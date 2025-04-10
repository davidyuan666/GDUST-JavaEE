package edu.gust.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.dao.IUserDao5;

public class TestXml{
        public static void main(String[] args){
                ApplicationContext context=new
                        ClassPathXmlApplicationContext("applicationContext.xml");
                IUserDao5 userDao5=context.getBean("userDao5",IUserDao5.class);
                userDao5.delete();	
                System.out.println("删除成功");
                userDao5.insert();	
                System.out.println("插入成功");
                userDao5.select();	
                System.out.println("查询成功");
                userDao5.update();	
                System.out.println("更新成功");
        }
}
