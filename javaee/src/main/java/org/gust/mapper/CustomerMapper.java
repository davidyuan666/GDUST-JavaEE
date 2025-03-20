package org.gust.mapper;

import org.gust.pojo.Customer;
import java.util.List;
import java.util.Map;  // 添加这个导入语句

public interface CustomerMapper {
    // 根据ID查询客户
    Customer selectCustomerById(Long id);
    
    List<Customer> queryCustomersByCondition(Map<String, Object> queryParams);

    // 根据条件查询客户
    List<Customer> queryCustomersByChoose(Customer customer);

    List<Customer> findCustomerByNameAndJobs(Customer customer);

    List<Customer> findCustomerByNameOrJobs(Customer customer);

    List<Customer> findCustomerByNameAndJobs2(Customer customer);

    List<Customer> findCustomerByNameAndJobs3(Customer customer);

    List<Customer> findCustomerByNameAndJobs4(Customer customer);

    void updateCustomerBySet(Customer customer);

    void updateCustomerByTrim(Customer customer);

    List<Customer> findByArray(Long[] ids);

    List<Customer> findByList(List<Long> ids);

    List<Customer> findByMap(Map<String, Object> map);
    
    
}