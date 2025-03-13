package com.itheima.pojo;

import lombok.Data;

import java.util.HashMap;

/**
 * Auther:bingli
 * ClassName:Order
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/4/1-04-01 10:26
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Data
public class Order {
    // 复杂POJO数据绑定-属性为对象类型的数据绑定
    // private String orderId;            //订单id

    // 复杂POJO数据绑定-属性为List类型的数据绑定
    // private String orderId;            //订单id
    // private String orderName;          //订单名字

    // 复杂POJO数据绑定-属性为Map类型的数据绑定
    private String orderId;            //订单id
    private HashMap<String, Product> productInfo;    //商品信息
}
