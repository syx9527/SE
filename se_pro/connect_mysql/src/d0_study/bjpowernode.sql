DROP TABLE
    IF
    EXISTS emp;
DROP TABLE
    IF
    EXISTS dept;
DROP TABLE
    IF
    EXISTS salgrade;
CREATE TABLE dept
(
    deptno INT ( 2 ) NOT NULL,
    dname  VARCHAR(14),
    loc    VARCHAR(13),
    PRIMARY KEY (deptno)
);
CREATE TABLE emp
(
    empno    INT ( 4 ) NOT NULL,
    ename    VARCHAR(10),
    job      VARCHAR(9),
    mgr      INT ( 4 ),
    hiredate DATE DEFAULT NULL,
    sal      DOUBLE ( 7, 2
) ,
	comm DOUBLE ( 7, 2 ),
	PRIMARY KEY ( empno ),
	deptno INT ( 2 ) 
);
CREATE TABLE salgrade
(
    grade INT,
    losal INT,
    hisal INT
);
INSERT INTO dept (deptno, dname, loc)
VALUES (10, 'accounting', 'new york');
INSERT INTO dept (deptno, dname, loc)
VALUES (20, 'research', 'dallas');
INSERT INTO dept (deptno, dname, loc)
VALUES (30, 'sales', 'chicago');
INSERT INTO dept (deptno, dname, loc)
VALUES (40, 'operations', 'boston');
COMMIT;
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7369, 'smith', 'clerk', 7902, '1980-12-17', 800, NULL, 20);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7499, 'allen', 'salesman', 7698, '1981-02-20', 1600, 300, 30);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7521, 'ward', 'salesman', 7698, '1981-02-22', 1250, 500, 30);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7566, 'jones', 'manager', 7839, '1981-04-02', 2975, NULL, 20);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7654, 'martin', 'salesman', 7698, '1981-09-28', 1250, 1400, 30);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7698, 'blake', 'manager', 7839, '1981-05-01', 2850, NULL, 30);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7782, 'clark', 'manager', 7839, '1981-06-09', 2450, NULL, 10);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7788, 'scott', 'analyst', 7566, '1987-04-19', 3000, NULL, 20);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7839, 'king', 'president', NULL, '1981-11-17', 5000, NULL, 10);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7844, 'turner', 'salesman', 7698, '1981-09-08', 1500, 0, 30);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7876, 'adams', 'clerk', 7788, '1987-05-23', 1100, NULL, 20);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7900, 'james', 'clerk', 7698, '1981-12-03', 950, NULL, 30);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7902, 'ford', 'analyst', 7566, '1981-12-03', 3000, NULL, 20);
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES (7934, 'miller', 'clerk', 7782, '1982-01-23', 1300, NULL, 10);
COMMIT;
INSERT INTO salgrade (grade, losal, hisal)
VALUES (1, 700, 1200);
INSERT INTO salgrade (grade, losal, hisal)
VALUES (2, 1201, 1400);
INSERT INTO salgrade (grade, losal, hisal)
VALUES (3, 1401, 2000);
INSERT INTO salgrade (grade, losal, hisal)
VALUES (4, 2001, 3000);
INSERT INTO salgrade (grade, losal, hisal)
VALUES (5, 3001, 9999);
COMMIT;