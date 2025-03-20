package org.gust.pojo;
import java.util.List;
import org.gust.pojo.Product;

public class Order {
    private Integer id;    			//订单id
    private String number;			//订单编号
    private Integer userId;
    private List<Product> products;

    @Override
    public String toString() {
        return "Order [id=" + id + ", number=" + number + "]";
    }
}
