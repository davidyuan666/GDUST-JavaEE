package org.gust.dao;

import org.gust.pojo.IdCard;
import org.apache.ibatis.annotations.Select;

public interface IdCardMapper {
    @Select("select * from idcards where id=#{id}")
    IdCard selectIdCardById(int id);
}