package org.gust.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Many;
import java.util.List;
import org.gust.pojo.Order;

public interface OrderMapper {
    @Select("select * from orders where user_id=#{user_id}")
    @Results({
        @Result(id = true, column = "id", property = "id"),
        @Result(column = "number", property = "number")
    })
    List<Order> selectOrdersByUserId(int user_id);



    @Select("select * from orders where id=#{id} ")
    @Results({@Result(id = true,column = "id",property = "id"),
            @Result(column = "number",property = "number"),
            @Result(column = "id",property = "products",many 	= @Many(select = "org.gust.dao.ProductMapper.selectProductByOrdersId"))})
    Order selectOrdersById(int id);



}