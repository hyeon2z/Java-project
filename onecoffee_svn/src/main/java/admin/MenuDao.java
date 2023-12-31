package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import admin.vo.Menu;
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
		String sql = "SELECT * FROM menu where no=? ";

	    try {
	        con = DBCon.con();
	        pstmt = con.prepareStatement(sql); 
	        pstmt.setInt(1, no);
	        rs = pstmt.executeQuery();
	
	        while (rs.next()) {
	            menu = new Menu(
	                    rs.getInt("no"),
	                    rs.getString("category"),
	                    rs.getString("name"),
	                    rs.getString("drink_type"),
	                    rs.getInt("price"),
	                    rs.getString("detail")
	            );
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 관련 오류: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("일반 오류: " + e.getMessage());
	    } finally {
	    	DBCon.close(rs, pstmt, con);
	    }

		return menu;
	}
	
	
// 메뉴 리스트 조회
	 
	    public List<Menu> getMenuList() {
		    List<Menu> mlist = new ArrayList<>();
		    String sql = "SELECT * FROM menu order by category";
		    
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
		
//메뉴 등록	    
		public static int InsertMenu(Menu ins) {
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
			String sql = "UPDATE menu " 
						+ "    SET category = ?,\r\n" 
					+ "    	name = ?,\r\n"
					+ "    drink_type=?,\r\n" 
					+ "    	price = ?,\r\n" 
					+ "    	detail = ? \r\n"
					+ "     WHERE no = ? ";
			try (Connection con = DBCon.con(); 
					PreparedStatement pstmt = con.prepareStatement(sql);) {
				con.setAutoCommit(false);
				// 처리코드1
				pstmt.setString(1, upt.getCategory());
				pstmt.setString(2, upt.getName());
				pstmt.setString(3, upt.getDrink_type());
				pstmt.setInt(4, upt.getPrice());
				pstmt.setString(5, upt.getDetail());
				pstmt.setInt(6, upt.getNo());
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
		public int deleteMenu(int no) {
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
//}


			
	      
}
}
	
