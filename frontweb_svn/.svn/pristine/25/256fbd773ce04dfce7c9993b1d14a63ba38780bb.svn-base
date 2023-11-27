package frontweb.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import frontweb.Dept;
// frontweb.database.ExpDao2
public class ExpDao2 {
	public Object template01(Object sch) {
		Object ob = false;
		String sql = "select * from emp";
		// 1. 연결?필드에 선언된 con = DBConn에 할당
		try (	Connection con = DB.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql) ){

			// 데이터가 있는지 여부만 가져오면 되기에
			rs.next();
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		}
		return ob;
	}
	public List<Dept> getDeptList(String sch){
		List<Dept> dlist = new ArrayList<Dept>();
		String sql = "SELECT deptno, dname, loc\r\n"
				+ "FROM dept\r\n"
				+ "WHERE dname LIKE ? ";
		//System.out.println();
		// 1. 연결?필드에 선언된 con = DBConn에 할당
		try (	
				Connection con = DB.getJNDIConnection();
				//Connection con = DB.getCon();
				
				PreparedStatement pstmt = con.prepareStatement(sql); ){
				pstmt.setString(1, "%"+sch+"%");
				System.out.println("연결:"+con);
				//System.out.println(con);
				try(ResultSet rs = pstmt.executeQuery()){
					while(rs.next()) {
						dlist.add(new Dept(rs.getInt("deptno"),
											rs.getString("dname"),
											rs.getString("loc")) );
					}
					System.out.println("데이터 건수:"+dlist.size());					
				}
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		}	
		return dlist;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpDao2 dao = new ExpDao2();
		for(Dept d:dao.getDeptList("")) {
			System.out.println(d.getDname());
		}
	}

}
