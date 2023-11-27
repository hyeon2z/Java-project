/*
# 날짜 함수
1. 날짜 데이터 타입에 사용하는 함수
2. 날짜 계산은 더하기, 빼기 연산이 가능하다.
	1) 날짜형데이터 + 숫자 : 해당 일자에 일수를 가산하여 처리한다.
	2) 날짜형데이터 + 1/24 : 시간단위 +1시간 처리가된다.
	결국, +1은 1일 단위이기에 이것을 
		/24 : 시간단위 1/24
		/60 : 분단위
		/60 : 초단위로  처리가 된다.
3. 현재시간 처리 : sysdate(현재 연도/월/일/시/분/초)를 처리하는
   내장된 객체	
 * */
SELECT sysdate "현재", sysdate-1 "전날",
       sysdate + 1 "내일"
  FROM dual;
SELECT ename, hiredate "입사일", sysdate "현재날짜",
       hiredate+1 "입사후 1일", 
       sysdate - hiredate "입사후 현재까지 날짜1",
       floor(sysdate - hiredate) "입사후 현재까지 날짜2"
  FROM emp;  
--  ex) 사원, 이름과 입사후 90일 날짜, 지금까지 근무년도(일년-365)를 출력
 SELECT ename, hiredate + 90 "입사후 90일",
        floor( (sysdate-hiredate)/365 ) "근무년도"
   FROM emp;    
/*
# 날짜 지원 함수
1. months_between(날짜1, 날짜2) : 날짜와 날짜 사이의 개월 수를 계산
	15일인 경우 0.5, 1월간을 1로 기준하여, 날짜, 시간, 분, 초 등을
	소숫점으로 계산이 된다.
   이 계산식안에는 365,366일경우, 2월의 28/29, 각 월마다 30,31인 
    경우를 다 적용하여 처리하기에 정확성이 높다고 할 수 있다.
 * */  
SELECT ename, hiredate, MONTHS_BETWEEN(sysdate, hiredate) "근무개월",
       trunc(MONTHS_BETWEEN(sysdate, hiredate)/12) "근무연한(정확성높음)"
 FROM emp;
/*
2. add_months(날짜, 추가개월수) : 해당 날짜에 개월을 더한 날짜 계산
**/
SELECT ENAME, HIREDATE, ADD_MONTHS(hiredate, 3) "입사 후, 3개월"
FROM emp;
-- ex) 입사일로 부터 100일전,입사 1년전, 입사후 6개월이 되는 날짜를 
--     사원번호와 사원명과 함께 출력하세요. 
SELECT empno, ename, hiredate, HIREDATE -100 "입사100일전", 
		add_months(hiredate, -12) "입사1년전",
		ADD_MONTHS(hiredate, 6) "입사후 6개월" 
FROM emp;
/*
3. next_day : 해당 날을 기준으로 명시된 요일의 다음 날짜를 반환하는 함수
 * */  
-- 오늘날짜로 부터 첫번째 돌아오는 일요일
SELECT NEXT_DAY(sysdate, '일') "다가오는 첫 일요일",
       NEXT_DAY(next_day( sysdate,'일'), '일') "두번째 일요일",
       next_day(sysdate,'화') "다가오는 첫 화요일"
FROM dual;
--  ex) 입사후, 첫번째 토요일을 사원명과 함께 출력하세요.
SELECT ename, hiredate, next_day(hiredate,'토') "첫번째 토요일",
        next_day(hiredate,'토') - hiredate "남은 일수"
FROM emp;
/*
4. last_day : 해당 날짜가 속한 달의 마지막 날짜를 반환
   
 * */
SELECT LAST_DAY(sysdate) "이번달 마지막날짜" FROM dual;

-- ex) 입사한 날짜에 속한 마지막 날짜와 첫번째 날짜를 출력하고 하세요
SELECT ename, hiredate, 
		LAST_DAY(hiredate) "입사월마지막날짜",
		LAST_DAY(hiredate)+1 "다음월첫번째날짜",
		ADD_MONTHS( LAST_DAY(hiredate)+1,-1) "이번월첫번째날짜"
FROM emp;


       
