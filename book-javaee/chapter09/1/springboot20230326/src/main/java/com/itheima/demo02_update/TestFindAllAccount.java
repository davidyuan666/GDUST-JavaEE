package com.itheima.demo02_update;

import com.itheima.demo02_update.dao.AccountDao;
import com.itheima.demo02_update.entity.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:TestFindAllAccount
 * Package:com.itheima.demo02_update
 * Description:
 *
 * @date:2023/3/27-03-27 1:22
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class TestFindAllAccount {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Update.xml");
        // 获取AccountDao实例
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        // 执行findAllAccount()方法,获取Account对象的集合
        List<Account> account = accountDao.findAllAccount();
        // 循环输出集合中的对象
        for (Account act : account) {
            System.out.println(act);
        }
    }
}
