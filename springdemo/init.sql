-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS gust;
USE gust;

-- 首先删除有外键关系的表
DROP TABLE IF EXISTS order_items;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS persons;

-- 然后删除其他表
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS idcards;
DROP TABLE IF EXISTS workers;



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


-- 创建订单表并与用户表关联
CREATE TABLE IF NOT EXISTS orders (
    id int(32) PRIMARY KEY AUTO_INCREMENT,
    order_number varchar(32),
    order_price decimal(10,2),
    user_id int(32),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

-- 插入订单示例数据
INSERT INTO orders (order_number, order_price, user_id) VALUES
    ('ORDER001', 100.50, 1),
    ('ORDER002', 200.75, 1),
    ('ORDER003', 150.25, 2);


    

-- 完整的表结构现在应该是：
CREATE TABLE IF NOT EXISTS customers (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    phone VARCHAR(20),
    email VARCHAR(255),
    address VARCHAR(255),
    jobs VARCHAR(255),
    create_time DATETIME,
    update_time DATETIME
);


INSERT INTO customers (name, phone, email, address, jobs, create_time, update_time) VALUES
('张三', '13800138000', 'zhangsan@example.com', '北京市海淀区', '工程师', NOW(), NOW()),
('李四', '13800138001', 'lisi@example.com', '北京市朝阳区', '经理', NOW(), NOW()),
('王五', '13800138002', 'wangwu@example.com', '北京市西城区', '经理', NOW(), NOW()),
('赵六', '13800138003', 'zhaoliu@example.com', '北京市东城区', '经理', NOW(), NOW());


CREATE TABLE IF NOT EXISTS idcards(
     id INT PRIMARY KEY AUTO_INCREMENT,
     CODE VARCHAR(18)	
);


INSERT INTO idcards(CODE) VALUES('152221198711020624');
INSERT INTO idcards(CODE) VALUES('152221198711020625');
INSERT INTO idcards(CODE) VALUES('152221198711020626');
INSERT INTO idcards(CODE) VALUES('152221198711020627');


CREATE TABLE IF NOT EXISTS persons(
     id INT PRIMARY KEY AUTO_INCREMENT,
     name VARCHAR(20),
     age INT,
     sex VARCHAR(2),
     card_id INT UNIQUE
);

INSERT INTO persons(name,age,sex,card_id) VALUES('张三',23,'男',1);
INSERT INTO persons(name,age,sex,card_id) VALUES('李四',24,'女',2);
INSERT INTO persons(name,age,sex,card_id) VALUES('王五',25,'男',3);
INSERT INTO persons(name,age,sex,card_id) VALUES('赵六',26,'女',4);



-- 创建商品表
CREATE TABLE IF NOT EXISTS products (
    id INT(32) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32),
    price DOUBLE
);

-- 插入商品示例数据
INSERT INTO products VALUES (1, 'Java基础入门', 44.5);

-- 创建订单商品关系表（中间表）
CREATE TABLE IF NOT EXISTS order_items (
    id INT(32) PRIMARY KEY AUTO_INCREMENT,
    order_id INT(32),
    product_id INT(32),
    quantity INT(32) NOT NULL DEFAULT 1,
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

-- 插入订单商品关系示例数据
INSERT INTO order_items (order_id, product_id, quantity) VALUES
    (1, 1, 2),  -- ORDER001购买了2个Java基础入门
    (2, 1, 1);  -- ORDER002购买了1个Java基础入门



-- 创建图书表
CREATE TABLE IF NOT EXISTS books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    bookName VARCHAR(255),
    price DOUBLE,
    author VARCHAR(40)
);

-- 插入图书示例数据
INSERT INTO books (bookName, price, author) VALUES
    ('Java基础入门', 45.0, '传智播客高教产品研发部');



-- mybatis annotation 注解

CREATE TABLE  IF NOT EXISTS workers( 
     id INT PRIMARY KEY AUTO_INCREMENT,
     worker_name VARCHAR(32),
     age INT,   
     sex VARCHAR(8),
     worker_id INT UNIQUE     
);
INSERT INTO workers(worker_name,age,sex,worker_id)VALUES('张三',32,'女',1001);
INSERT INTO workers(worker_name,age,sex,worker_id)VALUES('李四',33,'男',1002);
INSERT INTO workers(worker_name,age,sex,worker_id)VALUES('王五',34,'女',1003);
INSERT INTO workers(worker_name,age,sex,worker_id)VALUES('赵六',35,'男',1004);



-- create database spring;
-- use spring;
