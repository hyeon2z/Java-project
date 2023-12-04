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
	
	
//	SELECT * FROM memu
//	no ORDER BY;
	
	
	    private Connection con;
	    private PreparedStatement pstmt;
	    private ResultSet rs;

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

		public static void main(String[] args) {
			MenuDao dao = new MenuDao();
			System.out.println(dao.getMenuList().size());
			for(Menu memu:dao.getMenuList()) {
				System.out.print(memu.getNo()+"\t");
				System.out.print(memu.getCategory()+"\t");
				System.out.print(memu.getName()+"\t");
				System.out.print(memu.getPrice()+"\t");
				System.out.print(memu.getDetail()+"\n");
			}
		}
	}
		