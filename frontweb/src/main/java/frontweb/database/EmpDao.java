package frontweb.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import frontweb.Dept;
import frontweb.Emp;
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
	public int getEmpCount() {
		int cnt = 0;
		String sql = "select count(*) from emp";
		return cnt;
	}
	
	public EmpShort getEmpShort(int empno) {
		EmpShort se = null;
		String sql = "SELECT empno, ename, job\r\n"
				+ "	FROM emp\r\n"
				+ "	WHERE empno = " + empno;
		
		return se;
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
	
	

	public void inserReservation(Reservation ins){
	     String sql = "INSERT INTO reservation values(res_seq.nextval,\r\n"
	     		+ "			to_date('"+ins.getResdate()+"','YYYY-MM-DD'),\r\n"
	     		+ "			'"+ins.getStartloc()+"','"+ins.getEndloc()+"',"+ins.getStarttime()+","+ins.getEndtime()+")";
	}
	
	public static void main(String[] args) {

	}

}
