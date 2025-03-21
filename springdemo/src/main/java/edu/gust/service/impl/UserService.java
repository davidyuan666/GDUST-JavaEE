package edu.gust.service.impl;

import edu.gust.service.IUserService;
import edu.gust.dao.IUserDao;

public class UserService implements IUserService {
    IUserDao userDao;
    public void setUserDao(IUserDao userDao)
    { this.userDao=userDao; }
    @Override
    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}