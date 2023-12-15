SELECT * FROM emp;
/*
# where조건문 키워드 검색
1. 컬럼 like를 활용하면 비슷한 키워드로 검색을 할 수 있다.
2. 기본 형식
	1) where 컬럼명 like '%키워드%'
	   키워드가 포함되면 검색 처리
    2) where 컬럼명 like '시작키워드%'
       해당 문자열로 시작되면 검색
    3) where 컬럼명 like '%키워드'
       해당 키워드로 끝나면 검색
    4) where 컬럼명 like '_A%'
    	두번째 자리에 A가 포함되면 검색.
    5) where 컬럼명 like '__A__'
    	전체자리수가 5자리이고, 3번째 문자가
    	A이면 검색
**/
SELECT * FROM emp;
SELECT * 
FROM emp
WHERE ename like '%A%'; -- A가 포함되어 있는 사원명 검색
SELECT * 
FROM emp
WHERE ename like 'A%';
SELECT * 
FROM emp
WHERE job like '%MAN';
SELECT *
FROM EMP
WHERE ENAME LIKE '_A%';
SELECT *
FROM emp
WHERE job LIKE '__E__'; -- 자리수가 5자리이고, 3번째 E를 포함한 데이터 검색
-- ex1) 앞에서 4,5번째 ES를 포함한 직책(job)이 있는 사원정보
SELECT * FROM emp
WHERE job LIKE '___ES%';
-- ex2) 뒤에서 세번째 자리에 M이 포함된 직책(job) 검색
SELECT * FROM emp
WHERE job LIKE '%M__';
-- ex3) 자리수가 5자리이고 중간에 I자가 포함된 사원명(ename) 검색
SELECT * FROM emp
WHERE ename LIKE '__I__';


