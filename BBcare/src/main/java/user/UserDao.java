package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import db.DBCon;

import java.sql.ResultSet;



// user.UserDao
public class UserDao {
	
	
	/*
	INSERT INTO USERS (userno, UserID, Name, Username, Password, Address, PhoneNumber, PetStatus, SubStatus, SubDate, Role)
	VALUES (seq_sol01.nextval, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?);
	 * */
	// 유저 회원가입(회원등록) dao
	public int insertUser(Users ins) {
		int insCnt =0;
		String sql = "INSERT INTO USERS (userno, UserID, Name, Username, Password,Email, Address, PhoneNumber, PetStatus, SubStatus, SubDate, Role)\r\n"
				+ "	VALUES (seq_sol01.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?)";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setString(1, ins.getUserId());
			pstmt.setString(2, ins.getName());
			pstmt.setString(3, ins.getUserName());
			pstmt.setString(4, ins.getPassword());
			pstmt.setString(5, ins.getEmail());
			pstmt.setString(6, ins.getAddress());
			pstmt.setString(7, ins.getPhoneNumber());
			pstmt.setString(8, ins.getPetStatus());
			pstmt.setString(9, ins.getSubStatus());
			  // 'NULL' 문자열이 아니라 직접 null 값을 설정
		    if (ins.getSubDate() != null) {
		        pstmt.setString(10, ins.getSubDate());
		    } else {
		        pstmt.setNull(10, Types.DATE);
		    }
			pstmt.setString(11, ins.getRole());
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
	
	// 아이디 중복체크
	public boolean ckUserId(String userId) {
		boolean hasId=false;
		String sql = "SELECT * FROM users WHERE userId=? ";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, userId);
			try (ResultSet rs = pstmt.executeQuery();) {
				hasId = rs.next();
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}		
		return hasId;
	}
	
	// 이메일 중복체크
	public boolean ckEmail(String email) {
		boolean hasEmail=false;
		String sql = "SELECT * FROM users WHERE email=? ";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, email);
			try (ResultSet rs = pstmt.executeQuery();) {
				hasEmail = rs.next();
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}		
		return hasEmail;
	}
	
	// 닉네임 중복체크
	public boolean ckUserName(String userName) {
		boolean hasUserName=false;
		String sql = "SELECT * FROM users WHERE username=? ";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, userName);
			try (ResultSet rs = pstmt.executeQuery();) {
				hasUserName = rs.next();
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}		
		return hasUserName;
	}
	
	// 로그인
	public boolean login(String userId, String password) {
		boolean isLog = false;
		String sql = "SELECT * FROM users WHERE userId=? and password=? ";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				// 데이터가 있으면 true, 없으면 false
				isLog = rs.next();
				System.out.println("로그인 성공");
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
			System.out.println("로그인 실패");

		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
			System.out.println("로그인 실패");

		}

		return isLog;
	}
	
	// 관리자, 유저 역할 구분
	// SELECT ROLE FROM users WHERE userid='dlathf0202';
	public String getUserRole(String userId) {
	    String userRole = null;
	    String sql = "SELECT ROLE FROM users WHERE userid=?";

	    try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
	        pstmt.setString(1, userId);

	        try (ResultSet rs = pstmt.executeQuery();) {
	            if (rs.next()) {
	                userRole = rs.getString("role");
	            }
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 에러:" + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("일반 에러:" + e.getMessage());
	    }

	    return userRole;
	}
	
	
	// 닉네임 가져오기
		// SELECT ROLE FROM users WHERE userid='dlathf0202';
		public String getUserName(String userId) {
		    String userName = null;
		    String sql = "SELECT userName FROM users WHERE userid=?";

		    try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
		        pstmt.setString(1, userId);

		        try (ResultSet rs = pstmt.executeQuery();) {
		            if (rs.next()) {
		            	userName= rs.getString("userName");
		            }
		        }
		    } catch (SQLException e) {
		        System.out.println("DB 에러:" + e.getMessage());
		    } catch (Exception e) {
		        System.out.println("일반 에러:" + e.getMessage());
		    }

		    return userName;
		}
		
	
	// 유저 정보조회(마이페이지 출력용)
	public Users getUser(String userId) {
		Users user = null;
		String sql = "SELECT * FROM users WHERE userId=? ";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 처리코드1
			pstmt.setString(1, userId);
			try (ResultSet rs = pstmt.executeQuery();) {
				// 처리코드2
				if (rs.next()) {
					user = new Users(
							rs.getInt("userNo"),
							rs.getString("userId"),
							rs.getString("name"),
							rs.getString("userName"),
							rs.getString("password"),
							rs.getString("email"),
							rs.getString("address"),
							rs.getString("phoneNumber"),
							rs.getString("petStatus"),
							rs.getString("subStatus"),
							rs.getString("subDate"),
							rs.getString("role")
							);
				}
			}
		} catch (SQLException e) {
			System.out.println("DB 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 에러:" + e.getMessage());
		}		
		return user;
	}
	
	// 유저 회원탈퇴(마이페이지 탈퇴용) --> 등록된 강아지도 같이삭제(제약조건으로 설정)
	public int deleteUser(String userId) {
		int delCnt =0;
		String sql = "delete from users where userId = ?";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setString(1, userId);
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
	
	// 유저 정보수정(마이페이지 수정용)
	// userno, UserID, Name, Username, Password,Email, Address,
	// PhoneNumber, PetStatus, SubStatus, SubDate, Role
	public int updateUser(Users upt) {
		int uptCnt =0;
		String sql = "UPDATE Users\r\n"
				+ "		SET name = ?,\r\n"
				+ "			Username = ?,\r\n"
				+ "			Password = ?,\r\n"
				+ "			Email = ?,\r\n"
				+ "			Address = ?,\r\n"
				+ "			PhoneNumber = ?,\r\n"
				+ "			PetStatus = ?,\r\n"
				+ "			SubStatus = ?,\r\n"
				+ "			SubDate = ?,\r\n"
				+ "			Role = ?\r\n"
				+ "		WHERE UserID=? ";
		try (Connection con = DBCon.con(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			con.setAutoCommit(false);
			// 처리코드1
			pstmt.setString(1, upt.getName());
			pstmt.setString(2, upt.getUserName());
			pstmt.setString(3, upt.getPassword());
			pstmt.setString(4, upt.getEmail());
			pstmt.setString(5, upt.getAddress());
			pstmt.setString(6, upt.getPhoneNumber());
			pstmt.setString(7, upt.getPetStatus());
			pstmt.setString(8, upt.getSubStatus());
			pstmt.setString(9, upt.getSubDate());
			pstmt.setString(10, upt.getRole());
			pstmt.setString(11, upt.getUserId());

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
	
	// 구독 정보 변경()
	
	
	// 구독 날짜 등록
	
	
	// 멍멍이 등록
	
	
	// 멍멍이 수정
	
	
	// 멍멍이 삭제
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users newUser = new Users();
//        newUser.setUserId("hi01");
//        newUser.setName("임솔");
//        newUser.setUserName("하심");
//        newUser.setPassword("dla159");
//        newUser.setEmail("dla@na.com");
//        newUser.setAddress("진건오남로795");
//        newUser.setPhoneNumber("01020264701");
//        newUser.setPetStatus("Y");
//        newUser.setSubStatus("N");
//        newUser.setSubDate(null);
//        newUser.setRole("user");
//
//        // UserDao 인스턴스 생성
        UserDao dao = new UserDao();
//
//        // UserDao의 insertUser 메서드 호출
//        int result = userDao.insertUser(newUser);
//
//        // 결과 출력
//        if (result > 0) {
//            System.out.println("등록 성공");
//        } else {
//            System.out.println("등록 실패");
//        }
//    }

		dao.login("dlathf0202","dla159");
		

	

}}
