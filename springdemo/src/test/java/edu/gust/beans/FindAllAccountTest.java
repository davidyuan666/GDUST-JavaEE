package edu.gust.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.dao.impl.AccountDao;
import edu.gust.pojo.Account;
import java.util.List;

public class FindAllAccountTest {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext =new
                ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        List<Account> account = accountDao.findAllAccount(); // 执行方法
        for (Account act : account) {// 循环输出集合中的对象
            System.out.println(act); } }
}

