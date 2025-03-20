package com.itheima.demo02;

/**
 * Auther:bingli
 * ClassName:MyAspect
 * Package:com.itheima.demo01
 * Description:
 *
 * @date:2023/3/26-03-26 23:27
 * @author:2550976002@qq.com
 * @version:1.0
 */
//切面类：存在多个通知Advice（增强的方法）
public class MyAspect {
    public void check_Permissions() {
        System.out.println("模拟检查权限...");
    }

    public void log() {
        System.out.println("模拟记录日志...");
    }
}
