package org.gust.mapper;

import org.gust.pojo.Person;

public interface PersonMapper {
    // 根据id查询人员信息
    Person findPersonById(Integer id);
}
