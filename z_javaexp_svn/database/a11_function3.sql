/*
# instr(지정한문자열데이터|컬럼, '검색문자')
1. 특정한 문자열을 검색해서 해당 문자열의 위치를 index로 반환처리하는 함수
	ex) 주로 대용량의 문자열 데이터를 검색해서 해당 문자열의 첫번째 위치를
	index(1부터시작)로 표현해준다. 없으면 0으로 나온다.
2. 추가옵션
	instr(데이터|컬럼, '검색문자',시작위치, 검색된 횟수)
 * */
SELECT instr('sql*plus','*') sch1, -- 4번째 위치
       instr('sq*lp*lu*s','*',3,1) sch2,-- 3번째 위치
       instr('sq*lp*lu*s','*',3,2) sch3,-- 2번째 나타난 *은 6번째 위치
       instr('sq*lp*lu*s','#',3,2) sch4  -- 검색되지 않을 경우 0
FROM dual; 
-- ex) 위 instr 함수를 이용해서 직책에서 MAN이 있는 경우에 해당 위치를
--     직책과 함께 출력하세요.
SELeCT JOB, INSTR(JOB,'MAN') pos
FROM emp
WHERE INSTR(JOB,'MAN')>0;
/*
# 문자열을 특정한 크기를 만들어 부족한 문자는 특정 문자열로 채워서 처리하는 
	lpad, rpad
1. 예를들어 크기가 10자를 기준으로 해당 문자열보다 적으로 공백인, #으로 채워서
	일괄적으로 해당 크기로 표현하는 경우에 사용된다.
2. lpad : left padding 왼쪽을 특정 문자열로 채우는 경우
	lpad(데이터, 크기, 왼쪽에 덧붙일문자열)
3. rpad : right padding 오른쪽을 특정 문자열로 채우는 경우
	rpad(데이터, 크기, 오른쪽에 덧붙일문자열)
	
cf) varchar2내용을 char에 특정문자열로 채워서 입력할 때 사용.	
 * */
SELECT lpad('sql',5,'*') show1,
       rpad('sql',10,'#') show2
 FROM dual;
-- ex) 사원명의 최대크기 확인(max)해서, 그 보다 작은 문자는
--     왼쪽에 *, 오른쪽에 #를 각각 처리하여 출력하세요
SELECT max(LENGTHB(ename)) 사원명의최대크기
FROM emp;
SELECT ename
FROM emp;
SELECT ename, length(ename) 사원명길이,
       lpad(ename,6,'*') "왼쪽*",
       rpad(ename,6,'#') "오른쪽#"
  FROM emp;
/*
# 왼쪽과 오른쪽에 특정한 문자열을 삭제하는 trim
1. trim이라는 말은 절삭이라는 말로, 왼쪽이나 오른쪽 끝에 있는 특정한 문자열을
	반복적으로 삭제할 대, 사용된다.
2. 주요 기능함수
	1) ltrim(컬럼|데이터, '제거할문자') : 왼쪽에 제거할 문자를 반복적으로 없애준다.
	2) rtrim(컬럼|데이터, '제거할문자') : 오른쪽에 제거할 문자를 반복적으로 없애준다.
	3) trim('양쪽에삭제할문자' from 컬럼|데이터)
		양쪽에 제어할 문자가 있을 때, 한번에 제거 처리한다.
 * */
SELECT ltrim('*****sql****','*') str1,
       rtrim('*****sql****','*') str2,
       trim('*' FROM '****sql****') str3
  FROM dual;
-- ex) 직책(job) 기준으로 왼쪽에 'S', 오른쪽에 'N'을 삭제하고 출력하세요. 
SELECT job, ltrim(job,'S') job1,
       rtrim(job,'N') job2,
       rtrim(ltrim(job,'S'),'N') job3
FROM emp;


       