/*
# 여러가지 조인 구문 형식
1. 조인용 기본 inner join과 함께 여러가지 형식을 사용할 수 있다.

2. 조인 형식
    1) non equi join 
        조인하는 두개의 테이블의 컬럼 값이 동일하지 않을 때,
        조인하는 형식
        - 범위로 조인하는 경우
        
    2) outer join
        equi join의 조인 조건에서 양측 컬럼 값 중, 어느 하나라도
        null 이면 '=' 비교 결과가 거짓이 되어 null값을 가진 행으로 출력되지 않는다.
        이 때, 해당 컬럼의 값이 없더라도 출력되게 하려면 outer join 을 이용한다.
        ex) 부서별 사원 정보에서 해당 부서에 조인되는 사원이 없더라도
        부서정보를 출력하게 하려면 이 구문을 활용한다
        
    3) self join ==> 계층형 sql
        테이블 컬럼 안에 내부적으로 연관관계가 있는 컬럼간의 조인을 말한다.
        ex) 사원번호와 관리자번호는 내부적으로 조인관계를 가지고 있다.
        사원명과 해당 사원의 관리자명을 출력할 때는 self join을 감안하여 처리해야 한다.
        
        
*/
-- non equi join\
SELECT *
FROM salgrade;
SELECT * FROM emp;
-- 사원의 급여 등급을 출력하세요
SELECT ename, sal, grade
FROM emp e, salgrade s
WHERE sal BETWEEN losal AND hisal
AND grade = 4;
-- ex) 'SMITH'의 급여와 급여 등급을 출력하세요
SELECT ename, sal, grade
FROM emp e, SALGRADE s
WHERE ename = 'SMITH'
AND sal BETWEEN losal AND hisal;

-- ex) 직책 'salesman'에 해당하는 사원과 급여, 급여등급을 출력
SELECT job, sal, grade
FROM emp e, SALGRADE s
WHERE job = 'SALESMAN'
AND sal BETWEEN losal AND hisal;

SELECT d.deptno, dname, e.deptno, ename
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno;
-- 특정한 테이블에 조인된 데이터가 없더라도 기준이 되는 컬럼의 데이터를
-- 출력하게 할 때 outer 조인을 이용한다.
-- ex) employees와 jobs를 이용해서 outer 조인하여,
-- 직책기준으로 사원 정보를 출력하세요
SELECT e.FIRST_NAME, e.JOB_ID, j.JOB_TITLE
FROM EMPLOYEES e , JOBS j 
WHERE e.JOB_ID(+) = j.JOB_ID;

-- ex) employees와 departments를 이용해서 outer 조인하여
-- 부서기준으로 사원 정보를 출력
-- 부서별 사원명 출력
SELECT DEPARTMENT_NAME, first_name||' '||last_name name
FROM EMPLOYEES e , DEPARTMENTS d
WHERE e.DEPARTMENT_ID(+) = d.DEPARTMENT_ID;
-- self : 테이블 내부에 조인 관계 설정
--    emp의 경우 empno, mgr 관계에 설정되어 있다.
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename,
    e.ename||'의 관리자는 '|| m.ename 관리자표시
FROM emp e, emp m
WHERE e.mgr = m.empno;
-- emp e : 기본 사원에 대한 정보
-- e.mgr = m.empno : 기본 사원 관리자번호, 관리자의 사원번호와 연동
-- emp m : 관리자에 대한 정보

-- ex) 두개의 연관관계를 설정하여 @@@ 사원의 관리자명은 @@@입니다 출력(first_name)
SELECT employee_id, MANAGER_ID
FROM EMPLOYEES;
SELECT e.first_name||'사원의 관리자명은 '||m.FIRST_NAME ||'입니다' 관리자명
FROM EMPLOYEES e, EMPLOYEES m
WHERE e.MANAGER_ID = m.employee_id;
SELECT * FROM EMPLOYEES;