package frontweb.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import frontweb.Dept;
import frontweb.dao.DB;
import frontweb.vo.EmpShort;
import frontweb.vo.Member;
import frontweb.vo.Reservation;

public class EmpDao {
	// 공통으로 사용할 전역 객체 선언
	// 1. 연결
	private Connection con;
	
	// 2. 대화
	private Statement stmt;
	private PreparedStatement pstmt;
	
	// 3. 결과
	private ResultSet rs;
	
	
	// 기능별 메서드 처리
	/*
	SELECT empno, ename, job
	FROM emp
	WHERE empno = 7499
	1. empno, ename, job ==> class선언
	    int   String String
	    class EmpShort{}
	2. public EmpShort getEmpShort(int empno){
	        EmpShort sh = null;
	        
	        return sh;
	}
	 */
	// select count(*) from emp
//	public int getEmpCount() {
//		int cnt = 0;
//		String sql = "select count(*) from emp";
//		// 1. 연결
//		try {
//			con = DB.con();
//			// 2. 대화
//			stmt = con.createStatement();
//			// 3. 결과
//			rs = stmt.executeQuery(sql);
//			// while, if, x
//			rs.next();
//			cnt = rs.getInt(1);
//			
//			
//		} catch (SQLException e) {
//			System.out.println("DB연결 에러 : " + e.getMessage());
//		} catch(Exception e) {
//			System.out.println("일반에러 : " + e.getMessage());
//		} finally {
//			// 4. 자원해제
//			DB.close(rs, stmt, con);
//		}
//
//		return cnt;
//	}
	/*
	SELECT max(sal)
	FROM emp
	WHERE deptno=40; 
	 
	 */
//	public double getMaxSal(int deptno) {
//		double max=0;
//		String sql = "SELECT max(sal)\r\n"
//				+ "	FROM emp\r\n"
//				+ "	WHERE deptno="+deptno;
//		try {
//			con = DB.con();
//			stmt = con.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//			rs.next();
//			max = rs.getInt("deptno");
//		} catch (SQLException e) {
//			System.out.println("DB연결에러 : " + e.getMessage());
//		} catch (Exception e) {
//			System.out.println("일반에러 : " + e.getMessage());
//		} finally {
//			DB.close(rs, stmt, con);
//		}
//		return max;
//	}
	public Member memId(String id){
		Member getId = null;
		String sql = "SELECT *\r\n"
				+ "FROM MEMBER01\r\n"
				+ "WHERE id = '"+id+"'";
	
		// 1. 연결?필드에 선언된 con = DBConn에 할당
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			rs.next();
			getId = new Member(
						rs.getInt("mno"),
						rs.getString("name"),
						rs.getString("id"),
						rs.getString("pwd"),
						rs.getString("auth"),
						rs.getInt("point")
						);
			// 4. 예외와 자원해제
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		return getId;
	}
	
	public EmpShort getEmpShort(int empno) {
		EmpShort se = null;
		String sql = "SELECT empno, ename, job\r\n"
				+ "	FROM emp\r\n"
				+ "	WHERE empno = " + empno;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				// ResultSet 객체 안에 있는 데이터를 
				// 메서드를 이용해서 EmpShort 객체로 할당
				se = new EmpShort(
							rs.getInt("empno"),
							rs.getString("ename"),
							rs.getString("job")
						);
			}
			// 4. 예외와 자원해제
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		return se;
	}
	/*
	SELECT *
	FROM dept
	WHERE deptno = 10;
	-- Dept 객체를 리턴으로 하여 추가 메서드 선언 및 처리
	 */
	public Dept getDeptno(int deptno) {
		Dept dp = null;
		String sql = "SELECT *\r\n"
				+ "	FROM dept\r\n"
				+ "	WHERE deptno = "+deptno;
		// 1. 연결?필드에 선언된 con = DBConn에 할당
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				// ResutSet 객체 안에 있는 데이터를 메서드를 이용해서 EmpShort 객ㅊ
			};
			// 4. 예외와 자원해제
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		return dp;
	}
	
	
/*
SELECT count(*)
FROM DEPT
WHERE deptno = 20;
 */
	public int getCount(int deptno){
		String sql = "SELECT count(*)\r\n"
				+ "FROM DEPT\r\n"
				+ "WHERE deptno = " + deptno;;
		int count = 0; 
		return count;
		}
/*
SELECT ename
FROM emp
WHERE sal BETWEEN 1000 AND 2000
 */
	
	public List<String> getEnames(int start, int end){
		List<String> enames = new ArrayList<String>();
		String sql = "SELECT ename\r\n"
				+ "FROM emp\r\n"
				+ "WHERE sal BETWEEN "+start+" AND "+end;
		
		return enames;
	}
/*
SELECT sal
FROM emp
WHERE deptno=10;
 */
	public List<Double> getSal(int deptno){
		List<Double> sals = new ArrayList<Double>();
		String sql = "SELECT sal\r\n"
				+ "FROM emp\r\n"
				+ "WHERE deptno="+deptno;
		return sals;
	}
	/*
	ex) 메서드 선언
	    행이 여러개인지? List(여러개)
	    열이 여러개인지? 단일 타입 String/int/double, 객체(클래스 선언)
SELECT *
FROM dept
WHERE dname LIKE '%S%'
	
	 */
	public List<Dept> getDeptList(String s){
	     List<Dept> deptlist = new ArrayList<Dept>();
	     String sql = "SELECT *\r\n"
	     		+ "FROM dept\r\n"
	     		+ "WHERE dname LIKE '%"+s+"%'";
	     return deptlist;
	     }
//	회원가입
//	INSERT INTO member01 values(1,'홍길동','himan','7777','admin',1000);
	public void insertMember(Member ins){
		String sql = "INSERT INTO member01 values("+ins.getMno()+",'"+ins.getName()+
				"','"+ins.getId()+"','"+ins.getPwd()+
				"','"+ins.getAuth()+"',"+ins.getPoint()+")";
	}
	/*
SELECT *
FROM member01
WHERE name LIKE '%길동%';
	 */
	public List<Member> schMember(String nameSch){
		List<Member> mlist = new ArrayList<Member>();
		String sql = "SELECT *\r\n"
				+ "FROM member01\r\n"
				+ "WHERE name LIKE '%"+nameSch+"%'";
		return mlist;
	}
//	select *
//	from emp
//	where deptno = 10;
	
//	public List<Emp> schMember(int deptno){
//		List<Emp> mlist = new ArrayList<Emp>();
//		String sql = "SELECT ename\r\n"
//				+ "FROM emp\r\n"
//				+ "WHERE ename LIKE '%"+H+"'";
//		return mlist;
//	}
	public String empJob(int deptno){
		   String eJob = null;
		   String SQL = "SELECT job\r\n"
		   		+ "FROM emp\r\n"
		   		+ "WHERE deptno ="+deptno;
		   return eJob;
		}
	
	public List<Reservation> getResListByDate(String date){
		List<Reservation> rlist = new ArrayList<Reservation>();
		String sql = "SELECT *\r\n"
				+ "FROM reservation\r\n"
				+ "WHERE TO_char(resdate,'YYYY-MM-DD') = '"+date+"'";
		return rlist;
	}
	
	

//	public void inserReservation(Reservation ins){
//	     String sql = "INSERT INTO reservation values(res_seq.nextval,\r\n"
//	     		+ "			to_date('"+ins.getResdate()+"','YYYY-MM-DD'),\r\n"
//	     		+ "			'"+ins.getStartloc()+"','"+ins.getEndloc()+"',"+ins.getStarttime()+","+ins.getEndtime()+")";
//	}
	
/*
select * from member01
where id = 'himan' and pwd = '777'
    회원로그인 성공여부 확인 기능메서드
 */
	public boolean loginSucc(String id, String pwd) {
		boolean isLogSucc = false;
		String sql = "select * from member01\r\n"
				+ "where id = '"+id+"' and pwd = '"+pwd+"'";
		// 1. 연결?필드에 선언된 con = DBConn에 할당
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			isLogSucc = rs.next();
			// 4. 예외와 자원해제
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		
		
		
		
		return isLogSucc;
		
	}
	
	
	
	/*
	select * from member01
	where id = 'himan' and pwd = '777'
	    회원로그인 성공여부 확인 기능메서드
	 */
		public Object template01(Object sch) {
			Object ob = false;
			String sql = "sql";
			// 1. 연결?필드에 선언된 con = DBConn에 할당
			try {
				con = DBCon.con();
				// 2. 대화처리
				stmt = con.createStatement();
				// 3. 결과
				rs = stmt.executeQuery(sql);
				// 데이터가 있는지 여부만 가져오면 되기에
				rs.next();
				// 4. 예외와 자원해제
				
			} catch (SQLException e) {
				System.out.println("DB 예외 : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("일반 예외 : " + e.getMessage());
			} finally {
				// 자원해제(연결처리 후 사용한 객체들)
				DBCon.close(rs, stmt, con);
			}
			return ob;
		}
		
	/*
		select * from member01
		where id = 'himan' and pwd = '777'
		    회원로그인 성공여부 확인 기능메서드
		 */
			


	public static void main(String[] args) {
		// 기능메서드 잘되어 있는지 테스트 처리
		EmpDao dao = new EmpDao();
		EmpShort es = dao.getEmpShort(7499);
		Member mem = new Member();
		System.out.println(mem.getId());
		
//		if(es!=null) {
//			System.out.println("데이터 있음.");
//			System.out.println(es.getEmpno());
//			System.out.println(es.getEname());
//			System.out.println(es.getJob());
//		}else {
//			System.out.println("데이터 없음.");
//		}
//		System.out.println("성공여부1 : " + dao.loginSucc("himan", "7777"));
//		System.out.println("성공여부2 : " + dao.loginSucc("himan", "8888"));
//		System.out.println("성공여부3 : " + dao.loginSucc("himan", "777"));
//		System.out.println("사원정보의 수 : " + dao.getEmpCount());
//		
//		System.out.println("사원정보의 수 : " + dao.getMaxSal(1));
	}

}
