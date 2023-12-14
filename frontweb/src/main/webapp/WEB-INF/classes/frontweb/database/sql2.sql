SELECT e.*, to_char(hiredate, 'YYYY-MM-DD') hiredatestr
FROM emp01 e
WHERE empno = 7499;

SELECT * FROM emp01;
UPDATE EMP01
    SET 
    	empno = 1000,
        ename = '김영희',
        job = '대리',
        mgr = 7698,
        hiredate = to_date('2023-11-20', 'YYYY-MM-DD'),
        sal = 3500,
        comm = 200,
        deptno = 10
    WHERE empno = 0;
/*
UPDATE EMP01
    SET ename = ?,
        job = ?,
        mgr = ?,
        hiredate = to_date(?, 'YYYY-MM-DD'),
        sal = ?,
        comm = ?,
        deptno = ?
    WHERE empno = ?;
 */
UPDATE EMP01
    SET 
        ename = ename||'수정',
        job = job||'수정',
        mgr = 9999,
        hiredate = to_date('2023-11-01', 'YYYY-MM-DD'),
        sal = sal + 100,
        comm = comm + 100,
        deptno = deptno + 1
    WHERE empno = 7369;

SELECT d.*
FROM dept01 d
WHERE deptno = 30;

--UPDATE DEPT01
--SET deptno = ?, dname = ?, loc = ?
--WHERE deptno = ?

--DELETE FROM dept01 WHERE deptno = ?

SELECT e.*, to_char(hiredate, 'YYYY-MM-DD') hiredatestr
FROM emp01 e
WHERE empno = 7499;

SELECT *
FROM MEMBER01;