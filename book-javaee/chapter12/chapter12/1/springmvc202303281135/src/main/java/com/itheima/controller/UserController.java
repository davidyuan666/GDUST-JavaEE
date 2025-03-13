package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Auther:bingli
 * ClassName:UserController
 * Package:com.itheima.controller
 * Description:
 *
 * @date:2023/3/28-03-28 11:54
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Controller
public class UserController {
    // 简单数据绑定-默认类型数据绑定
    @RequestMapping("/getUserId")
    public void getUserId(HttpServletRequest request) {
        String userid = request.getParameter("userid");
        System.out.println("userid=" + userid);
    }

    // 简答数据绑定-简单数据类型绑定
    @RequestMapping("/getUserNameAndId")
    public void getUserNameAndId(String username, Integer id) {
        System.out.println("username=" + username + ",id=" + id);
    }

    // Param注解
    @RequestMapping("/getUserName")
    public void getUserName(@RequestParam(value = "name", required = false, defaultValue = "itheima") String username) {
        System.out.println("username = " + username);
    }

    // RESt风格
    @RequestMapping("/user/{name}")
    public void getPathVariable(@PathVariable(value = "name") String username) {
        System.out.println("username=" + username);
    }

    /**
     * 接收表单用户信息
     */
    @RequestMapping("/registerUser")
    public void registerUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        // 提交方式为get时，重新编码
        // String username = new String(user.getUsername().getBytes("ISO8859-1"), "UTF-8");
        // String password = new String(user.getPassword().getBytes("ISO8859-1"), "UTF-8");
        System.out.println("username=" + username + ",password=" + password);
    }


    // 使用自定义类型数据绑定日期数据
    @RequestMapping("/getBirthday")
    public void getBirthday(Date birthday) {
        System.out.println("birthday=" + birthday);
    }

    @RequestMapping("/getBirthdayAnno")
    public void getBirthdayAnno(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
        System.out.println("birthday=" + birthday);
    }


}
