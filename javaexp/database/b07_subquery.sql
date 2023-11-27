/*
# subquery(inline view)
1. sql을 처리한 결과가 이를 포함하는 다른 sql에 조건의 값 또는 조회값을 사용할 때 사용되는 sql을 말한다.

2. 기본 형식
    1) 조건문 데이터의 결과값으로 사용되는 경우
        사원정보중에서 최고 급여자의 사원정보를 출력하세요
        최고급여를 먼저 조회하고, 그 다음 급여 정보의 조회 조건으로 처리한다.
        
    2) 테이블을 해당 query로 작성하고, 이를 활용하여 다른 테이블과의 관계 조인을 한다.
        from(sql) 별칭1, 테이블명 별칭2
        where 별칭1.컬럼 = 별칭2.컬럼명
    
    3) select 구문에서 선택 결과를 sql로 처리하는 경우
        select(sql)
        from 테이블;
*/
SELECT max(sal)
FROM emp;
-- sql은 행단위로 먼저 searching을 해야지 최고급여만 가져올 수 있다.
SELECT *
FROM emp
WHERE sal = (SELECT max(sal) FROM emp);
-- 부서별 최대 급여자에 대한 사원 정보를 처리
SELECT deptno, empno, ename, SAL 
FROM emp e
WHERE (deptno, sal) 
IN (SELECT deptno, max(sal) 
	FROM emp
	GROUP BY DEPTNO
	)
ORDER BY deptno;
-- subquery의 결과가 다중 행인 경우 in을 사용하고
-- 열도 다중인 경우 해당 컬럼명을 선언하여 처리한다.

-- ex) 사원번호가 가장 마지막에 등록된 사원의 정보를 출력하세요
SELECT *
FROM emp
WHERE empno = (SELECT max(empno) FROM EMP);
-- 사원정보중에 마지막으로 입사한 사원의 정보를 출력
SELECT *
FROM emp
WHERE hiredate = (
SELECT max(hiredate)
FROM emp
);

-- ex) 직급별로 최저연복사의 사원 정보를 출력
SELECT *
FROM emp
WHERE sal in (SELECT min(SAL) FROM emp GROUP BY job)
ORDER BY sal;

SELECT job, sal, ename
FROM emp
WHERE (job, sal) in(
SELECT job, min(SAl)
FROM emp
GROUP BY job
)
ORDER BY sal;

SELECT job, min(sal) sal
FROM emp
GROUP BY job;

SELECT e1.*, empno, ename
FROM (SELECT job, min(sal) sal
		FROM emp
		GROUP BY job) e1, emp e
WHERE e1.job = e.job
AND e1.sal = e.sal;
-- inline view : sql의 처리 결과를 테이블로 생각하고, 그 컬럼을 조인 처리할 때 사용한다

-- 위에서 e1 은 sql에서 만들어진 가상의 테이블 즉, inline view이고 
-- 이것을 실제 테이블 emp와 조언을 해서, 원하는 결과값을 가져오게 처리할 수 있다.
-- 위와 같은 inline view을 이용하면 데이터를 보다 효과적으로 필요한 컬럼만 로딩하여 출력할 수 있다.

/*
# inline 뷰 처리 순서
1. inline view(테이블 subquery)를 작성할 내용부터 만들고, 이 데이터를 확인한다.

2. 조인 할 테이블 내용을 선언하고, 조건조건을 할당한다.

3. 원하는 컬럼 리스트를 select에 선택하여 출력한다.
*/
-- ex) 직책별 가장 먼저 입사한 사원 정보를 출력하세요(inline view 활용)
-- subquery, inline view를 쓰면 하위에 복잡한 함수 적용이나
-- 연산식을 하나의 이름으로 간단하게 불러와서 또 다른 수치/함수 적용을 간편하게 할 수 있다.
SELECT *
FROM(SELECT empno, ename, sal*1.2 sal, e.job, e.hiredate
FROM (SELECT job, min(hiredate) hiredate FROM emp GROUP BY job) e1, emp e
WHERE e1.hiredate = e.hiredate
AND e1.job = e.job);

-- 평균 급여보다 많은 사원 정보를 출력
SELECT *
FROM emp
WHERE sal>(SELECT avg(sal) FROM emp);
-- select 구문에서 바로 subquery로 데이터 출력해서 처리하는 경우.
SELECT (SELECT avg(sal) FROM emp) avgSal, e.*
FROM emp e;
-- inline view를 통해서 나온 결과값을 다시 위로 넘겨서 데이터를 처리하는 경우로,
-- 복잡한 함수 처리해서 그 결과값을 처리할 때, 주로 이용된다.
SELECT empno, sal*deptno plus
FROM 
(SELECT empno, sal, deptno FROM emp) e;

SELECT part, ename, e.sal
FROM (
SELECT TO_char(hiredate,'Q') part, max(sal) sal
FROM emp
GROUP BY TO_char(hiredate, 'Q')
	) e1, emp e
WHERE e1.part = TO_char(e.hiredate, 'Q')
AND e1.sal = e.sal
ORDER BY part;
/*
# subquery를 이용한 등록/수정/삭제 처리
1. update 명령문에 set부분이나 where 조건절에 subquery를 이용하여 수정 처리하는 것을 말한다.

2. 다른 테이블이나 현재 테이블에 정보를 변경할 때, 일단 query를 수행한 결과로
    해당 데이터를 수정 처리하는 것을 말한다.
    
3. 변경할 컬럼의 타입과 갯수는 반드시 일치하여야 한다.

4. 유형
    set 부분 subquery 활용
        - 한개의 컬럼 set 컬럼명 = (결과가 1개인 컬럼테이블)
        - 두개의 컬럼 set (컬럼1, 컬럼2) = (결과가 2개인 컬럼 데이터)
*/
-- 부서번호가 10인 사원정보의 급여를 부서정보 20인 사원의 최고 급여로 변경 처리
CREATE TABLE emp07
AS SELECT * FROM emp;
UPDATE emp07
    SET sal = (
    		SELECT max(saL)
    		FROM emp07
    		WHERE deptno = 20
    )
WHERE deptno = 10;
SELECT * FROM emp07;
-- ex) emp07 job 'SALESMAN'의 평균 급여를 사원번호 7499의 급여로 수정처리
SELECT avg(sal) FROM emp07
WHERE job = 'SALESMAN';
UPDATE emp07
	SET sal = (
				SELECT avg(sal)
				from emp07
				WHERE job = 'SALESMAN'
	)
WHERE empno = 7499;
SELECT * FROM emp;

-- 부서별 최고 급여인 사원을 삭제 처리
SELECT deptno, max(sal)
FROM EMP
GROUP BY deptno;

DELETE 
FROM emp07
where(deptno, sal) IN (
	SELECT deptno, max(sal)
	FROM emp07
	GROUP BY deptno
);
SELECT * FROM emp07;