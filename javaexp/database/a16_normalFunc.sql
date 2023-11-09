/*
# 많이 활용되는 일반 기능함수
*/
/*
1. nvl(param1, param2)
    param1 : 컬럼이나 데이터
    param2 : param1의 컬럼이나 데이터가 null일 때, 대신해서 처리할 데이터내용
*/
SELECT ename, sal, comm, sal+comm 합산,
nvl(comm,0) "0처리 comm", sal+nvl(comm,0) 합산2
FROM emp;
-- 위 내용에서 comm이 null일 경우 sal값과 정상적인 합산을 처리할 수 없다.
-- 이 때, nvl을 처리해서 comm이 null일 경우 0으로 처리되어 합산을 정상적으로 할 수 있다.
SELECT * FROM EMPLOYEES;
SELECT employee_id, salary, commission_pct "보너스%"
FROM employees;
-- ex) salary와 commission_pct를 기준으로 보너스 금액을 사원아이디, 급여, 보너스금액 출력 
SELECT employee_id 사원아이디, salary 급여, commission_pct "보너스%",
nvl(commission_pct,0)*salary 보너스금액
FROM employees
ORDER BY nvl(commission_pct,0)*salary;
/*
2. nvl2(컬럼 또는 데이터, param1, param2)
    컬럼이 null이 아닐 때, param1 처리
    컬럼이 null일 때, param2로 처리
*/
SELECT salary*commission_pct, salary, nvl2(commission_pct,(salary*commission_pct)+SALARY,salary) 합산
FROM employees;
-- comm이 null이 아닐 때는 0.2, null일때는 0.1로 보너스 %로 지정한다고 할 때 처리
SELECT ename, sal, comm, nvl2(comm,0.2,0.1)*100 "보너스%"
from emp;
-- ex) 사원과 급여 보너스를 합산 처리하되 comm이 null 일 경우 sal만
-- comm이 null이 아닌경우 sal+comm을 처리하여 총계로 출력(nvl2)
SELECT nvl2(comm,sal+comm,sal) 합산
FROM emp;

SELECT ename, sal, COMM
FROM emp
WHERE nvl(comm,0)!=0;

/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
3. nullif(컬럼1, 컬럼2)
	두개의 컬럼 또는 데이터가 동일하면 null, 그렇지않으면 컬럼1을 출력
*/
SELECT NULLIF('a','a') 결과1, NULLIF('a','b') 결과2,
nvl(NULLIF('a','a'),'동일') 결과3
FROM dual;
/*
4. mod(컬럼1, 데이터)
    특정 컬럼의 데이터를 나눈 나머지값.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ode()
*/
SELECT empno, mod(empno,2) "구분"
FROM emp;
SELECT empno, mod(empno,2) "구분"
FROM emp
WHERE mod(empno,2)=0; -- 짝수 사번만 출력
--
SELECT *
FROM EMPLOYEES e;
-- ex) employees에서 employee_id를 기준으로 3으로 나누어 지면 청팀
-- 1이 남으면 홍팀, 2가 남으면 심판으로 구분한다
-- 각 팀의 인원을 구해보기.
-- mod(), groupby 활용, count(*)
SELECT mod(employee_id, 3) div, count(*)
FROM employees
GROUP BY mod(employee_id,3)
ORDER BY div;

-- 입사일을 기준으로 월별로 입사인원처리, 분기별로 입사인원
SELECT hiredate, TO_char(hiredate, 'MM') 입사월,
to_char(hiredate, 'Q')||'/4' 분기
FROM emp
ORDER BY to_char(hiredate, 'MM');

SELECT TO_CHAR(hiredate, 'MM') 입사월, count(*) "인원수"
FROM EMP
GROUP BY to_char(hiredate, 'MM')
ORDER BY 입사월;
-- ex) 분기별 입사 인원수 출력
SELECT to_char(hiredate,'Q')||'/4' 분기, count(*) 인원수
FROM emp
GROUP BY to_char(hiredate,'Q')
ORDER BY 분기;

SELECT to_char(hiredate,'Q')||'/4' 입사분기, avg(sal) 평균급여
FROM EMP
GROUP BY to_char(hiredate,'Q')
ORDER BY 입사분기;
/*
5. decode()
    1) 특정 데이터의 비교를 통한 데이터값을 처리할 때 활용된다.
    2) 형식
        decode(컬림|데이터, 1번값, 1번값일때 처리할 데이터,
                        2번값, 2번값일때 처리할 데이터
                        ..
                        그 외 데이터)
    ps) decode 함수는 프로그래밍에 있어서 case when 구문과 유사한 특징을 가지고 있다.
        즉, 해당 기준 컬럼의 데이터가 어떤 case인 경우냐를 기준으로
        처리할 데이터와 컬럼을 지정하는 것이라고 할 수 있다.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ode()
*/
-- 부서번호 기준으로 부서명 지정
SELECT ename, deptno, decode(deptno, 10, '인사',
20, '재무', 30, '총무', 40, '기획', '미정') dname
FROM emp;
-- ex) 사원번호를 기준으로 짝수이면 청팀, 홀수이면 홍팀으로 출력되게 하세요
SELECT empno, decode(MOD(empno, 2), 0 ,'청팀','홍팀') 팀1, -- key로 NULL 없을때
decode(MOD(empno,2),1,'홍팀',0,'청팀','팀미정') 팀2 -- key가 아니라서 NULL 있을때
FROM emp;

select job_id 직책, decode(COMMISSION_PCT , 0.1, '10%',
                      0.15, '15%',
                      0.2, '20%',
                      0.25, '25%',
                      0.3, '30%',
                      0.35, '35%',
                      0.4, '40%', '보너스없음') "보너스%",
decode(COMMISSION_PCT , 0.1, (1.1*SALARY),
	0.15, (1.15*SALARY),
	0.2, (1.2*SALARY),
	0.25, (1.25*SALARY),
	0.3, (1.3*SALARY),
	0.35, (1.35*SALARY),
	0.4, (1.4*SALARY), SALARY) "보너스%포함월급"
FROM EMPLOYEES;

SELECT ename 사원명, hiredate 입사일,
CASE 
WHEN to_char(hiredate,'MM')>=11 THEN '겨울'
WHEN to_char(hiredate,'MM')>=9 THEN '가을'
WHEN to_char(hiredate,'MM')>=6 THEN '여름'
WHEN to_char(hiredate,'MM')>=3 THEN '봄'
WHEN to_char(hiredate,'MM')<=2 THEN '겨울'
END "계절"
FROM emp;
/*
6. case 키워드 처리(조건문처리)
1) decode의 확장된 함수 형식을 표현식 또는 컬럼 값 '=' 비교를 통해
    조건에 일치하는 경우에만 다른 값으로 대치하지만, case함수에서는
    산술연산, 관계연산, 논리연산과 같이 다양한 비교가 가능하다.

2) 기본형식
    case[컬럼명]
        when 비교/논리 연산식 then 처리할 데이터,
        when 비교/논리 연산식 then 처리할 데이터,
        when 비교/논리 연산식 then 처리할 데이터,
        else 기타 처리할 데이터
    end
# 이와 같이 특정한 컬럼이나 비교 논리식으로 데이터를 처리해서 프로그램에
    if 구문의 처리와 유사하다고 할 수 있다.
*/
SELECT ename, sal,
    CASE WHEN sal>=5000 THEN 'A등급'
         WHEN sal>=4000 THEN 'B등급'
         WHEN sal>=3000 THEN 'C등급'
         WHEN sal>=2000 THEN 'D등급'
         ELSE 'F등급'
    END "등급분류",
    CASE deptno WHEN 10 THEN '인사'
                WHEN 20 THEN '재무'
                WHEN 30 THEN '무역'
                WHEN 40 THEN '기획'
                ELSE '미정'
    END "부서명"
FROM emp;

SELECT ename, to_char(hiredate,'Q') 분기
FROM emp;
-- ex) 분기에 따른 보너스 % 설정 
-- 1 ==> 15%, 2 ==> 20%, 3 ==> 8%, 4 ==> 5% 설정을
-- case when 구문을 이용해서 처리하고 출력하세요.

SELECT ename 사원,
    CASE WHEN to_char(hiredate,'Q')=1 THEN 0.15
         WHEN to_char(hiredate,'Q')=2 THEN 0.2
         WHEN to_char(hiredate,'Q')=3 THEN 0.08
         WHEN to_char(hiredate,'Q')=4 THEN 0.05
    END "보너스%"
FROM emp;

SELECT * FROM EMPLOYEES ;