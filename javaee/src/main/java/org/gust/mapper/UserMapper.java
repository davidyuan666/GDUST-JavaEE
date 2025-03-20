package org.gust.mapper;

import org.gust.pojo.User;
import java.util.List;

public interface UserMapper {
    // 根据ID查询用户
    User selectUserById(Integer id);
    
    // 查询所有用户
    List<User> selectAllUsers();
    
    // 插入新用户
    void insertUser(User user);
    
    // 更新用户信息
    void updateUser(User user);
    
    // 删除用户
    void deleteUser(Integer id);

    // 一对多关联映射
    User findUserWithOrders(Integer userId);
}