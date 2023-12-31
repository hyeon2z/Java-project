package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBCon;
import user.Users;

public class UserManageDao {
	public List<Users> searchUsers(String query) {
	    List<Users> userList = new ArrayList<>();
	    String sql = "SELECT * FROM users WHERE role = 'user' AND (userid LIKE ? OR name LIKE ? OR username LIKE ?) ORDER BY joindate";
	    
	    try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
	        String searchQuery = "%" + query + "%"; 
	        // 하나의 input 값에서 아이디, 이름, 닉네임으로 검색이 가능하게 구성
	        pstmt.setString(1, searchQuery);
	        pstmt.setString(2, searchQuery);
	        pstmt.setString(3, searchQuery);
	        
	        try (ResultSet rs = pstmt.executeQuery();) {
	            while (rs.next()) {
	                userList.add(new Users(
	                        rs.getString("userId"),
	                        rs.getString("name"),
	                        rs.getString("username"),
	                        rs.getString("phoneNumber"),
	                        rs.getString("subStatus"),
	                        rs.getString("joinDate")
	                ));
	            }
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 에러:" + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("일반 에러:" + e.getMessage());
	    }
	    return userList;
	}
}
