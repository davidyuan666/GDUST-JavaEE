import com.itheima.pojo.Person;
import com.itheima.utils.MyBatisUtils;
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

}
