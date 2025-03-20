package com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:User
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/4/1-04-01 8:59
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class User {
    private String username;        //用户名
    private String password;        //用户密码

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
