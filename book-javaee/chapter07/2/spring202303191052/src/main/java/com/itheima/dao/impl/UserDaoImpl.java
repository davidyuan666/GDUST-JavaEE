package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * Auther:bingli
 * ClassName:UserDaoImpl
 * Package:com.itheima.dao.impl
 * Description:
 *
 * @date:2023/3/19-03-19 11:05
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
        System.out.println("执行UserDaoImpl.save()");
    }
}
