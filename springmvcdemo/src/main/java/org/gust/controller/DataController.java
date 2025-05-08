package org.gust.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.gust.pojo.User;
import org.gust.pojo.Product;

@Controller
public class DataController {
    // 普通字符串的回写
    @RequestMapping("showDataByResponse")
    public void showDataByResponse(HttpServletResponse response) {
        try {
            response.getWriter().print("response");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // JSON数据的回写——对象数据转换成JSON数据后的回写
    @RequestMapping("showDataByJSON")
    public void showDataByJSON(HttpServletResponse response) {
        try {
            ObjectMapper om = new ObjectMapper();
            User user = new User();
            user.setUsername("heima");
            user.setPassword("666");
            String ujson = om.writeValueAsString(user);
            response.getWriter().print(ujson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // @ResponseBody注解
    @RequestMapping("getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setUsername("heima2");
        return user;
    }

    // JSON数据的回写——集合数据转换成JSON数据后的回写
    @RequestMapping("addProducts")
    @ResponseBody
    public List<Product> addProducts() {
        Product p1 = new Product();
        p1.setProId("p001");
        p1.setProName("红牛");
        Product p2 = new Product();
        p2.setProId("p002");
        p2.setProName("三文鱼");
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        return products;
    }
}
