package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Auther:bingli
 * ClassName:SpringMvcConfig
 * Package:com.itheima.config
 * Description:
 *
 * @date:2023/4/15-04-15 20:12
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Configuration
//等同于<context:component-scan base-package="com.itheima.controller"/>
@ComponentScan("com.itheima.controller")
//等同于<mvc:annotation-driven/>，还不完全相同
// https://blog.csdn.net/zxc123e/article/details/84636521
@EnableWebMvc
public class SpringMvcConfig {
}
