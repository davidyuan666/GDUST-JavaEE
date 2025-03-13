package com.itheima.demo03;

/**
 * Auther:bingli
 * ClassName:UserDaoImpl
 * Package:com.itheima.demo03
 * Description:
 *
 * @date:2023/3/27-03-27 0:04
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void insert() {
        System.out.println("添加用户信息");
    }

    @Override
    public void delete() {
        System.out.println("删除用户信息");
    }

    @Override
    public void update() {
        System.out.println("更新用户信息");
    }

    @Override
    public void select() {
        System.out.println("查询用户信息");
    }
}
