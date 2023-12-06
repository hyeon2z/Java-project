package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBCon;
import order_sol.Member;

public class MemberDAO {
	
	public Member getMember(int memberId) {
		Member member = null;
		String sql = "select * from member where mem_id = ?";
		
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, memberId);
			
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				if (rs.next()) {
					member = new Member(rs.getInt("mem_id"), rs.getString("name"));
				}
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}
		
		return member;
	}
	
	public int getMemIdById(String id) {
		int memberId = -1;
		
		String sql = "select * from member where id = ?";
		
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, id);
			
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				if (rs.next()) {
					memberId = rs.getInt("mem_id");
				}
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}
		
		return memberId;
	}

}
