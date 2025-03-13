package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Auther:bingli
 * ClassName:ParamsController
 * Package:com.itheima.controller
 * Description:
 *
 * @date:2023/3/28-03-28 11:30
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Controller
public class ParamsController {
    @RequestMapping(value = "/params", params = "id=1")
    public void findById(String id) {
        System.out.println("id=" + id);
    }
}
