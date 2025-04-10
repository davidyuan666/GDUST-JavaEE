package edu.gust.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.dao.impl.AccountDao;
import edu.gust.pojo.Account;

public class FindAccountByIdTest {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext =new
                ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        Account account = accountDao.findAccountById(1);
        System.out.println(account);
    }
}
