package javaexp.z02_homework.a18_LSD;

public class A1025 {

	public static void main(String[] args) {
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

		*/
//		--empno, ename, job, mgr, hiredate, sal, comm, deptno
//		   
//		-- 문제 1.
//
//		SELECT sal*0.1 "급여에10%증가시킨금액"
//		FROM emp;
//
//		 SELECT ename||hiredate "사원명-입사일"
//		 FROM emp;
//		 
//		SELECT ename||mgr "사원-관리자번호"
//		FROM emp;
//
//
//		SELECT ename||'의 입사일은'||hiredate||'인데, 현재 급여와 보너스 합산액은'||sal+comm||'이고,
//			   이중에서 8%인 '|| (sal+comm)*0.08 ||'이 세금입니다.'
//		FROM emp;
//			 
//		SELECT DISTINCT mgr
//		FROM emp;
//
//		-- 문제 2.
//		SELECT * 
//		FROM EMP
//		WHERE sal>=3000;
//
//		SELECT *
//		FROM EMP
//		WHERE deptno=10 AND sal<4000;
//
//		--3.
//		컬럼 is NULL : 실제 데이터가 없음
//		컬럼 = NULL : 컬럼명이 null

	}//main()

}//A1025{}
