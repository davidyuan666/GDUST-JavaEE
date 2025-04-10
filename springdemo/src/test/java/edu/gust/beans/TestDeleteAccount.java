package edu.gust.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.dao.impl.AccountDao;

public class TestDeleteAccount {
    public static void main(String[] args) {
        try {
            // 加载配置文件
            ApplicationContext applicationContext = new
                    ClassPathXmlApplicationContext("applicationContext.xml");
            // 获取AccountDao实例
            AccountDao accountDao =
                    (AccountDao) applicationContext.getBean("accountDao");
            // 执行deleteAccount()方法，并获取返回结果
            int num = accountDao.deleteAccount(1);
            // 添加输出结果
            if (num > 0) {
                System.out.println("Successfully deleted account with ID: 1");
            } else {
                System.out.println("No account was deleted. Account may not exist.");
            }
        } catch (Exception e) {
            System.err.println("Error occurred while deleting account: " + e.getMessage());
        }
    }
}