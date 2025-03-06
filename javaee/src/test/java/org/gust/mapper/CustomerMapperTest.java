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

    @Test
    public void testInsertCustomer() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            CustomerMapper mapper = session.getMapper(CustomerMapper.class);
            // 创建新客户对象
            Customer customer = new Customer();
            customer.setName("李四");
            customer.setPhone("13912345678");
            customer.setEmail("lisi@example.com");
            customer.setAddress("北京市朝阳区");
            customer.setJobs("工程师");
            
            // 执行插入操作
            mapper.insert(customer);
            
            // 提交事务
            session.commit();
            
            // 验证ID是否被正确设置
            assert customer.getId() != null : "插入后的ID不应该为null";
            System.out.println("插入成功，新客户ID: " + customer.getId());
        }
    }



    @Test
    public void testQueryAllCustomers() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            CustomerMapper mapper = session.getMapper(CustomerMapper.class);
            
            // 查询所有客户
            List<Customer> customers = mapper.selectAll();
            
            // 验证查询结果
            assert customers != null;
            System.out.println("总共查询到 " + customers.size() + " 个客户:");
            customers.forEach(customer -> {
                System.out.println("ID: " + customer.getId() + 
                                 ", 姓名: " + customer.getName() + 
                                 ", 电话: " + customer.getPhone() + 
                                 ", 职位: " + customer.getJobs());
            });
        }
    }

    @Test
    public void testDeleteCustomer() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            CustomerMapper mapper = session.getMapper(CustomerMapper.class);

            // 指定要删除的客户ID
            Long customerId = 1L; // 替换为实际要删除的客户ID

            // 执行删除操作
            mapper.delete(customerId);

            // 提交事务
            session.commit();

            // 验证删除结果
            System.out.println("成功删除客户，ID: " + customerId);
        }
    }


    @Test
    public void testQueryCustomersbyCondition() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            CustomerMapper mapper = session.getMapper(CustomerMapper.class);
            // 创建查询条件
            Customer queryParams = new Customer();
            queryParams.setName("李");  // 按名字模糊查询
            queryParams.setPhone("139");    // 按电话号码模糊查询

            // 直接使用Customer对象进行查询
            List<Customer> customers = mapper.queryCustomersByChoose(queryParams);
            
            // 验证查询结果
            customers.forEach(System.out::println);
        } 
    }



}