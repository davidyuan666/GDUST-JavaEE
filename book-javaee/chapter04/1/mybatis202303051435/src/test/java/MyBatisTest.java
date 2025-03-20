import com.itheima.pojo.com.itheima.pojo.Orders;
import com.itheima.pojo.com.itheima.pojo.Person;
import com.itheima.pojo.com.itheima.pojo.Users;
import com.itheima.pojo.com.itheima.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Auther:bingli
 * ClassName:MyBatisTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/5-03-05 14:50
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class MyBatisTest {

    /**
     * 一对一：嵌套查询
     */
    @Test
    public void findPersonByIdTest() {
        // 1、通过工具类获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
        Person person = session.selectOne("com.itheima.mapper.PersonMapper.findPersonById", 1);
        // 3、输出查询结果信息
        System.out.println(person);
        // 4、关闭SqlSession
        session.close();
    }

    /**
     * 一对一：嵌套结果
     */
    @Test
    public void findPersonByIdTest2() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.使用MyBatis嵌套结果的方法查询id为1的人员信息
        Person person = session.selectOne("com.itheima.mapper.PersonMapper.findPersonById2", 2);
        // 3.输出查询结果信息
        System.out.println(person);
        // 4.关闭SqlSession
        session.close();
    }

    /**
     * 一对多：嵌套结果
     */
    @Test
    public void findUserTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.查询id为1的用户信息
        Users users = session.selectOne("com.itheima.mapper.UsersMapper.findUserWithOrders", 1);
        // 3.输出查询结果信息
        System.out.println(users);
        // 4.关闭SqlSession
        session.close();
    }


    /**
     * 多对多:嵌套结果
     */
    @Test
    public void findOrdersTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 2.查询id为1的订单中的商品信息
        Orders orders = session.selectOne("com.itheima.mapper.OrdersMapper.findOrdersWithPorduct2", 1);
        // 3.输出查询结果信息
        System.out.println(orders);
        // 4.关闭SqlSession
        session.close();
    }


}
