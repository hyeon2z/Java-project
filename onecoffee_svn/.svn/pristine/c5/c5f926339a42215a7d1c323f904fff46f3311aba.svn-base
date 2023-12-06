package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DBCon;
import login.vo.Member;

public class DeleteMemDao {
	public int deleteMem(Member mem) {
		int uptCnt = 0;
		String sql = "DELETE FROM Member \r\n"
				+ "WHERE id = ? AND pwd = ?";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPwd());
			uptCnt = pstmt.executeUpdate();
			if (uptCnt == 0) {
				System.out.println("삭제 실패");
				con.rollback();
			} else {
				con.commit(); // Commit the transaction
				System.out.println("삭제 성공");
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}

		return uptCnt;
	}
}
