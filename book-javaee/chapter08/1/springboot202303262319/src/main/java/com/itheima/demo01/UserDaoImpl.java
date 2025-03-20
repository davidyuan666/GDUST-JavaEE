package com.itheima.demo01;

/**
 * Auther:bingli
 * ClassName:UserDaoImpl
 * Package:com.itheima.demo01
 * Description:
 *
 * @date:2023/3/26-03-26 23:25
 * @author:2550976002@qq.com
 * @version:1.0
 */

//目标类
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
