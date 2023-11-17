DROP TABLE emp01;
CREATE TABLE emp01
AS SELECT * FROM emp;

/*
class EmpCU{
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredateStr;
	private double sal;
	private double comm;
	private int deptno;
}
INSERT INTO emp01
values(?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?);

 */

SELECT*
FROM emp01;

ALTER TABLE EMP01
modify(ename varchar(50), job varchar2(50));

INSERT INTO emp01
values(1002,'오길동','사원',7902,to_date('2023-11-15','YYYY-MM-DD'),3000,100,10);
-- 등록/수정/삭제 시 commit 하기 전에는 현재 계정에서 임시로 데이터 처리
-- commit으로 확정되기전에는 rollback이 된다.

SELECT * FROM dept01;
INSERT INTO dept01 values(50,'회계','서울');
/*
INSERT INTO dept01 values(?,?,?);

기능 메서드 추가
public int insertDept01(Dept ins){
	int deptInsCnt = 0;
	
	return deptInsCnt;
}
*/
SELECT *
FROM emp;

SELECT empno, ename, job, to_char(hiredate,'Q'),hiredate
FROM emp
WHERE to_char(hiredate,'Q') = 1
AND job = 'CLERK';

/*
SELECT empno, ename, job, to_char(hiredate,'Q'),hiredate
FROM emp
WHERE to_char(hiredate,'Q') = ?
AND job = ?;

*/

SELECT empno, ename, job, to_char(HIREDATE,'YYYY-MM-DD'), DEPTNO 
FROM emp
WHERE to_char(HIREDATE,'YYYY-MM,DD') > '1980-10-10'
AND to_char(HIREDATE,'YYYY-MM,DD') < '1985-10-10';

/*
SELECT ename, ename, job, to_char(HIREDATE,'YYYY-MM-DD'), DEPTNO
FROM emp
WHERE to_char(HIREDATE,'YYYY-MM,DD') > ?
AND to_char(HIREDATE,'YYYY-MM,DD') < ?;


SELECT empno, ename, job, to_char(hiredate, 'Q') hire_qua,
to_char(hiredate, 'YYYY/MM/DD') hire_Str
FROM emp
WHERE job LIKE ?
AND to_char(hiredate, 'Q') = ?

입력값 : job, hire_qua
출력값 : empno, ename, job, hire_qua, hire_str
class EmpHire{
	private int empno;
	private String ename;
	private String job;
	private String hire_qua;
	private String hire_str;
}

*/

SELECT empno, ename, job, to_char(hiredate, 'Q') hire_qua,
to_char(hiredate, 'YYYY/MM/DD') hire_Str
FROM emp
WHERE job LIKE '%MAN%'
AND to_char(hiredate, 'Q') = '1';

SELECT empno, ename, job,
to_char(hiredate, 'YYYY/MM/DD') hirestr, deptno
FROM emp
WHERE hiredate BETWEEN to_date('1981/01/01', 'YYYY/MM/DD')
AND to_date('1981/06/01', 'YYYY/MM/DD');

/*
empno, ename, job, hirestr, deptno

SELECT empno, ename, job,
to_char(hiredate, 'YYYY/MM/DD') hirestr, deptno
FROM emp
WHERE hiredate BETWEEN to_date(?, 'YYYY/MM/DD')
AND to_date(?, 'YYYY/MM/DD');
*/