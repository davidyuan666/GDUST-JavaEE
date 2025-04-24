package org.gust.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.gust.pojo.User;
import org.gust.pojo.Order;

@Controller
public class OrderController {

    @RequestMapping("/order")
    //设置当前方法返回值类型为 String，用于指定请求完成后跳转的页面
    public String order() {
        System.out.println("访问到 order webpage!");
        //设定具体跳转的页面
        return "order";
    }

    @RequestMapping("/showOrders")
    public void showOrders(User user) {
        List<Order> orders = user.getOrders();
        List<String> addressList = user.getAddress();
        System.out.println("订单：");
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            String address = addressList.get(i);
            System.out.println("订单Id:" + order.getOrderId());
            System.out.println("订单配送地址：" + address);
        }
    }
}