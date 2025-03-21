package edu.gust.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    public static void main(String[] args) {
        // 加载applicationBean1.xml配置
        ApplicationContext applicationContext = new 
                ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取配置中bean1的实例
        System.out.println(applicationContext.getBean("bean1"));

        System.out.println(applicationContext.getBean("bean2"));

        System.out.println(applicationContext.getBean("bean3"));


    }
}