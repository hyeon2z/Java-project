package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DBCon;
import login.vo.Member;

public class UpdateMemDao {
/*
UPDATE MEMBER SET
pwd = '1111', phonenum = '010-1234-5678', address = '서울'
WHERE id = 'hyeon2'; 
 */
	public int updateMem(Member mem) {
		int insCnt = 0;
		String sql = "UPDATE MEMBER SET\r\n"
				+ "pwd = ?, phonenum = ?, address = ?\r\n"
				+ "WHERE id = ?";
		
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setString(1, mem.getPwd());
			pstmt.setString(2, mem.getPhonenum());
			pstmt.setString(3, mem.getAddress());
			pstmt.setString(4, mem.getId());
			insCnt = pstmt.executeUpdate();
			if (insCnt == 0) {
				System.out.println("등록 실패");
				con.rollback();
			} else {
				con.commit(); // Commit the transaction
				System.out.println("등록 성공");
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}
		return insCnt;
	}
}