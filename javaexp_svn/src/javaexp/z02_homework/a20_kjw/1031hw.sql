--[1단계:확인] 1. EMP 테이블에서 emp05 복사 테이블을 생성하세요

--[1단계:확인] 2. emp05 테이블에서 모든 사원의 이름, 직책, 급여를 출력합니다.
SELECT * FROM emp05;

--[1단계:확인] 3. emp05 테이블에서 급여가 2000 이상인 사원의 이름, 직책, 급여를 출력합니다.
SELECT ename,sal,job FROM emp05 WHERE sal>=2000;
--[1단계:확인] 4. emp05 테이블에서 부서가 20번인 사원의 이름, 직책, 급여를 출력합니다.
SELECT ename,job,sal FROM emp05 WHERE deptno =20;
--[1단계:확인] 5. emp05 테이블에 새로운 사원을 추가합니다.
INSERT INTO emp05 values(3000,'maker',3000);
--[1단계:확인] 6. emp05 테이블에서 사원의 이름이 "SMITH"인 사원의 정보를 수정합니다.
--[1단계:확인] 7. emp05 테이블에서 사원의 이름이 "SMITH"인 사원을 삭제합니다.
DELETE FROM emp05 WHERE ename='SMITH'
--[1단계:확인] 8. DEPT 테이블에서 dept03 복사 테이블을 생성하세요
CREATE TABLE dept03 AS SELECT * FROM DEPT;
SELECT * FROM dept03;
--[1단계:확인] 9. dept03 테이블에서 부서 번호가 20번인 부서의 정보를 수정합니다.
SELECT *
--delete
FROM dept03 WHERE deptno = 20;

UPDATE dept03 SET dname="sale" WHERE deptno = 20;
--[1단계:확인] 10. dept03 테이블에서 모든 부서의 이름, 위치를 출력합니다.
SELECT * FROM dept03;

--[1단계:확인] 11. dept03 테이블에서 부서 번호가 20번인 부서를 삭제합니다.
DELETE FROM dept03 WHERE deptno=20;
--[1단계:확인] 12. 모든 사원의 이름을 대문자로 변환한 후, 이름의 길이를 출력하세요.
SELECT LENGTH(upper(ename)),ename FROM emp;
--[1단계:확인] 13. 모든 사원의 이름의 첫 글자만 대문자로 변환한 후, 마지막 문자를 출력하세요.
SELECT  substr(lower(ename),-1) 마지막,initcap(ename) FROM emp;
--[1단계:확인] 14. 모든 사원의 이름의 첫 글자를 제외하고 모두 소문자로 변환하세요.
SELECT substr(ename,1,1)||substr(lower(ename),2) FROM emp;
--[1단계:확인] 15. `DEPTNO`를 문자열로 변환한 후, 앞에 0을 5개 채워 출력하세요.

SELECT lpad(to_char(deptno),7,0) FROM emp ;
--[1단계:확인] 16. 사원의 이름에서 두 번째 문자를 찾아 출력하세요.
SELECT substr(ename,2,1) FROM emp;
--[1단계:확인] 17. 사원의 이름을 모두 소문자로 변환한 후, 이름의 길이를 바이트로 출력하세요.
SELECT LENGTH(lower(ename)) FROM emp;
--[1단계:확인] 18. 사원의 이름을 모두 대문자로 변환한 후, 뒤에 `!!!`를 붙여 출력하세요.
 SELECT rpad(upper(ename),8,'!!!') FROM emp;
--[1단계:확인] 19. 사원의 이름에서 첫 번째 문자와 마지막 문자를 출력하세요.
SELECT substr(ename,1,1),substr(ename,-1,1) FROM emp;

--[1단계:확인] 20. 사원의 이름 중 앞에 'S'로 시작하는 사원을 찾아 이름을 대문자로 출력하세요.
SELECT upper(ename) FROM emp WHERE ename like'S%';
--[1단계:확인] 21. 사원의 이름과 직업을 `/`로 연결한 후, 앞뒤에 `###`를 추가하여 출력하세요.
SELECT '###'||ename||'/'||job||'###' FROM emp;
--[1단계:확인] 22. 시원의 이름에서 처음으로 'E' 문자가 나오는 위치와 마지막 글자를 연결하여 출력하세요.
SELECT instr(ename,'E')||substr(ename,-1,1) FROM emp ;
--[1단계:확인] 24. 사원의 이름에서 오른쪽 공백을 제거한 후, 그 결과값의 길이를 출력하세요
SELECT LENGTH(rtrim(ename,' '))FROM emp;
