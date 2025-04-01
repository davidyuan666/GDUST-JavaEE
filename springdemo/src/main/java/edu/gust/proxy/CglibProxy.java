package edu.gust.proxy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import edu.gust.aop.MyAspect;

public class CglibProxy implements MethodInterceptor {
    public  Object createProxy(Object target) {// 代理方法
        Enhancer enhancer = new Enhancer();// 创建一个动态类对象
        enhancer.setSuperclass(target.getClass());// 确定需要增强的类，设置其父类
        enhancer.setCallback(this);// 添加回调函数
        return enhancer.create();// 返回创建的代理类
    }

    /**
     * proxy CGlib根据指定父类生成的代理对象
     * method 拦截的方法
     * args 拦截方法的参数数组
     * methodProxy 方法的代理对象，用于执行父类的方法
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 创建切面类对象
        MyAspect myAspect = new MyAspect();
        // 前增强
        myAspect.check_Permissions();
        // 目标方法执行
        Object obj = methodProxy.invokeSuper(proxy, args);
        // 后增强
        myAspect.log();
        return obj;
    }
}
