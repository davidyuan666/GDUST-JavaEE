package org.gust.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.gust.pojo.Person;
import org.gust.util.MyBatisUtil;
import org.junit.Before;
import org.junit.Test;

public class IdCardMapperTest {
    
    private SqlSessionFactory sqlSessionFactory;
    
    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
    
    @Test
    public void findPersonByIdTest() {
        SqlSession session = null;
        try {
            // 通过工具类获取SqlSession对象
            session = sqlSessionFactory.openSession();
            
            // 使用MyBatis嵌套查询的方式查询id为1的人的信息
            Person person = session.selectOne(
                "org.gust.mapper.PersonMapper.findPersonById", 
                1
            );
            
            // 输出查询结果信息
            System.out.println(person);
            
        } catch (Exception e) {
            System.out.println("查询人员信息失败：" + e.getMessage());
        } finally {
            // 关闭SqlSession
            if (session != null) {
                session.close();
            }
        }
    }
}