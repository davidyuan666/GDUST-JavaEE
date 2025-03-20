CREATE DATABASE ssm;
USE ssm;
CREATE TABLE `tb_book`  (
  `id` int(11) ,
  `name` varchar(32),
  `press` varchar(32),
  `author` varchar(32),
  PRIMARY KEY (`id`) USING BTREE
)

INSERT INTO `tb_book` VALUES (1, 'Java EE企业级应用开发教程', '人民邮电出版社', '黑马程序员');

