
package org.gust.mapper;

import org.gust.pojo.Order;
import org.gust.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.gust.util.MyBatisUtil;
import org.gust.dao.OrderMapper;
import java.util.List;


public class OrderMapperTest2 {  // Changed from UserMapperTest to match filename

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    @Test
    public void selectOrdersByIdTest() {
        // 使用try-with-resources确保SqlSession正确关闭
        try (SqlSession session = sqlSessionFactory.openSession()) {
            OrderMapper mapper = session.getMapper(OrderMapper.class);
            // 查询id为3的订单的信息
            Order order = mapper.selectOrdersById(3);
            System.out.println(order.toString());
        }
    }

}


