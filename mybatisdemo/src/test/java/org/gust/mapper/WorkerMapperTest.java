package org.gust.mapper;

import org.gust.pojo.Worker;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.gust.util.MyBatisUtil;
import org.gust.dao.WorkerMapper;

public class WorkerMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    @Test
    public void findWorkerByIdTest() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            WorkerMapper mapper = session.getMapper(WorkerMapper.class);
            // 查询id为1的员工信息
            Worker worker = mapper.selectWorker(1);
            System.out.println(worker);
        }
    }


    @Test
    public void insertWorkerTest() {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            WorkerMapper mapper = session.getMapper(WorkerMapper.class);
            Worker worker = new Worker();
            worker.setId(5);
            worker.setWorker_name("赵六");
            worker.setAge(36);
            worker.setSex("女");
            worker.setWorker_id("1005");
            int result = mapper.insertWorker(worker); 
            System.out.println(result);
        } 
    } 

    @Test
    public void updateWorkerTest() {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            WorkerMapper mapper = session.getMapper(WorkerMapper.class);
            Worker worker = new Worker();
            worker.setId(4);
            worker.setWorker_name("大李华");
            worker.setAge(28);
            int result = mapper.updateWorker(worker); 
            System.out.println(result);
        }
    }


    @Test
    public void deleteWorkerTest() {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            WorkerMapper mapper = session.getMapper(WorkerMapper.class);
            int result = mapper.deleteWorker(4);
            if (result > 0) {
                System.out.println("成功删除" + result + "条数据");
            } else {
                System.out.println("删除数据失败");
            }
        }
    }


    @Test
    public void selectWorkerByIdAndNameTest() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            WorkerMapper mapper = session.getMapper(WorkerMapper.class);
            Worker worker = mapper.selectWorkerByIdAndName(3,"王五");
            System.out.println(worker.toString());
        }
    }




}