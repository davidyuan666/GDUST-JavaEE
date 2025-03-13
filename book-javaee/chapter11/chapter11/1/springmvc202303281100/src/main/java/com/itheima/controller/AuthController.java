package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Auther:bingli
 * ClassName:AuthController
 * Package:com.itheima.controller
 * Description:
 *
 * @date:2023/3/28-03-28 11:14
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Controller
public class AuthController {
    //设定当前方法的访问映射地址列表
    @RequestMapping(value = {"/addUser", "/deleteUser"})
    public void checkAuth() {
        System.out.println("增删操作校验");
    }
}
