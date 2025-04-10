package edu.gust.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdTemplate.execute("DROP TABLE IF EXISTS account");
        jdTemplate.execute("CREATE TABLE account (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "username VARCHAR(50)," + 
                "balance DOUBLE," +
                "INDEX(username)" + 
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4");
        System.out.println("账户表account创建成功！");
    }
}

