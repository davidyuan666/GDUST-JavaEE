package com.itheima.demo02_update;

import com.itheima.demo02_update.dao.AccountDao;
import com.itheima.demo02_update.entity.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Auther:bingli
 * ClassName:TestAddAccount
 * Package:com.itheima.demo02_update
 * Description:
 *
 * @date:2023/3/27-03-27 1:11
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class TestAddAccount {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Update.xml");
        // 获取AccountDao实例
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        // 创建Account对象，并向Account对象中添加数据
        Account account = new Account();
        account.setUsername("tom");
        account.setBalance(1000.00);
        // 执行addAccount()方法，并获取返回结果
        int num = accountDao.addAccount(account);
        if (num > 0) {
            System.out.println("成功插入了" + num + "条数据！");
        } else {
            System.out.println("插入操作执行失败！");
        }
    }
}
