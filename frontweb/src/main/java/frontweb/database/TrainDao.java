package frontweb.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import frontweb.Train;
import frontweb.dao.DB;

public class TrainDao {
	
	
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public List<Train> getTrainList(String traintype) {
	    List<Train> tlist = new ArrayList<>();
	    String sql = "SELECT * FROM TRAINRESERVATION\r\n"
	    		+"WHERE traintype LIKE '%"+traintype+"%'";
	    
	    try {
	        con = DB.con();
	        pstmt = con.prepareStatement(sql); 
	        rs = pstmt.executeQuery();
	
	        while (rs.next()) {
	            tlist.add(new Train(
	                    rs.getString("traintype"),
	                    rs.getString("tno"),
	                    rs.getString("departstation"),
	                    rs.getDate("starttime"),
	                    rs.getString("arrivalstation"),
	                    rs.getDate("endtime"),
	                    rs.getString("duration"),
	                    rs.getInt("price"),
	                    rs.getString("seatinfo")
	            ));
	        }
	    } catch (SQLException e) {
	        System.out.println("DB 관련 오류: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("일반 오류: " + e.getMessage());
	    } finally {
	        DB.close(rs, pstmt, con);
	    }
	    return tlist;
	}


	public static void main(String[] args) {
		TrainDao dao = new TrainDao();
		System.out.println(dao.getTrainList(null).size());
		for(Train train:dao.getTrainList(null)) {
			System.out.print(train.getTraintype()+"\t");
			System.out.print(train.getTno()+"\t");
			System.out.print(train.getDepartstation()+"\t");
			System.out.print(train.getStarttime()+"\n");
			System.out.print(train.getArrivalstation()+"\n");
			System.out.print(train.getEndtime()+"\n");
			System.out.print(train.getDuration()+"\n");
			System.out.print(train.getPrice()+"\n");
			System.out.print(train.getSeatinfo()+"\n");
		}
	}
	
	
}