package com.itheima.controller;

import com.itheima.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:ProductController
 * Package:com.itheima.controller
 * Description:
 *
 * @date:2023/4/1-04-01 10:03
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Controller
public class ProductController {

    // 复杂数据绑定-数组绑定
    // 获取商品列表
    // @RequestMapping("/getProducts")
    // public void getProducts(String[] proIds) {
    //     for (String proId : proIds) {
    //         System.out.println("获取到了Id为" + proId + "的商品");
    //     }
    //     System.out.println(Arrays.toString(proIds));
    // }


    // 复杂数据绑定-List绑定
    // 获取商品列表(使用List绑定数据)
    @RequestMapping("/getProducts")
    public void getProducts(@RequestParam("proIds") List<String> proIdss) {
        for (String proId : proIdss) {
            System.out.println("获取到了Id为" + proId + "的商品");
        }
        System.out.println(proIdss.toString());
    }


    // 获取单个商品信息
    @RequestMapping("/getProduct")
    public void getProduct(@RequestBody Product product) {
        String proId = product.getProId();
        String proName = product.getProName();
        System.out.println("获取到了Id为" + proId + "名称为" + proName + "的商品");
    }


    // 获取多个商品信息
    @RequestMapping("/getProductList")
    public void getProductList(@RequestBody List<Product> products) {
        for (Product product : products) {
            String proId = product.getProId();
            String proName = product.getProName();
            System.out.println("获取到了Id为" + proId + "名称为" + proName + "的商品");
        }
    }

}
