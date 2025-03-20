package com.itheima.demo01;

/**
 * Auther:bingli
 * ClassName:JDKTest
 * Package:com.itheima.demo01
 * Description:
 *
 * @date:2023/3/26-03-26 23:41
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class JDKTest {
    public static void main(String[] args) {
        // 创建代理对象
        MyProxy jdkProxy = new MyProxy();
        // 创建目标对象
        UserDao userDao = new UserDaoImpl();
        // 从代理对象中获取增强后的目标对象
        UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
        // 执行方法
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
