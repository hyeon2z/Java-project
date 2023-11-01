/*
# 데이터베이스에서 CRUD란?
1. C : create 즉, 생성을 말하는 것. 데이터를 입력 할 때, 사용되는걸 말한다.
        기본 구분으로 전체 컬럼에 입력 할 때,
        insert into 테이블명 values(데이터1, 데이터2...);
            해당 테이블에 포함된 컬럼의 순서에 맞게 데이터를 입력하는 것을 말한다.
        insert into 테이블명(입력할컬럼1, 컬럼2, 컬럼3)
                    values(데이터1, 데이터2, 데이터3);

2. R : read 즉, 데이터를 읽어오는 처리를 하는 것을 말한다.
    select * from emp;
    
3. U : update 데이터를 수정하는 것을 말한다.
    update emp
        set ename = '홍길동',
            job = '사원'
    where empno = 7780;

4. D : delete 데이터를 삭제하는 것을 말한다.
    delete
    from emp
    where empno = 7780;

일반적으로 데이터에 의한 처리를 CRUD라는 용어를 이용해서 처리하는 것을 의미할 때 사용한다.
*/
SELECT * FROM emp01;
SELECT SYSDATE 오늘날짜, 1+2 합산 FROM dual;
-- sysdate : 현재 날짜와 시간으로 가져오는 키워드(오라클 내장 객체)
-- dual : 하나의 데이터를 확인 할 때 사용하는 오라클의 내장된 테이블

INSERT INTO emp01 values(1000,'홍길동','사원',7780,sysdate, 4000, 100, 10);
SELECT * FROM emp01;

-- ex) emp01에 위와 같이 1001사원번호로 사원정보 입력
-- 사원명(10byte), 직책(9byte) -> 입력 주의

INSERT INTO EMP01 values(1001,'김길동','대리',7781,sysdate,4000,100,10);
SELECT * FROM emp01;

INSERT INTO EMP01(empno, ENAME, SAL)
            values(1002, '오길동', 5000);
-- 지정되지 않는 컬럼의 데이터는 null(데이터없음)으로 처리된다.
           
SELECT * FROM emp02;
-- ex) emp02 사원번호, 직책, 입사일, 급여, 부서번호를 입력하세요.
INSERT INTO emp02(empno, job, hiredate, sal, deptno) values(1003, '인턴', sysdate, 2500, 11);
SELECT * FROM emp02;

/*
# 수정기본형식
1. update 테이블
        set 컬럼1명 = 수정할데이터,
            컬럼2명 = 수정할데이터
        where 조건(비교/논리)
2. 위 형식으로 특정 테이블에 조건으로 특정 컬럼의 데이터를 수정한다.
*/
SELECT * FROM emp01;
UPDATE EMP01
    SET ename = '마길동'
  WHERE empno = 7369;
UPDATE EMP01 
    SET job = '사원',
        mgr = 7777
  WHERE empno = 7369;
-- ex) emp01 테이블의 empno가 7499인 사원의 ename, job, deptno를 변경하세요
UPDATE EMP01
	SET ename = '최길동', job = '인턴', DEPTNO = 5
	WHERE EMPNO = 7499;
SELECT * FROM emp01;
/*
# 삭제 기본형식
1. delete 
    form 테이블명
    where 비교/논리
2. 테이블에 비교/논리식을 통하여 특정 데이터를 행단위로 삭제한다.
    행단위로 삭제 되기에 delete 컬럼명 지정이 필요없게 되었다.
 */
DELETE
FROM EMP01 e
WHERE empno = 1000;
SELECT * FROM emp01;
DELETE
FROM EMP01 e
WHERE sal BETWEEN 1000 AND 2000;
-- ex) emp01 기준으로 직책이 MANAGER인 데이터를 삭제해보기
DELETE 
FROM EMP01 e 
WHERE JOB = 'MANAGER';

SELECT * FROM EMP01 e;

-- ex) emp01 기준으로 부서번호가 20이고, 직책이 대리인 데이터를 삭제하세요
DELETE
FROM EMP01 e 
WHERE DEPTNO = 20 AND JOB = '대리';



