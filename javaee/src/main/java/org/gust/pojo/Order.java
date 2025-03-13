package org.gust.pojo;

public class Order {
    private Integer id;    			//订单id
    private String number;			//订单编号
    private Integer userId;

    @Override
    public String toString() {
        return "Orders [id=" + id + ", number=" + number + "]";
    }
}
