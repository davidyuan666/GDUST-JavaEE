package com.itheima.demo01_xml.dao.impl;

import com.itheima.demo01_xml.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Auther:bingli
 * ClassName:AccountDaoImpl
 * Package:com.itheima.demo01_xml.dao.impl
 * Description:
 *
 * @date:2023/3/27-03-27 1:33
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class AccountDaoImpl implements AccountDao {

    // 定义JdbcTemplate属性及其setter方法
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 转账
     * inUser：收款人
     * outUser：汇款人
     * money：收款金额
     */
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        // 收款时，收款用户的余额=现有余额+所汇金额
        this.jdbcTemplate.update("update account set balance = balance +? where username = ?", money, inUser);
        // 模拟系统运行时的突发性问题
        int i = 1 / 0;
        // 汇款时，汇款用户的余额=现有余额-所汇金额
        this.jdbcTemplate.update("update account set balance = balance-? where username = ?", money, outUser);
    }

}
