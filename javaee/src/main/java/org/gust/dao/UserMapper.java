package org.gust.dao;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Many;
import org.gust.pojo.User;

public interface UserMapper {
    @Select("select * from users where id=#{id} ")
    @Results({@Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "address",property = "address"),
            @Result(column = "id",property = "orders",
                    many = @Many(select = "org.gust.dao.OrderMapper.selectOrdersByUserId"))})
    User selectUserById_byannotation(int id);

}
