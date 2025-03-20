package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Auther:bingli
 * ClassName:FirstController
 * Package:com.itheima.controller
 * Description:
 *
 * @date:2023/3/28-03-28 11:05
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Controller
@RequestMapping(value = "/springMVC")
public class FirstController {
    @RequestMapping(value = "/firstController")
    public void sayHello() {
        System.out.println("hello Spring MVC");
    }
}
