SELECT *
FROM emp;
-- 특정 컬럼이 key(식별)인 경우에는 단일 row로 데이터를 조회 처리
SELECT *
FROM emp
WHERE empno = 7369;
/*
-- 위 내용은 여러 열에 걸쳐 데이터를 처리해주어야 하고, 이때는  VO 객체를 리턴
-- 하여 처리하여야 한다.
public Emp getEmpByEmpno(int empno){
	Emp emp= null;
	String sql = "select * from emp where empno = "+empno;
	연결
	대화
	결과
	rs = stmt.executeQuery(sql);
	if(rs.next()){ // 데이터가 있을 때, 처리..
		/* 
		1. 기본 생성자로 객체를 생성 후, setXXX 기능메서드로 할당하는 경우
		emp = new Emp();
		emp.setEmpno(rs.getInt("empno"));
		emp.setEname(rs.getInt("ename"));
		결과 객체를 통해서 컬럼에 있는 데이터를 객체로 할당 처리하는 것을
		말한다.
		(  ) ==> Emp
		..
		2. 매개변수가 있는 생성자를 통해서 객체 생성과 동시에 데이터 할당.
		emp = new Emp(
			rs.getInt("empno"),
			rs.getString("ename"),
			rs.getString(3), rs.getInt(4),
			rs.getDate(5), rs.getDouble("sal"),
			rs.getDouble(7), rs.getInt(8)
		);
		
	}
	
	
	return emp;
}

*/
SELECT *
FROM dept
WHERE deptno = 20;
--  20 SEARCH DALLAS  데이터유형이 다르고, 갯수 정해져있는
--  담아서 사용하기 위하여서 class선언
/*
class Dept{
	private int deptno;
	private String dname;
	private String loc;
	Dept(){}
	Dept(int deptno, String dname, String loc){} // 초기화
}
public Dept getDept(int deptno){
	 Dept dept = null;	 
	 if(rs.next()){
	 	rs.getInt("deptno")	
	 	rs.getString("dname")	
	 	rs.getString("loc")	
	 	==> ResultSet객체의 데이터를 생성자를 통해서 객체 생성과 데이터 할당.
	 	dept = new Dept(
	 		rs.getInt("deptno"),
	 		rs.getString("dname"),
	 		rs.getString("loc")	
	 	)
	 }
}
 * 
 * */
--  Dept 객체를 리턴으로 하여 추가 메서드 선언 및 처리.

--  mno, name, id, pwd, auth, point
SELECT * 
FROM member01
WHERE id='goodman';
/*
위 기준 sql 기능메서드 선언, 데이터 로딩 처리
실행할 결과가 여러 열에 걸쳐서 나오면
-- 자바의 데이터유형, 필드명을 지정..
--      String, int, double, Date
class Member{
    private int mno;
    private String name;
    private String id;
    private String pwd;
    private String auth;
    private int point;
      
}

기능메서드 선언 틀?? 할수있다/할수없다. 인원파악 전달.
ResultSet 처리 제외..

SELECT * 
FROM member01
WHERE id='goodman'
select * :  결과는 리턴객체로
WHERE id='goodman' : 매개변수로

public Member getMember(String id){
	Member member =null;
	String sql = "SELECT * 
					FROM member01
					WHERE id='"+id+"' ";
	..
	
	if(rs.next()){
	    rs.getInt("mno")
	    rs.getString("name")
	    rs.getString("id")
	    rs.getString("pwd")
	    rs.getString("auth")
	    rs.getInt("point") ==> Member()에 할당해서 메서드 리턴..
	    member = Member()
	    member = Member(3,"홍길동","himan", "8888", "admin",3000)
	    // DB ==> sql ==> ResultSet ==> VO
	    member = Member(rs.getInt("mno"),rs.getString("name"),
	    				rs.getString("id"), 
	    				rs.getString("pwd"), 
	    				rs.getString("auth"),
	    				rs.getInt("point"))
	    
	    
	}
	
	return member;
}


 * */

select * from member 
		where id = 'himan' and pwd=' or 1=1';
--	id:[ himan  ]
--	pwd:[ 7777  ]
SELECT *
FROM member01
WHERE id='himan' AND pwd='777';

SELECT *
FROM member01
WHERE id='9999' AND pwd='' OR 1=1--';

--	id:[ 9999  ]
--	pwd:[ ' OR 1=1--  ]
/*
-- String sql = "SELECT *
				FROM member01
				WHERE id='"+id+"' AND pwd='"+pwd+"'"
*/

SELECT * FROM MEMBER01;
SELECT * 
FROM MEMBER01
WHERE id='9999' AND pwd= '' OR 1=1--';
