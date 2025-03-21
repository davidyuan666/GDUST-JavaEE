package edu.gust.pojo;

public class User1 {
    private int id;
    private String name;
    private String password;
    
    public User1(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String toString() {
        return "id=" + id + ", name=" + name + ", password=" + password;
    }
}