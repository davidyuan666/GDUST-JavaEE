package edu.gust.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.gust.service.IUserService;

public class TestDao {
    public static void main(String[] args) {
        // 加载applicationContext.xml配置
        ApplicationContext applicationContext = new 
            ClassPathXmlApplicationContext("applicationContext.xml");
        
        // 获取配置中的UserService实例
        IUserService userService = (IUserService) 
            applicationContext.getBean("userServiceBean");
        
        boolean flag = userService.login("张三", "123");
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}