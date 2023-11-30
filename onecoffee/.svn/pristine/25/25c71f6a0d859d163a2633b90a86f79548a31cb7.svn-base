package order_sol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import db.DBCon;

public class Orderdao {

	public List<Beverage> getBevList(Beverage sch) {

		// 메뉴 선택 메서드
		List<Beverage> bevList = new ArrayList<Beverage>();
		String sql = "SELECT *\r\n" + "FROM BEVERAGE WHERE CASE WHEN kind = ? THEN kind\r\n"
				+ "WHEN type = UPPER(?) THEN type WHEN name LIKE ? THEN name ELSE NULL\r\n"
				+ "END IS NOT NULL order by no";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, sch.getKind());
			pstmt.setString(2, sch.getType());
			pstmt.setString(3, "%" + sch.getName() + "%");

			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				while (rs.next()) {
					bevList.add(new Beverage(rs.getInt("no"), rs.getString("kind"), rs.getString("type"),
							rs.getString("name"), rs.getInt("price"), rs.getInt("cnt")));
				}
				System.out.println("건수:" + bevList.size());
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}

		return bevList;
	}
	
	/*
INSERT INTO carttest SELECT * FROM BEVERAGE
WHERE CASE WHEN kind = ? THEN kind WHEN type = UPPER(?) THEN type WHEN name LIKE ? THEN name
ELSE NULL END IS NOT NULL ORDER BY no; 
	 * */
	// 장바구니 추가 메서드
	public List<Beverage> insertCartList(Beverage ins) {

		// 메뉴 츨략 메서드
		List<Beverage> cartList = new ArrayList<Beverage>();
		int insCnt = 0;
		String sql = "INSERT INTO carttest SELECT * FROM BEVERAGE "
		        + "WHERE "
		        + "CASE WHEN kind = ? THEN kind "
		        + "WHEN type = UPPER(?) "
		        + "THEN type WHEN name LIKE ? "
		        + "THEN name "
		        + "ELSE NULL END IS NOT NULL ORDER BY no";
		try (Connection con = DBCon.con();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setString(1, ins.getKind());
			pstmt.setString(2, ins.getType());
			pstmt.setString(3, "%"+ins.getName()+"%");
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
		return cartList;
	}
	
	// 장바구니 삭제 기능 메서드
	/*
	DELETE FROM carttest
	 * */
	public int deleteCart() {
		int delCnt = 0;
		String sql = "DELETE FROM carttest";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
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

	
	
	// 장바구니 수량 증가 메서드
	//UPDATE carttest SET cnt= cnt+1 WHERE NO=?;
	public int plusCnt(int no) {
		int uptCnt = 0;
		String sql = "UPDATE carttest SET cnt= cnt+1 WHERE NO=?";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setInt(1, no);
			uptCnt = pstmt.executeUpdate();
			if (uptCnt == 0) {
				System.out.println("CUD 실패");
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

		return uptCnt;
	}
	
	// 장바구니 수량 감소 메서드
		//UPDATE carttest SET cnt= cnt-1 WHERE NO=?;
		public int minusCnt(int no) {
			int uptCnt = 0;
			String sql = "UPDATE carttest SET cnt= cnt-1 WHERE NO=?";
			try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
				con.setAutoCommit(false);
				// 처리코드1
				pstmt.setInt(1, no);
				uptCnt = pstmt.executeUpdate();
				if (uptCnt == 0) {
					System.out.println("CUD 실패");
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

			return uptCnt;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orderdao dao = new Orderdao();

//		for (Beverage b01 : dao.insertCartList(new Beverage(" ", "ice", " "))) {
//			System.out.print(b01.getNo() + "\t");
//			System.out.print(b01.getKind() + "\t");
//			System.out.print(b01.getType() + "\t");
//			System.out.print(b01.getName() + "\t");
//			System.out.print(b01.getPrice() + "\t");
//			System.out.print(b01.getCnt() + "\n");
//		}
		dao.deleteCart();
		
		for (Beverage b01 : dao.getBevList(new Beverage(" ", "ice", " "))) {
			System.out.print(b01.getNo() + "\t");
			System.out.print(b01.getKind() + "\t");
			System.out.print(b01.getType() + "\t");
			System.out.print(b01.getName() + "\t");
			System.out.print(b01.getPrice() + "\t");
			System.out.print(b01.getCnt() + "\n");
		}
	}

}
