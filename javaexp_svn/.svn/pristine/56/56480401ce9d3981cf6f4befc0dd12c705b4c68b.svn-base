package javaexp.z02_homework.a02_oys.z03_miniProgram;


public class MovieReservation {
	// 영화 시간
	private int month;
	private int day;
	private int hour;
	private int minute;
	private Seat seat;
	
	
	public MovieReservation(int month, int day, int hour, int minute) {
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}

	public Seat getSeat() {
		return seat;
	}
	public int getSeatColumn() {
		return seat.getColumn();
	}
	public int getSeatRow() {
		return seat.getRow();
	}
	public void setSeat(int column, int row) {
		seat = new Seat(column, row);
	}
	
	public void reservationSeat(int column, int row) {
		seat.reservationSeat(column - 1, row - 1);
	}
	public boolean checkReservationSeat(int column, int row) {
		return seat.checkReservationSeat(column - 1, row - 1);
	}

	public void showMovieReservation() {
		System.out.print(month + "월 " + day + "일 / ");
		System.out.println(hour + "시 " + minute + "분");
	}

}
