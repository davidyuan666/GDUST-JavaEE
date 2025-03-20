package com.itheima.dao;

import com.itheima.pojo.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Auther:bingli
 * ClassName:PersonMapper
 * Package:com.itheima.dao
 * Description:
 *
 * @date:2023/3/13-03-13 23:00
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface PersonMapper {

    @Select("select * from tb_person where id=#{id}")
    @Results({@Result(column = "card_id_id", property = "card",
            one = @One(select = "com.itheima.dao.IdCardMapper.selectIdCardById"))})
    Person selectPersonById(int id);

}
