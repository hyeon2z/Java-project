/*
# join(조인)
1. 하나의 sql명령문에 의해 여러 테이블에 저장된 데이터를 한번에
	조회할 때 사용하는 기능을 말한다.
2. 관계형 데이터베이스 분야의 표준으로 자리 잡혀서, 여러 테이블과의
	조인 관계에서 사용하여, 테이블을 효율적으로 관리하고, 데이터를
	조회 처리할 때 사용된다.
3. 단계별 학습 내용
	1) 기본 조인 구문 형식 이해 및 활용
	2) 여러가지 조인 구문 형식 활용
	3) subquery, inline view를 통한 조인 구문 처리
		- 주로 그룹함수 처리 후, 조인 처리
	4) 여러가지 복합 형식의 조인 구문 처리
# 기본 조인 구문 형식
1. 테이블과 테이블의 연관관계를 아래와 같이 설정한다.
	select 테이블별칭1.선택할 컬럼, 테이블별칭2.선택할컬럼
	from 테이블명 별칭1, 테이블명 별칭2
	where 별칭1.공통컬럼 = 별칭2.공통처럼
	- 이 내용을 조인의 가장 기본형식인 두개 테이블간의 공통
	컬럼을 기준으로 조인하는 inner 조인의 형식이다.
 * */
SELECT e.*, d.*
FROM emp e, dept d
WHERE e.deptno = d.deptno;
-- 사원명, 부서명을 출력
SELECT ename, dname  -- 컬럼이 공통이 아닌 경우 테이블 지정 생략
FROM emp e, dept d
WHERE e.deptno = d.deptno;
-- ex1) 조인 구문을 활용하여 부서명, 사원명, 부서위치, 급여를 출력
SELECT dname, ename, loc, sal
FROM emp e, dept d
WHERE e.deptno = d.deptno;
-- ex2) employee, LOCATIONS 테이블에 공통 컬럼을 확인하여
--      조인하여, 데이터를 출력하세요.
SELECT EMPLOYEE_ID, FIRST_NAME,
		DEPARTMENT_NAME, STREET_ADDRESS 
FROM EMPLOYEES e, DEPARTMENTS d, LOCATIONS l
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID 
AND d.LOCATION_ID  = l.LOCATION_ID;


SELECT FIRST_NAME, j.JOB_TITLE 
FROM EMPLOYEES e, jobs j
WHERE e.JOB_ID = j.JOB_ID;
/*
# 조인 구문의 결과에 의한 조건 및 함수 처리
1. 위와 같이 조인 구문에 의해 처리된 결과는 다시, 하나의 데이터의
	결과로 다시 이것을 이용해서 조건/그룹함수/일반함수를 적용하여
	데이터를 처리하여 결과를 출력할 수 있다.
 * */
--  부서명이 A가 포함되는 사원명, 부서명을 출력 
SELECT ename, dname
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND dname LIKE '%A%';
--  부서명별 최고를 출력
SELECT dname, max(sal) msal
FROM emp e, dept d
WHERE e.deptno = d.deptno
GROUP BY dname;
-- ex1) 부서위치별 평균 급여을 출력하세요
SELECT loc, avg(sal)
FROM emp e, dept d
WHERE e.deptno = d.deptno
GROUP BY loc;
-- ex2) employees, jobs 테이블을 이용하여, 직책명별(job_title)로 
--      최고급여을 출력하세요.
SELECT j.JOB_TITLE, max(e.SALARY) msal
FROM employees e, jobs j
WHERE e.JOB_ID = j.JOB_ID
GROUP BY JOB_TITLE
ORDER BY msal;




