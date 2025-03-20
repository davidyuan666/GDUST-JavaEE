import com.itheima.pojo.Customer;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Auther:bingli
 * ClassName:CustomerTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/2/26-02-26 21:36
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class CustomerTest {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;


    /**
     * 根据客户姓名和职业组合条件查询客户信息列表
     */
    @Test
    public void findCustomerByNameAndJobsTest() {
        // 通过工具类获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 创建Customer对象，封装需要组合查询的条件
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        // 执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.itheima.mapper.CustomerMapper.findCustomerByNameAndJobs3", customer);
        // 输出查询结果信息
        for (Customer customer2 : customers) {
            // 打印输出结果
            System.out.println(customer2);
        }
        // 关闭SqlSession
        session.close();
    }

    /**
     * 根据客户姓名或职业查询客户信息列表
     */
    @Test
    public void findCustomerByNameOrJobsTest() {
        // 通过工具类获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 创建Customer对象，封装需要组合查询的条件
        Customer customer = new Customer();
        //customer.setUsername("tom");
        //customer.setJobs("teacher");
        // 执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.itheima.mapper.CustomerMapper.findCustomerByNameOrJobs", customer);
        // 输出查询结果信息
        for (Customer customer2 : customers) {
            // 打印输出结果
            System.out.println(customer2);
        }
        // 关闭SqlSession
        session.close();
    }

    /**
     * 更新客户信息
     */
    @Test
    public void updateCustomerBySetTest() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        // 创建Customer对象，并向对象中添加数据
        Customer customer = new Customer();
        customer.setId(3);
        customer.setPhone("13311111234");
        // 执行SqlSession的更新方法，返回的是SQL语句影响的行数
        int rows = sqlSession.update("com.itheima.mapper.CustomerMapper.updateCustomerBySet", customer);
        // 通过返回结果判断更新操作是否执行成功
        if (rows > 0) {
            System.out.println("您成功修改了" + rows + "条数据！");
        } else {
            System.out.println("执行修改操作失败！！！");
        }
        // 提交事务
        sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    /**
     * 更新客户信息
     */
    @Test
    public void updateCustomerByTrimTest() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();
        // 创建Customer对象，并向对象中添加数据
        Customer customer = new Customer();
        customer.setId(3);
        customer.setPhone("13311111111");
        // 执行SqlSession的更新方法，返回的是SQL语句影响的行数
        int rows = sqlSession.update("com.itheima.mapper.CustomerMapper.updateCustomerByTrim", customer);
        // 通过返回结果判断更新操作是否执行成功
        if (rows > 0) {
            System.out.println("您成功修改了" + rows + "条数据！");
        } else {
            System.out.println("执行修改操作失败！！！");
        }
        // 提交事务
        sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    /**
     * 根据客户id批量查询客户信息
     */
    @Test
    public void findByArrayTest() {
        // 获取SqlSession
        SqlSession session = MyBatisUtils.getSession();
        // 创建数组，封装查询id
        Integer[] roleIds = {2, 3};
        // 执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.itheima.mapper.CustomerMapper.findByArray", roleIds);
        // 输出查询结果信息
        for (Customer customer : customers) {
            // 打印输出结果
            System.out.println(customer);
        }
        // 关闭SqlSession
        session.close();
    }

    /**
     * 根据客户id批量查询客户信息
     */
    @Test
    public void findByListTest() {
        // 获取SqlSession
        SqlSession session = MyBatisUtils.getSession();
        // 创建List集合，封装查询id
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        // 执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.itheima.mapper.CustomerMapper.findByList", ids);
        // 输出查询结果信息
        for (Customer customer : customers) {
            // 打印输出结果
            System.out.println(customer);
        }
        // 关闭SqlSession
        session.close();
    }

    /**
     * 根据客户id批量查询客户信息
     */
    @Test
    public void findByMapTest() {
        // 获取SqlSession
        SqlSession session = MyBatisUtils.getSession();
        // 创建List集合，封装查询id
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        Map<String, Object> conditionMap = new HashMap<String, Object>();
        conditionMap.put("id", ids);
        conditionMap.put("jobs", "teacher");
        System.out.println(conditionMap);
        // 执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.itheima.mapper.CustomerMapper.findByMap", conditionMap);
        // 输出查询结果信息
        for (Customer customer : customers) {
            // 打印输出结果
            System.out.println(customer);
        }
        // 关闭SqlSession
        session.close();
    }

}
