package com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:Book
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/3/13-03-13 21:59
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Worker {

    private Integer id;         //主键
    private String name;        //姓名
    private Integer age;        //年龄
    private String sex;         //性别
    private String worker_id;   //工号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", worker_id='" + worker_id + '\'' +
                '}';
    }
}
