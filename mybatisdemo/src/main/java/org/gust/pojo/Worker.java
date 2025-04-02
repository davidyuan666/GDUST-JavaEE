package org.gust.pojo;

public class Worker {
    private Integer id;   
    private String worker_name;     
    private Integer age;
    private String sex;
    private String worker_id;
    
    // Getter and Setter methods
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getWorker_name() {
        return worker_name;
    }
    
    public void setWorker_name(String worker_name) {
        this.worker_name = worker_name;
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
        return "Worker{" + "id=" + id + ", worker_name=" + worker_name +
                ", age=" + age + ", sex=" + sex + ", worker_id=" + worker_id + '}';
    }
}