SELECT * FROM emp; -- ctrl + enter
/* 
# 데이터의 산술연산자와 문자열 연결처리
1. 컬럼의 타입이 숫자이면 연산(+,-,*,/ 사칙연산)이 처리된다.
2. 컬럼이나 문자열을 연결하여 출력할 때는 컬럼1||컬럼2, 문자열||문자열
	형식으로 처리한다.
3. 문자열 타입데이터 '문자열데이터'로만 사용한다. ""(X)  
 */
SELECT sal, sal*2 두배, sal + 10 "+10"
FROM emp;
SELECT empno, deptno, empno+deptno 컬럼간연산
FROM emp;
SELECT ename, ename||'님 입니다' 사원명소개
FROM emp;
-- 주의) 데이터베이스에서는 + 를 통해 문자열 연결하지
--      않고, ||를 통해 처리된다.
SELECT ename, empno, ename||empno 사원명과사원번호
FROM emp;
SELECT *
FROM emp;
-- emp : 사원정보 테이블
-- empno(사원번호), ename(사원명), job(직책), mgr(관리자번호),
-- hiredate(입사일), sal(급여/연봉), comm(보너스), deptno(부서번호)
-- ex1) 각사원의 급여의 3배를 사원명과 함께 출력하세요
SELECT ename, sal*3 "급여3배"
FROM emp;
-- ex2) 사원번호와 사원명, 급여+보너스를 출력하세요
--      nvl(컬럼명,데이터가null초기값)
--   null vs ' '(공백), 0(default) 차이
--   null 데이터바 비어 있는 상태.. 
--   1000 + null ==> null
--   nvl(숫자, 0), nvl(문자열,' ')
SELECT empno, ename, sal, comm, sal+comm "급여+보너스",
       sal + nvl(comm,0) "급여+보너스(0)"
FROM emp;
-- ex3) 사원명-부서번호, 사원번호-사원명, 입사일을 출력하세요
SELECT ename||'-'||deptno "사원명과부서번호",
       empno||'-'||ename 사원번호와사원명,
       hiredate
  FROM emp;
-- ex) @@@(사원명)의 급여는 @@@(급여)이고,부서번호는 @@(부서번호)입니다.
SELECT ename||'의 급여는 '||sal||
	'이고,부서번호는 '||deptno||'입니다.' show
FROM emp;
/*
# 중복제거
1. 동일한 데이터의 중복 제거
 * */ 
-- 기본적으로 다른 컬럼과 연결된 데이터 내용을 출력된다.
SELECT deptno
FROM emp;
--2. 중복되지 않는 데이터를 출력 하기 위해서는 distinct를 사용한다.
SELECT DISTINCT deptno
FROM emp;
SELECT deptno, mgr
FROM emp;
-- distinct 컬럼1, 컬럼2  : 컬럼1,컬럼2를 합쳐서 같은 데이터 삭제
SELECT DISTINCT deptno, mgr
FROM emp;
-- ex1) job을 중복되지 않게 출력하세요.
SELECT DISTINCT job
FROM emp;
-- ex2) 관리자번호(mgr)를 중복되지 않게 출력하세요
SELECT DISTINCT mgr
FROM emp;





