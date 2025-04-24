package org.gust.pojo;

public class Order {
    private String orderId;			//订单id
    private String orderName;			//订单名称
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }   
}
