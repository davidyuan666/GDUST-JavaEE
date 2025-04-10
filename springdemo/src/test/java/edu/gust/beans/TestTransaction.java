package edu.gust.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.dao.IAccountDao;  // Change this import
import edu.gust.dao.impl.AccountDao;

public class TestTransaction {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // Get AccountDao instance using the interface type
        IAccountDao accountDao =
                (IAccountDao)applicationContext.getBean("accountDao");
        // Call the transfer method
        accountDao.transfer("lisi", "zhangsan", 100.0);
        // Print success message
        System.out.println("转账成功！");
    }
}