package edu.gust.springdemov2;

public class Hello {
    private String userName;
    
    // Add constructor
    public Hello() {
        this.userName = "Guest";
    }
    
    // Add parameterized constructor
    public Hello(String userName) {
        this.userName = userName;
    }
    
    // Existing setter method
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    // Add getter method
    public String getUserName() {
        return userName;
    }
    
    // Existing show method
    public void show() {
        System.out.println(userName + ":欢迎来到Spring");
    }
    
    // Add toString method
    @Override
    public String toString() {
        return "Hello [userName=" + userName + "]";
    }
}