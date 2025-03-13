import com.itheima.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Auther:bingli
 * ClassName:Bean1Test
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/19-03-19 10:17
 * @author:2550976002@qq.com
 * @version:1.0
 */

public class ScopeTest {
    public static void main(String[] args) {
        //加载applicationBean1.xml配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Scope.xml");
        //通过容器获取配置中bean1的实例
        Scope scope1 = (Scope) applicationContext.getBean("scope");
        Scope scope2 = (Scope) applicationContext.getBean("scope");
        System.out.print(scope1 == scope2);
    }
}
