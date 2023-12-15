-- emp : 사원정보 테이블
-- empno(사원번호), ename(사원명), job(직책), mgr(관리자번호), hiredate(입사일)
-- sal(급여/연봉), comm(보너스), deptno(부서번호)
/*
[1단계:확인] 1. 아래 sql문을 작성해보세요..
	급여에 10% 증가시킨 금액 조회
	사원명과 입사일을 연결하여 조회
	사원명과 해당 사원의 관리자번호와 연결하여 조회
	@@@(사원명)의 입사일은 @@@인데, 현재 급여와 보너스 합산액은 @@@이고,
	   이중에서 8%인 @@@이 세금입니다.(출력)
	관리자번호가 중복되지 않게 출력하세요
*/
SELECT sal * 1.1 "10%증가한 급여"
FROM EMP e

SELECT ename||'-'||hiredate "사원명-입사일"
FROM EMP e 

SELECT ename||'-'||mgr "사원명-관리자번호"
FROM EMP; 

SELECT SAL+COMM
FROM EMP;

SELECT ename||'의 입사일은 '||HIREDATE||'인데, 현재 급여와 보너스 합산액은 '||(sal+nvl(COMM,0)) ||'이고, 이중에서 8%인 '||((sal+nvl(comm,0))*0.08)||'이 세금입니다.' 정보 
FROM EMP

SELECT DISTINCT mgr 관리자번호
FROM emp
WHERE mgr IS NOT NULL;
/*
[1단계:확인] 2. WHERE 조건문을 활용하여 아래 내용을 처리하세요
        급여가 3000이상인 사원정보 출력
	부서번호가 10이고 급여가 4000미만인 사원정보 출력
*/
SELECT *
FROM emp
WHERE SAL  > 3000;

SELECT *
FROM EMP e 
WHERE DEPTNO = 10 AND sal < 4000;
/*
[1단계:개념] 3. 컬럼=null과 컬럼 is null의 차이점을 sql을 통해서 설명하세요 
컬럼 = null 은 컬럼에 있는 데이터값을 비교하는게 아닌 해당 컬럼 문자열이 'null' 인지 물어보는것이고
컬럼 is null 은 컬럼의 데이터값이 null 인지 물어보는것이다.
*/
SELECT ename, comm
FROM EMP e 
WHERE comm IS NULL; -- NULL 인 값만 출력

SELECT ename, comm
FROM EMP e 
WHERE comm IS NOT NULL; -- NULL 아닌 값만 출력