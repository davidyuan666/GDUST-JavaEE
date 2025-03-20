package org.gust.mapper;

import org.gust.pojo.IdCard;

public interface IdCardMapper {
    // 根据id查询证件信息
    IdCard findCodeById(Integer id);
}
