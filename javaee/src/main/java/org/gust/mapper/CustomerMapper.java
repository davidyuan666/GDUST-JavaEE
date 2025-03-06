package org.gust.mapper;

import org.gust.pojo.Customer;
import java.util.List;
import java.util.Map;  // 添加这个导入语句

public interface CustomerMapper {
    // 根据ID查询客户
    Customer selectCustomerById(Long id);
    
    // 查询所有客户
    List<Customer> selectAll();
    
    // 插入新客户
    void insert(Customer customer);
    
    // 更新客户信息
    void update(Customer customer);
    
    // 删除客户
    void delete(Long id);

    // 根据条件查询客户
    List<Customer> queryCustomersByCondition(Map<String, Object> queryParams);

    // 根据条件查询客户
    List<Customer> queryCustomersByChoose(Customer customer);
}