package org.gust.mapper;

import org.gust.pojo.Order;
import org.gust.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.gust.util.MyBatisUtil;

import java.util.List;


public class OrderMapperTest {  // Changed from UserMapperTest to match filename

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    @Test
    public void findOrdersTest() {
        // 1.生成SqlSession对象
        SqlSession session = sqlSessionFactory.openSession();  // Use class member and correct method
        try {
            // 2.查询id为1的订单中的商品信息
            OrderMapper orderMapper = session.getMapper(OrderMapper.class);
            Order order = orderMapper.findOrderWithProduct(1);  // Fixed package name and class name
            System.out.println(order);  // 3.输出查询结果信息
        } finally {
            session.close();  // 4.关闭SqlSession
        }
    }
}
