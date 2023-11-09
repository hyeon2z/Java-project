package javaexp.z04_project02;

import java.util.Date;

public class TrainReservation {
	private String traintype; // 열차종류
	private String tno; // 열차번호
	private String departstation; // 출발역
	private Date starttime; // 출발시간
	private String arrivalstation; // 도착역
	private Date endtime; // 도착시간
	private String duration; // 소요시간
	private int price; // 가격
	private String seatinfo; // 좌석정보
	public TrainReservation() {
		// TODO Auto-generated constructor stub
	}
	public TrainReservation(String traintype, String tno, String departstation, Date starttime, String arrivalstation,
			Date endtime, String duration, int price, String seatinfo) {
		this.traintype = traintype;
		this.tno = tno;
		this.departstation = departstation;
		this.starttime = starttime;
		this.arrivalstation = arrivalstation;
		this.endtime = endtime;
		this.duration = duration;
		this.price = price;
		this.seatinfo = seatinfo;
	}
	public String getTraintype() {
		return traintype;
	}
	public void setTraintype(String traintype) {
		this.traintype = traintype;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getDepartstation() {
		return departstation;
	}
	public void setDepartstation(String departstation) {
		this.departstation = departstation;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public String getArrivalstation() {
		return arrivalstation;
	}
	public void setArrivalstation(String arrivalstation) {
		this.arrivalstation = arrivalstation;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSeatinfo() {
		return seatinfo;
	}
	public void setSeatinfo(String seatinfo) {
		this.seatinfo = seatinfo;
	}
}
