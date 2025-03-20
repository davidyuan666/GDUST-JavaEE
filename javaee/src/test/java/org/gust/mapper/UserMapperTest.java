package org.gust.mapper;

import org.gust.pojo.Order;
import org.gust.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.gust.util.MyBatisUtil;

import java.util.List;

public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    @Test
    public void testSelectUserById() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectUserById(1);
            System.out.println(user);
        }
    }

    @Test
    public void testSelectAllUsers() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            List<User> users = mapper.selectAllUsers();
            users.forEach(System.out::println);
        }
    }

    @Test
    public void testInsertUser() {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserMapper mapper = session.getMapper(UserMapper.class);
             // 使用时间戳生成唯一的用户名和邮箱
            long timestamp = System.currentTimeMillis();
            String randomUsername = "user_" + timestamp;
            String randomEmail = "user_" + timestamp + "@example.com";
            
            User user = new User();
            user.setUsername(randomUsername);
            user.setEmail(randomEmail);
            mapper.insertUser(user);
            System.out.println("Inserted user with ID: " + user.getId());
        }
    }

    @Test
    public void testUpdateUser() {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectUserById(1);
            user.setEmail("updated@example.com");
            mapper.updateUser(user);
            System.out.println("Updated user: " + user);
        }
    }

    @Test
    public void testDeleteUser() {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            mapper.deleteUser(10);
            System.out.println("Deleted user with ID: 10");
        }
    }


    // 一对多关联映射测试
    @Test
    public void testFindUserWithOrders() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.findUserWithOrders(1);
            System.out.println("User details: " + user);
            System.out.println("Orders for user " + user.getUsername() + ":");
            for (Order order : user.getOrders()) {
                System.out.println("\t" + order);
            }
        }
    }

}