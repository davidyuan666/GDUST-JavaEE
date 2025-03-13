package com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:Product
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/4/1-04-01 10:00
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Product {
    private String proId;        //商品id
    private String proName;        //商品名称

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                '}';
    }
}
