package chat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import chat.vo.Chat;
import db.DBCon;
import user.UserDao;
import user.Users;

public class ChatDao {
	UserDao userDao = new UserDao();
	
	// 자신과 관련된 채팅 전부 불러오기
	public List<Chat> getChatList(Users user) {
		List<Chat> chatList = new ArrayList<Chat>();
		String sql = "SELECT *\r\n"
				+ "FROM CHAT\r\n"
				+ "WHERE user01 = ? OR user02 = ?";
		
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserId());
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					chatList.add(new Chat(rs.getInt("chatnum"),
								rs.getString("chat"),
								userDao.getUser(rs.getString("user01")),
								userDao.getUser(rs.getString("user02")),
								rs.getDate("sendtime")));
				}
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}
		
		return chatList;
	}

}
