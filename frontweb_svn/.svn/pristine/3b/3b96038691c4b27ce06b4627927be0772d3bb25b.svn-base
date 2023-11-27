SELECT e.*, to_char(hiredate,'YYYY-MM-DD') hiredatestr  
FROM emp01 e 
WHERE empno=7499;

SELECT * FROM emp01;
UPDATE emp01
    SET empno = 1000,
    	ename = '김영희',
    	job = '대리',
    	mgr = 7698,
    	hiredate = to_date('2023-11-20','YYYY-MM-DD'),
    	sal = 3500,
    	comm = 200,
    	deptno = 10
  WHERE empno = 0;
/*
UPDATE emp01
    SET ename =?,
    	job = ?,
    	mgr = ?,
    	hiredate = to_date(?,'YYYY-MM-DD'),
    	sal = ?,
    	comm = ?,
    	deptno = ?
  WHERE empno = ?
 * 
 * */ 
UPDATE emp01
    SET 
    	ename = ename||'수정',
    	job = job||'수정',
    	mgr = 9999,
    	hiredate = to_date('2023-11-01','YYYY-MM-DD'),
    	sal = sal + 1000,
    	comm = comm + 100,
    	deptno = deptno + 1
  WHERE empno = 7369; 
 
ALTER TABLE emp01
MODIFY (ename varchar2(60),
         job varchar2(60) );
    
		select * from member01 
		where name like '%%'
		and auth like '%%'
		;
SELECT * FROM MEMBER01;	
-- mno, name, id, pwd, auth, point
CREATE SEQUENCE mem_seq;
INSERT INTO member01 values(mem_seq.nextval,
	'오길동','badman','8888','admin',3000);
/*
INSERT INTO member01 values(mem_seq.nextval,
	?,?,?,?,?)
UPDATE member01
	SET name = ?,
		id = ?,
		pwd = ?,
		auth = ?
	WHERE mno=?
delete 
from member01
where mno = ?
 * */
SELECT mem_seq.nextval FROM dual;
SELECT * FROM member01;
UPDATE member01
	SET name = '신철수',
		id = 'himan',
		pwd = '9999',
		auth = 'superuser'
	WHERE mno=1; 