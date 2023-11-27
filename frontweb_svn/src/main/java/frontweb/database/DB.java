package frontweb.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
// frontweb.database.DB
// DB.getCon()
public class DB {
	// 데이터베이스 서버 연동 처리..
	// 1. 연동 기능 메서드..
	//     1) 기본 접속정보
	private static final String 
		URL = "jdbc:oracle:thin:@localhost:1521:xe";
	//         드라이버정보:@ip:port:DB명
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	public static Connection getCon() throws SQLException {
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}
    public static Connection getJNDIConnection() throws NamingException, SQLException {
        InitialContext ctx = new InitialContext();
        DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MyOracleDB");
        return ds.getConnection();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Connection con = DB.getCon()){
			System.out.println("접속성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러발생:"+e.getMessage());
		}
		
	}

}
