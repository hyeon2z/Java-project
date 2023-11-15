package frontweb.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import frontweb.Dept;
import frontweb.Emp;
import frontweb.dao.DB;
/*
import = "frontweb.database.PreparedStmtDao"
import = "frontweb.Emp"
*/ 
public class PreparedStmtDao {
	
	public Object template(String dname){
		Object ob = new Object();
		String sql = "select * from dept where dname like ?";
		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			// 처리코드1
			pstmt.setString(1, "%"+dname+"%");
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				// 처리코드2
				rs.next();
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return ob;
	}
/*
try(){
		 
	}catch(SQLException e) {
		
	}catch(Exception se) {
		
	}
 */
	
	
	public List<Dept> getDeptList(String dname){
		List<Dept> dlist = new ArrayList<Dept>();
		String sql = "select deptno,dname,loc from dept where dname like ?";
		// try(객체처리){} : try resource 구문 파일이나 DB연결 자동 자원해제
		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			pstmt.setString(1, "%"+dname+"%");
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					dlist.add(new Dept(
								rs.getInt("deptno"),
								rs.getString("dname"),
								rs.getString("loc")
							));
				}
				System.out.println("데이터 건수 : " + dlist.size());
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return dlist;
	}
	/*
SELECT *
FROM emp
WHERE ename LIKE ?
AND job LIKE ?
AND deptno = ?
	 */
	public List<Emp> getEmpList(Emp sch){
		List<Emp> empList = new ArrayList<Emp>();
		String sql = "SELECT *\r\n"
				+ "FROM emp\r\n"
				+ "WHERE ename LIKE ?\r\n"
				+ "AND job LIKE ?\r\n"
				+ "AND deptno = ?";
		try(
				Connection con = DBCon.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			pstmt.setString(1, "%"+sch.getEname()+"%");
			pstmt.setString(2, "%"+sch.getJob()+"%");
			pstmt.setInt(3, sch.getDeptno());
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					empList.add(new Emp(
								rs.getInt("empno"),
								rs.getString("ename"),
								rs.getString("job"),
								rs.getInt("mgr"),
								rs.getDate("hiredate"),
								rs.getDouble("sal"),
								rs.getDouble("comm"),
								rs.getInt("deptno")
							));
				}
				System.out.println("데이터 건수 : " + empList.size());
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return empList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStmtDao dao = new PreparedStmtDao();
		for(Dept d:dao.getDeptList("A")) {
			System.out.print(d.getDeptno()+"\t");
			System.out.print(d.getDname()+"\t");
			System.out.print(d.getLoc()+"\n");
		}
//		for(Emp e:dao.getEmpList(3)) {
//			
//		}
	}

}
