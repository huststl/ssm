# ssm
通过maven搭建的一个ssm框架，并通过简单测试demo验证成功运行！


本实例搭建使用的是环境IDEA + maven + tomcat + jdk1.7

数据库sql为：

CREATE TABLE `category_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=utf8

使用了
分页插件pagehelper
数据库连接池是c3p0
