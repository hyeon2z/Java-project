package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import admin.vo.*;
import db.DBCon;

public class NoticeDao {

//	SELECT * FROM notice order by NO;
		
		    private Connection con;
		    private PreparedStatement pstmt;
		    private ResultSet rs;

		    public List<Notice> getNoticeList() {
			    List<Notice> nlist = new ArrayList<>();
			    String sql = "SELECT * FROM notice order by NO desc";
			    
			    try {
			        con = DBCon.con();
			        pstmt = con.prepareStatement(sql); 
			        rs = pstmt.executeQuery();
			
			        while (rs.next()) {
			            nlist.add(new Notice(
			                    rs.getInt("no"),
			                    rs.getString("title"),
			                    rs.getString("content"),
			                    rs.getDate("adddate")
			            ));
			        }
			    } catch (SQLException e) {
			        System.out.println("DB 관련 오류: " + e.getMessage());
			    } catch (Exception e) {
			        System.out.println("일반 오류: " + e.getMessage());
			    } finally {
			    	DBCon.close(rs, pstmt, con);
			    }
			    return nlist;
			}

			public static void main(String[] args) {
				NoticeDao dao = new NoticeDao();
				System.out.println(dao.getNoticeList().size());
				for(Notice memu:dao.getNoticeList()) {
					System.out.print(memu.getNo()+"\n");
					System.out.print(memu.getTitle()+"\n");
					System.out.print(memu.getContent()+"\n");
					System.out.print(memu.getAdddate()+"\n");
				}
			}
		}
			
