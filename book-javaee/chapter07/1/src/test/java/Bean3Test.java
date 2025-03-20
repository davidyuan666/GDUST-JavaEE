import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Auther:bingli
 * ClassName:Bean3Test
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/19-03-19 10:30
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Bean3Test {
    public static void main(String[] args) {
        // ApplicationContext在加载配置文件时，对Bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Bean3.xml");
        System.out.println(applicationContext.getBean("bean3"));
    }
}
