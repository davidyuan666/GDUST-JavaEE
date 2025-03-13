package org.gust.mapper;

import org.gust.pojo.Customer;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.gust.util.MyBatisUtil;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;


public class CustomerMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    /**
     * 根据客户姓名和职业组合条件查询客户信息列表
     */
    @Test
    public void testFindCustomerByNameAndJobs() {
        SqlSession session = null;
        try {
            // 通过工具类获取SqlSession对象
            session = sqlSessionFactory.openSession();
            
            // 创建Customer对象，封装需要组合查询的条件
            Customer customer = new Customer();
            customer.setName("李四");
            customer.setJobs("工程师");
            
            // 执行SqlSession的查询方法，返回结果集
            List<Customer> customers = session.selectList(
                "org.gust.mapper.CustomerMapper.findCustomerByNameAndJobs", 
                customer
            );
            
            // 输出查询结果信息
            for (Customer customer2 : customers) {
                System.out.println(customer2);
            }
        } catch (Exception e) {
            System.out.println("查询客户信息失败：" + e.getMessage());
        } finally {
            // 关闭SqlSession
            if (session != null) {
                session.close();
            }
        }
    }

    /**
     * 根据客户姓名或职业查询客户信息列表
     */
    @Test
    public void testFindCustomerByNameOrJobs() {
        SqlSession session = null;
        try {
            // 通过工具类获取SqlSession对象
            session = sqlSessionFactory.openSession();
            
            // 创建Customer对象，封装需要组合查询的条件
            Customer customer = new Customer();
             customer.setName("李四");
             customer.setJobs("老师");
            
            // 执行SqlSession的查询方法，返回结果集
            List<Customer> customers = session.selectList(
                "org.gust.mapper.CustomerMapper.findCustomerByNameOrJobs", 
                customer
            );
            
            // 输出查询结果信息
            for (Customer customer2 : customers) {
                System.out.println(customer2);
            }
        } catch (Exception e) {
            System.out.println("查询客户信息失败：" + e.getMessage());
        } finally {
            // 关闭SqlSession
            if (session != null) {
                session.close();
            }
        }
    }

    /**
     * 使用set元素更新客户信息
     */
    @Test
    public void testUpdateCustomerBySet() {
        SqlSession session = null;
        try {
            // 获取SqlSession
            session = sqlSessionFactory.openSession();
            
            // 创建Customer对象，并向对象中添加数据
            Customer customer = new Customer();
            customer.setId(3L);
            customer.setPhone("1111111");
            
            // 执行SqlSession的更新方法，返回的是SQL语句影响的行数
            int rows = session.update(
                "org.gust.mapper.CustomerMapper.updateCustomerBySet", 
                customer
            );
            
            // 通过返回结果判断更新操作是否执行成功
            if (rows > 0) {
                System.out.println("您成功修改了" + rows + "条数据！");
                // 提交事务
                session.commit();
            } else {
                System.out.println("执行修改操作失败！！！");
                // 回滚事务
                session.rollback();
            }
        } catch (Exception e) {
            System.out.println("更新客户信息失败：" + e.getMessage());
            // 发生异常时回滚事务
            if (session != null) {
                session.rollback();
            }
        } finally {
            // 关闭SqlSession
            if (session != null) {
                session.close();
            }
        }
    }

    /**
     * 使用trim元素更新客户信息
     */
    @Test
    public void testUpdateCustomerByTrim() {
        SqlSession session = null;
        try {
            // 获取SqlSession
            session = sqlSessionFactory.openSession();
            
            // 创建Customer对象，并向对象中添加数据
            Customer customer = new Customer();
            customer.setId(3L);
            customer.setPhone("222222222");
            
            // 执行SqlSession的更新方法，返回的是SQL语句影响的行数
            int rows = session.update(
                "org.gust.mapper.CustomerMapper.updateCustomerByTrim", 
                customer
            );
            
            // 通过返回结果判断更新操作是否执行成功
            if (rows > 0) {
                System.out.println("您成功修改了" + rows + "条数据！");
                // 提交事务
                session.commit();
            } else {
                System.out.println("执行修改操作失败！！！");
                // 回滚事务
                session.rollback();
            }
        } catch (Exception e) {
            System.out.println("更新客户信息失败：" + e.getMessage());
            // 发生异常时回滚事务
            if (session != null) {
                session.rollback();
            }
        } finally {
            // 关闭SqlSession
            if (session != null) {
                session.close();
            }
        }
    }
}