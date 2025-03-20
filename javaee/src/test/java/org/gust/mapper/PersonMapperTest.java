package org.gust.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.gust.pojo.Person;
import org.gust.util.MyBatisUtil;
import org.gust.dao.PersonMapper;
import org.junit.Before;
import org.junit.Test;

public class PersonMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    @Test
    public void selectPersonByIdTest() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            PersonMapper mapper = session.getMapper(PersonMapper.class);
            Person person = mapper.selectPersonById(2);
            System.out.println(person.toString());
        }
    }
}