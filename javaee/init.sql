-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS gust;
USE gust;

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


-- 完整的表结构现在应该是：
CREATE TABLE customer (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    phone VARCHAR(20),
    email VARCHAR(255),
    address VARCHAR(255),
    jobs VARCHAR(255),
    create_time DATETIME,
    update_time DATETIME
);


INSERT INTO customer (name, phone, email, address, jobs, create_time, update_time) VALUES 
('张三', '13800138000', 'zhangsan@example.com', '北京市海淀区', '工程师', NOW(), NOW()),
('李四', '13800138001', 'lisi@example.com', '北京市朝阳区', '经理', NOW(), NOW()),
('王五', '13800138002', 'wangwu@example.com', '北京市西城区', '经理', NOW(), NOW()),
('赵六', '13800138003', 'zhaoliu@example.com', '北京市东城区', '经理', NOW(), NOW());



