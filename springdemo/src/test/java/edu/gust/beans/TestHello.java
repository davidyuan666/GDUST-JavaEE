package edu.gust.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
        public static void main(String[] args) {
        //初始化spring容器，加载applicationContext.xml配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取配置中helloSpring的实例
        Hello helloBean = (Hello) applicationContext.getBean("helloBean");
        helloBean.show();//调用方法

    }
}
