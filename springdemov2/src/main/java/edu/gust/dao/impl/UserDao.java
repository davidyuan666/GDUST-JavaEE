package edu.gust.dao.impl;

import edu.gust.dao.IUserDao;
import java.util.HashMap;
import java.util.Map;

public class UserDao implements IUserDao {
    
    @Override
    public boolean login(String name, String password) {
        if (name == null || password == null) {
            return false;
        }
        return true;
    }
}