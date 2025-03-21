package edu.gust.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new 
               ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1_1 = (Bean1) applicationContext.getBean("bean1");
        Bean1 bean1_2 = (Bean1) applicationContext.getBean("bean1");
        System.out.println("Check Bean1 Scope: " + (bean1_1 == bean1_2));
    }
}