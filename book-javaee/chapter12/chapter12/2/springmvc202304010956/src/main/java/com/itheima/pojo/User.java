package com.itheima.pojo;

import lombok.Data;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:User
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/4/1-04-01 10:26
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Data
public class User {
    // 复杂POJO绑定-属性为对象类型的数据绑定
    // private String username;        //用户名
    // private String password;        //用户密码
    // private Order order;            //订单

    // 复杂POJO绑定-属性为List类型的数据绑定
    private String username;        //用户名
    private String password;        //用户密码
    private List<Order> orders;                //用户订单
    private List<String> address;              //订单地址

}
