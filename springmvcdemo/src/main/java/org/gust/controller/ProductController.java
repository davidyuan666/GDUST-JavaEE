package org.gust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class ProductController {
    // 获取商品列表
    @RequestMapping("/getProducts")
    public void getProducts(String[] proIds) {
        for (String proId : proIds) {
            System.out.println("获取到了Id为"+proId+"的商品");	}
    }

    @RequestMapping("/product")
    //设置当前方法返回值类型为 String，用于指定请求完成后跳转的页面
    public String product() {
        System.out.println("访问到 product webpage!");
        //设定具体跳转的页面
        return "product";
    }

    // 获取商品列表(使用List绑定数据)
    @RequestMapping("/getProductsList")
    public void getProductsList(@RequestParam("proIds") List<String> proIds) {
        for (String proId : proIds) {
            System.out.println("获取到了Id为" + proId + "的商品");
        }
    }



}

