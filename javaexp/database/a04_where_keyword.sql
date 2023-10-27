/*
# 기타 비교/논리연산 처리 구문
1. 컬럼 in(데이터1, 데이터2...)
    해당컬럼에 or 조건으로 데이터가 있을 경우를 지칭한다.
    ==> 컬럼 = 데이터1 or 컬럼 = 데이터2 or 컬럼 = 데이터3..
    
    subquery로도 사용할 때가 많다.
    	where sal in (select max(sal) from emp)
    	급여가 가장 높은 사원을 출력 시 사용
    
    컬럼명 between a and b : a와 b 포함한 사이
    ==> 컬럼명 >= a and 컬럼명 <= b
    
2. not, !=, <> 해당 조건이 아닐 때
3. 컬럼 = null ==> 컬럼 = 'null' 처리(문자열)
		문자열 자동형 변환이라는 기능을 포함하고 있기 때문에 위 내용을
		문자열로 인식해서 처리 = (비교연산식에서는 문자열 비교를 처리)
    컬럼명 is null 실제 데이터가 없는 null 인 경우
    컬럼명 is not null 실제 데이터가 있는 경우
    ps) null : 데이터 자체가 할당되지 않음.
        'null' : 문자열 'null' 이 할당되어 있는 경우
*/
SELECT * FROM emp;
-- 사원 번호가 7369, 7499, 7521인 경우 데이터 조회
SELECT *
FROM EMP e 
WHERE empno in(7369, 7499, 7521);

SELECT *
FROM emp
WHERE sal BETWEEN 2000 AND 3000;

SELECT ename, comm
FROM emp
WHERE COMM = NULL; -- 컬럼 = NULL ==> 'null'로 형변환되서 문자열비교

SELECT ename, comm
FROM EMP e 
WHERE comm IS NULL;

SELECT ename, comm
FROM EMP e 
WHERE comm IS NOT NULL;

-- ex1) 부서번호가 10, 30인 경우 사원 정보를 출력
SELECT * FROM EMP e 
WHERE deptno IN(10, 30);

-- ex2) comm이 null이 아닌 경우, 사원번호, 급여 + 보너스 합산을 출력하세요
SELECT empno 사원번호, SAL + comm "급여+보너스"
FROM EMP e 
WHERE COMM IS NOT NULL