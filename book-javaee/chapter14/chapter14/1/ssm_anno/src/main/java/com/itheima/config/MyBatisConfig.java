package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Auther:bingli
 * ClassName:MyBatisConfig
 * Package:com.itheima.config
 * Description:
 *
 * @date:2023/4/15-04-15 20:05
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class MyBatisConfig {

    // 定义MyBatis的核心连接工厂bean,等同于:<bean class="org.mybatis.spring.SqlSessionFactoryBean">
    // 参数使用自动装配的形式加载dataSource，为set注入提供数据源，dataSource来源于JdbcConfig中的配置
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(@Autowired DataSource dataSource) {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        //等同于<property name="dataSource" ref="dataSource"/>
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    // 定义MyBatis的映射扫描,等同于:<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        //等同于<property name="basePackage" value="com.itheima.dao"/>
        msc.setBasePackage("com.itheima.dao");
        return msc;
    }

}
