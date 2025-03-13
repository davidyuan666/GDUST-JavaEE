package com.itheima.demo02_update;

import com.itheima.demo02_update.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Auther:bingli
 * ClassName:TestDeleteAccount
 * Package:com.itheima.demo02_update
 * Description:
 *
 * @date:2023/3/27-03-27 1:13
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class TestDeleteAccount {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Update.xml");
        // 获取AccountDao实例
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        // 执行deleteAccount()方法，并获取返回结果
        int num = accountDao.deleteAccount(1);
        if (num > 0) {
            System.out.println("成功删除了" + num + "条数据！");
        } else {
            System.out.println("删除操作执行失败！");
        }
    }
}
