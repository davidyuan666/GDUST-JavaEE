package org.gust.dao;
import org.gust.pojo.Person;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.One;

public interface PersonMapper {
    @Select("select * from persons where id=#{id}")
    @Results({@Result(column = "card_id", property = "card",
            one = @One(select = "org.gust.dao.IdCardMapper.selectIdCardById"))})
    Person selectPersonById(int id);
}