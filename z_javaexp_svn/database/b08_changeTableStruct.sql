/*
# 테이블의 구조 변경
1. 테이블을 사용하다보면 여러가지 상황에 다라 테이블의 구조를 변경하는 경우가 
	발생한다. 테이블의 구조를 변경하는데 필요한 명령어를 파악하고,
	테이블 구조의 변경시 발생하는 데이터 처리에 대한 내용을 파악해보자.
2. 테이블 구조의 변경 유형
	1) 컬럼의 추가, 컬럼의 삭제, 컬럼의 속성의 변경, 제약조건의 추가/삭제/변경 등.
	
# 컬럼의 추가.
1. 테이블에 컬럼을 추가하기 위해서는 아래의 기본구문으로 처리한다.
2. 기본 형식
	alter table 테이블명
	add 컬럼명 데이터유형[defautl 디폴트 데이터, 제약조건.. ]	
 * */
SELECT * FROM emp02;
DROP TABLE emp02; --  테이블 삭제
CREATE TABLE emp02
AS SELECT empno, ename, job, sal FROM emp;
-- 선택한 컬럼으로 테이블 생성
SELECT * FROM emp02; 
-- 주소입력컬럼 추가.
ALTER TABLE emp02
ADD address varchar2(20) DEFAULT '주소입력없음';
-- 기본값으로 주소입력없음이라는 컬럼 추가가 됨..
-- ex) emp08로 부서번호, 사원명, 직책, 급여로 복사테이블을 만들고,
--    해당 테이블에 bonus 컬럼을 추가하고, default데이터롤 0을 입력처리하세요.
CREATE TABLE emp08
AS SELECT deptno, ename, job, sal
FROM emp;
SELECT * FROM emp08;
ALTER TABLE emp08
ADD bonus NUMBER DEFAULT 0;
/*
# 컬럼 삭제
1. 테이블의 특정 컬럼과 컬럼의 데이터를 삭제 처리
2. 형식
	alter table 테이블명
	drop column 컬럼명
3. 주의 사항
	1) 2개 이상의 컬럼이 존재하는 테이블에서만 삭제 가능
		하나의 컬럼을 삭제은 테이블에 대한 의미가 없기에 삭제 불가
	2) 한번에 하나의 컬럼만 삭제 가능
 * */
SELECT * FROM emp02;
ALTER TABLE emp02
DROP COLUMN ename;
-- ex) emp 테이블을 이용하여 emp08테이블을 생성하고,
--     해당 테이블에 dname, loc 컬럼 추가, deptno 컬럼 삭제 처리하세요.
DROP TABLE emp08;
CREATE TABLE emp08
AS SELECT e.*, dname, loc
FROM emp e, dept d
where e.deptno = d.deptno;
SELECT * FROM emp08;
ALTER TABLE emp08
DROP COLUMN deptno;
/*
# 테이블 컬럼 변경
1. 테이블의 컬럼의 타입, 크기, 기본 값은 변경이 가능한다.
2. 기본 형식
	alter table 테이블명
	modify 컬럼명  변경할 타입/크기/기본값;
3. 변경시 주의 사항
	1) 해당 컬럼에 데이터가 없는 경우
		컬럼의 타입이나 크기 변경이 자유롭다.
	2) 기존 데이터가 있는 경우
		-다른 타입 변경은 char/varchar2만 허용된다.
		-변경한 컬럼의 크기가 저장된 데이터의 크기보다 같거나 클 경우 변경 가능
		-숫자 타입에는 정밀도를 증가시키는 것만 가능
	3) 기본 값의 변경은 변경 후에 입력되는 데이터부터 적용된다.
# 테이블 컬럼명 변경				
 * */
CREATE TABLE emp09
AS SELECT * FROM emp WHERE 1=0;
SELECT * FROM emp09;
-- 데이터가 없는 경우에는 타입변경이 자유롭다.
ALTER TABLE emp09
MODIFY ename varchar2(50);
ALTER TABLE emp09
MODIFY job number;
ALTER TABLE emp09
MODIFY deptno varchar2(1);
SELECT * FROM emp09;
DROP TABLE emp10;
CREATE TABLE emp10
AS SELECT * FROM emp;
SELECT * FROM emp10;
--# 데이터가 있을 때
--0. 다른 유형으로 변경하는 것은 불가능(문자형==> 숫자, 숫자 =>날짜..등)
--1. 작은 데이터 유형에서 큰데이터 유형 변경은 가능
ALTER TABLE emp10
MODIFY ( ename varchar2(50),
	     job varchar2(50),
	     empno NUMBER );
--2. 하지만 데이터 기준으로 데이터가 입력된 크기 이하로는 변경 불가
SELECT max(LENGTH(ename)) FROM emp10;	    
--  저장된 데이터까지 변경하는 것은 가능..
ALTER TABLE emp10
MODIFY ename varchar2(6);
--  최대값 기준으로 이하의 컬럼을 변경하는 것을 불가능..
ALTER TABLE emp10
MODIFY ename varchar2(5);
/*
# 테이블 이름 변경 처리
rename 기존테이블명 to 변경할테이블명;

# 컬럼 이름 변경 처리
alert table 테이블명
rename column 기존컬럼명 to 변경할컬럼명;

 * */
SELECT *
FROM EMP12;
RENAME emp12 TO emp12_new;
SELECT *
FROM emp12_new;

alter TABLE emp12_new
RENAME COLUMN ename TO name;
-- ex) emp02 테이블을 emp02_cpy 로 변경하고,
--     empno ==> no, ename ==> name, 
--    sal ==> salary  변경처리하세요..
DROP TABLE emp02;
CREATE TABLE emp02
AS SELECT * FROM emp;
RENAME emp02 TO emp02_cpy;
SELECT * FROM emp02_cpy;
ALTER TABLE emp02_cpy
RENAME COLUMN empno TO NO;
ALTER TABLE emp02_cpy
RENAME COLUMN ename TO name;
ALTER TABLE emp02_cpy
RENAME COLUMN sal TO salary;
SELECT * FROM emp02_cpy;




















