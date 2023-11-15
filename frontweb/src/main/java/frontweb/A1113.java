package frontweb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import frontweb.database.DBCon;
import frontweb.homework_vo.Emp1;
import frontweb.homework_vo.Emp2;
import frontweb.homework_vo.Emp3;
import frontweb.homework_vo.Emp4;
import frontweb.homework_vo.Emp5;
import frontweb.homework_vo.Emp6;
import frontweb.homework_vo.Emp7;


public class A1113 {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	/*
	1. sql 작성
	2. 입력 출력 구분
	3. 입력 : 메서드의 매개변수
	   출력 : 메서드의 리턴유형
	4. 메서드 위 내용을 구분해서 처리
	    1) 리턴할 데이터
	    2) sql 선언
	5. 기본 연결 설정부분 복사
	6. resultset객체 rs.next(), rs.getXXX("컬럼명") rs.getXXX(1)
	    if,while
	 
SELECT MAX(sal) msal FROM emp;
    어떤 데이터 출력 타입 유형 5000(double)결과
    컬럼명이 어떤 형태
    rs.getString("msal")
    rs.get타입유형("컬럼명")
	 */
	
	//1. **최대 급여 조회**
	public double getMaxSal() {
		double maxsal = 0;
		String sql = "SELECT MAX(SAL) \r\n"
				+ "FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				maxsal = rs.getDouble("max(sal)");
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
		
		return maxsal;
	}
	// 2. **총 직원 수 계산**:
	public int getCount() {
		int cnt = 0;
		String sql = "SELECT COUNT(ename)\r\n"
				+ "FROM emp";
		
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				cnt = rs.getInt("count(ename)");
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
		
		return cnt;
	}
	// 3. **평균 급여 계산**:
	public double getAvg() {
		double avgSal = 0;
		String sql = "SELECT AVG(sal)\r\n"
				+ "FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				avgSal = rs.getDouble("avg(sal)");
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
		return avgSal;
	}
	// 4. **최소 급여 조회**:
	public double getMinSal() {
		double minSal = 0;
		String sql = "SELECT min(sal)\r\n"
				+ "FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				minSal = rs.getDouble("min(sal)");
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
		return minSal;
	}
	// 5. **부서 번호 @@의 총 직원 수**:
	public int getCount2(int deptno) {
		int cnt = 0;
		String sql = "SELECT count(ename)\r\n"
				+ "FROM emp\r\n"
				+ "WHERE DEPTNO ="+deptno;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				cnt = rs.getInt("count(ename)");
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
		return cnt;
	}
	// 1. **전체 직원의 평균 급여와 총 급여**:
	
	public Emp1 getSal() {
		Emp1 avgSum = null;
		String sql = "SELECT AVG(sal), SUM(sal)\r\n"
				+ "FROM EMP";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) { 
				avgSum = new Emp1(
					rs.getDouble("avg(sal)"),
					rs.getDouble("sum(sal)")
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
		
		return avgSum;
	}
	// 2. **직원이름 에서 일하는 직원의 이름과 입사일,
	
	public Emp2 getEmp(String ename) {
		Emp2 empInfo = null;
		String sql = "SELECT ename, hiredate\r\n"
				+ "FROM emp\r\n"
				+ "WHERE ename = '"+ename+"'";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) { 
				empInfo = new Emp2(
					rs.getString("ename"),
					rs.getDate("hiredate")
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
		
		return empInfo;
	}
// 1. **모든 부서의 부서 번호 목록**:
	public List<Integer> getDeptno(){
		List<Integer> deptnoInfo = new ArrayList<Integer>();
		
		String sql = "SELECT deptno\r\n"
				+ "FROM emp";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) { 
				deptnoInfo.add(rs.getInt(1));
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
		return deptnoInfo;
	}
	// 2. **@@@ 이상 급여를 받는 직원들의 이름**:
	public List<String> getEname(int sal){
		List<String> enameInfo = new ArrayList<String>();
		String sql = "SELECT ename\r\n"
				+ "FROM EMP \r\n"
				+ "WHERE sal >= "+sal;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) { 
				enameInfo.add(rs.getString(1));
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
		return enameInfo;
	}
	// 3. **직책이 @@ 인 직원들의 이름**:
	public List<String> getEname2(String job){
		List<String> enameInfo2 = new ArrayList<String>();
		String sql = "SELECT ename\r\n"
				+ "FROM emp\r\n"
				+ "WHERE job = '"+job+"'";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) { 
				enameInfo2.add(rs.getString("ename"));
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
		return enameInfo2;
	}
	// 1. **각 부서이름과  급여를 기준으로 직원의 이름, 직책, 급여**:
	public List<Emp3> getEmp(int deptno, double sal){
		List<Emp3> empInfo = new ArrayList<Emp3>();
		String sql = "SELECT ename, job, sal\r\n"
				+ "FROM emp\r\n"
				+ "WHERE DEPTNO = "+deptno+" AND SAL >= "+sal;
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {empInfo.add( new Emp3(
					rs.getString("ename"),
					rs.getString("job"),
					rs.getDouble("sal")
					)
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
		
		return empInfo;
	}
	// 2. **각 직책별 평균 급여**:
	public List<Emp4> getEmp2(){
		List<Emp4> empInfo = new ArrayList<Emp4>();
		String sql = "SELECT JOB, avg(sal)\r\n"
				+ "FROM emp\r\n"
				+ "GROUP BY job";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				empInfo.add(new Emp4(
							rs.getString("job"),
							rs.getInt("avg(sal)")
						)
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
		
		return empInfo;
	}
	// 3. **각 부서의 직원 수 및 평균 급여**:
	public List<Emp5> getEmp3(){
		List<Emp5> empInfo = new ArrayList<Emp5>();
		String sql = "SELECT DEPTNO ,COUNT(ename), AVG(sal)\r\n"
				+ "FROM emp\r\n"
				+ "GROUP BY DEPTNO";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				empInfo.add(new Emp5(
							rs.getInt("deptno"),
							rs.getInt("count(ename)"),
							rs.getDouble("avg(sal)")
						)
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
		
		return empInfo;
	}
	public Emp6 getDept(int deptno) {
		Emp6 getDeptInfo = null;
		String sql = "SELECT deptno, avg(sal) avsal\r\n"
				+ "FROM EMp\r\n"
				+ "WHERE deptno = +"+deptno+"\r\n"
				+ "GROUP BY deptno";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				getDeptInfo = new Emp6(
						rs.getInt("deptno"),
						rs.getDouble("avsal")
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
		return getDeptInfo;
	}
	// 직원 이름에서 일하는 직원 이름 입사일
	public Emp7 getEmp7(String ename) {
		Emp7 emp7 = null;
		String sql = "SELECT ename, hiredate\r\n"
				+ "FROM emp\r\n"
				+ "WHERE ename='"+ename+"'";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			if(rs.next()) {
				emp7 = new Emp7(
						rs.getString("ename"),
						rs.getDate("hiredate")
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
		
		return emp7;
	}
	
	public static void main(String[] args) {
		A1113 dao = new A1113();
		System.out.println(dao.getMaxSal()); // 1번
		System.out.println(dao.getCount());
		System.out.println(dao.getAvg());
		System.out.println(dao.getMinSal());
		System.out.println(dao.getCount2(10));
		
		Emp1 emp = dao.getSal();
		System.out.println(emp.getAvg());
		System.out.println(emp.getSum());
		
		Emp2 emp2 = dao.getEmp("SMITH");
		System.out.println(emp2.getEname());
		System.out.println(emp2.getHiredate());
		
		for(int deptno:dao.getDeptno()) {
			System.out.println(deptno);
		}
		for(String ename:dao.getEname(3000)) {
			System.out.println(ename);
		}
		for(String ename:dao.getEname2("CLERK")) {
			System.out.println(ename);
		}
		for(Emp3 emp3:dao.getEmp(20,1000)) {
			System.out.println(emp3.getEname() +"\t");
			System.out.println(emp3.getJob()+"\t");
			System.out.println(emp3.getSal()+"\n");
		}
		for(Emp4 emp4:dao.getEmp2()) {
			System.out.println(emp4.getJob() +"\t");
			System.out.println(emp4.getAvg() +"\n");
		}
		for(Emp5 emp5:dao.getEmp3()) {
			System.out.println(emp5.getDeptno()+"\t");
			System.out.println(emp5.getCount()+"\t");
			System.out.println(emp5.getAvg()+"\n");
		}
		
		Emp6 emp6 = dao.getDept(10);
		System.out.println("결과");
		System.out.println(emp6.getDeptno());
		System.out.println(emp6.getAvsal());
		
		Emp7 emp7 = dao.getEmp7("SMITH");
		System.out.println(emp7.getEname());
		System.out.println(emp7.getHiredate());
		
	}
}