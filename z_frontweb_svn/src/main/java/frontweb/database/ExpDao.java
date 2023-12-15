package frontweb.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import frontweb.Dept;
import frontweb.Emp;

public class ExpDao {



	// 공통으로 사용할 전역 객체 선언
	// 1. 연결
	private Connection con;
	private Statement stmt;
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
	public List<String> getStreetAddress(String country_id){
		List<String> list = new ArrayList<String>();
		String sql = "	SELECT STREET_ADDRESS \r\n"
				+ "	FROM LOCATIONS\r\n"
				+ "	WHERE COUNTRY_ID ='"+country_id+"'";
		// 1. 위 template 복사.
		// 1. 연결?필드에 선언된 con = DBConn에 할당
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				// rs.getString("컬럼") :문자열
				// rs.getInt("컬럼") :문자열
				// rs.getDouble("컬럼") :문자열
				// rs.getDate("컬럼") :문자열
				list.add(rs.getString(1));
			}
			System.out.println("크기:"+list.size());
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		
		// 2. while(rs.next()){
		//        list.add(rs.getString(1));
		//    }
		return list;
	}	
	/*
	select *
	from emp
	where ename like '%A%'
	 * */
	public List<Emp> getEmpList(String sch){
		List<Emp> empList = new ArrayList<Emp>();
		String sql = "	select *\r\n"
				+ "	from emp\r\n"
				+ "	where ename like '%"+sch+"%'";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			// 데이터가 있는지 여부만 가져오면 되기에
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
					        )
						);
			}
			System.out.println("조회된 사원 정보 갯수:"+empList.size());
			// 4. 예외와 자원해제
		} catch (SQLException e) {
			System.out.println("DB 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:" + e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		
		
		return empList;
	}
	/*
SELECT *
FROM dept
WHERE dname LIKE '%A%'
	 * */
	public List<Dept> getDeptList(String sch){
		List<Dept> dlist = new ArrayList<Dept>();
		String sql = "SELECT *\r\n"
				+ "FROM dept\r\n"
				+ "WHERE dname LIKE '%"+sch+"%'";
		try {
			con = DBCon.con();
			// 2. 대화처리
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			//    데이터가 있는지 여부만 가져오면 되기에
			while(rs.next()) {
				dlist.add(new Dept(rs.getInt(1),
									rs.getString(2),
									rs.getString(3)) );
			}
			System.out.println("데이터 건수:"+dlist.size());
			// 4. 예외와 자원해제					
		} catch (SQLException e) {
			System.out.println("DB 예외:"+e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		} finally {
			// 자원해제(연결처리 후 사용한 객체들)
			DBCon.close(rs, stmt, con);
		}		
		return dlist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpDao dao = new ExpDao();
		for(Dept d:dao.getDeptList("O")) {
			System.out.print(d.getDeptno()+"\t");
			System.out.print(d.getDname()+"\t");
			System.out.print(d.getLoc()+"\n");
		}
		/*
		System.out.println("# 검색된 사원 정보 #");
		for(Emp emp:dao.getEmpList("A")) {
			System.out.print(emp.getEmpno()+"\t");
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getJob()+"\t");
			System.out.print(emp.getMgr()+"\t");
			System.out.print(emp.getHiredate()+"\t");
			System.out.print(emp.getSal()+"\t");
			System.out.print(emp.getComm()+"\t");
			System.out.print(emp.getDeptno()+"\n");
		}
		*/
		
//		List<String> list = dao.getStreetAddress("US");
//		for(String address:dao.getStreetAddress("US")) {
//			System.out.println(address);
//			
//		}

	}
}
