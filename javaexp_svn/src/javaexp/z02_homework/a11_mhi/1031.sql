--[1단계:확인] 1. EMP 테이블에서 emp05 복사 테이블을 생성하세요
CREATE TABLE emp05 AS
SELECT * FROM emp;

SELECT * FROM emp05;

--[1단계:확인] 2. emp05 테이블에서 모든 사원의 이름, 직책, 급여를 출력합니다.
SELECT ename, job, sal FROM emp05;

--[1단계:확인] 3. emp05 테이블에서 급여가 2000 이상인 사원의 이름, 직책, 급여를 출력합니다.
SELECT ename, job, sal FROM emp05
WHERE sal >=2000

--[1단계:확인] 4. emp05 테이블에서 부서가 20번인 사원의 이름, 직책, 급여를 출력합니다.
SELECT ename, job, sal FROM emp05
WHERE deptno=20

--[1단계:확인] 5. emp05 테이블에 새로운 사원을 추가합니다.
SELECT * FROM emp05;
INSERT INTO emp05 VALUES (7935,'HIMOON','STUDENT',7780,sysdate,4000,100,10);

--[1단계:확인] 6. emp05 테이블에서 사원의 이름이 "SMITH"인 사원의 정보를 수정합니다.
UPDATE EMP05
    SET JOB = 'ANALYST'
   WHERE ENAME ='SMITH';

 SELECT * FROM emp05;
--[1단계:확인] 7. emp05 테이블에서 사원의 이름이 "SMITH"인 사원을 삭제합니다.
DELETE
FROM emp05
WHERE ename ='SMITH';

--[1단계:확인] 8. DEPT 테이블에서 dept03 복사 테이블을 생성하세요
SELECT * FROM dept

CREATE TABLE dept03 AS
SELECT * FROM dept;

SELECT * FROM dept03;

--[1단계:확인] 9. dept03 테이블에서 부서 번호가 20번인 부서의 정보를 수정합니다.
SELECT * FROM dept03;
UPDATE dept03
  SET dname = 'HIMOON'
  WHERE deptno = 20;
 
--[1단계:확인] 10. dept03 테이블에서 모든 부서의 이름, 위치를 출력합니다.
SELECT * FROM dept03;
 
 --[1단계:확인] 11. dept03 테이블에서 부서 번호가 20번인 부서를 삭제합니다.
DELETE 
FROM dept03
WHERE deptno =20;

--[1단계:확인] 12. 모든 사원의 이름을 대문자로 변환한 후, 이름의 길이를 출력하세요.
SELECT LOWER(dname) FROM dept03

SELECT dname, LENGTH (UPPER(dname)) show 
FROM dept03

--[1단계:확인] 13. 모든 사원의 이름의 첫 글자만 대문자로 변환한 후, 마지막 문자를 출력하세요.
SELECT dname, initcap(dname), substr(INITCAP(dname),-1)
FROM dept03;
--[1단계:확인] 14. 모든 사원의 이름의 첫 글자를 제외하고 모두 소문자로 변환하세요.
SELECT dname, initcap(dname)
FROM dept03;

--[1단계:확인] 15. `DEPTNO`를 문자열로 변환한 후, 앞에 0을 5개 채워 출력하세요.
-- 문자열로 변환하기 위해서는 length사용?
--lpad만 써도 문자열 이된다 length사용이 필요한가?
SELECT * FROM dept03;
SELECT lpad(deptno,7,0)FROM dept03;

--[1단계:확인] 16. 사원의 이름에서 두 번째 문자를 찾아 출력하세요.
SELECT * FROM dept03;
SELECT substr(DNAME,2,1)FROM dept03;

--[1단계:확인] 17. 사원의 이름을 모두 소문자로 변환한 후, 이름의 길이를 바이트로 출력하세요.
SELECT LOWER(DNAME), lengthb(LOWER(DNAME)) FROM dept03;

--[1단계:확인] 18. 사원의 이름을 모두 대문자로 변환한 후, 뒤에 `!!!`를 붙여 출력하세요.
-- cancat을 쓰는게 맞는가?
SELECT concat(dname,'!!!') FROM dept03;

--[1단계:확인] 19. 사원의 이름에서 첫 번째 문자와 마지막 문자를 출력하세요.
SELECT * FROM dept03;
SELECT substr(DNAME,1,1) 첫번째문자, substr(DNAME,-1) 마지막문자 FROM dept03;

--[1단계:확인] 20. 사원의 이름 중 앞에 'S'로 시작하는 사원을 찾아 이름을 대문자로 출력하세요.
-- 다른 사원들의 이름은 나오지 않는게 맞는지
SELECT UPPER(dname) FROM dept03
WHERE substr(dname,1,1)='S';

--[1단계:확인] 21. 사원의 이름과 직업을 `/`로 연결한 후, 앞뒤에 `###`를 추가하여 출력하세요.
--cancat으로 합치는 기능 사용할때 ,안에 넣으면 되는걸로 알고있는데 인수가 부적합하다고 실행이 안된다.
-- 2개일때는 잘되는데 3개 일때 안된다.
SELECT concat(concat(ENAME ,'/',JOB) FROM emp05;

SELECT * FROM emp05;
--아래 두개로는 잘됨.
SELECT concat(concat(ename,'/'),job) FROM emp05;
SELECT ename || '/' || job FROM emp05;

--[1단계:확인] 22. 시원의 이름에서 처음으로 'E' 문자가 나오는 위치와 마지막 글자를 연결하여 출력하세요.
SELECT * FROM dept03;
SELECT concat(instr(dname,'E'), substr(dname,-1)) FROM dept03;


--[1단계:확인] 23. 사원의 이름에서 오른쪽 공백을 제거한 후, 그 결과값의 길이를 출력하세요
-- 해당 데이터에 공백이 존재하는가?
SELECT LENGTH(rtrim(dname,' ')) FROM dept03;
