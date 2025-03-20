package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Auther:bingli
 * ClassName:SpringConfig
 * Package:com.itheima.config
 * Description:
 *
 * @date:2023/4/15-04-15 20:10
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Configuration
@Import({MyBatisConfig.class, JdbcConfig.class})
// 等同于:<context:component-scan base-package="com.itheima.service">
@ComponentScan(value = "com.itheima.service")
// 将MyBatisConfig类和JdbcConfig类交给Spring管理
public class SpringConfig {
}
