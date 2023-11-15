SELECT * FROM member01
WHERE id ='himan' AND pwd='7777'

-- id : [himan]
-- pwd : [7777]

SELECT *
FROM MEMBER01
WHERE id = '9999' AND pwd = '' OR 1=1--;

SELECT *
FROM emp
WHERE ename LIKE '%A%'
AND job LIKE '%A%'
AND deptno = 30;
-- 리턴 List<Emp>
-- 매개변수 ename, job, deptno, ==> Emp로 설정가능

SELECT *
FROM member01
WHERE id = '' AND pwd = '';



SELECT *
FROM member01
WHERE name LIKE '%%';

SELECT *
FROM locations
WHERE STREET_ADDRESS LIKE '%%' AND CITY LIKE '%%';