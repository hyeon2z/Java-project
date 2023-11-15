-- 특정 컬럼이 key(식별)인 경우에는 단일 row로 데이터를 조회 처리
SELECT *
FROM emp
WHERE empno = 7369;
-- 위 내용은 여러 열에 걸쳐 데이터를 처리해주어야 하고, 이때는 VO 객체를 리턴하여 처리해야한다.
/*
public Emp getEmpByEmpno(int empno){
		Emp emp = null;
		String sql = "select * from emp where empno = " + empno;
		연결
		대화
		결과
		rs = stmt.executeQuery(sql);
		if(rs.next()){// 데이터가 있을 때 처리
		    /* 
		    1.기본 생성자로 객체를 생성 후, setXXX 기능메서드로 할당하는 경우
		    emp = new Emp();
		    emp.setEmpno(rs.getInt("empno"));
		    emp.setXXX(rs.getInt(".."));
		    결과 객체를 통해서 컬럼에 있는 데이터를 객체로 할당 처리하는것을 말한다.
		    (   ) ==> Emp
		    
		    
		    ..
		    2. 매개변수가 있는 생성자를 통해서 객체 생성과 동시에 데이터 할당.
		    emp = new Emp(
		        rs.getInt("empno"),
		        rs.getString("ename"),
		        rs.getString(3), rs.getInt(4),
		        rs.getDate(5), rs.getDouble("sal"),
		        rs.getDouble(7), rs.getInt(8)
		    )
		   
		}
		
		
		return emp;
	}
*/

SELECT *
FROM MEMBER01
WHERE id = 'himan';

/*
위 기준 SQL 기능메서드 선언, 데이터 로딩 처리
실행할 결과가 여러 열에 걸쳐 나오면
자바의 데이터유형, 필드명을 지정
class Member{
	private int mno;
	private String name;
	private String id;
	private String pwd;
	private String auth;
	private int point;
}

SELECT *
FROM MEMBER01
WHERE id = 'himan';
select * : 결과는 리턴객체로
WHERE id = 'himan' : 매개변수로

public Member memId(String id){
		Member getId = null;
		String sql = "";
		
		if(rs.next()){ Member(
		    rs.getInt("mno")
		    rs.getString("name")
		    rs.getString("id")
		    rs.getString("pwd")
		    rs.getString("auth")
		    rs.getInt("point")
		    ) ==> Member()에 할당해서 메서드 리턴
		}
		member = Member(3,"홍길동","himan"...) <- 생성자
		DB ==> sql ==> ResultSet ==> VO
		db에 있는 데이터를 sql로 뽑고
		sql구문으로 ResultSet으로 데이터를 추출한거를
		VO클래스에 담기
		
		return getId;
	}
*/
SELECT *
FROM jobs
WHERE job_id='AD_VP';

/*
한 열을 기준으로 다중 행 처리
List<데이터유형>
 */
SELECT ename
FROM emp
WHERE DEPTNO = 10;

/*
public List<String> getEnames(int deptno){
	List<String> enames = new ArrayList<String>();
	String sql = "SELECT ename
	FROM emp
	WHERE DEPTNO = "+deptno;
	return ename;	
}

if( ) 한개의 행
while(rs.next()){
	// 컬럼의 index를 사용해서 호출
	enames.add(rs.getString(1))
	반복을 통해 계속 추가처리
}
 */


SELECT email
FROM employees
WHERE manager_id = 101;

SELECT Street_address
FROM locations
WHERE country_id = 'US';

/*
public List<String> getStreetAddress(String country_id){
	List<String> list = new ArrayList<String>();
	
	return list;
}
*/
SELECT *
FROM emp
WHERE ename LIKE '%A%';
-- 다중열 ==> 열에 대한 클래스 선언
-- 다중행 ==> 행에 대한 List 선언
/*
다중행 다중열 List<클래스>

public List<Emp> getEmpList(String sch){
	List<Emp> empList = new ArrayList<Emp>();
	String sql = "SELECT * FROM emp WHERE ename LIKE '%"+shc+"%'";
	
	return empList;
	
	Emp emp = new Emp(
		rs.getInt("empno"),
		rs.getString("ename"),
		rs.getString("job"),
		rs.getInt("mgr"),
		rs.getDate("hiredate),
		rs.getDouble("sal"),
		rs.getDouble("comm"),
		rs.getInt("deptno")
		);
		empList.add(emp); // 한행의 여러개의 열을 객체에 담에서 행단위로 계속 추가
}
*/
SELECT *
FROM dept
WHERE dname LIKE '%A%';

-- ex) min, max(입력), Employee
SELECT EMPLOYEE_ID, FIRST_NAME, EMAIL, SALARY
FROM employees
WHERE salary BETWEEN 1000 AND 3000;

SELECT MAX(SAL) 
FROM emp;

SELECT COUNT(ename)
FROM emp;

SELECT AVG(sal)
FROM emp;

SELECT min(sal)
FROM emp;

SELECT count(ename)
FROM emp
WHERE DEPTNO = 10;

SELECT AVG(sal), SUM(sal)
FROM EMP;

SELECT ename, hiredate
FROM emp
WHERE ename = 'SMITH';

SELECT deptno
FROM emp;

SELECT ename
FROM EMP 
WHERE sal >= 3000;

SELECT ename
FROM emp
WHERE job = 'CLERK'

SELECT * FROM emp;
SELECT ename, job, sal
FROM emp
WHERE DEPTNO = 20 AND SAL > 1000;

SELECT JOB, avg(sal)
FROM emp
GROUP BY job;

SELECT DEPTNO ,COUNT(ename), AVG(sal)
FROM emp
GROUP BY DEPTNO;

SELECT deptno, avg(sal) avsal
FROM EMp
WHERE deptno = 10
GROUP BY deptno;

SELECT ename, hiredate
FROM emp
WHERE ename='';