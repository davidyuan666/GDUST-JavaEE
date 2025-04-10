package edu.gust.dao.impl;

import edu.gust.dao.IUserDao3;

public class UserDao3 implements IUserDao3 {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}