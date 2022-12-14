select *
from emp;


describe emp;

# distinct 去除重复值

select distinct job
from emp;

select distinct job, deptno
from emp;

# 统计工作岗位的数量
select count(distinct job)
from emp;


/*
 连接查询
 从一张表中查询称为单表查询
 从多个表中查询称为多表联合查询（连接查询）
 连接查询的语法分类：
    SQL92   1992年的语法
    SQL99   1999年的语法  🔺
 根据表连接的方式分类
    内连接：
        等值连接
        非等值连接
        自连接
    外连接
        左外连接（左连接）
        右外连接（右连接）
    全连接
 */

# 查询每个员工所在部门名称


select ename, deptno
from emp;

select *
from dept;


# SQL92语法
select e.ename, d.dname
from emp e,
     dept d
where e.deptno = d.deptno;

/*
 注意：
 通过笛卡尔积现象得出，表的连接次数越多，效率越低，应尽量避免表的连接次数
 */

# 内连接的等值连接