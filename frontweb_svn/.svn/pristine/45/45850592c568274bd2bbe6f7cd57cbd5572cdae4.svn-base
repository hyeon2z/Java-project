package frontweb.z01_home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import frontweb.database.DBCon;
import frontweb.vo.Location;
import frontweb.vo.Member;
/*
import="frontweb.z01_home.A1114Dao"
import="frontweb.vo.Location"
 * */ 
public class A1114Dao {

//	[1단계:확인] 2. login 처리 예제를 기준으로 PreparedStatement를 활용하여 id, pwd를 입력하는 처리를 해보세요.
//	   select * from member01 where id=? and pwd=? 기능메서드 처리
	/*
	 * select * from member01 where id=? and pwd=?
	 */
	public Member login(Member sch) {
		Member mem = null;
		String sql = "	select * \r\n" 
					+ "	from member01\r\n" 
					+ "	where id=? and pwd=?";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, sch.getId());
			pstmt.setString(2, sch.getPwd());
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				// mno, name, id, pwd, auth, point
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
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}
		return mem;
	}

//	[1단계:확인] 3. select * from member01 where name like ? 기능메서드 처리
	public List<Member> getMemberList(String name){
		List<Member> list = new ArrayList<Member>();
		String sql = "select * from member01 "
				+ "	  where name like ?";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, "%"+name+"%");
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				while(rs.next()) {
					list.add(
							new Member(
									rs.getInt("mno"),
									rs.getString("name"),
									rs.getString("id"),
									rs.getString("pwd"),
									rs.getString("auth"),
									rs.getInt("point")
									)							
							);
					
				}
				System.out.println(name+"으로 검색된 회원의 수:"+
						list.size());
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}	
		
		
		return list;
	}
	
	
//	[1단계:확인] 4. SELECT * 
//		     FROM locations
//		     WHERE STREET_ADDRESS LIKE ?
//		     AND city LIKE ?;
//	           처리기능메서드 하고, 웹화면 출력까지 해보세요.
/*
SELECT * 
FROM locations
WHERE upper(STREET_ADDRESS) LIKE upper(?)
AND upper(city) LIKE upper(?)
 * */
	public List<Location> getLocations(Location sch){
		List<Location> list = new ArrayList<Location>();
		String sql = "SELECT * \r\n"
				+ "FROM locations\r\n"
				+ "WHERE upper(STREET_ADDRESS) LIKE upper(?)\r\n"
				+ "AND upper(city) LIKE upper(?)";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, "%"+sch.getStreet_address()+"%");
			pstmt.setString(2, "%"+sch.getCity()+"%");
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				while(rs.next()) {
					list.add(new Location(
								rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getString(5),
								rs.getString(6)
							));
				}
				System.out.println("데이터 건수:"+list.size());
				
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}		
		return list;
	}
	
	
	public static void main(String[] args) {
		A1114Dao dao = new A1114Dao();
		Member m = dao.login(new Member("himan","777"));
		if(m!=null){
			System.out.println(m.getName()+"로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		// TODO Auto-generated method stub
		/*
		 * [1단계:확인] 1. PreparedStatement의 사용하는 이유와 장단점을 기술하세요. [1단계:확인] 2. login 처리 예제를
		 * 기준으로 PreparedStatement를 활용하여 id, pwd를 입력하는 처리를 해보세요. select * from member01
		 * where id=? and pwd=? 기능메서드 처리 [1단계:확인] 3. select * from member01 where name
		 * like ? 기능메서드 처리 [1단계:확인] 4. SELECT * FROM locations WHERE STREET_ADDRESS LIKE
		 * ? AND city LIKE ?; 처리기능메서드 하고, 웹화면 출력까지 해보세요. # 조별로 파악사항(아래사항 조별로 취합 전달
		 * 17:20까지 전달) 1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분 2. 오늘 지각(9:00기준)/수업시간
		 * 엄수(매시간:00)/과제제출 인원과 사유 3. 수업 시간 집중하였는가?
		 */
	}

}
