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
	public Board getPet(int no) {
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
						rs.getString("id"), 
						rs.getString("name"), 
						rs.getDate("time"), 
						rs.getString("title"), 
						rs.getString("img"), 
						rs.getString("content"), 
						rs.getInt("likes"),
						rs.getInt("click")
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
	public List<Board> getBoardList() {
		List<Board> blist = new ArrayList<>();
		String sql = "SELECT * FROM PET_BOARD order by no";

		try {
			con = DBCon.con();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				blist.add(new Board(
						rs.getInt("no"), 
						rs.getString("id"), 
						rs.getString("name"), 
						rs.getDate("time"), 
						rs.getString("title"), 
						rs.getString("img"), 
						rs.getString("content"), 
						rs.getInt("likes"),
						rs.getInt("click")
						));
			}
		} catch (SQLException e) {
			System.out.println("DB 관련 오류: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 오류: " + e.getMessage());
		} finally {
			DBCon.close(rs, pstmt, con);
		}
		return blist;
	}

	// no 최대값을 가져오기
	public int getMaxNo() {
		int result = 0;
		String sql = "SELECT MAX(no) as maxno FROM pet_board";
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
	
	// 게시물 등록
	public static int InsertBoard(Board ins) {
		int insCnt = 0;
		String sql = "INSERT INTO pet_board " + "values(?,?,?,?,?,?,?,?,?)";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setInt(1, ins.getNo());
			pstmt.setString(2, ins.getId());
			pstmt.setString(3, ins.getName());
			pstmt.setDate(4, ins.getTime());
			pstmt.setString(5, ins.getTitle());
			pstmt.setString(6, ins.getImg());
			pstmt.setString(7, ins.getContent());
			pstmt.setInt(8, ins.getLikes());
			pstmt.setInt(9, ins.getClick());
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
		String sql = "update pet_board set title = ?, img = ?, content=? where no=? and id = ? ";
		System.out.println("수정 start ");
		try (Connection con = DBCon.con(); 
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setString(1, upt.getTitle());
			pstmt.setString(2, upt.getImg());
			pstmt.setString(3, upt.getContent());
			pstmt.setInt(4, upt.getNo());
			pstmt.setString(5, upt.getId());
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
	
	//조회
	public static int hit(int no) {
		int uptCnt = 0;
		String sql = "update pet_board set click = click+1 where no=?";
		System.out.println("수정 start ");
		try (Connection con = DBCon.con(); 
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setInt(1, no);
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
	
	//조회
		public static int hit2(int no) {
			int uptCnt2 = 0;
			String sql = "update pet_board set likes = likes+1 where no=?";
			System.out.println("수정 start ");
			try (Connection con = DBCon.con(); 
					PreparedStatement pstmt = con.prepareStatement(sql);) {
				con.setAutoCommit(false);
				// 처리코드1
				pstmt.setInt(1, no);
				uptCnt2 = pstmt.executeUpdate();
				if (uptCnt2 == 0) {
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

			return uptCnt2;
		}
	

	// 메뉴삭제
	public int deleteBoard(int no,String id) {
		int delCnt = 0;
		String sql = "delete from pet_board where no=? and id=?";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setInt(1, no);
			pstmt.setString(2, id);
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
		System.out.println(dao.getBoardList().size());
		 for(Board blist:dao.getBoardList()) {
			System.out.print(blist.getNo()+"\t");
			System.out.print(blist.getId()+"\t");
			System.out.print(blist.getName()+"\t");
			System.out.print(blist.getTime()+"\t");
			System.out.print(blist.getTitle()+"\n");
			System.out.print(blist.getImg()+"\n");
			System.out.print(blist.getContent()+"\n");
			System.out.print(blist.getLikes()+"\n");
			System.out.print(blist.getClick()+"\n");
		 }

	}
}
