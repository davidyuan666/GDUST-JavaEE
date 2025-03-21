package edu.gust.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.controller.UserController2;

public class TestAnnotation {
    public static void main(String[] args){
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserController2 usercontroller2=(UserController2)
                applicationContext.getBean("userController2");
        usercontroller2.save();
    }
}