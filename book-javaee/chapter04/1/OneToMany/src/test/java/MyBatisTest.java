import com.itheima.pojo.Users;
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

}
