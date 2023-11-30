package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DBCon;
import login.vo.CreateAccount;

public class CreateMemDao {
// terms 관련 db에 number로 저장? 
		public int CreateAccount(CreateAccount ins) {
		int insCnt = 0; // db 몇 행에 업데이트인지 저장하기위함
		String sql = "";
		try (Connection con = DBCon.con();
	            PreparedStatement pstmt = con.prepareStatement(sql);) {
	            con.setAutoCommit(false);
	         // 내가 처리할 처리코드 1				
	            pstmt.setString(1,ins.getName());
	            pstmt.setString(2,ins.getId());
	            pstmt.setString(3,ins.getPwd());
	            pstmt.setString(4,ins.getPhoneNumber());
	            pstmt.setString(5,ins.getAddress());
	            pstmt.setString(6,ins.getPwdAnswer());
	            pstmt.setString(6,ins.getTerms());
	            
	            insCnt = pstmt.executeUpdate(); // db 업데이트한 행에 따라 그 행 숫자를 반환
	            if(insCnt==0) { // 실패하면 0 반환
	            	System.out.println("등록 실패");
	            	con.rollback();
	            }else {
	            	con.commit();
	            	System.out.println("등록 성공");
	            }
	         } catch (SQLException e) {
	            System.out.println("DB에러 : " + e.getMessage());
	            //con.rollback;
	         } catch (Exception e) {
	            System.out.println("일반에러 : " + e.getMessage());
	         }
		return insCnt;
	}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		}}
