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
import frontweb.vo.EmpDTO;
import frontweb.vo.EmpHomework;
import frontweb.vo.Member;

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
	
	public List<Dept> getDeptList(String dname, String loc){
		List<Dept> dlist = new ArrayList<Dept>();
		String sql = "select deptno,dname,loc from dept01 where dname like ? and loc like ?";
		// try(객체처리){} : try resource 구문 파일이나 DB연결 자동 자원해제
		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			pstmt.setString(1, "%"+dname+"%");
			pstmt.setString(2, "%"+loc+"%");
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
				+ "FROM emp01\r\n"
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
	public List<Emp> getEmpList2(int deptno){
		List<Emp> empList = new ArrayList<Emp>();
		String sql = "SELECT *\r\n"
				+ "FROM emp\r\n"
				+ "WHERE deptno = ?";
		try(
				Connection con = DBCon.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			pstmt.setInt(1, deptno);

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

	public Member getMember(String id){
		Member mem = null;
		String sql = "SELECT *\r\n"
				+ "FROM MEMBER01\r\n"
				+ "WHERE id = ?";
	

		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			// 처리코드1
			pstmt.setString(1, id);
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				// 처리코드2
				if(rs.next()) {
					mem = new Member(
							rs.getInt("mno"),
							rs.getString("name"),
							rs.getString("id"),
							rs.getString("pwd"),
							rs.getString("auth"),
							rs.getInt("point")
							);
				}
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		return mem;
	}

// INSERT INTO emp01 values(?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?);
// dao.insertEmp01(new EmpDTO(1003, "하길동", "대리", 7799, "2023-11-01", 3500, 1000, 20));
	public int insertEmp01(EmpDTO ins) {
	      int insCnt = 0;
	      String sql = "INSERT INTO emp01 VALUES (?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?)";
	      try (Connection con = DBCon.con();
	            PreparedStatement pstmt = con.prepareStatement(sql);) {
	            con.setAutoCommit(false);
	         // 내가 처리할 처리코드 1
	            pstmt.setInt(1,ins.getEmpno());
	            pstmt.setString(2,ins.getEname());
	            pstmt.setString(3,ins.getJob());
	            pstmt.setInt(4,ins.getMgr());
	            pstmt.setString(5,ins.getHiredateStr());
	            pstmt.setDouble(6,ins.getSal());
	            pstmt.setDouble(7,ins.getComm());
	            pstmt.setInt(8,ins.getDeptno());
	            
	            insCnt = pstmt.executeUpdate();
	            con.commit();
	         } catch (SQLException e) {
	            System.out.println("DB에러 : " + e.getMessage());
	            //con.rollback;
	         } catch (Exception e) {
	            System.out.println("일반에러 : " + e.getMessage());
	         }
	      return insCnt;
	   }
	
	
	
	public List<Emp> getEmpMem(String job, String hire){
		List<Emp> meminfo = new ArrayList<Emp>();
		String sql = "SELECT empno, ename, job, to_char(hiredate,'Q') hire,hiredate\r\n"
				+ "FROM emp\r\n"
				+ "WHERE to_char(hiredate,'Q') = ?\r\n"
				+ "AND job = ?";
		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			// 처리코드1
			pstmt.setString(1, hire);
			pstmt.setString(2, job);
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				// 처리코드2
				while(rs.next()) {
					meminfo.add(new Emp(
								rs.getInt("empno"),
								rs.getString("ename"),
								rs.getString("job"),
								rs.getDate("hiredate"),
								rs.getString("hire")
							));
				}
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return meminfo;
	}
	


	public List<EmpHomework> getEmpMem2(String start, String end){
		List<EmpHomework> meminfo = new ArrayList<EmpHomework>();
		String sql = "SELECT empno, ename, job, to_char(HIREDATE,'YYYY-MM-DD') hiredate, DEPTNO\r\n"
				+ "FROM emp\r\n"
				+ "WHERE to_char(HIREDATE,'YYYY-MM,DD') > ?\r\n"
				+ "AND to_char(HIREDATE,'YYYY-MM,DD') < ?";
		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			// 처리코드1
			pstmt.setString(1, start);
			pstmt.setString(2, end);
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				// 처리코드2
				while(rs.next()) {
					meminfo.add(new EmpHomework(
								rs.getInt("empno"),
								rs.getString("ename"),
								rs.getString("job"),
								rs.getString("hiredate"),
								rs.getInt("deptno")
							));
				}
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return meminfo;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStmtDao dao = new PreparedStmtDao();
		
		dao.insertEmp01(new EmpDTO(1004, "구길동", "과장", 7799, "2023-12-01", 5500, 1000, 20));
		
		for(Emp e:dao.getEmpList(new Emp("","",20))) {
			System.out.print(e.getEmpno()+"\t");
			System.out.print(e.getEname()+"\t");
			System.out.print(e.getDeptno()+"\n");
		}
		
		for(Dept d:dao.getDeptList("A")) {
			System.out.print(d.getDeptno()+"\t");
			System.out.print(d.getDname()+"\t");
			System.out.print(d.getLoc()+"\n");
		}
		System.out.println();
		for(Emp e:dao.getEmpMem("CLERK", "1")) {
			System.out.println(e.getEmpno()+"\t");
			System.out.println(e.getEname()+"\t");
			System.out.println(e.getJob()+"\t");
			System.out.println(e.getHiredate()+"\t");
			System.out.println(e.getHire()+"\n");
		}
		for(EmpHomework eh:dao.getEmpMem2("1980-10-10", "1983-10-10")) {
			System.out.print(eh.getEmpno()+"\t");
			System.out.print(eh.getEname()+"\t");
			System.out.print(eh.getJob()+"\t");
			System.out.print(eh.getHiredate()+"\t");
			System.out.print(eh.getDeptno()+"\n");
		}
		
		
	}

}
