/*
# check 제약조건
1. 특정한 컬럼을 조건이나 범위를 지정해서, 해당 범위에 데이터만
	입력되도록 처리하는 것을 말한다.
2. 형식
	컬럼 데이터유형 constraint 제약명 check (조건문-where문에
		들어가는 sql문장)
	컬럼 데이터유형 check(조건문 -where절에 들어가는 sql문장)
 * */
create TABLE  student05(
	name varchar2(50),
	gender varchar2(1) check( gender IN('F','M') )
);
-- gender 컬럼에 F와 M만 들어 갈 수 있음..
INSERT INTO student05 values('홍길동','F');
INSERT INTO student05 values('김길동','M');
INSERT INTO student05 values('마길동','K');
-- 제약조건에 걸림
INSERT INTO student05 values('오길동',null);
-- null은 입력 가능
SELECT * FROM student05;
-- ex) student06 테이블, 이름(not null), 
--        학년(1~4학년만), 국어(0~100 점수범위)
CREATE TABLE STUDENT06(
	name varchar2(50) NOT NULL,
	grade number(1) CONSTRAINT STUDENT06_grade_ck 
		check(grade BETWEEN 1 AND 4),
	kor number(3) check(kor BETWEEN 0 AND 100)	
);
SELECT * FROM STUDENT06;
INSERT INTO STUDENT06 values('홍길동',1,85);
INSERT INTO STUDENT06 values('김길동',5,85); -- CHECK 1번째
INSERT INTO STUDENT06 values('신길동',3,101);-- check 2번째 
/*
# 외래키 설정 관계(foreign key)
1. 연관관계에 있는 두 테이블에 대하여, 한쪽 테이블에 있는 데이터 기준으로 
	다른쪽 테이블의 데이터를 입력할 수 있게 하는 것을 말한다.
	ex) 사원테이블에서 deptno는 부서테이블에서 입력된 부서번호이외의 데이터를
		입력이 불가능 하다.
2. 기본형식
	컬럼명 데이터유형 constraint 테이블명_컬럼명_fk references 테이블명(컬럼명)
 * */
CREATE TABLE emp12(
	empno number(4) PRIMARY KEY,
	ename varchar2(50),
	deptno number(2) CONSTRAINT emp12_deptno_fk 
		REFERENCES dept(deptno)
);
INSERT INTO emp12 values(1000,'홍길동', 10);
INSERT INTO emp12 values(1001,'김길동', 20);
INSERT INTO emp12 values(1002,'신길동', 30);
INSERT INTO emp12 values(1003,'마길동', 50);
-- 50데이터는 dept테이블에 deptno로 50이 없으므로 입력이 불가능하다.
SELECT * FROM emp12;





