package com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:Student
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/2/19-02-19 23:23
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Student {
    private Integer id;            //主键id
    private String name;          //学生姓名
    private Integer age;          //学生年龄

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
