package edu.gust.dao.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import edu.gust.dao.IUserDao2;
import edu.gust.entity.User;

@Repository("userDao2")
public class UserDao2 implements IUserDao2 {
    public void save(){
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User) applicationContext.getBean("user");
        System.out.println(user);
        System.out.println("执行UserDao2.save()");
    }
}
