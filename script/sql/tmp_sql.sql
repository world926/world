
一、 DDL (Data Definition Language)
数据定义语言，主要是进行定义/改变表的结构、数据类型、表之间的链接等操作。常用的语句关键字有 CREATE、DROP、ALTER 等。

CREATE TABLE 表名(
     列名1 数据类型,
     列名2 数据类型,
     列名3 数据类型,
    ...
)

ALTER TABLE 表名;
eg：ALTER TABLE 表名 ADD 列名 数据类型;（添加一个列）
ALTER TABLE 表名 CHANGE 列名 新列名 新数据类型;（修改列名）
ALTER TABLE 表名 DROP 列名;

DROP TABLE 表名;
DROP DATABASE 数据库名;


二、 DML 语句
DML（Data Manipulation Language）
语句: 数据操纵语言，主要是对数据进行增加、删除、修改操作。常用的语句关键字有 INSERT、UPDATE、DELETE 等。                                                                                                          INSERT INTO 表名 (字段1,字段2,...) values (某值,某值,...),(某值,某值,...);

UPDATE 表名 SET 列名=新值 WHERE 限定条件;

DELETE FROM 表名 WHERE 限定条件;

三、 DQL 语句
DQL（Data Query Language）语句：数据查询语言，主要是对数据进行查询操作。常用关键字有 SELECT、FROM、WHERE 等。

SELECT 列名 FROM 表名 WHERE 限定条件;

四、 DCL 语句
DCL（Data Control Language）语句： 数据控制语言，主要是用来设置/更改数据库用户权限。常用关键字有 GRANT、REVOKE 等。

GRANT （授权）
REVOKE （取消权限）
