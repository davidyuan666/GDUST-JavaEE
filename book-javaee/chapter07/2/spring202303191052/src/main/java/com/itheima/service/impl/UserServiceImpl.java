package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Auther:bingli
 * ClassName:UserServiceImpl
 * Package:com.itheima.service.impl
 * Description:
 *
 * @date:2023/3/19-03-19 11:07
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    //使用@Resource注解注入UserDao
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("执行UserServiceImpl.save()");
    }
}
