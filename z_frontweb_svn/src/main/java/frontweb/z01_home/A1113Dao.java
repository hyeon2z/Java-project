package frontweb.z01_home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import frontweb.database.DBCon;
import frontweb.vo.DeptAvg;
import frontweb.vo.DeptCntAvgSal;
import frontweb.vo.Emp01;
import frontweb.vo.Employee01;
import frontweb.vo.EnameHire;
import frontweb.vo.JobAvgSal;
import frontweb.vo.SalCalcu;

public class A1113Dao {
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
/*
# 처리 순서
1. sql작성
2. 입력 출력 구분
3. 입력 : 메서드의 매개변수
   출력 : 메서드의 리턴유형
4. 메서드 위 내용을 구분해서 처리.
   1) 리턴할 데이터
   2) sql 선언 매개변수 처리..
5. 기본 연결 설정 부분 복사
6. resultset객체 rs.next(), rs.getXXX("컬럼명") rs.getXXX(1)
   if, while          
 * */	
//	[1단계:확인] 1.단일 열 및 단일 행 결과:
//		1. **최대 급여 조회**:SELECT MAX(sal) FROM emp
// 
	
	
	public double getMaxSal() {
		double maxSal = 0;
		String sql = "SELECT MAX(sal) msal FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				//maxSal = rs.getDouble("msal");
				maxSal = rs.getDouble(1);
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
		return maxSal;
	}
//	2. **총 직원 수 계산**:SELECT COUNT(*) FROM emp
	
	/*
	# 처리 순서
	1. sql작성 SELECT COUNT(*) cnt FROM emp
	2. 입력 출력 구분  입력X, 출력 10(정수)
	3. 입력 : 메서드의 매개변수 () 
	   출력 : 메서드의 리턴유형 public int getCnt(){}
	   
	4. 메서드 위 내용을 구분해서 처리.
	   1) 리턴할 데이터
	   2) sql 선언 매개변수 처리..	   
	5. 기본 연결 설정 부분 복사
	6. resultset객체 rs.next(), rs.getXXX("컬럼명") rs.getXXX(1)
	   if, while          
	 * */	
	public int getEmpCount() {
		int cnt = 0;
		String sql = "SELECT COUNT(*) cnt FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next())
				cnt = rs.getInt(1);
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		return cnt;
	}
	/*
	# 처리 순서
	1. sql작성
	2. 입력 출력 구분
	3. 입력 : 메서드의 매개변수
	   출력 : 메서드의 리턴유형
	4. 메서드 위 내용을 구분해서 처리.
	   1) 리턴할 데이터
	   2) sql 선언 매개변수 처리..
	5. 기본 연결 설정 부분 복사
	6. resultset객체 
			rs.next(), rs.getXXX("컬럼명") rs.getXXX(1)
	   if, while          
	 * */	
//		3. **평균 급여 계산**:SELECT AVG(sal) FROM emp
//  SELECT AVG(sal) asal FROM emp;
//	-- 입력:X, 출력:2077.08 (실수double), 컬럼:  asal
	public double getAvgSal() {
		double avgsal = 0.0;
		String sql = "SELECT AVG(sal) asal FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				avgsal = rs.getDouble("asal"); // 컬럼명 지정
//				avgsal = rs.getDouble(1); // select 출력되는 순서를 1,2,3
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
		
		return avgsal;
		
	}
	/*
	# 처리 순서
	1. sql작성 SELECT AVG(sal) FROM emp
	2. 입력 출력 구분
	3. 입력 : 메서드의 매개변수
	   출력 : 메서드의 리턴유형
	4. 메서드 위 내용을 구분해서 처리.
	   1) 리턴할 데이터
	   2) sql 선언 매개변수 처리..
	5. 기본 연결 설정 부분 복사
	6. resultset객체 rs.next(), rs.getXXX("컬럼명") rs.getXXX(1)
	   if, while          
	 * */	
//		4. **최소 급여 조회**:SELECT MIN(sal) FROM emp
	
	public double getMinSal() {
		double minsal = 0.0;
		String sql = "SELECT  MIN(sal) minsal FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				minsal = rs.getDouble("minsal"); // 컬럼명 지정
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
		
		return minsal;
		
	}	
	
//		5. **부서 번호 @@의 총 직원 수**: SELECT COUNT(*) FROM emp WHERE deptno = 10;
//			입력  : deptno (정수형), 출력 :정수형
	public int getCntByDeptno(int deptno) {
		int cnt = 0;
		String sql = "SELECT COUNT(*) "
				+ "		FROM emp "
				+ "		WHERE deptno = "+deptno;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) { 
				cnt = rs.getInt(1);
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
		
		return cnt;
	}
//	[1단계:확인] 2.다중 열 및 단일 행 결과:
//		1. **전체 직원의 평균 급여와 총 급여**: SELECT AVG(sal), SUM(sal) FROM emp
	public SalCalcu getSalCal() {
		SalCalcu sc = null;
		String sql = "SELECT AVG(sal) avgsal, SUM(sal) sumsal FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				sc = new SalCalcu(
							rs.getDouble("avgsal"),
							rs.getDouble(2)
						);
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
		
		
		
		return sc;
	}
	/*
	SELECT deptno, avg(sal) avsal
	FROM emp
	WHERE deptno = 10
	GROUP BY deptno;
	--  ==> VO, 기능메서드 선언..
	 * */
	public DeptAvg getAvgDept(int deptno) {
		DeptAvg da = null;
		String sql = "	SELECT deptno, avg(sal) avsal\r\n"
				+ "	FROM emp\r\n"
				+ "	WHERE deptno = "+deptno+"\r\n"
				+ "	GROUP BY deptno";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				da = new DeptAvg(
							rs.getInt("deptno"),
							rs.getDouble(2)
						);
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
		
		
		
		
		return da;
	}
//		2. **직원이름 에서 일하는 직원의 이름과 입사일,
//	        SELECT ename, hiredate FROM emp WHERE ename='SMITH'
	public EnameHire getEnameHire(String ename) {
		EnameHire eh = null;
		String sql = "SELECT ename, hiredate "
				+ "	FROM emp "
				+ "	WHERE ename='"+ename+"'";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				eh = new EnameHire(
							rs.getString("ename"),
							rs.getDate("hiredate")
						);
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
		
		
		return eh;
	}
	
	
	
//	[1단계:확인] 3. 단일 열 및 다중 행 결과:
//		1. **모든 부서의 부서 번호 목록**:  SELECT DISTINCT deptno FROM emp
	public List<Integer> getDeptnos(){
		List<Integer> deptnos = new ArrayList<Integer>();
		String sql = "SELECT DISTINCT deptno FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) { // sql 결과가 행단위 여러개 나올 수 있 때.
				//int deptno = rs.getInt("deptno");
				//deptnos.add(deptno);
				deptnos.add(rs.getInt("deptno"));
			}
			System.out.println("현재 조회된 건수:"+deptnos.size());
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		
		return deptnos;
	}
//		2. **@@@ 이상 급여를 받는 직원들의 이름**: SELECT ename FROM emp WHERE sal >= 3000
	public List<String> getEnames(double sal){
		String sql = "SELECT ename FROM emp WHERE sal >= "+sal;
		List<String> enames = new ArrayList<String>();
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				enames.add(rs.getString("ename"));
			}
			System.out.println("데이터 건수:"+enames.size());
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
//		3. **직책이 @@ 인 직원들의 이름**: SELECT ename FROM emp WHERE job = 'MANAGER'
	public List<String> getEnamesByJob(String job){
		String sql = "SELECT ename FROM emp WHERE job = '"+job+"' ";
		List<String> enames = new ArrayList<String>();
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				enames.add(rs.getString("ename"));
			}
			System.out.println("데이터 건수:"+enames.size());
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
		
//	[1단계:확인] 4. 다중 열 및   다중 행 결과(vo는 개인폴드로 추가해서 만들기)
//	              class XXX  List  ===> List<클래스명>
	
	
//		1. **각 부서이름과  급여를 기준으로 직원의 이름, 직책, 급여**:
/*
	SELECT ename, job, sal
	FROM emp
	WHERE deptno = 10 
	AND sal BETWEEN 1000 AND  5000
*/	
	public List<Emp01> getEmp01Sch(int deptno, double start, double end){
		List<Emp01> elist = new ArrayList<Emp01>();
		String sql = "	SELECT ename, job, sal\r\n"
				+ "	FROM emp\r\n"
				+ "	WHERE deptno = "+deptno+" \r\n"
				+ "	AND sal BETWEEN "+start+" AND  "+end;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) { // 행별로 데이터 호출..
				elist.add(new Emp01(rs.getString("ename"),
									rs.getString("job"),
									rs.getDouble("sal")
									)
						  );
			}
			System.out.println("현재 데이터 건수:"+elist.size());
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		
		return elist;
	}
//	2. **각 직책별 평균 급여**: SELECT job, AVG(sal) avgsal FROM emp GROUP BY job;
	public List<JobAvgSal> getJobAvgSal() {
		String sql = "SELECT job, AVG(sal) avgsal "
				+ "     FROM emp GROUP BY job";
		List<JobAvgSal> jobAvgList = new ArrayList<JobAvgSal>();
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				
				jobAvgList.add(new JobAvgSal(rs.getString("job"),
									rs.getDouble("avgsal")));
			}
			System.out.println("데이터 건수:"+jobAvgList.size());
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		
		return jobAvgList;
	}
//	3. **각 부서의 직원 수 및 평균 급여**: 
/*
 SELECT deptno, COUNT(*) cnt, AVG(sal) avgsal 
 FROM emp 
 GROUP BY deptno
 class DeptCntAvgSal{
 	private int deptno;
 	private int cnt;
 	private double avgsal;
 	
 }
 * */
	public List<DeptCntAvgSal> getDetpcntAvgSal() {
		List<DeptCntAvgSal> list = new ArrayList<DeptCntAvgSal>();
		String sql = " SELECT deptno, COUNT(*) cnt, AVG(sal) avgsal \r\n"
				+ " FROM emp \r\n"
				+ " GROUP BY deptno";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				list.add(new DeptCntAvgSal(
							rs.getInt("deptno"),
							rs.getInt("cnt"),
							rs.getDouble("avgsal")					
						));
			}
			System.out.println("데이터 건수:"+list.size());
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}	
		
		
		return list;
		
	}
	public List<Employee01> getEmployeeList(double min, double max){
		List<Employee01> list = new ArrayList<Employee01>();
		String sql="SELECT employee_id,first_name,email,salary\r\n"
		            + "FROM EMPLOYEES e \r\n"
		            + "WHERE salary BETWEEN "+min+" AND "+max;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				list.add(new Employee01(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getDouble(4)));				
			}
			System.out.println("데이터 건수:"+list.size());
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		return list;
	}
	
	
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
