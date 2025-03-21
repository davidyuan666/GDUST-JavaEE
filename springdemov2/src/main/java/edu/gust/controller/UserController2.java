package edu.gust.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import edu.gust.service.impl.UserService2;

@Controller
public class UserController2 {
    //使用@Resource注解注入UserService
    @Resource(name="userService2")
    private UserService2 userService2;
    
    public void save(){
        this.userService2.save();
        System.out.println("执行UserController2.save()");
    }
}