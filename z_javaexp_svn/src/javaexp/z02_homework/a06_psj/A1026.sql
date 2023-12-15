/*
[1단계:개념] 7. 데이터베이스의 keyword 검색의 기본 형식을 예제를 통해서 기술하세요.
[1단계:확인] 8. 사원정보를 정렬하여 출력하되 부서번호(deptno)를 1차(오름차순)로 급여(sal) 2차(내림차순)으로 부서번호, 급여, 사원명을 출력하세요.
*/
SELECT *
FROM EMP e 
WHERE sal LIKE '5___' ; -- 연봉이 5천달러대인 사원을 알고싶다 (4자리수)

SELECT *
FROM EMP e 
WHERE ENAME  LIKE 'M%' ; -- 이름이 M으로 시작하는 사원을 알고싶다

SELECT *
FROM EMP e 
WHERE ENAME  LIKE '%M%' ; -- 이름에 M이 들어가는 사원을 알고싶다

SELECT *
FROM EMP e 
WHERE ename LIKE '__L__' ; -- 이름이 5자리인데 가운데자리가 L인 사원을 알고싶다

SELECT DEPTNO , sal, ENAME 
FROM EMP 
ORDER BY DEPTNO, sal DESC; -- 부서번호 오름차순 먼저하고 그중 급여가 높은사람이 먼저 나오게 정렬
