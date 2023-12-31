package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBCon;

public class BoardDAO {

	MemberDAO memberDao = new MemberDAO();

	// 게시판 리스트 조회
	public List<Board> getBoards() {
		List<Board> boards = new ArrayList<Board>();

		String sql = "select * from board order by isNotice desc, no desc, firstDate desc";

		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {

			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				while (rs.next()) {
					boards.add(new Board(rs.getInt("no"), rs.getString("title"), rs.getString("text"),
							memberDao.getMember(rs.getInt("writer")), rs.getDate("firstDate"), rs.getBoolean("isEnd"), rs.getBoolean("isNotice")));
				}
				System.out.println("건수:" + boards.size());
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}

		return boards;
	}
	
	// 게시판 조회
	public Board getBoardByNumAndTitle(int boardNum, String title) {
		Board board = null;
		String sql = "select * from board where no = ? and title = ?";
		
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, boardNum);
			pstmt.setString(2, title);
			
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				if (rs.next()) {
					board = new Board(rs.getInt("no"), rs.getString("title"), rs.getString("text"),
							memberDao.getMember(rs.getInt("writer")) , rs.getDate("firstDate"), rs.getBoolean("isEnd"), rs.getBoolean("isNotice"));
				}
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}
		
		return board;
	}

	// 게시판 글 생성
	public void createBoard(String title, String text, int userNum) {
		String sql = "INSERT INTO board\r\n" 
				+ "(\r\n" 
				+ "	NO,\r\n" 
				+ "	title,\r\n" 
				+ "	text,\r\n" 
				+ "	writer,\r\n"
				+ "	firstdate\r\n" 
				+ ")\r\n" 
				+ "VALUES\r\n" 
				+ "(\r\n" 
				+ "	board_seq.NEXTVAL,\r\n" 
				+ "	?,\r\n" // 제목
				+ "	?,\r\n" // 본문내용
				+ "	?,\r\n" // 유저 번호
				+ "	sysdate\r\n" // 날짜
				+ ")";

		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 내가 처리할 처리코드 1
			pstmt.setString(1, title);
			pstmt.setString(2, text);
			pstmt.setInt(3, userNum);

			int insCnt = pstmt.executeUpdate(); // db 업데이트한 행에 따라 그 행 숫자를 반환
			if (insCnt == 0) { // 실패하면 0 반환
				System.out.println("등록 실패");
				con.rollback();
			} else {
				con.commit();
				System.out.println("등록 성공");
			}
		} catch (SQLException e) {
			System.out.println("DB에러 : " + e.getMessage());
			// con.rollback;
		} catch (Exception e) {
			System.out.println("일반에러 : " + e.getMessage());
		}
	}
	
	// 처리완료
	public void updateIsEnd(int boardNum) {
		String sql = "UPDATE board SET ISEND = 1 WHERE NO = ?";
		
		try (Connection con = DBCon.con(); PreparedStatement 
		pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setInt(1, boardNum);
			int uptCnt = pstmt.executeUpdate();
			if (uptCnt == 0) {
				System.out.println("CUD 실패");
				System.out.println();
				con.rollback();
			} else {
				con.commit(); // Commit the transaction
				System.out.println("CUD 성공");
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}
		
	}
	
	// 게시판 수정
	
	// 게시판 삭제
	public void deleteBoard(int boardNum, String title) {
		String sql = "DELETE FROM board\r\n"
				+ "WHERE NO = ? AND title = ?";
		
		try (Connection con = DBCon.con(); PreparedStatement 
		pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setInt(1, boardNum);
			pstmt.setString(2, title);
			
			int uptCnt = pstmt.executeUpdate();
			if (uptCnt == 0) {
				con.rollback();
			} else {
				con.commit(); // Commit the transaction
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}
	}
	
	// 공지 생성
		public void createNotice(String title, String text) {
			String sql = "INSERT INTO board\r\n"
					+ "(\r\n"
					+ "	NO,\r\n"
					+ "	title,\r\n"
					+ "	text,\r\n"
					+ "	writer,\r\n"
					+ "	firstdate,\r\n"
					+ "	isnotice\r\n"
					+ ")\r\n"
					+ "VALUES\r\n"
					+ "(\r\n"
					+ "	0,\r\n"
					+ "	?,\r\n"
					+ "	?,\r\n"
					+ "	0,\r\n"
					+ "	sysdate,\r\n"
					+ "	1\r\n"
					+ ")";

			try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
				con.setAutoCommit(false);
				// 내가 처리할 처리코드 1
				pstmt.setString(1, title);
				pstmt.setString(2, text);

				int insCnt = pstmt.executeUpdate(); // db 업데이트한 행에 따라 그 행 숫자를 반환
				if (insCnt == 0) { // 실패하면 0 반환
					System.out.println("등록 실패");
					con.rollback();
				} else {
					con.commit();
					System.out.println("등록 성공");
				}
			} catch (SQLException e) {
				System.out.println("DB에러 : " + e.getMessage());
				// con.rollback;
			} catch (Exception e) {
				System.out.println("일반에러 : " + e.getMessage());
			}
		}

}
