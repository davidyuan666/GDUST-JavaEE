package com.itheima.demo02_anno;

import com.itheima.demo02_anno.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Auther:bingli
 * ClassName:TransactionTest
 * Package:com.itheima.demo01_xml
 * Description:
 *
 * @date:2023/3/27-03-27 1:35
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class TransactionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Anno.xml");
        // 获取AccountDao实例
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        // 调用实例中的转账方法
        accountDao.transfer("lisi", "zhangsan", 100.0);
        // 输出提示信息
        System.out.println("转账成功！");
    }
}
