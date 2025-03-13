import com.itheima.dao.WorkerMapper;
import com.itheima.pojo.Worker;
import com.itheima.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Auther:bingli
 * ClassName:WorkerTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/3/13-03-13 22:11
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class WorkerTest {

    /**
     * findWorkerById
     */
    @Test
    public void findWorkerByIdTest() {
        // 1.通过工具类获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        // 2.使用WorkerMapper对象查询id为1的员工的信息
        Worker worker = mapper.selectWorker(1);
        System.out.println(worker);
        // 3.关闭SqlSession
        session.close();
    }

    /**
     * insertWorker
     */
    @Test
    public void insertWorkerTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("赵六");
        worker.setAge(36);
        worker.setSex("女");
        worker.setWorker_id("1004");

        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        // 2.插入员工信息
        int result = mapper.insertWorker(worker);
        if (result > 0) {
            System.out.println("成功插入" + result + "条数据");
        } else {
            System.out.println("插入数据失败");
        }
        System.out.println(worker);
        session.commit();
        // 3.关闭SqlSession
        session.close();
    }

    /**
     * updateWorker
     */
    @Test
    public void updateWorkerTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("李华");
        worker.setAge(28);

        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        // 2.更新员工信息
        int result = mapper.updateWorker(worker);
        if (result > 0) {
            System.out.println("成功更新" + result + "条数据");
        } else {
            System.out.println("更新数据失败");
        }
        System.out.println(worker.toString());
        session.commit();
        // 3.关闭SqlSession
        session.close();
    }

    /**
     * deleteWorker
     */
    @Test
    public void deleteWorkerTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        // 2.删除员工信息
        int result = mapper.deleteWorker(4);
        if (result > 0) {
            System.out.println("成功删除" + result + "条数据");
        } else {
            System.out.println("删除数据失败");
        }
        session.commit();
        // 3.关闭SqlSession
        session.close();
    }

    /**
     * param
     */
    @Test
    public void selectWorkerByIdAndNameTest() {
        // 1.通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        // 2.查询id为3姓名为王五的员工的信息
        Worker worker = mapper.selectWorkerByIdAndName(3, "王五");
        System.out.println(worker.toString());
        session.close();
    }


}
