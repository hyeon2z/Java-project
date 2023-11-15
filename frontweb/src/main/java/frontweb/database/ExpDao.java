package frontweb.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import frontweb.Dept;
import frontweb.Emp;
import frontweb.vo.Employee;

public class ExpDao {

	// 공통으로 사용할 전역 객체 선언
	// 1. 연결
	private Connection con;
	// 2. 대화
	private Statement stmt;
	private PreparedStatement pstmt;
	// 3. 결과
	private ResultSet rs;

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
		
		public List<String> getStreetAddress(String country_id){
			List<String> list = new ArrayList<String>();
			String sql = "SELECT Street_address\r\n"
					+ "FROM locations\r\n"
					+ "WHERE country_id = '"+country_id+"'";
			try {
				con = DBCon.con();
				// 2. 대화처리
				stmt = con.createStatement();
				// 3. 결과
				rs = stmt.executeQuery(sql);
				// 데이터가 있는지 여부만 가져오면 되기에
				while(rs.next()) {
					list.add(rs.getString(1));
				}
				System.out.println(list.size());
				// 4. 예외와 자원해제
				
			} catch (SQLException e) {
				System.out.println("DB 예외 : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("일반 예외 : " + e.getMessage());
			} finally {
				// 자원해제(연결처리 후 사용한 객체들)
				DBCon.close(rs, stmt, con);
			}
			return list;
		}
		public List<Emp> getEmpList(String sch){
			List<Emp> empList = new ArrayList<Emp>();
			String sql = "SELECT * FROM emp WHERE ename LIKE '%"+sch+"%'";
			try {
				con = DBCon.con();
				// 2. 대화처리
				stmt = con.createStatement();
				// 3. 결과
				rs = stmt.executeQuery(sql);
				// 데이터가 있는지 여부만 가져오면 되기에

				// 4. 예외와 자원해제
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
				System.out.println("조회된 사원 정보 갯수 :" + empList.size());
			} catch (SQLException e) {
				System.out.println("DB 예외 : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("일반 예외 : " + e.getMessage());
			} finally {
				// 자원해제(연결처리 후 사용한 객체들)
				DBCon.close(rs, stmt, con);
			}
			
			return empList;
		}
		public List<Dept> getMem(String dname){
			List<Dept> memlist = new ArrayList<Dept>();
			String sql = "SELECT *\r\n"
					+ "FROM dept\r\n"
					+ "WHERE dname LIKE '%"+dname+"%'";
			try {
				con = DBCon.con();
				// 2. 대화처리
				stmt = con.createStatement();
				// 3. 결과
				rs = stmt.executeQuery(sql);
				// 데이터가 있는지 여부만 가져오면 되기에

				// 4. 예외와 자원해제
				while(rs.next()) {
					memlist.add(new Dept(
							rs.getInt("deptno"),
							rs.getString("dname"),
							rs.getString("loc")
						) 
					);
				}
				System.out.println("조회된 사원 정보 갯수 :" + memlist.size());
			} catch (SQLException e) {
				System.out.println("DB 예외 : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("일반 예외 : " + e.getMessage());
			} finally {
				// 자원해제(연결처리 후 사용한 객체들)
				DBCon.close(rs, stmt, con);
			}
			return memlist;
			
		}
		public List<Employee> getEmployeeList(int min, int max){
		      List<Employee> elist = new ArrayList<Employee>();
		      String sql = "SELECT EMPLOYEE_ID , FIRST_NAME , EMAIL , SALARY  FROM EMPLOYEES WHERE SALARY BETWEEN  "+min+" AND "+max;
		      try {
		         con = DBCon.con();
		         stmt = con.createStatement();
		         rs = stmt.executeQuery(sql);
		         while(rs.next()) {
		            elist.add(new Employee(
		               rs.getInt("employee_id"),
		               rs.getString("first_name"),
		               rs.getString("email"),
		               rs.getDouble("salary")
		                  ));
		         }
		      } catch (SQLException e) {
		         System.out.println("DB예외" + e.getMessage());
		      } catch (Exception e) {
		         System.out.println("일반예외" + e.getMessage());
		      } finally {
		         DBCon.close(rs, stmt, con);
		         System.out.println("자원해제처리!");
		      }
		      return elist;
		   }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpDao dao = new ExpDao();
//		for(String address:dao.getStreetAddress("US")) {
//			System.out.println(address);
//		}
		for(Employee employee:dao.getEmployeeList(1000, 3000)) {
			System.out.println(employee.getEmployee_id()+ "\t");
			System.out.println(employee.getFirst_name()+ "\t");
			System.out.println(employee.getEmail() + "\t");
			System.out.println(employee.getSalary() + "\n");
		}
		
//		for(Emp emp:dao.getEmpList("A")) {
//			System.out.println(emp.getEmpno()+"\t");
//			System.out.println(emp.getEname()+"\t");
//			System.out.println(emp.getJob()+"\t");
//			System.out.println(emp.getMgr()+"\t");
//			System.out.println(emp.getHiredate()+"\t");
//			System.out.println(emp.getSal()+"\t");
//			System.out.println(emp.getComm()+"\t");
//			System.out.println(emp.getDeptno()+"\n");
//		}
//		
//		for(Dept dept:dao.getMem("A")) {
//			System.out.println(dept.getDeptno()+"\t");
//			System.out.println(dept.getDname()+"\t");
//			System.out.println(dept.getLoc()+"\n");
//		}
	}

}
