package edu.gust.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import edu.gust.dao.IUserDao3;
import edu.gust.aop.MyAspect;

public class MyProxy implements InvocationHandler {
    private IUserDao3 userDao3;
    public  Object createProxy(IUserDao3 userDao3) {
        this.userDao3 = userDao3;
        ClassLoader classLoader = MyProxy.class.getClassLoader(); // 1.类加载器
        Class[] classes = userDao3.getClass().getInterfaces(); // 2.被代理对象实现的所有接口
        return  Proxy.newProxyInstance(classLoader,classes,this); // 3.返回代理对象
    }

    /**
     * 所有动态代理类的方法调用，都会交由invoke()方法去处理
     * proxy 被代理的对象
     * method 将要被执行的方法信息（反射）
     * args 执行方法时需要的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 创建切面对象
        MyAspect myAspect = new MyAspect();
        // 前增强
        myAspect.check_Permissions();
        // 在目标类上调用方法，并传入参数
        Object obj = method.invoke(userDao3, args);
        // 后增强
        myAspect.log();
        return obj;
    }

}