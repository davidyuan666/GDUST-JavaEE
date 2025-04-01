package edu.gust.beans;
import edu.gust.proxy.CglibProxy;
import edu.gust.dao.impl.UserDao4;

public class TestCglib {
     public static void main(String[] args) {
            CglibProxy cglibProxy = new CglibProxy(); // 创建代理对象
            UserDao4 userDao4 = new UserDao4(); // 创建目标对象
            // 获取增强后的目标对象
            UserDao4 userDao4_1 = (UserDao4)cglibProxy.createProxy(userDao4);
            // 执行方法
            userDao4_1.addUser();
            userDao4_1.deleteUser();
     }
}
