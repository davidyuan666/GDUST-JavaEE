package org.gust.pojo;
import org.gust.pojo.Order;
import java.util.List;


public class Product {
    private Integer id;      private String name;
    private Double price;
    private List<Order> orders; //关联订单属性

    // Getters and Setters
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
        return "Product [id=" + id + ", name=" + name
                + ", price=" + price + "]";}
}
