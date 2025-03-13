package com.itheima.pojo;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:User
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/3/13-03-13 22:33
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Users {

    private Integer id;                 // 用户编号
    private String username;           // 用户姓名
    private String address;            // 用户地址
    private List<Orders> ordersList; //用户关联的订单


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }
}
