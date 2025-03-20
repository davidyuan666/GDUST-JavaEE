package com.itheima.demo03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Auther:bingli
 * ClassName:XmlAdvice
 * Package:com.itheima.demo03
 * Description:
 *
 * @date:2023/3/27-03-27 0:05
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class XmlAdvice {

    //使用JoinPoint接口实例作为参数获得目标对象的类名和方法名
    //前置通知
    public void before(JoinPoint joinPoint) {
        System.out.print("这是前置通知!");
        System.out.print("目标类是：" + joinPoint.getTarget());
        System.out.println("，被织入增强处理的目标方法为：" +
                joinPoint.getSignature().getName());
    }

    //返回通知
    public void afterReturning(JoinPoint joinPoint) {
        System.out.print("这是返回通知（方法不出现异常时调用）!");
        System.out.println("被织入增强处理的目标方法为：" +
                joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知
     * ProceedingJoinPoint 是JoinPoint子接口，表示可以执行目标方法
     * 1.必须是Object类型的返回值
     * 2.必须接收一个参数，类型为ProceedingJoinPoint
     * 3.必须throws Throwable
     */
    // 使用ProceedingJoinPoint接口实例作为参数获得目标对象的类名和方法名
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("这是环绕通知之前的部分！");
        //调用目标方法
        Object object = point.proceed();
        System.out.println("这是环绕通知之后的部分！");
        return object;
    }

    //异常通知
    public void afterException() {
        System.out.println("异常通知！");
    }

    //后置通知
    public void after() {
        System.out.println("这是后置通知！");
    }
}
