/*
[1단계:확인] 1. 아래 sql문을 작성해보세요..
	급여에 10% 증가시킨 금액 조회
	사원명과 입사일을 연결하여 조회
	사원명과 해당 사원의 관리자번호와 연결하여 조회
	@@@(사원명)의 입사일은 @@@인데, 현재 급여와 보너스 합산액은 @@@이고,
	   이중에서 8%인 @@@이 세금입니다.(출력)
	관리자번호가 중복되지 않게 출력하세요
[1단계:확인] 2. WHERE 조건문을 활용하여 아래 내용을 처리하세요
        급여가 3000이상인 사원정보 출력
	부서번호가 10이고 급여가 4000미만인 사원정보 출력
[1단계:개념] 3. 컬럼=null과 컬럼 is null의 차이점을 sql을 통해서 설명하세요 

# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
3. 수업 시간 집중하였는가?    
*/

SELECT sal 급여, sal*1.1 "급여10%인상후"
FROM EMP e ;

SELECT ename 사원명, hiredate 입사일, ename||hiredate "ex1-2"
FROM EMP e;

SELECT ename||'/'||mgr "ex1-3"
FROM EMP e;

SELECT ename||'의 입사일은 '||hiredate||
	'인데, 현재 급여와보너스 합산액은 '||(sal+nvl(comm,0))||
	'이고, 이중에서 8%인 '||(sal+nvl(comm,0))*0.08||'이세금입니다.' t3
FROM EMP e;

SELECT *
FROM EMP e 
WHERE SAL >= 3000;

SELECT *
FROM EMP e 
WHERE DEPTNO = 10 AND SAL < 4000;

SELECT *
FROM EMP e 
WHERE comm = NULL; -- comm 컬럼을 null을 넣어버린다는 명령이다.

SELECT *
FROM EMP e 
WHERE comm IS NULL; -- comm이 Null값이면 가져온다는 조건문이다.