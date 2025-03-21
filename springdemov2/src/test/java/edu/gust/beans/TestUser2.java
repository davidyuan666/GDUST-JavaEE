package edu.gust.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.pojo.User2;

public class TestUser2 {
    public static void main(String[] args)throws Exception {
        //加载applicationContext.xml配置
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取配置中的User2实例
        User2 user2 = applicationContext.getBean("user2Bean", User2.class);
        System.out.println(user2);
    }}