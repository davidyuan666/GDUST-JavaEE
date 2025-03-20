package com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:User
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/2/19-02-19 21:39
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class User {
    private int uid;             //用户id
    private String uname;       //用户姓名
    private int uage;            //用户年龄

    public User() {
    }

    public User(int uid, String uname, int uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }
}
