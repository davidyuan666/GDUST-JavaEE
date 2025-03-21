package edu.gust.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args){
        AbstractApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=(Student)applicationContext.getBean("student");
        System.out.println(student);
        //销毁Spring容器中的所有Bean
        AbstractApplicationContext ac= applicationContext;
        ac.registerShutdownHook();
    }
}