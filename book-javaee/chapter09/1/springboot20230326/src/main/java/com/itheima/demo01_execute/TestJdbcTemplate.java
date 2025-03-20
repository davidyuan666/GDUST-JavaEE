package com.itheima.demo01_execute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Auther:bingli
 * ClassName:TestJdbcTemplate
 * Package:com.itheima.demo01_execute
 * Description:
 *
 * @date:2023/3/27-03-27 0:46
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class TestJdbcTemplate {

    /**
     * 调用execute()方法建表
     */
    public static void main(String[] args) {
        // 初始化spring容器，加载applicationContext.xml配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器，获取JdbcTemplate的实例
        JdbcTemplate jdTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        // 使用execute()方法执行SQL语句，创建用户账户管理表account
        jdTemplate.execute("create table account(" +
                "id int primary key auto_increment," +
                "username varchar(50)," +
                "balance double)");
        System.out.println("账户表account创建成功！");
    }

}
