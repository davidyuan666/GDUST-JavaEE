package org.gust.dao;
import org.gust.pojo.Worker;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;


public interface WorkerMapper {

    @Select("select * from workers where id = #{id}")
    Worker selectWorker(int id);

    @Insert("insert into workers(worker_name,age,sex,worker_id)"
        +"values(#{worker_name},#{age},#{sex},#{worker_id})")
    int insertWorker(Worker worker);


    @Update("update workers set worker_name = #{worker_name},age = #{age} " +"where id = #{id}")
    int updateWorker(Worker worker);

    @Delete("delete from workers where id = #{id}")
    int deleteWorker(int id);


    @Select("select * from workers where id = #{param01} and worker_name = #{param02}")
    Worker selectWorkerByIdAndName(@Param("param01") int id,
                                        @Param("param02") String name);

}
