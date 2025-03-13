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
 * @date:2023/2/19-02-19 22:45
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

    @Test
    public void userInsert() {
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
        User user = new User();
        user.setUid(3);
        user.setUname("王五");
        user.setUage(20);
        //传入参数查询，返回结果
        int result = session.insert("com.itheima.pojo.User.addUser", user);
        if (result > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        session.commit();
        //输出结果
        //关闭session
        session.close();
    }

    @Test
    public void userUpdate() {
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
        User user = new User();
        user.setUid(3);
        user.setUname("老六");
        user.setUage(100);
        //传入参数查询，返回结果

        int result = session.update("com.itheima.pojo.User.updateUser", user);
        if (result > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        session.commit();
        //输出结果
        //关闭session
        session.close();
    }

}
