import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Auther:bingli
 * ClassName:UserTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/2/19-02-19 21:44
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class UserTest {

    @Test
    public void userFindByIdTest() {
        //读取文件的名称
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;
        try {
            //读取mybatis-config.xml文件内容到reader对象中
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //初始化mybatis数据库,创建SqlSessionFactory类的实例
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        //创建SqlSession实例
        SqlSession session = sqlMapper.openSession();
        //传入参数查询，返回结果
        User user = session.selectOne("findById", 1);
        //输出结果
        System.out.println(user.getUname());
        //关闭session
        session.close();
    }

}
