/*
# 숫자형 처리 함수
1. 테이블에 컬럼별로 저장되어 있는 숫자형 테이블을 합산하거나
	통계치를 낼 때, 올림/반올림/내림 들을 처리할 필요가 있을 때가 있다.
	이 때 사용하는 함수가 숫자형 함수이다.
	ex) 학생 성적테이블에서 과목별 점수에 대한 합산과 평균 처리
	ex) 사원정보의 입사일을 기준으로 6개월 후, 특정 일과 날짜의 차이들에 대한 처리
2. 오라클은 기본적으로 숫자형 문자열의 자동형변환을 포함하고 있어서
	이것을 감안해서 처리하는 방법을 확인해보도록 한다.
3. 주요 학습 내용
	1) 숫자형 함수들의 기능적인 내용을 확인하고 익힌다.
	2) 숫자형 함수에서 절삭시, 자릿수에 대한 처리를 확인한다.
	3) 각 함수를 사용할 때, 중첩적으로 사용할 내용에 대한 처리를 감안하여,
		앞에서 배운 여러가지 함수와 함께 사용하는 방법을 생각해보자.
	4) select 함수처리와 where 함수 처리의 차이점에 대하여 구분하여 처리할 수 있다.
4. 주요 함수의 기본 형식
	1) round(데이터, 자리수) : 반올림 처리, 자리수 처리해준다.
	2) trunc(데이터, 자리수) : 내림/절삭 처리, 자리수 처리해준다.
	3) ceil(데이터) : 올림 처리, 정수형 리턴
	4) floor(데이터) : 내림 처리, 정수형 리턴
	5) mod(데이터, 나눌수) :  대상되는 데이터를 나눌 수로 나눈 후,
		나머지값을 처리할 때 사용한다. 오라클은 나머지 연산자가 없다. 함수로 처리
5. 생각해볼 내용
	1) 자릿수 처리 함수에서 자리수 개념
		trunc(75.346,2) : 소숫점 이하 2자리까지 표시하고 그 이후 내용을 절삭 처리
			==> 75.34
		trunc(7534.346, -1) : .을 기준으로 왼쪽으로 1자리 즉 10자리
			단위로 절삭처리 ==> 7530
		trunc(7534.346, -2) : .을 기준으로 왼쪽으로 2자리 즉 100자리
			단위로 절삭처리 ==> 7500
	2) 위 함수의 적용 범위
		- 숫자의 연산
		- 날짜형 데이터의 처리(날짜형 데이터 처리 규칙과 관계에서)
			Date
				05/25 ==> 11/25 날짜별로 6개월 후의 날짜와 시간이 다름
				현재시간을 기준으로 3개월 후
				날짜계산의 복잡 1/1000 ==> 1 ===> 60 ==> 60 ==> 24
				==> 1일 ==> 월 
	3) 중첩함수 처리시 복잡성에 대한 대안
	4) 함수는 select 함수(컬럼)
	        from
	        where 함수(컬럼) = 데이터
	          and 컬럼 = 함수(데이터)
**/
select 
	round(23423.27734,3) "반올림소수점3자리",
	round(23423.27734,1) "반올림소수점1자리",
	round(23423.27734,-3) "반올림1000자리",
	trunc(23423.27734,1) "절삭소수점1자리",
	trunc(23423.27734,-2) "절삭100자리",
	CEIL(23423.27734) "올림(정수형)",
	floor(23423.27734) "내림(정수형)"
FROM dual;	
-- ex)사원명, 급여를 100단위로 반올림처리, 
--     급여+보너스를 1000단위로 절삭하여 처리하여 출력
SELECT ename, round(sal,-2) "급여100자리반올림",
       trunc(sal+nvl(comm,0),-3) "급여+보너스 1000단위"
FROM emp;       




