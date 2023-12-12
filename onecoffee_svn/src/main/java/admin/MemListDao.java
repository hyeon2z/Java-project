package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import admin.vo.Menu;
import db.DBCon;
import login.vo.Member;

public class MemListDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<Member> getMemList(String name) { // name 변수명으로 값을 넘겨받음 
		List<Member> mlist = new ArrayList<>();
		String where = "";
		if(name != "") {
			where = " where name LIKE ? ";
		}
		String sql = "SELECT name,id,phonenum,address,point FROM member " + where + " order by name";
		//System.out.println(sql);
		try {
			con = DBCon.con();
			pstmt = con.prepareStatement(sql);
			if(where != "") {
				pstmt.setString(1, "%" + name + "%"); // name 변수값을 쿼리문으로 넘겨받음 
			}
			rs = pstmt.executeQuery(); // 쿼리 실행문 

			while (rs.next()) {
				mlist.add(new Member(rs.getString("name"), rs.getString("id"), rs.getString("phonenum"),
						rs.getString("address"), rs.getInt("point")));
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
		MemListDao dao = new MemListDao();

		for (Member m : dao.getMemList("근")) {
			System.out.println(m.getName());

		}

	}
}
