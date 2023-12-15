package frontweb.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import frontweb.Dept;
import frontweb.vo.EmpShort;
import frontweb.vo.Job;
import frontweb.vo.Member;
import frontweb.vo.Reservation;
import frontweb.vo.Trainschedule;

public class EmpDao {
	// 공통으로 사용할 전역 객체 선언
	// 1. 연결
	private Connection con;
	// 2. 대화
	private Statement stmt;
	private PreparedStatement pstmt;
	// 3. 결과
	private ResultSet rs;

	/*
	 * select * from member01 where id='himan' and pwd='777' 회원로그인 성공여부 확인 기능메서드..
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
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		return ob;
	}

	// 기능별 메서드 처리.
	/*
	 * SELECT empno, ename, job FROM emp WHERE empno = 7499 1. empno, ename, job ==>
	 * class선언.. int String String class EmpShort{} 2. public EmpShort
	 * getEmpShort(int empno){ EmpShort sh = null;
	 * 
	 * return sh; }
	 */
	// select count(*) from emp
	public int getEmpCount() {
		int cnt = 0;
		String sql = "select count(*) cnt from emp";
		// 1. 연결
		try {
			con = DBCon.con();
			// 2. 대화
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// while, if, X
			rs.next();
//			cnt = rs.getInt(1); // select 1, 2, 3,  선언된 순서
			cnt = rs.getInt("cnt"); // select 컬럼명

		} catch (SQLException e) {
			System.out.println("DB연결 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		} finally {
			// 4. 자원해제
			DBCon.close(rs, stmt, con);
		}

		return cnt;
	}

	/*
	 * SELECT max(sal) FROM emp WHERE deptno=40; ex)
	 */
	public double getMaxSal(int deptno) {
		double max = 0;
		String sql = "	SELECT max(sal) mxsal \r\n" + "	FROM emp\r\n" + "	WHERE deptno= " + deptno;
		// 1. 연결
		try {
			con = DBCon.con();
			// 2. 대화
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			rs.next();
			max = rs.getDouble("mxsal");

		} catch (SQLException e) {
			System.out.println("DB예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반예외:" + e.getMessage());
		} finally {
			DBCon.close(rs, stmt, con);
		}

		return max;
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
			// (int empno, String ename, String job)
			if (rs.next()) {
				// ResultSet 객체 안에 있는 데이터를 메서드를
				// 이용해서 EmpShort객체로 할당..
				se = new EmpShort(
						 rs.getInt("empno"), 
						 rs.getString("ename"), 
						 rs.getString("job"));
			}
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}

		return se;
	}

	/*
	 * SELECT * FROM dept WHERE deptno = 10; -- Dept 객체를 리턴으로 하여 추가 메서드 선언 및 처리.
	 */
	public Dept getDept(int deptno) {
		Dept dept = null;
		String sql = "SELECT *\r\n" + "		FROM dept\r\n" + "		WHERE deptno = " + deptno;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에

			if (rs.next()) {
				dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
			}

			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		return dept;
	}

	/*
	 * SELECT count(*) FROM dept WHERE deptno = 20
	 */
	public int getDetCnt(int deptno) {
		String sql = "SELECT count(*)\r\n" + "FROM dept\r\n" + "WHERE deptno = " + deptno;

		int cnt = 0;
		return cnt;
	}

	/*
	 * SELECT ename FROM emp WHERE sal BETWEEN 1000 AND 2000
	 * 
	 */
	public List<String> getEnames(int start, int end) {
		List<String> enames = new ArrayList<String>();
		String sql = "SELECT ename\r\n" + "	FROM emp\r\n" + "	WHERE sal BETWEEN " + start + " AND " + end;

		return enames;
	}

	/*
	 * SELECT sal FROM emp WHERE deptno=10
	 */
	public List<Double> getSalaries(int deptno) {
		List<Double> sals = new ArrayList<Double>();
		String sql = "SELECT sal\r\n" + 
					"	 FROM emp\r\n" + 
					"	 WHERE deptno=" + deptno;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				sals.add(rs.getDouble(1));
			}
			System.out.println("데이터 건수:"+sals.size());
			
			
			
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}

		return sals;
	}

	/*
	 * SELECT * FROM dept WHERE dname LIKE '%S%' ; -- ex) 메서드 선언. -- 행이 여러개인지?
	 * List(여러개) -- 열이 여러개인지? 단일 타입 String/int/double, 객체(클래스 선언) -- public
	 * List<Dept> getDeptSch(String sch)
	 */
	public List<Dept> getDeptSch(String sch) {
		List<Dept> dlist = new ArrayList<Dept>();
		String sql = "SELECT *\r\n" + "FROM dept\r\n" + "WHERE dname LIKE '%" + sch + "%' ";
		return dlist;
	}

	/*
	 * INSERT INTO member01
	 * values(1,'"+ins.getName()+"','himan','7777','admin',1000); -- 회원가입 -- public
	 * void insertMember(Member ins){} sql 문자열 숫자
	 */
	public void insertMember(Member ins) {
		String sql = "INSERT INTO member01 \r\n" + "	values(" + ins.getMno() + ",'" + ins.getName() + "','"
				+ ins.getId() + "','" + ins.getPwd() + "','" + ins.getAuth() + "'," + ins.getPoint() + ")";

	}

	/*
	 * SELECT * FROM member01 WHERE name LIKE '%길동%';
	 */
	public List<Member> schMember(String nameSch) {
		List<Member> mlist = new ArrayList<Member>();
		String sql = "SELECT * \r\n" + "	FROM member01\r\n" + "	WHERE name LIKE '%" + nameSch + "%' ";

		return mlist;
	}

	/*
	 * SELECT * FROM member01 WHERE id='himan' AND pwd = '777'
	 */
	public Member login(String id, String pass) {
		Member mem = null;
		String sql = "SELECT *\r\n" + "FROM member01\r\n" + "WHERE id='" + id + "' AND pwd = '" + pass + "'";

		return mem;
	}

	/*
	 * SELECT * FROM reservation WHERE to_char(resdate,'YYYY-MM-DD') = ''
	 */
	public List<Reservation> getResListByDate(String date) {
		List<Reservation> rlist = new ArrayList<Reservation>();
		String sql = "SELECT * \r\n" + "		FROM reservation\r\n" + "		WHERE to_char(resdate,'YYYY-MM-DD') = '"
				+ date + "'";
		return rlist;
	}

	/*
	 * INSERT INTO reservation values(res_seq.nextval,
	 * to_date('2023-11-13','YYYY-MM-DD'), '서울','대구',9,12)
	 */
	public void inserReservation(Reservation ins) {
		String sql = "	INSERT INTO reservation values(res_seq.nextval,\r\n" + "      to_date('" + ins.getResdate()
				+ "','YYYY-MM-DD'), \r\n" + "	       '" + ins.getStartloc() + "','" + ins.getEndloc() + "',"
				+ ins.getStarttime() + "," + ins.getEndtime() + ")";

	}

	/*
	 * SELECT * FROM trainschedule WHERE departstation = '서울' AND arrivalstation =
	 * '부산'
	 */
	public List<Trainschedule> getList(String dpart, String arri) {
		List<Trainschedule> list = new ArrayList<Trainschedule>();
		String sql = "SELECT * FROM trainschedule\r\n" + "	WHERE departstation = '" + dpart + "' \r\n"
				+ "	AND arrivalstation = '" + arri + "'";
		return list;
	}

	/*
	 * select * from member01 where id='himan' and pwd='777' 회원로그인 성공여부 확인 기능메서드..
	 */
	public boolean loginSucc(String id, String pwd) {
		boolean isLogSucc = false;
		String sql = "select * from member01\r\n" + "where id='" + id + "' and pwd='" + pwd + "'";
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
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		return isLogSucc;
	}

	/*
	 * SELECT * FROM member01 WHERE id='goodman'
	 */
	public Member getMember(String id) {
		Member mem = null;
		String sql = "SELECT * \r\n" 
		           + "FROM member01\r\n" 
		            + "WHERE id='" + id + "'";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if (rs.next()) {
				// mno, name, id, pwd, auth, point
				mem = new Member(rs.getInt("mno"), rs.getString("name"), rs.getString("id"), rs.getString("pwd"),
						rs.getString("auth"), rs.getInt("point"));
			}
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}

		return mem;
	}

	public Job getJobById(String job_id) {
		String sql = "	SELECT * \r\n" + "	FROM jobs\r\n" + "	WHERE job_id='" + job_id + "'";
		Job job = null;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if (rs.next()) {
				// job_id, job_title, min_salary, max_salary
				job = new Job(rs.getString("job_id"), rs.getString("job_title"), rs.getInt("min_salary"),
						rs.getInt("max_salary"));
			}
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		return job;
	}

	// 하나의 열로 다중행
	public List<String> getEnames(int deptno) {
		List<String> enames = new ArrayList<String>();
		String sql = "SELECT ename\r\n" + "	   FROM emp\r\n" + "	  WHERE deptno = " + deptno;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 다중행이 있을 때는 while문으로 행처리 단위로 가져오게 처리
			while (rs.next()) {
				// rs.getString(1) : select 문의 첫번째 문자열 데이터 가져오기
				enames.add(rs.getString(1));
				// 선언한 List<String>에 추가.
			}
			System.out.println("데이터 건수:" + enames.size());
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}
		return enames;

	}
	/*
	SELECT email
FROM EMPLOYEES
WHERE MANAGER_ID =101
	*/
	public List<String> getEmailsById(int mananger_id){
		List<String> emails = new ArrayList<String>();
		String sql = "	SELECT email\r\n"
				+ "FROM EMPLOYEES\r\n"
				+ "WHERE MANAGER_ID ="+mananger_id;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			//    데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				emails.add(rs.getString(1));
			}
			System.out.println("데이터 건수:"+emails.size());
			
			// 4. 예외와 자원해제					
		} catch (SQLException e) {
			System.out.println("DB 예외:"+e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		
		return emails;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기능메서드 잘되어 있는지 테스트 처리..
		EmpDao dao = new EmpDao();
		for(String email:dao.getEmailsById(101)) {
			System.out.println(email);
		}
//		for(double sal :dao.getSalaries(10)) {
//			System.out.println("급여:"+sal);
//		}
//		for (String ename : dao.getEnames(30)) {
//			System.out.println(ename);
//		}

		/*
		 * Job job = dao.getJobById("AD_VP"); if(job!=null) {
		 * System.out.println("검색된 데이터"); System.out.println(job.getJob_id());
		 * System.out.println(job.getJob_title());
		 * System.out.println(job.getMin_salary());
		 * System.out.println(job.getMax_salary()); }else {
		 * System.out.println("데이터 없음");
		 * 
		 * }
		 */
		/*
		 * Dept dept = dao.getDept(30); if(dept!=null) { System.out.println("부서정보 있음");
		 * System.out.println(dept.getDeptno()); System.out.println(dept.getDname());
		 * System.out.println(dept.getLoc()); }else { System.out.println("부서정보 없음"); }
		 */
		/*
		 * EmpShort es = dao.getEmpShort(7499); // empno값에 따라 확인 if(es!=null) {
		 * System.out.println("데이터 있음."); System.out.println(es.getEmpno());
		 * System.out.println(es.getEname()); System.out.println(es.getJob()); }else {
		 * System.out.println("데이터 없음."); }
		 */
//		System.out.println("성공여부1:"+dao.loginSucc("himan", "7777"));
//		System.out.println("성공여부2:"+dao.loginSucc("himan", "8888"));
//		System.out.println("성공여부3:"+dao.loginSucc("goodman", "7777"));

		// System.out.println("사원정보의 수:"+dao.getEmpCount());
		// System.out.println("10번부서의 최대급여:"+dao.getMaxSal(10));

	}

}
