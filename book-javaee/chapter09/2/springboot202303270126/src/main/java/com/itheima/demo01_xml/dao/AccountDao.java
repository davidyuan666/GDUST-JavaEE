package com.itheima.demo01_xml.dao;

/**
 * Auther:bingli
 * ClassName:AccountDao
 * Package:com.itheima.demo01_xml.dao
 * Description:
 *
 * @date:2023/3/27-03-27 1:33
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface AccountDao {
    // 转账
    public void transfer(String outUser, String inUser, Double money);
}
