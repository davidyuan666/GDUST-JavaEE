package org.gust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import org.gust.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;


@Controller
public class UserController {
//    http://localhost:8080/springmvcdemo/getUserId?userid=1
    @RequestMapping("/getUserId")
    public void getUserId(HttpServletRequest request){
        String userid= request.getParameter("userid");
        System.out.println("userid="+userid);
    }

//    http://localhost:8080/springmvcdemo/getUserNameAndId?username=Spring&id=1
    @RequestMapping("/getUserNameAndId")
    public void getUserNameAndId(String username,Integer id) {
        System.out.println("username="+username+",id="+id);
    }

//    http://localhost:8080/springmvcdemo/getUserName?name=test
    // Param注解
    @RequestMapping("/getUserName")
    public void getUserName(@RequestParam(value = "name", required = false, defaultValue = "user1") String username) {
        System.out.println("username = " + username);
    }

    // RESTFUL风格
    @RequestMapping("/user/{name}")
    public void getPathVariable(@PathVariable(value = "name") String username) {
        System.out.println("username=" + username);
    }

    @RequestMapping("/register")
    //设置当前方法返回值类型为 String，用于指定请求完成后跳转的页面
    public String register() {
        System.out.println("访问到 register webpage!");
        //设定具体跳转的页面
        return "register";
    }


    // 接收表单用户信息
    @RequestMapping("/registerUser")
    public void registerUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("username="+username+",password="+password);
    }


    /**
     * 使用自定义类型数据绑定日期数据
     */
//    http://localhost:8080/springmvcdemo/getBirthday?birthday=2023-04-27
    @RequestMapping("/getBirthday")
    public void getBirthday(Date birthday) {
        System.out.println("birthday="+birthday);
    }


    /**
     * 使用@DateTimeFormat注解绑定日期数据
     */
    @RequestMapping("/getBirthdayAnno")
    public void getBirthdayAnno(@DateTimeFormat(
            pattern = "yyyy-MM-dd")Date birthday) {
        System.out.println("birthday="+birthday);
    }


    @RequestMapping("/findOrderWithUser")
    public void findOrderWithUser(User user) {
        String username = user.getUsername();
        String orderId = user.getOrder().getOrderId();
        System.out.println("username="+username+",orderId="+orderId);
    }







}
