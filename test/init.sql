-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS test;
USE test;

-- 创建用户表
CREATE TABLE IF NOT EXISTS users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100)
);

-- 插入测试数据
INSERT INTO users (username, email) VALUES
    ('admin', 'admin@example.com'),
    ('zhangsan', 'zhangsan@example.com'),
    ('lisi', 'lisi@example.com'),
    ('wangwu', 'wangwu@example.com'),
    ('zhaoliu', 'zhaoliu@example.com');