package com.itheima.dao;

import com.itheima.pojo.Users;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Auther:bingli
 * ClassName:UsersMapper
 * Package:com.itheima.dao
 * Description:
 *
 * @date:2023/3/13-03-13 22:35
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface UsersMapper {

    @Select("select * from tb_user where user_id=#{id} ")
    @Results({@Result(id = true, column = "user_id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(column = "address", property = "address"),
            @Result(column = "user_id", property = "ordersList",
                    many = @Many(select = "com.itheima.dao.OrdersMapper.selectOrdersByUserId"))})
    Users selectUserById(int id);

}
