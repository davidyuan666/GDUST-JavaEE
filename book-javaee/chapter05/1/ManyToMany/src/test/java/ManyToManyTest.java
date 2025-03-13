import com.itheima.dao.OrdersMapper;
import com.itheima.pojo.Orders;
import com.itheima.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Auther:bingli
 * ClassName:ManyToManyTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/14-03-14 5:37
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class ManyToManyTest {

    @Test
    public void selectOrdersByIdTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        OrdersMapper mapper = session.getMapper(OrdersMapper.class);
        // 2.查询id为3的订单的信息
        Orders orders = mapper.selectOrdersById(1);
        System.out.println(orders.toString());
        session.close();
    }

}
