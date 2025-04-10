package edu.gust.dao.impl;
import edu.gust.dao.IAccountDao;
import edu.gust.beans.Account;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDao implements IAccountDao {
    // 定义JdbcTemplate属性，此处省略setter方法
    private JdbcTemplate jdbcTemplate;
    // 这里只展示（添加账户）的操作
    public int addAccount(Account account) {
        String sql = "insert into account(username,balance) value(?,?)";
        Object[] obj = new Object[] {// 定义数组来存放SQL语句中的参数
                account.getUsername(), account.getBalance() 	};
        // 执行添加操作，返回的是受SQL语句影响的记录条数
        return this.jdbcTemplate.update(sql, obj);}
}

