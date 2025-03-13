package com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:Orders
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/3/13-03-13 22:33
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Orders {

    private Integer id;                //订单id
    private String number;            //订单编号

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

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
