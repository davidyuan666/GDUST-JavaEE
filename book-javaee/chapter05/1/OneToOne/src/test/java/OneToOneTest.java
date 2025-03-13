import com.itheima.dao.PersonMapper;
import com.itheima.pojo.Person;
import com.itheima.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Auther:bingli
 * ClassName:OneToOneTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/13-03-13 23:01
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class OneToOneTest {

    @Test
    public void selectPersonByIdTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        // 2.查询id为1的人员的信息
        Person person = mapper.selectPersonById(2);
        System.out.println(person);
        // 3.关闭SqlSession
        session.close();
    }

}
