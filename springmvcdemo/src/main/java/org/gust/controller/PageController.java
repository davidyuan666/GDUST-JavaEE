package org.gust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.gust.pojo.User;

@Controller
public class PageController {
    // 返回值为void类型的页面跳转
    @RequestMapping("/registerDemo")
    public void showPageByVoid() {
        System.out.println("showPageByVoid running");
    }

    // 返回值为String类型的页面跳转——不携带数据
    @RequestMapping("/showPageByString")
    public String showPageByString() {
        System.out.println("showPageByString running");
        return "register";
    }

    // 转发
    @RequestMapping("/showPageByForward")
    public String showPageByForward() {
        System.out.println("showPageByForward running");
        return "forward:orders.jsp";
    }

    // 重定向
    @RequestMapping("/showPageByRedirect")
    public String showPageByRedirect() {
        System.out.println("showPageByRedirect running");
        return "redirect:http://www.baidu.com";
    }

    // 返回值为String类型的页面跳转——携带数据
    @RequestMapping("/showPageByRequest")
    public String showPageByRequest(HttpServletRequest request) {
        System.out.println("showPageByRequest running");
        request.setAttribute("username", "request");
        return "register";
    }

    // 返回值为String类型的页面跳转——携带数据
    @RequestMapping("/showPageByModel")
    public String showPageByModel(Model model) {
        System.out.println("showPageByModel running");
        model.addAttribute("username", "model");
        User user = new User();
        user.setPassword("password");
        model.addAttribute("user", user);
        return "register";
    }

    // 返回值为ModelAndView类型的页面跳转
    @RequestMapping("/showModelAndView")
    public ModelAndView showModelAndView() {
        //创建ModelAndView实例
        ModelAndView modelAndView = new ModelAndView();
        //向ModelAndView实例中添加名称为username的数据
        modelAndView.addObject("username", "heima");
        User user = new User();
        user.setPassword("password");
        //向ModelAndView实例中添加名称为user的数据
        modelAndView.addObject("user", user);
        //向ModelAndView实例中设置视图的名称
        modelAndView.setViewName("register");
        return modelAndView;
    }
}
