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
		return getId;
	}
*/

