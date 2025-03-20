package com.itheima.controller;

import com.itheima.pojo.Order;
import com.itheima.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Set;

/**
 * Auther:bingli
 * ClassName:OrderController
 * Package:com.itheima.controller
 * Description:
 *
 * @date:2023/4/1-04-01 10:55
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Controller
public class OrderController {

    // 复杂POJO绑定-属性为List类型的数据绑定
    // 获取用户中的订单信息
    // @RequestMapping("/showOrders")
    // public void showOrders(User user) {
    //     List<Order> orders = user.getOrders();
    //     List<String> addressList = user.getAddress();
    //     System.out.println("订单：");
    //     for (int i = 0; i < orders.size(); i++) {
    //         Order order = orders.get(i);
    //         String address = addressList.get(i);
    //         System.out.println("订单Id:" + order.getOrderId());
    //         System.out.println("订单Name:" + order.getOrderName());
    //         System.out.println("订单配送地址：" + address);
    //     }
    // }


    // 复杂POJO绑定-属性为Map类型的数据绑定
    // 获取订单信息
    @RequestMapping("/orderInfo")
    public void getOrderInfo(Order order) {
        String orderId = order.getOrderId();        //获取订单id
        //获取商品信息
        HashMap<String, Product> orderInfo = order.getProductInfo();
        Set<String> keys = orderInfo.keySet();
        System.out.println("订单id:" + orderId);
        System.out.println("订单商品信息:");
        for (String key : keys) {
            Product product = orderInfo.get(key);
            String proId = product.getProId();
            String proName = product.getProName();
            System.out.println(key + "类~" + "商品id:" + proId + ",商品名称：" + proName);
        }
    }
}
