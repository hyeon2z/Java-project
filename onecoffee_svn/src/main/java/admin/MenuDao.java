package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import admin.vo.*;
import db.DBCon;



public class MenuDao {
	   private Connection con;
	    private PreparedStatement pstmt;
	    private ResultSet rs;

	
//	SELECT * FROM memu
//	no ORDER BY;

	
// 메뉴 조회
	public Menu getMenu(int no) {
		Menu menu = null;
		String sql = "SELECT * \r\n" + "FROM menu\r\n" + "WHERE no=? ";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setInt(1, no);
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				if (rs.next()) {
					menu = new Menu(rs.getInt("no"), rs.getString("category"), 
							rs.getString("id"), rs.getString("drink_type"),
							rs.getInt("price"), rs.getString("datail"));
				}
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}

		return menu;
	}
	
	
// 메뉴 리스트 조회
	 
	    public List<Menu> getMenuList() {
		    List<Menu> mlist = new ArrayList<>();
		    String sql = "SELECT * FROM menu order by no";
		    
		    try {
		        con = DBCon.con();
		        pstmt = con.prepareStatement(sql); 
		        rs = pstmt.executeQuery();
		
		        while (rs.next()) {
		            mlist.add(new Menu(
		                    rs.getInt("no"),
		                    rs.getString("category"),
		                    rs.getString("name"),
		                    rs.getString("drink_type"),
		                    rs.getInt("price"),
		                    rs.getString("detail")
		            ));
		        }
		    } catch (SQLException e) {
		        System.out.println("DB 관련 오류: " + e.getMessage());
		    } catch (Exception e) {
		        System.out.println("일반 오류: " + e.getMessage());
		    } finally {
		    	DBCon.close(rs, pstmt, con);
		    }
		    return mlist;
		}

		
//메뉴 등록	    
		public static int getMenuList(Menu ins) {
			int insCnt = 0;
			String sql = "INSERT INTO menu "
					+ "values(?,?,?,?,?,?)";
			try (Connection con = DBCon.con(); 
				PreparedStatement pstmt = con.prepareStatement(sql);
					) {con.setAutoCommit(false);
				// 처리코드1
				pstmt.setInt(1, ins.getNo());
				pstmt.setString(2, ins.getCategory());
				pstmt.setString(3, ins.getName());
				pstmt.setString(4, ins.getDrink_type());
				pstmt.setInt(5, ins.getPrice());
				pstmt.setString(6, ins.getDetail());
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

			
		
		
//메뉴 수정		
		
		public static int updateMenu(Menu upt) {
			int uptCnt = 0;
			String sql = "UPDATE menu\r\n" 
						+ "    SET no =?,\r\n" 
						+ "    	category = ?,\r\n" 
					+ "    	name = ?,\r\n"
					+ "    drink_type=?,\r\n" 
					+ "    	price = ?,\r\n" + 
					"    	detail = ?,\r\n"
					+ "     WHERE no = ? ";
			try (Connection con = DBCon.con(); 
					PreparedStatement pstmt = con.prepareStatement(sql);) {
				con.setAutoCommit(false);
				// 처리코드1
				pstmt.setInt(1, upt.getNo());
				pstmt.setString(2, upt.getCategory());
				pstmt.setString(3, upt.getName());
				pstmt.setString(4, upt.getDrink_type());
				pstmt.setInt(5, upt.getPrice());
				pstmt.setString(6, upt.getDetail());
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

		
		
//메뉴삭제
		public int deleteMeue(int no) {
			int delCnt = 0;
			String sql = "delete from menu where no=?";
			try (Connection con = DBCon.con(); 
					PreparedStatement pstmt = con.prepareStatement(sql);) {
				con.setAutoCommit(false);
				// 처리코드1
				pstmt.setInt(1, no);
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
	MenuDao dao = new MenuDao();
	System.out.println(dao.getMenuList().size());
//	 for(Menu memu:dao.getMenuList()) {
//		System.out.print(memu.getNo()+"\t");
//		System.out.print(memu.getCategory()+"\t");
//		System.out.print(memu.getName()+"\t");
//		System.out.print(memu.getPrice()+"\t");
//		System.out.print(memu.getDetail()+"\n");
	


			
	      
}
}
	