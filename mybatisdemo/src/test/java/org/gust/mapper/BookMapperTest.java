package org.gust.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.gust.pojo.Person;
import org.gust.util.MyBatisUtil;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import org.gust.pojo.Book;

public class BookMapperTest {
    private SqlSessionFactory sqlSessionFactory;
    
    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    @Test
    public void findBookByIdTest1() {
        SqlSession session1 = null;
        try {
            // 1.通过工具类生成SqlSession对象
            session1 = sqlSessionFactory.openSession();
            // 2.使用session1查询id为1的图书的信息
            Book book1 = session1.selectOne("org.gust.mapper." 
                                + "BookMapper.findBookById", 1);
            System.out.println(book1.toString()); // 3.输出查询结果信息
            // 再次使用session1查询id为1的图书的信息，同2、3步
        } catch (Exception e) {
            System.out.println("查询图书信息失败：" + e.getMessage());
        } finally {
            // 4.关闭SqlSession
            if (session1 != null) {
                session1.close();
            }
        }
    }

    @Test
    public void findBookByIdTest3() {
        // 1.通过工具类生成两个SqlSession对象
        SqlSession session1 = sqlSessionFactory.openSession();
        SqlSession session2 = sqlSessionFactory.openSession();
        
        try {
            // 2.使用session1查询id为1的图书的信息
            Book book1 = session1.selectOne("org.gust.mapper.BookMapper.findBookById", 1);
            System.out.println("Session 1 result: " + book1.toString());

            // 重要：提交事务，这样缓存才会生效
            session1.commit();
            
            // 3.使用session2查询相同的图书信息
            Book book2 = session2.selectOne("org.gust.mapper.BookMapper.findBookById", 1);
            System.out.println("Session 2 result: " + book2.toString());
        } catch (Exception e) {
            System.out.println("查询图书信息失败：" + e.getMessage());
        } finally {
            // 4.关闭两个SqlSession
            if (session1 != null) session1.close();
            if (session2 != null) session2.close();
        }
    }




}
