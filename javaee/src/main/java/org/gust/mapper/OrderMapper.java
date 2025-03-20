package org.gust.mapper;

import org.gust.pojo.Order;

public interface OrderMapper {
    // 根据id查询订单信息
    Order findOrderWithProduct(Integer id);
}
