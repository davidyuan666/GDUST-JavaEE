import com.itheima.pojo.Orders;
import com.itheima.util.MyBatisUtils;
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
