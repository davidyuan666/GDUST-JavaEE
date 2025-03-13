package com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:Product
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/3/14-03-14 5:35
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Product {

    private Integer id;                //商品id
    private String name;                //商品名称
    private Double price;                //商品单价

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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
