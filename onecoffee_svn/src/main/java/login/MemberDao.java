package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBCon;
import login.vo.Member;

public class MemberDao {
	public Member getMemberInfo(String id) { // 세션 id 기반 정보출력
		Member mem = null;
		String sql = "SELECT name, id, pwd, phonenum, address, point\r\n"
				+ "FROM MEMBER\r\n"
				+ "WHERE id = ?";
		
		try(
				Connection con = DBCon.con();
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
							rs.getString("name"),
							rs.getString("id"),
							rs.getString("pwd"),
							rs.getString("phonenum"),
							rs.getString("address"),
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
	}
