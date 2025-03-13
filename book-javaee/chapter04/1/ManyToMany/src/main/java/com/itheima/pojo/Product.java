package com.itheima.pojo;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:Product
 * Package:com.itheima.pojo.com.itheima.pojo
 * Description:
 *
 * @date:2023/3/5-03-05 15:43
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Product {

    private Integer id;                //商品id
    private String name;                //商品名称
    private Double price;                //商品单价
    private List<Orders> orders;        //与订单关联的属性

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", orders=" + orders +
                '}';
    }
}
