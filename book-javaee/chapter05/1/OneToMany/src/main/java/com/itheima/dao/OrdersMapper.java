package com.itheima.dao;

import com.itheima.pojo.Orders;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:OrdersMapper
 * Package:com.itheima.dao
 * Description:
 *
 * @date:2023/3/13-03-13 22:39
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface OrdersMapper {

    @Select("select * from tb_orders where user_id_foreign=#{id}")
    @Results({@Result(id = true, column = "orders_id", property = "id"),
            @Result(column = "number", property = "number")})
    List<Orders> selectOrdersByUserId(int user_id);

}
