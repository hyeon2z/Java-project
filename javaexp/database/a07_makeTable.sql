/*
# 테이블 생성
1. 데이터베이스에서 핵심 객체인 테이블을 생성하여 데이터를 저장, 수정, 삭제, 조회를 할 수 있게 해보자.
2. 테이블 생성 단계별 학습
    1) 테이블의 구성요소 확인
        컬럼 : 테이블은 컬럼이라는 구성요소로 되어 있는데,
            각 컬럼은 데이터 유형과 이름 그리고 제약조건이라는 설정을 할 수 있다.
            이번 장 에서는 데이터 유형과 이름 설정까지 하도록 한다.
    2) 데이터 유형
        1) number : 숫자형 유형
               - number : 정수와 실수가 모두 입력되는 기본 유형의 숫자형 타입
               - number(전체자리수, 소수점이하 자리수)
        2) varchar2(byte) : 가변형 문자열
              최대크기를 설정하여, 그 이하의 데이터를 입력할 수 있다.
               - varchar2(10)
                     최대문자열 10bytes
                         10byte이하의 문자열을 저장하고, 해당 크기만큼 메모리를 사용한다.
                         'himan' 할당된 경우 5byte - 메모리를 이용하여 할당이 된다.
                         '안녕하세요' 3x5 = 15byte - 할당자체가 되지않는다. 최대값 초과
                     영문은 10자, 한글은 오라클에서는 3byte가 한문자이기에 3자 입력 가능
        3) char(byte) : 고정형 문자열
               해당 설정한 데이터 크기로만 메모리를 할당하는 데이터 유형이다.
               - char(10) : 최대크기보다 작은 데이터를 입력가능하나, 메모리는 10byte가 할애되고 나머지는 공백이 할당된다.
        4) date : 날짜형 유형
               1/1000 초 부터 초분시 일월년도 등과 같이 날짜
               ps) sysdate라는 내장형 날짜 데이터를 통해서
                   오늘 현재시간의 날짜형 데이터를 입력 할 수 있다.
               ps) 오라클 clob, file 타입을 통해서 binary로 
                   파일을 stream형식으로 전달해서 담을 수는 있지만, 실무적으로 너무 낭비인 경우가 많다.
                   일반적으로 파일서버를 따로 만들고, 해당 실제 파일을 해당 파일서버에 담고,
                   파일의 경로만 oracle의 varchar2로 저장한다. 
    
    3) 테이블 선언과 활용
        create table 테이블명(
            컬럼1 데이터유형 [제약조건] <- 생략가능,
            컬럼2 데이터유형,            
            컬럼3 데이터유형,            
            컬럼4 데이터유형,
            ...
        );
        기존에 테이블 기반으로 테이블 생성
        -- 구조 + 데이터(모두복사)
        create table 테이블명
        as select * from 테이블;
        -- 구조(데이터 이외에 컬럼 구조 복사)
        create table 테이블명
        as select * from 테이블 where 1=0;
        -- 이름을 변경하거나 구조의 일부 선택적으로 복사
        create table 테이블명
        as select empno no, job, to_char(sal) salStr
        from emp;
        
    4) 데이터 등록
        전체 컬럼 등록
        insert 테이블명 values(데이터1, 데이터2...)
        특정 컬럼 등록
        insert 테이블명(컬럼1, 컬럼2)
            values(데이터1, 데이터2)
    5) 데이터 수정
        update 테이블명
            set 컬럼명 = 수정할 데이터,
                컬럼명 = 수정할데이터
                ..
            where 비교/논리연산자 조건
    6) 데이터 삭제
        delete
        from 테이블명
        where 비교/논리연산자 조건
*/
-- 번호 이름 국어 영어 수학 student 테이블 생성
CREATE TABLE student(
	NO number(3,0),
	name varchar2(50),
	kor number(3,0),
	eng number(3,0),
	math number(3,0)
);
SELECT * FROM STUDENT;
INSERT INTO STUDENT values(1,'홍길동',70,80,90);
-- ex) 물건정보를 넣는 테이블 product
--    물건번호(정수5자리), 물건명, 가격
CREATE TABLE product(
	NO number(5,0),
	name varchar2(50),
	price number(8,0)
);
INSERT INTO product values(10000, '사과', 3000);
INSERT INTO product values(10001, '바나나', 4000);
INSERT INTO product values(10002, '딸기', 12000);
SELECT * FROM product;

-- 사원정보 복사테이블
CREATE TABLE emp01
AS SELECT * FROM emp;
SELECT * FROM emp01;
-- 복사테이블은 제약조건은 복사되지 않는다.
-- 사원정보의 구조만 복사하는 테이블
CREATE TABLE emp02
AS SELECT * FROM emp WHERE 1=0;
SELECT * FROM emp02;

SELECT * FROM dept;
-- ex) dept01(전체복사), dept02(구조만) 복사테이블 만들기

CREATE TABLE dept01
AS SELECT * FROM dept;
SELECT * FROM dept01;

CREATE TABLE dept02
AS SELECT * FROM dept WHERE 1=0;
SELECT * FROM dept02;

-- 사원정보중에 급여가 2000~4000 사이이고, 사원번호 사원명 급여로 된 테이블 생성
--                                no   name
CREATE TABLE emp03
AS SELECT empno NO, ename name, sal
FROM EMP
WHERE sal BETWEEN 2000 AND 4000;
SELECT * FROM emp03;