package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import db.DBCon;
import login.vo.Member;

public class MemListDao {
	   private Connection con;
	    private PreparedStatement pstmt;
	    private ResultSet rs;
	    
	  public List<Member> getMemList() {
		    List<Member> mlist = new ArrayList<>();
		    String sql = "SELECT name,id,phonenum,address,point FROM member "
		    		+ "order by name";
		    
		    try {
		        con = DBCon.con();
		        pstmt = con.prepareStatement(sql); 
		        rs = pstmt.executeQuery();
		
		        while (rs.next()) {
		            mlist.add(new Member(
							rs.getString("name"),
							rs.getString("id"),
							rs.getString("phonenum"),
							rs.getString("address"),
							rs.getInt("point")
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
			// TODO Auto-generated method stub
			
			MemListDao dao = new MemListDao();
			System.out.println(dao.getMemList().size());

		}
	      
}
	
