package community;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import community.vo.Board;
import db.DBCon;

public class BoardDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 게시물 조회
	public Board getCom(int no) {
		Board board = null;
		String sql = "SELECT * FROM PET_BOARD where no=? ";

		try {
			con = DBCon.con();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				board = new Board(
						rs.getInt("no"), 
						rs.getString("title"), 
						rs.getString("id"), 
						rs.getString("img"), 
						rs.getString("content"), 
						rs.getInt("likes")
						);
			}
		} catch (SQLException e) {
			System.out.println("DB 관련 오류: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 오류: " + e.getMessage());
		} finally {
			DBCon.close(rs, pstmt, con);
		}

		return board;
	}

	// 게시물 리스트 조회

	public List<Board> getComList() {
		List<Board> clist = new ArrayList<>();
		String sql = "SELECT * FROM PET_BOARD where no=? ";

		try {
			con = DBCon.con();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				clist.add(new Board(
						rs.getInt("no"), 
						rs.getString("title"), 
						rs.getString("id"), 
						rs.getString("img"), 
						rs.getString("content"), 
						rs.getInt("likes")
						));
			}
		} catch (SQLException e) {
			System.out.println("DB 관련 오류: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 오류: " + e.getMessage());
		} finally {
			DBCon.close(rs, pstmt, con);
		}
		return clist;
	}

	/*
	// no 최대값을 가져오기
	public int getMaxNo() {
		int result = 0;
		String sql = "SELECT MAX(no) as maxno FROM menu";
		try {
			con = DBCon.con();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				result = rs.getInt("maxno");
			}
		} catch (SQLException e) {
			System.out.println("DB 관련 오류: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 오류: " + e.getMessage());
		} finally {
			DBCon.close(rs, pstmt, con);
		}
		return result;
	}
*/
	// 게시물 등록
	public static int InsertBoard(Board ins) {
		int insCnt = 0;
		String sql = "INSERT INTO pet_board " + "values(?,?,?,?,?)";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setInt(1, ins.getNo());
			pstmt.setString(2, ins.getTitle());
			pstmt.setString(3, ins.getImg());
			pstmt.setString(4, ins.getContent());
			pstmt.setInt(5, ins.getLikes());
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

	// 메뉴 수정

	public static int updateBoard(Board upt) {
		int uptCnt = 0;
		String sql = "UPDATE pet_board " + 
					"SET no=?,"
					+ "title = ?,\r\n" 
					+ "img = ?,\r\n" 
					+ "content=?,\r\n"
					+ "likes = ?,\r\n" 
					+ "WHERE id = ? ";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setInt(1, upt.getNo());
			pstmt.setString(2, upt.getTitle());
			pstmt.setString(3, upt.getImg());
			pstmt.setString(4, upt.getContent());
			pstmt.setInt(5, upt.getLikes());
			pstmt.setString(6, upt.getId());
			uptCnt = pstmt.executeUpdate();
			if (uptCnt == 0) {
				System.out.println("수정 실패");
				con.rollback();
			} else {
				con.commit(); // Commit the transaction
				System.out.println("수정 성공");
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}

		return uptCnt;
	}

	// 메뉴삭제
	public int deleteBoard(String name) {
		int delCnt = 0;
		String sql = "delete from menu where name=?";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setString(1, name);
			delCnt = pstmt.executeUpdate();
			if (delCnt == 0) {
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

		return delCnt;
	}

	

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		System.out.println(dao.getComList().size());
//		 for(Menu memu:dao.getMenuList()) {
//			System.out.print(memu.getNo()+"\t");
//			System.out.print(memu.getCategory()+"\t");
//			System.out.print(memu.getName()+"\t");
//			System.out.print(memu.getPrice()+"\t");
//			System.out.print(memu.getDetail()+"\n");
		// }

	}
}
