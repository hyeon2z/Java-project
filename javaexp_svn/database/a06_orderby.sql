/*
# 데이터의 정렬처리
1. sql명령문에서 검색된 결과는 테이블에 데이터가 입력된 순서로 일반적으로 출력된다.
2. 데이터의 출력 순서를 특정 컬럼을 기준으로 오름차순/내림차순으로 정렬하는 경우가 발생한다.
3. 여러 개의 컬럼에 대해 정렬 순서를 지정해서 처리해야 할 경우
	1차로 컬럼명 정렬옵션, 2차로 컬럼명 정렬옵션으로 오름차순/내림차순으로 처리한다.
4. 기본적인 정렬 방법
	1) 문자값을 알파벳순으로 출력되고, 한글은 가나다라 순으로 출력된다(오름차순)
	2) 숫자값은 가장 작은 값으로부터 점점 더 큰값으로 정렬된다(오름차순)
	위 내용에 반대되는 형식을 내림차순이라고 한다.
5. 기본 형식(코드)
	select 
	from 테이블명
	where 조건문 처리
	order by 컬럼명 [asc|desc], 컬럼2 [asc|desc] 
	asc : 모든 정렬은 오름차순이 default이다 즉, 옵션을 정하지 않으면 오름차순
		order by 컬럼1 desc, 컬럼2 
	desc : 역순/내림차순 정렬  
		내림차순을 처리할 때는 컬럼명 desc 라고 명시적으로 선언하여야 한다.	
 * */
-- 사원번호 기준으로 오름차순
SELECT *
FROM emp
ORDER BY empno;
-- 사원번호 기준으로 내림차순
SELECT *
FROM emp
ORDER BY empno DESC;
--ex1) 연봉이 가장 높은 사람으로 부터 가장 낮은 사람 순으로 급여와 이름을 출력하세요
SELECT sal, ename
FROM emp
ORDER BY sal desc;
--ex2) 입사일을 기준으로 최근에 입사한 사람으로 부터 가장 먼저 입사한 사람 순으로
--     입사일과 사원명을 출력하세요.
SELECT hiredate, ename
FROM emp
ORDER BY hiredate DESC;
