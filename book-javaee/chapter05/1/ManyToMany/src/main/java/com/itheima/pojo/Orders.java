package com.itheima.pojo;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:Orders
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/3/14-03-14 5:34
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Orders {

    private Integer id;                //订单id
    private String number;            //订单编号
    //关联商品集合属性
    private List<Product> productList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", productList=" + productList +
                '}';
    }
}
