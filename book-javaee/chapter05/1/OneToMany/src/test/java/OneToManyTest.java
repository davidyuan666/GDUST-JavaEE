import com.itheima.dao.UsersMapper;
import com.itheima.pojo.Users;
import com.itheima.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Auther:bingli
 * ClassName:OneToManyTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/13-03-13 22:43
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class OneToManyTest {


    @Test
    public void selectUserByIdTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        // 2.查询id为1的人的信息
        Users users = mapper.selectUserById(1);
        System.out.println(users);
        session.close();
    }

}
