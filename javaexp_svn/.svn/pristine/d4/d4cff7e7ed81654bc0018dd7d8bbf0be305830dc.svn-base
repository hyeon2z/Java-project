/*
# 그룹함수란?
1. 테이블의 전체 행을 하나 이상의 컬럼을 기준으로 그룹화하여 그룹별로 결과를 출력하는
	함수를 말한다.
2. 그룹함수는 통계적인 결과를 출력하는데 자주 사용된다.
3. 형식 
	select 그룹할 컬럼, 그룹함수(대상컬럼)
	from 테이블
	group by 그룹할컬럼
	having 그룹함수의 결과기준으로 조건처리
4. 그룹함수의 종류
	count() : 행의 갯수
	max() : null을 제외한 모든 행의 최대값,
	min() : null을 제외한 모든 행의 최소값
	sum() : null을 제외한 모든 행의 합
	avg() : null을 제외한 모든 행의 평균값
	stddev(표준편차), variance(분산)	
 * */
SELECT count(empno) "사원번호 갯수" FROM emp;
SELECT count(mgr) "관리자번호 갯수" FROM emp;
-- 함수명(컬럼명) : null을 제외한 전체 데이터
SELECT count(*) "전체컬럼데이터건수" FROM emp;
-- 급여의 최대값
SELECT max(sal) FROM emp;
SELECT min(sal) FROM emp;
SELECT count(*) "건수", max(sal) 급여최대, min(sal) 급여최소,
       avg(sal) "평균급여"
   FROM emp;
SELECT * FROM EMPLOYEES; 
-- ex) EMPLOYEES의 
--    employee_id의 시작번호와 마지막 번호, salary의 평균값을 출력하세요.
SELECT min(EMPLOYEE_ID) "시작번호", 
       max(EMPLOYEE_ID) "마지막번호",
       avg(SALARY) "평균급여"
FROM EMPLOYEES;
SELECT empno, deptno, sal
FROM emp
ORDER BY deptno, sal;
SELECT deptno, sal
FROM emp
ORDER BY deptno, sal;
-- 위 내용을 기준, 통계 처리를 할려고 한다.
-- 부서별로 부서인원, 최대급여, 최소급여, 합산급여, 평균급여
SELECT deptno 부서번호, count(*) 인원, max(sal) 최대급여,
       min(sal) 최소급여, sum(sal) 합산, avg(sal) 평균급여
  FROM emp
 GROUP BY deptno  --  부서별로 처리를 선언
 ORDER BY deptno;
SELECT EMPLOYEE_ID, job_id "직책별", SALARY 
FROM EMPLOYEES
ORDER BY job_id,SALARY;
-- ex) EMPLOYEES 기준으로 직책별 인원수, 최대급여, 최소급여, 급여합산, 평균급여
SELECT job_id "직책별", SALARY 
FROM EMPLOYEES
ORDER BY job_id,SALARY; 
SELECT job_id "직책", count(*) "인원", max(SALARY) 최대급여,
       min(SALARY) 최소급여, sum(SALARY) 급여합산, avg(SALARY) 평균급여
FROM EMPLOYEES
GROUP BY job_id
ORDER BY JOB_ID;
-- having : group by를 통계치를 낸 결과값을 기준으로 검색조건을 만들 때,
-- 사용된다.
SELECT deptno, sum(sal)
FROM emp
GROUP BY deptno;
-- sum의 합산금액을 기준으로 검색할 때는 where 조건으로 처리하지 않고,
-- having을 활용한다.
SELECT deptno, sum(sal) 총계
FROM emp
GROUP BY deptno
HAVING sum(sal)>=7000;
SELECT job, avg(sal) 평균급여
FROM emp
GROUP BY job;
-- avg(sal) 기준으로 3000이상인 데이터를 검색할 때, having
SELECT job, avg(sal) 평균급여
FROM emp
GROUP BY job
HAVING avg(sal)>=3000;
SELECT * FROM EMPLOYEES;
--ex) EMPLOYEES의 department_id 별로 평균급여를 산출하되, 
--    평균급여가 5000이상인 경우만 출력하세요
SELECT department_id 부서아이디, TRUNC(avg(salary)) 평균급여
FROM EMPLOYEES e 
GROUP BY DEPARTMENT_ID
HAVING avg(salary)>=5000
ORDER BY DEPARTMENT_ID;



  







