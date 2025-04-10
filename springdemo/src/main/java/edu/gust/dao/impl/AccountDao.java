package edu.gust.dao.impl;
import edu.gust.dao.IAccountDao;
import edu.gust.pojo.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.util.List;


public class AccountDao implements IAccountDao {
    // 定义JdbcTemplate属性，此处省略setter方法
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 这里只展示（添加账户）的操作
    public int addAccount(Account account) {
        String sql = "insert into account(username,balance) value(?,?)";
        Object[] obj = new Object[] {// 定义数组来存放SQL语句中的参数
                account.getUsername(), account.getBalance() 	};
        // 执行添加操作，返回的是受SQL语句影响的记录条数
        return this.jdbcTemplate.update(sql, obj);
    }

    // 实现更新账户方法
    public int updateAccount(Account account) {
        String sql = "update account set username=?, balance=? where id=?";
        Object[] obj = new Object[] {
                account.getUsername(), 
                account.getBalance(),
                account.getId()
        };
        return this.jdbcTemplate.update(sql, obj);
    }

    // 实现删除账户方法
    public int deleteAccount(int id) {
        String sql = "delete from account where id=?";
        return this.jdbcTemplate.update(sql, id);
    }

    // 通过id查询
    public Account findAccountById(int id) {
        String sql = "select * from account where id=?";
        return this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class), id);
    }

    public List<Account> findAllAccount() {
        String sql = "select * from account";
        return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
    }
}