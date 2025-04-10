package edu.gust.pojo;

public class Account {
    private Integer id;       	               // 账户id
    private String username; 	// 用户名
    private Double balance;  	// 账户余额
    // 省略gettter/setter方法
    public String toString() {
        return "Account [id=" + id + ", "
                + "username=" + username + ", balance=" + balance + "]";}
}

