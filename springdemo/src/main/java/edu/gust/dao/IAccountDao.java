package edu.gust.dao;
import edu.gust.pojo.Account;

public interface IAccountDao {
    // 添加
    public int addAccount(Account account);
    // 更新
    public int updateAccount(Account account);
    // 删除
    public int deleteAccount(int id);
}

