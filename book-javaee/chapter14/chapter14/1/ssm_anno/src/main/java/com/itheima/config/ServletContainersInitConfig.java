package com.itheima.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Auther:bingli
 * ClassName:ServletContainersInitConfig
 * Package:com.itheima.config
 * Description:
 *
 * @date:2023/4/15-04-15 20:23
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    // 加载Spring配置类中的信息，初始化Spring容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    // 加载Spring MVC配置类中的信息，初始化Spring MVC容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    //配置DispatcherServlet的映射路径.
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
