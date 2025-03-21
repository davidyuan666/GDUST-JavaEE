package edu.gust.service.impl;

import org.springframework.stereotype.Service;
import edu.gust.service.IUserService2;
import edu.gust.dao.impl.UserDao2;
import javax.annotation.Resource;

@Service("userService2")
public class UserService2 implements IUserService2 {
    //使用@Resource注解注入UserDao
    @Resource(name="userDao2")
    private UserDao2 userDao2;
    public void save(){
        this.userDao2.save();
        System.out.println("执行UserService2.save()");
    }
}

