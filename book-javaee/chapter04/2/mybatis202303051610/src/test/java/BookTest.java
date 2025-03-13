import com.itheima.pojo.Book;
import com.itheima.pojo.com.itheima.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Auther:bingli
 * ClassName:BookTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/5-03-05 16:23
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class BookTest {

    /**
     * 根据id查询图书信息—-一级缓存
     */
    @Test
    public void findBookByIdTest0() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        SqlSession session1 = MyBatisUtils.getSession();
        // 2.使用session1查询id为1的图书的信息
        Book book1 = session.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 3.输出查询结果信息
        System.out.println(book1.toString());
        session.close();
        // 4.使用session1查询id为1的图书的信息
        Book book2 = session1.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 5.输出查询结果信息
        System.out.println(book2.toString());
        // 6.关闭SqlSession
        session1.close();
    }

    @Test
    public void findBookByIdTest1() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.使用session1查询id为1的图书的信息
        Book book1 = session.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 3.输出查询结果信息
        System.out.println(book1.toString());
        // 4.使用session1查询id为1的图书的信息
        Book book2 = session.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 5.输出查询结果信息
        System.out.println(book2.toString());
        // 6.关闭SqlSession
        session.close();
    }


    @Test
    public void findBookByIdTest2() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.使用session查询id为1的图书的信息
        Book book1 = session.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 3.输出查询结果信息
        System.out.println(book1.toString());
        Book book2 = new Book();
        book2.setId(3);
        book2.setBookName("MySQL数据库入门");
        book2.setPrice(40.0);
        // 4.使用session更新id为3的图书的信息
        session.update("com.itheima.mapper.BookMapper.updateBook", book2);
        session.commit();
        Book book3 = session.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 5.输出查询结果信息
        System.out.println(book1.toString());
        // 6.关闭SqlSession
        session.close();
    }

    /**
     * 根据id查询图书信息—-二级缓存
     */
    @Test
    public void findBookByIdTest3() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session1 = MyBatisUtils.getSession();
        SqlSession session2 = MyBatisUtils.getSession();
        // 2.使用session1查询id为1的图书的信息
        Book book1 = session1.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 3.输出查询结果信息
        System.out.println(book1.toString());
        // 4.关闭SqlSession1
        session1.close();
        // 5.使用session2查询id为1的图书的信息
        Book book2 = session2.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 6.输出查询结果信息
        System.out.println(book2.toString());
        // 7.关闭SqlSession2
        session2.close();
    }

    @Test
    public void findBookByIdTest4() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session1 = MyBatisUtils.getSession();
        SqlSession session2 = MyBatisUtils.getSession();
        SqlSession session3 = MyBatisUtils.getSession();
        // 2.使用session1查询id为1的图书的信息
        Book book1 = session1.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 3.输出查询结果信息
        System.out.println(book1.toString());
        // 4.关闭SqlSession
        session1.close();
        Book book2 = new Book();
        book2.setId(2);
        book2.setBookName("Java Web程序开发进阶");
        book2.setPrice(45.0);
        // 5.使用session2更新id为2的图书的信息
        session2.update("com.itheima.mapper.BookMapper.updateBook", book2);
        session2.commit();
        session2.close();
        // 6.使用session3查询id为1的图书的信息
        Book book3 = session3.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        // 7.输出查询结果信息
        System.out.println(book3.toString());
        // 8.关闭SqlSession
        session3.close();
    }

}
