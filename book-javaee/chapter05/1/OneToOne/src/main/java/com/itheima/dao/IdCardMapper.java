package com.itheima.dao;

import com.itheima.pojo.IdCard;
import org.apache.ibatis.annotations.Select;

/**
 * Auther:bingli
 * ClassName:IdCardMapper
 * Package:com.itheima.dao
 * Description:
 *
 * @date:2023/3/13-03-13 22:28
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface IdCardMapper {

    @Select("select * from tb_idcard where id=#{id}")
    IdCard selectIdCardById(int id);

}
