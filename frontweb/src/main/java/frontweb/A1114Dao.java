package frontweb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import frontweb.dao.DB;
import frontweb.homework_vo.Location;
import frontweb.homework_vo.Mem;

public class A1114Dao {
// [1단계:확인] 2. login 처리 예제를 기준으로 PreparedStatement를 활용하여 id, pwd를 입력하는 처리를 해보세요.
//	select * from member01 where id=? and pwd=? 기능메서드 처리
	
	public List<Mem> getUserInfo(String id, String pwd){
		List<Mem> showInfo = new ArrayList<Mem>();
		String sql = "SELECT *\r\n"
				+ "FROM member01\r\n"
				+ "WHERE id = ? AND pwd = ?";
		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			// 처리코드1
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				// 처리코드2
				if(rs.next()) {
					showInfo.add(new Mem(
								rs.getInt("mno"),
								rs.getString("name"),
								rs.getString("id"),
								rs.getString("pwd"),
								rs.getString("auth"),
								rs.getInt("point")
							));
				}
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return showInfo;
	}
	// [1단계:확인] 3. select * from member01 where name like ? 기능메서드 처리 
	public List<Mem> getUser(String name){
		List<Mem> userInfo = new ArrayList<Mem>();
		String sql = "SELECT *\r\n"
				+ "FROM member01\r\n"
				+ "WHERE name LIKE ?";
		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			// 처리코드1
			pstmt.setString(1, "%"+name+"%");
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				// 처리코드2
				while(rs.next()) {
					userInfo.add(new Mem(
							rs.getInt("mno"),
							rs.getString("name"),
							rs.getString("id"),
							rs.getString("pwd"),
							rs.getString("auth"),
							rs.getInt("point")
							));
				}
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return userInfo;
	}
	/*[1단계:확인] 
4. SELECT * 
    FROM locations
    WHERE STREET_ADDRESS LIKE ?
  	AND city LIKE ?;
처리기능메서드 하고, 웹화면 출력까지 해보세요.*/
	public List<Location> getLoc(String street_address, String city){
		List<Location> locInfo = new ArrayList<Location>();
		String sql = "SELECT *\r\n"
				+ "FROM locations\r\n"
				+ "WHERE STREET_ADDRESS LIKE ? AND CITY LIKE ?";
		try(
				Connection con = DB.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			){
			// 처리코드1
			pstmt.setString(1, "%"+street_address+"%");
			pstmt.setString(2, "%"+city+"%");
			try(
					ResultSet rs = pstmt.executeQuery();
				){
				// 처리코드2
				while(rs.next()) {
					locInfo.add(new Location(
								rs.getInt("location_id"),
								rs.getString("street_address"),
								rs.getString("postal_code"),
								rs.getString("city"),
								rs.getString("state_province"),
								rs.getString("country_id")
							));
				}
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러 : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		
		return locInfo;
	}
	
	public static void main(String[] args) {
		A1114Dao dao = new A1114Dao();
		for(Mem info:dao.getUserInfo("himan", "7777")) {
			System.out.println(info.getMno()+"\t");
			System.out.println(info.getName()+"\t");
			System.out.println(info.getId()+"\t");
			System.out.println(info.getPwd()+"\t");
			System.out.println(info.getAuth()+"\t");
			System.out.println(info.getPoint()+"\n");
		}
		
		for(Mem info2:dao.getUser("길동")) {
			System.out.println(info2.getMno()+"\t");
			System.out.println(info2.getName()+"\t");
			System.out.println(info2.getId()+"\t");
			System.out.println(info2.getPwd()+"\t");
			System.out.println(info2.getAuth()+"\t");
			System.out.println(info2.getPoint()+"\n");
		}
		
		for(Location loc:dao.getLoc("C", "S")) {
			System.out.println(loc.getLocation_id()+"\t");
			System.out.println(loc.getStreet_address()+"\t");
			System.out.println(loc.getPostal_code()+"\t");
			System.out.println(loc.getCity()+"\t");
			System.out.println(loc.getState_province()+"\t");
			System.out.println(loc.getCountry_id()+"\n");
		}
		
/*
[1단계:확인] 1. PreparedStatement의 사용하는 이유와 장단점을 기술하세요.
장점1) SQL injection을 방지한다
장점2) 한번 실행했던 코드는 해석없이 바로 실행해서 성능이 빨라진다
장점3) 쿼리에 직접 변수를 넣는게 아닌 ?를 사용해서 코드의 가독성이 높다

단점1) 쿼리가 처음 실행될 때 컴파일과정이 필요해서 초기 실행속도가 느리다.
단점2) 쿼리의 구조가 변경되어야 할 때 마다 PreparedStatement를 새로 생성해야 한다.
*/
	}

}
