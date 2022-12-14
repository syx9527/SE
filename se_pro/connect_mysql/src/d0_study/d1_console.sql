select *
from emp;

select *
from dept;

select *
from salgrade;

# 查看表结构
desc dept;

desc emp;

desc salgrade;

# 查看数据库版本
select version();

# 查看当前使用的是哪个数据库
select database();

# 查询的列可以起别名
select ENAME as name, JOB as 职业, SAL as 工资
from emp
where DEPTNO = 20;

# as关键字可以省略
select DEPTNO, DNAME depname
from dept;

/*
尽量使用单引号代替双引号，防止别的sql系统识别有误
 */
select deptno, dname 'de pname'
from dept;

/*
月薪
 */
select ename, sal
from emp;

/*
 年薪(字段可以使用数学表达式)
 */
select ename, sal * 12 '年薪'
from emp;

/*
 条件查询
 <> 、!=  不等于
 between a and b  介于a,b之间（包含a,b）等同于 >=a and <=b
 */

# 查询薪资等于800的员工的姓名和编号
select empno, ename, sal
from emp
where sal != 800;

select empno, ename, sal
from emp
where 1000 <= sal
  and sal <= 3000
order by sal;


select empno, ename, sal
from emp
order by sal desc, empno
limit 10;


select empno, ename, sal
from emp
where sal between 2000 and 3000;


# 数据库中null不能使用=判断，需要使用 is null 或者 is not null
select empno, ename, sal, comm
from emp
where comm is null
  and sal >= 1500;

select empno, ename, job, sal
from emp
where job = 'manager'
  and sal >= 2500;


select empno, ename, job, sal
from emp
where job = 'manager'
   or job = 'salesman';

/*
 and 和 or 优先级： and >or 类似（* > ÷）
 */
# 查询工资2500及以上，并且部门编号为10或者20部门的员工
select *
from emp
where sal >= 2500
  and (deptno = 10
    or deptno = 20);

select empno, ename, job, sal
from emp
where job in ('manager', 'salesman')
  and sal between 1000 and 2500
order by sal;

/*
 模糊查询
 % 匹配多个字符
 _ 匹配一个字符
 */
select empno, ename, job, sal
from emp
where ename like '%o%';

select empno, ename, job, sal
from emp
where ename like '%t';

select empno, ename, job, sal
from emp
where ename like 'k%';


select empno, ename, job, sal
from emp
where ename like '__r%';

# 找出名字中有下划线'_'的
select *
from t_student
where name like '%\_%';

# 排序,默认升序
select ename, sal
from emp
order by sal;

# 降序
select ename, sal
from emp
order by sal desc;

# 指定升序
select ename, sal
from emp
order by sal asc;


# 多字段排序，优先级从左至右
select empno, ename, job, sal
from emp
order by sal, job, empno;


/*
 综合案例
 找出工资再1250到3000之间的员工信息，要求按照薪资降序排列。
 */
select empno, ename, job, sal
from emp
where sal between 1250 and 3000
order by sal desc;

/*
 数据处理函数
 单行处理理函数：一个输入对于一个输出
 多行处理函数：多个输入，对应一个输出
 单行处理函数：
 lower 转换小写
 upper 转换大写
 substr 取子串（substr(被截取的字符串，起始下标，截取的长度)）
 length 取长度
 trim 去除前后的空格，但是不能去除内部的空格
 str_to_date 将字符串转换成日期
 date_format 格式化日期
 round 四舍五入
 rand() 生成随机数(0,1)
 ifnull 可以将null转换成一个具体值,专门处理null值，只要有null参与结果，结果是null
 concat 字符串拼接
 case...when...then...when...then...else...end


 */
select upper(ename) as name
from emp;

# 起始下标从1开始
select substr(ename, 1, 1) as ename
from emp;

select ename
from emp
where substr(ename, 2, 1) = 'a';


# 首字母大写
select concat(upper(substr(name, 1, 1)), substr(name, 2)) as 'Name'
from t_student;


select empno, ename, job, sal
from emp
where ename = trim(' king  ');

select round('123456.1252151', 2) as num
from emp
limit 1;

select round('123456.1252151', -1) as num
from emp
limit 1;

# 100以内的随机数
select round(rand() * 100) as 'result'
from emp;

select ename, sal + ifnull(comm, 0) as salcom
from emp;


# 计算每个员工的年薪
# 年薪=( 月薪 + 津贴 ) * 12
select ename, (sal + ifnull(comm, 0)) * 12 as 'year_sal'
from emp;

# 员工的工作的岗位是manager的时候，工资上调10%，
# 员工的工作的岗位是salesman的时候，工资上调50%，
# （注意：不修改数据库）

select ename, job, sal
from emp;

select ename, job, (case job when 'manager' then sal * 1.1 when 'salesman' then sal * 1.5 else sal end) as newsal, sal
from emp;


/*
 多行函数/聚合函数/多行处理函数
 count  取得记录数
 sum    求和
 avg    取平均
 max    取最大的数
 min    取最小的数

 注意：
    分组函数在使用的时候必须进行分组，然后才能使用
    如果没有对数据进行分组，整张表为一组
    分组函数自动忽略null，不需要提前对null处理
 */

select max(sal)
from emp;

select min(sal)
from emp;

select avg(sal)
from emp;

select sum(sal)
from emp;

select avg(sal)
from emp;

select count(*)
from emp e
where e.comm is not null;

select *
from emp;

select sum(comm)
from emp;

select count(comm)
from emp;



select job, count(job) as 'count'
from emp
group by job;

/*
 count(*) 和 count(具体某个字段)的区别
 count(*)：          统计总条数
 count(具体某个字段)： 该字段中不为null的总条数
 */

# 14
select count(*)
from emp;


# 4
select count(comm)
from emp;

/*
 分组函数不能直接使用在 where 语句中

 */
# 找出比最低工资高的员工信息
# ?????   报错

# select ename, sal
# from emp
# where sal > min(sal);

select ename, sal
from emp
where sal > (select min(sal) from emp);

/*
 分组查询（group by）
 所有的分组函数可以组合起来一起用
 */

select sum(sal), min(sal), max(sal), avg(sal), count(*)
from emp;


select deptno, max(sal) as 'max_'
from emp
group by deptno
order by max_;

# 找出每个工作岗位的工资和
select job, sum(sal) sumsal
from emp
group by job
order by sumsal;

# 找出部门的最高工资
select deptno, max(sal)
from emp
group by deptno;


# 找出每个部门中不同岗位的最高薪资

select deptno, job, max(sal) as maxsal
from emp
group by deptno, job
order by deptno;

# having 可以对分完组后的数据进行进一步过滤，having不能代替where单独使用,必须和group byu 组合使用
# 找出每个部门最高工资，仅显示3000及以上的，若最高工资低于 3000则不显示

select deptno, max(sal) max
from emp
group by deptno
having max >= 3000;



select deptno, max(sal) max
from emp
where sal >= 3000
group by deptno;

# 统计每个部门的平均工资，要求显示平均工资不低于2000的
select deptno, avg(sal) avgsal
from emp
group by deptno
having avgsal >= 2000;


# 找出每个岗位的平均薪资，要求显示平均薪资大于1500的，除manager岗位之外
# 要求按照平均薪资降序排列

select job, avg(sal) avgsal
from emp
where job <> 'manager'
group by job
having avgsal >= 1500;



