package com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:Customer
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/2/26-02-26 21:22
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Customer {

    private Integer id;       // 主键id
    private String username; // 客户名称
    private String jobs;      // 职业
    private String phone;     // 电话


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

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", username=" + username +
                ", jobs=" + jobs + ", phone=" + phone + "]";

    }
}
