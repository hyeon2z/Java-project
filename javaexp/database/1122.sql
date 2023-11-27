/*
[1단계:개념] 1. 시퀀스란 무엇인가? 기본형식과 속성값을 지정하고, 사용 형태를 예시로 나열해 보세요.
시퀀스는 자동으로 numbering 해주는 객체.
create sequence 시퀀스명 <- 1부터 1씩 증가하는 시퀀스

craete sequence 시퀀스명
increment by 증가단위
start with 시작번호
minvalue 최소
maxvalue 최대
cycle|noncycle 최소/최대에 이르게 반복수행
cache n|nocache 속도 개선을 위한 메모리캐시

select seq.nextval <- 하나씩 증가
select seq.currval <- 현재 증가된 번호를 가져옴
*/
--[1단계:확인] 2. 4자리의 고정된 고객번호와 고객명, 나이, 주소 테이블을 만들고, 제약조건과  seqence를 이용하여 고객번호를 입력 처리하세요.
CREATE SEQUENCE seq2;
CREATE TABLE mem01(
	mno char(4) PRIMARY KEY,
	name varchar2(50) NOT NULL,
	age number(3) NOT NULL,
	address varchar2(50)
);
INSERT INTO mem01 values(seq1.nextval , '김길동', 23, '서울시 강남구');
SELECT * FROM mem01;

--[1단계:개념] 3. 조인이란 무엇인가 개념을 정리하고, 기본 inner조인을 예제로 만들어 해당 코드를 설명하세요.
-- 하나의 sql 명령문으로 여러 테이블에 있는 데이터를 한번에 조회할 때 사용한다.
SELECT e.DEPTNO, d.DEPTNO 
FROM emp e, DEPT d
WHERE e.DEPTNO = d.DEPTNO;

--[1단계:확인] 4. 회원(회원번호, 회원명, 등급번호)과 등급테이블(등급번호, 등급명, 할인율)을 테이블을 구성하여 데이터를 입력하고, 조인관계를 처리하세요.
CREATE TABLE mem02(
	mno char(4) PRIMARY KEY,
	name varchar2(50) NOT NULL,
	grade number(2) NOT null
);
CREATE TABLE grade01 (
	gno number(1) NOT null,
	gname varchar2(50) NOT NULL,
	discount NUMBER
);

INSERT INTO mem02 values(
	seq2.nextval,'최철수',3
);
INSERT INTO grade01 values(
	3, '3등급', 0.1
);
SELECT g.gno, m.name, g.discount
FROM mem02 m, grade01 g
WHERE m.grade = g.gno;
-- [1단계:확인] 5. employees, jobs, departments, locations, job_history를 이용 조인연습 문제
--	1) 부서 번호가 10인 부서에 근무하는 사원의 이름, 직급, 부서, 근무지를 출력
SELECT first_name||' '||last_name 사원명, job_id, DEPARTMENT_NAME, l.STREET_ADDRESS  
FROM EMPLOYEES e, DEPARTMENTS d, LOCATIONS l
where e.DEPARTMENT_ID = d.DEPARTMENT_ID
AND d.LOCATION_ID = l.LOCATION_ID
AND e.DEPARTMENT_ID = 10;
--	2) 모든 사원의 이름, 직급, 부서, 근무지를 출력하시오.
SELECT first_name||' '||last_name 사원명, job_id, DEPARTMENT_NAME, l.STREET_ADDRESS
FROM EMPLOYEES e , DEPARTMENTS d , LOCATIONS l
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID
AND d.LOCATION_ID = l.LOCATION_ID;

--1단계:개념] 6. 조인의 여러가지 종류를 기본에제를 통해서 그 특정을 설명하세요
SELECT ename, sal, grade
FROM EMP e , SALGRADE s 
WHERE sal BETWEEN losal AND hisal
AND grade = 1;
-- non equi join = 조인하는 두 개의 테이블의 컬럼 값이 다를 때 조인하는 형식(범위로 조인)
SELECT d.deptno, dname, e.deptno, e.ename
FROM EMP e , DEPT d
WHERE e.DEPTNO(+)=d.DEPTNO;
-- outer join = 조인하는 곳에 데이터가 null이더라도 조인된 값을 생략하지 않고 표한하는 방식
SELECT e.first_name, m.EMPLOYEE_ID 
FROM EMPLOYEES e , EMPLOYEES m
WHERE e.manager_id = m.EMPLOYEE_ID ;
-- self join = 테이블 컬럼 안에 내부적으로 연관관계가 있는 컬럼간의 조인.
--[1단계:개념] 7. subquery를 사용해야 하는 경우를 기술하고 이 때, 활용하는 subquery 형식을 예시를 들어 설명하세요.
-- sql처리 결과가 다른 sql의 조건 값 또는 조회값을 사용할 때 자주 사용된다.
SELECT *
FROM emp
WHERE sal = (SELECT max(sal) FROM emp);

--[1단계:확인] 8. subquery, inline view 를 이용해서 아래 query 처리하세요.
-- EMP 테이블에서 가장 높은 급여를 받는 직원의 이름과 급여 조회하기.
SELECT ename, sal
FROM emp
WHERE sal = (SELECT max(sal) FROM emp);
SELECT * FROM emp;
-- DEPT 테이블에서 부서별 평균 급여 계산하기.
SELECT deptno,
(SELECT avg(sal) FROM emp WHERE emp.deptno = dept.DEPTNO) avgsal
FROM dept;
-- EMP 테이블에서 각 직무별로 가장 높은 급여를 받는 직원 찾기.
SELECT DISTINCT ename, sal
FROM (SELECT max(sal) FROM emp GROUP BY job) e1, emp e;
-- 각 부서에서 근무하는 직원 수 계산하기.
SELECT e1.deptno, cnt
FROM (SELECT deptno, count(*) cnt FROM emp GROUP BY deptno) e1;
-- EMP 테이블에서 매니저가 아닌 직원만 조회하기.
SELECT *
FROM (SELECT * FROM emp WHERE job NOT IN ('MANAGER')) e1;
-- EMP 테이블에서 각 부서별로 가장 오래 근무한 직원 찾기.
SELECT *
FROM (SELECT min(hiredate) hiredate FROM emp GROUP BY deptno) e1, emp e 
WHERE e1.hiredate = e.hiredate
ORDER BY deptno;
-- [1단계:개념] 9. 테이블 구조변경 유형을 기본예제를 통해 설명하세요.
/*
컬럼 추가
alter table 테이블
add 컬럼명 데이터유형 default [제외조건]

컬럼 삭제
alter table 테이블
drop column 컬럼명;
	-> 2개이상 컬럼이 존재하는 테이블만 삭제가 가능하다.
		하나의 컬럼인곳의 삭제는 테이블에 대한 의미가 없어서 삭제 불가능
		
		한번에 하나의 컬럼만 삭제가 가능

테이블 컬럼 변경
alter table 테이블
modify 컬럼명 변경할 타입/크기/기본값
	-> 데이터가 있을 때는 다른 유형으로 변경이 안됨.
	    작은 데이터 유혀엥서 큰 데이터 유형으로 변경은 가능하다.
	    char - > varchar
	데이터 기준으로 데이터가 입력된 크기 이하로는 변경이 안됨.
	
*/