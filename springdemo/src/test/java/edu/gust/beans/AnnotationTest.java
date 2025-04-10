package edu.gust.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.dao.IAccountDao;  // Changed import

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        IAccountDao accountDao =
                (IAccountDao)applicationContext.getBean("accountDao");  // Changed cast to interface
        // 调用实例中的转账方法
        accountDao.transfer("lisi", "zhangsan", 100.0);
        // 输出提示信息
        System.out.println("转账成功！");
    }
}