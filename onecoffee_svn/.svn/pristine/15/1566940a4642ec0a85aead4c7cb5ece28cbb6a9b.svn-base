package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import db.DBCon;
import admin.vo.Sal;

public class SalDao {
	    
	    public List<Sal> getSalList() {
			List<Sal> slist = new ArrayList<Sal>();
			String sql = "SELECT * FROM orderList";

			try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
				// 처리코드1

				try (ResultSet rs = pstmt.executeQuery();) {
					// 처리코드2
					while (rs.next()) {
						slist.add(new Sal(
								rs.getString("category"), 
								rs.getString("drink_Type"), 
								rs.getString("name"),
								rs.getInt("price"), 
								rs.getInt("cnt")
							));
					}
					System.out.println("건수:" + slist.size());
				}
			} catch (SQLException e) {
				System.out.println("DB 에러:" + e.getMessage());
			} catch (Exception e) {
				System.out.println("일반 에러:" + e.getMessage());
			}

			return slist;
		}
	  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			SalDao dao = new SalDao();
			System.out.println(dao.getSalList().size());

		}
	      
}
	

