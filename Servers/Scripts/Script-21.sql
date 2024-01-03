SELECT *
FROM locations;
-- 단위 객체 VO 설정 할 속성과 타입
/*
resultType를 쓰는 경우는 단위/다중리스트 상관없이 컬럼명과 property를 동일하게 사용이 가능할 때

class Location{
	private int locations_id;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
}

*/
--CREATE TABLE exp01(
--	id varchar2(100)
--);
SELECT *
FROM jobs;

SELECT *
FROM EMP
WHERE job LIKE '%'||''||'%'
AND ename LIKE '%'||'B'||'%';

SELECT *
FROM DEPT
WHERE dname LIKE '%'||''||'%'
AND loc LIKE '%'||''||'%';
/*
class Depart{
	private int no; // DEPTNO
	private String name; // DNAME
	private String location; // LOC
}

private int no; // empno
private String name; // ename
private double salary; // sal
private String grade; // job

*/
SELECT * FROM emp02;
SELECT * FROM dept01;
INSERT INTO emp02 values(7934, '홍길동', 'CLERK', 7782, 
to_date('2024-01-02', 'YYYY-MM-DD'), 4000, 1000, 10);

/*
class Emp
private String hiredateS;

public int insertEmp(Emp insert);

<insert id="insertEmp" parameterType="emp" resultType="int">
	INSERT INTO emp02 values(#{empno}, #{ename}, #{job}, #{mgr}, 
	to_date(#{hiredateS}, 'YYYY-MM-DD'), #{sal}, #{comm}, #{deptno})
</insert>
*/
INSERT INTO dept01 values(50, '인사', '서울');

SELECT * FROM MEMBER01;

SELECT *
FROM member01
WHERE id='himan'
AND pwd='7777';

SELECT name
FROM member01
WHERE id='himan';

SELECT *
FROM member01
WHERE name LIKE '%'||''||'%';

-- INSERT INTO member01 values(#{mno}, #{name}, #{id}, #{pwd}, #{auth}, #{point})