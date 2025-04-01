package edu.gust.beans;
import edu.gust.proxy.MyProxy;
import edu.gust.dao.IUserDao3;
import edu.gust.dao.impl.UserDao3;



public class TestJDK {
    public static void main(String[] args) {
        MyProxy jdkProxy = new MyProxy();// 创建代理对象
        IUserDao3 userDao3 = new UserDao3();// 创建目标对象
        // 从代理对象中获取增强后的目标对象
        IUserDao3 userDao31 = (IUserDao3) jdkProxy.createProxy(userDao3);
        // 执行方法
        userDao31.addUser();
        userDao31.deleteUser();
    }
}


