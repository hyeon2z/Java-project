/* 
# sql 함수
1. 컬럼의 값이나 데이터 타입을 선언된 내장내용을 변경하는 경우를 말한다.
2. 숫자 또는 날짜 데이터의 출력 형식을 변경하는 경우
3. 하나 이상의 행에 대한 집계를 하는 경우
ex) select 함수(컬럼)
    from 테이블
    where 함수(컬럼) = 데이터
    and 컬럼 = 함수(데이터)

# sql 함수의 유형
1. 단일행 함수 : 테이블에 저장되어 있는 개별 행을 대상으로 함수를 적용하여
    하나의 결과를 반환하는 함수
    - 데이터 값을 조작하는 데 주로 사용한다.
    - 행별로 함수를 적용하여 하나의 결과를 반환하는 함수
    1) 종류
	    - 문자함수
	    - 숫자함수
	    - 날짜함수
	    - 변환함수 : 묵시적 데이터변환/명시적 데이터변환
	    - 일반함수
    2) 사용법
        함수명(컬럼명|표현식, 매개변수1, 매개변수2,...)

2. 복수행 함수 : 조건에 따라 여러 행을 그룹화하여 그룹별로 결과를 하나씩 반환하는 함수
    1)  사용방법
        select 그룹대상컬럼, 그룹함수(그룹데이터)
        from 테이블
        group by 그룹대신컬럼
        ex) 부서번호별 최고 급여
	        select deptno, max(sal)
	        from emp
	        group by deptno;
	        
	        select max(hiredate)
	        from emp;
	        -- 사원의 입사일 중에 가장 높은 것으로 최근에 입사한 날짜를 출력
*/
-- 문자함수 : 문자데이터를 입력하여 문자나 숫자를 결과로 변환하는 함수
-- 1. initcap() : 문자의 첫번째 문자만 대문자로 변환
SELECT ename, initcap(ename) ename2, job, INITCAP(job)job2
FROM EMP;
-- ex) || 연결연산자를 활용하여 사원명 is a 직책명으로 출력하세요. ex) Smith is a Clerk

SELECT INITCAP(ENAME)  || ' is a ' ||INITCAP(JOB) show
FROM emp;

/*
   2. 대소문자 변환 함수
       주로 실무상 코드명이나 물건명이 영문으로 되어있는 경우, 대소문자 구분없이 검색이 필요한 경우,
       입력/수정/조회 조건문 사용으로 활용할 수 있다.
           
           1) lower() : 문자열 전체를 소문자로 변환처리한다.
               ex) lower('Student') ==> student
           2) upper() : 문자열 전체를 대문자로 변환처리한다.
               ex) upper('Student') ==> STUDENT
*/
SELECT ename, LOWER(ename) "사원명소문자",
        JOB || UPPER('- hi! Man!') "직책과 조합 대문자"
FROM emp;

SELECT * FROM EMPLOYEES;
SELECT first_name || ' ' || last_name 전체이름,
        LOWER(FIRST_NAME) 소문자로, UPPER(LAST_NAME) 대문자로 
FROM EMPLOYEES e;
-- ex) employees 테이블에서 job_id, email은 소문자로, first_name은 대문자로 변환하여 || 연결연산자와 혼합하여
--    직책 @@@(job_id)인 @@@(first_name)의 이메일은 @@@(email) =입니다.
SELECT '직책 ' || LOWER(job_id) || '(job_id)인 ' || UPPER(first_name) || '(first_name)의 이메일은 ' || LOWER(email) || '입니다' show
FROM EMPLOYEES e;

-- first_name 컬럼을 기준으로 do, DO, dO 입력값 상관없이 Do라는 글자를 대소문자 관련 없이 검색이 되게 하려면
SELECT first_name, employee_id
FROM EMPLOYEES e 
WHERE UPPER(first_name) LIKE '%' || UPPER('do') || '%';
-- WHERE lower(first_name) LIKE '%' || lower('do') || '%';
--    첫번째이름[   ] 마지막이름[   ] [검색] ==> 검색시,
--        입력값의 대소문자 상관없이 검색을 처리 할 때, 사용할 sql처리부분(keyword)

-- upper('do') 부분에 어떤 데이터를 입력하더라도 대문자로 바뀌고, 다시 컬럼을 upper(컬럼명)에 의해 대문자로 변환된 내용을 검색되게 한다.

-- ex) employee 테이블에 email와 job_id가 대소문자 관련없이 키워드 검색되게 하기. 연습키워드 'o', 'A'
SELECT email, job_id
FROM EMPLOYEES e 
-- WHERE UPPER(EMAIL) LIKE '%' || UPPER('o') || '%';
WHERE lower(job_id) LIKE '%' || lower('o') || '%'; 

SELECT email, job_id, e.* -- 추가컬럼 e(테이블 alias) e.*
FROM EMPLOYEES e
WHERE UPPER(email) LIKE UPPER('%o%')
AND LOWER(job_id) LIKE LOWER('%A%');