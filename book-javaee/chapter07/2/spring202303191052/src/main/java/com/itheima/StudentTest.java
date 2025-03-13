package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Auther:bingli
 * ClassName:StudentTest
 * Package:com.itheima
 * Description:
 *
 * @date:2023/3/19-03-19 11:21
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-Student.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
        //销毁Spring容器中的所有Bean
        AbstractApplicationContext ac = (AbstractApplicationContext) applicationContext;
        ac.registerShutdownHook();
    }
}
