import com.itheima.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Auther:bingli
 * ClassName:AnnotationTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/19-03-19 11:14
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController usercontroller = (UserController) applicationContext.getBean("userController");
        usercontroller.save();
    }
}
