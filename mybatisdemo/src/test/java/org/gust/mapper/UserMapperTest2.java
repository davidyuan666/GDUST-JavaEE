import org.gust.dao.UserMapper;
import org.gust.pojo.User;
import org.gust.pojo.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.gust.util.MyBatisUtil;
import org.junit.Test;
import org.junit.Before;

public class UserMapperTest2 {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
    // 一对多关联映射测试
    @Test
    public void testFindUserWithOrders() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectUserById_byannotation(1);
            System.out.println("User details: " + user);
            System.out.println("Orders for user " + user.getUsername() + ":");
            for (Order order : user.getOrders()) {
                System.out.println("\t" + order);
            }
        }
    }
}