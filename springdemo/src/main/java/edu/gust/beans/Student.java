package edu.gust.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("student")
public class Student {
    @Value("1")
    private String id;
    @Value("张三")
    private String name;
    
    // 添加getter/setter方法
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // 实现toString()方法
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    
    @PostConstruct
    public void init(){System.out.println("Bean的初始化完成，调用init()方法");	}
    @PreDestroy
    public void destroy(){System.out.println("Bean销毁前调用destroy()方法");		}}