package com.itheima.demo02_update.dao;

import com.itheima.demo02_update.entity.Account;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:AccountDao
 * Package:com.itheima.demo02_update.dao
 * Description:
 *
 * @date:2023/3/27-03-27 1:02
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface AccountDao {
    // 添加
    public int addAccount(Account account);
    // 更新
    public int updateAccount(Account account);
    // 删除
    public int deleteAccount(int id);
    // 通过id查询
    public Account findAccountById(int id);
    // 查询所有账户
    public List<Account> findAllAccount();
}
