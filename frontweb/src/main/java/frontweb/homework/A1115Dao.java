package frontweb.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import frontweb.Emp;
import frontweb.database.DBCon;
import frontweb.vo.EmpHire;
import frontweb.vo.EmpHireTerm;

public class A1115Dao {
	public List<Emp> getEmpListByDeptno(int deptno){
		List<Emp> elist = new ArrayList<Emp>();
		String sql = "Select empno, ename, sal, deptno\r\n"
			+ " From emp\r\n"
			+ " Where deptno = ?";
		try(
				Connection con = DBCon.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			pstmt.setInt(1, deptno);

			try(
					ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					elist.add(
							new Emp(
								rs.getInt("empno"),
								rs.getString("ename"),
								rs.getDouble("sal"),
								rs.getInt("deptno")
							));
				}
				System.out.println("데이터 건수 : " + elist.size());
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		return elist;
	}
	
	public List<EmpHire> getEmpHireInfo(String job, String hire_qua){
		List<EmpHire> hiList = new ArrayList<EmpHire>();
		String sql = "SELECT empno, ename, job, to_char(hiredate, 'Q') hire_qua,\r\n"
				+ "to_char(hiredate, 'YYYY/MM/DD') hire_Str\r\n"
				+ "FROM emp\r\n"
				+ "WHERE job LIKE ?\r\n"
				+ "AND to_char(hiredate, 'Q') = ?";
		try(
				Connection con = DBCon.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			pstmt.setString(1, "%"+job+"%");
			pstmt.setString(2, hire_qua);

			try(
					ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					hiList.add(
							new EmpHire(
								rs.getInt("empno"),
								rs.getString("ename"),
								rs.getString("job"),
								rs.getString("hire_qua"),
								rs.getString("hire_str")
							));
				}
				System.out.println("데이터 건수 : " + hiList.size());
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return hiList;
	}
	/*
	empno, ename, job, hirestr, deptno

SELECT empno, ename, job,
to_char(hiredate, 'YYYY/MM/DD') hirestr, deptno
FROM emp
WHERE hiredate BETWEEN to_date(?, 'YYYY/MM/DD')
AND to_date(?, 'YYYY/MM/DD');

출력 : empno, ename, job, hirestr, deptno
입력 : start, end

class EmpHireTerm{
	private int empno;
	private String ename;
	private String job;
	private String hirestr;
	private int deptno;
}
	 */
	public List<EmpHireTerm> getEmpHireList(String start, String end){
		List<EmpHireTerm> list = new ArrayList<EmpHireTerm>();
		String sql ="SELECT empno, ename, job,\r\n"
				+ "to_char(hiredate, 'YYYY/MM/DD') hirestr, deptno\r\n"
				+ "FROM emp\r\n"
				+ "WHERE hiredate BETWEEN to_date(?, 'YYYY/MM/DD')\r\n"
				+ "AND to_date(?, 'YYYY/MM/DD')";
		try(
				Connection con = DBCon.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			pstmt.setString(1, start);
			pstmt.setString(2, end);

			try(
					ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					list.add(
							new EmpHireTerm(
								rs.getInt("empno"),
								rs.getString("ename"),
								rs.getString("job"),
								rs.getString("hirestr"),
								rs.getInt("deptno")
							));
				}
				System.out.println("데이터 건수 : " + list.size());
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return list;
	}
	
	public static void main(String[] args) {

	}

}
