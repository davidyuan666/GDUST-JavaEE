package com.itheima.dao;

import com.itheima.pojo.Orders;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Auther:bingli
 * ClassName:OrdersMapper
 * Package:com.itheima.dao
 * Description:
 *
 * @date:2023/3/14-03-14 5:36
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface OrdersMapper {

    @Select("select * from tb_orders where orders_id=#{id} ")
    @Results({@Result(id = true, column = "orders_id", property = "id"),
            @Result(column = "number", property = "number"),
            @Result(column = "orders_id", property = "productList",
                    many = @Many(select = "com.itheima.dao.ProductMapper.selectProductByOrdersId"))})
    Orders selectOrdersById(int id);

}
