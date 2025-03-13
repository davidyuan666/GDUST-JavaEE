package com.itheima.demo02;

/**
 * Auther:bingli
 * ClassName:CglibTest
 * Package:com.itheima.demo02
 * Description:
 *
 * @date:2023/3/26-03-26 23:58
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class CglibTest {
    public static void main(String[] args) {
        // 创建代理对象
        CglibProxy cglibProxy = new CglibProxy();
        // 创建目标对象
        UserDao userDao = new UserDao();
        // 获取增强后的目标对象
        UserDao userDao1 = (UserDao) cglibProxy.createProxy(userDao);
        // 执行方法
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
