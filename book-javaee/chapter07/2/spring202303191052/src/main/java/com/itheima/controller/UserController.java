package com.itheima.controller;

import com.itheima.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Auther:bingli
 * ClassName:UserController
 * Package:com.itheima.controller
 * Description:
 *
 * @date:2023/3/19-03-19 11:09
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Controller("userController")
public class UserController {
    //使用@Resource注解注入UserService
    @Resource(name = "userService")
    private UserService userService;

    public void save() {
        this.userService.save();
        System.out.println("执行UserController.save()");
    }
}
