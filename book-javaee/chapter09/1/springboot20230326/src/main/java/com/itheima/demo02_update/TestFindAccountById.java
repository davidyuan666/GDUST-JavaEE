package com.itheima.demo02_update;

import com.itheima.demo02_update.dao.AccountDao;
import com.itheima.demo02_update.entity.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Auther:bingli
 * ClassName:TestFindAccountById
 * Package:com.itheima.demo02_update
 * Description:
 *
 * @date:2023/3/27-03-27 1:22
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class TestFindAccountById {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Update.xml");
        // 获取AccountDao实例
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        // 执行findAccountById()方法
        Account account = accountDao.findAccountById(1);
        System.out.println(account);
    }
}
