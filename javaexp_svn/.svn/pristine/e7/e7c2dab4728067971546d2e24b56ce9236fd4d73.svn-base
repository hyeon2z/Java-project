package javaexp.z02_homework.a02_oys.z03_miniProgram;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	private String movieTitle;
	private String director;
	private List<MovieReservation> movieReservations;
	
	public Movie(String movieTitle, String director) {
		this.movieTitle = movieTitle;
		this.director = director;
		movieReservations = new ArrayList<MovieReservation>();
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public String getDirector() {
		return director;
	}
	public int getMovieMonth(int num) {
		return movieReservations.get(num).getMonth();
	}
	public int getMovieDay(int num) {
		return movieReservations.get(num).getDay();
	}
	public int getMovieHour(int num) {
		return movieReservations.get(num).getHour();
	}
	public int getMovieMinute(int num) {
		return movieReservations.get(num).getMinute();
	}
	public int getSeatColumn(int num) {
		return movieReservations.get(num).getSeatColumn();
	}
	public int getSeatRow(int num) {
		return movieReservations.get(num).getSeatRow();
	}
	
	
	public boolean getMovieReservationList() {
		if (movieReservations != null) {
			for(int i = 0; i < movieReservations.size(); i++) {
				System.out.print(i + 1 + " : ");
				movieReservations.get(i).showMovieReservation();
			}
			return true;
		} else {
			System.out.println("날짜 설정을 먼저 해주세요.");
			return false;
		}
	}
	
	// 예매할때 -> 시간와 자리를 출력
	public void getMovieReservationWithSeat(int timeNum) {
		movieReservations.get(timeNum).showMovieReservation();
		if (movieReservations.get(timeNum).getSeat() != null) {
			movieReservations.get(timeNum).getSeat().getSeat();
		}
	}
	
	// 관리자 -> 영화시간 설정
	public void setMovieTime (MovieReservation movieReservation) {
		movieReservations.add(movieReservation);
	}
	
	// 관리자 -> 영화 자리 설정
	public void setSeat(int num, int column, int row) {
		movieReservations.get(num - 1).setSeat(column, row);
	}
	
	// 유저 -> 자리 예매
	public void reservationSeat(int num, int column, int row) {
		movieReservations.get(num - 1).reservationSeat(column, row);
	}
	
	// 예매되어있는 자리인지 체크
	public boolean checkReservationSeat(int num, int column, int row) {
		return movieReservations.get(num - 1).checkReservationSeat(column, row);
	}
	
	// 영화 정보 (제목, 감독)
	public void getMovieInfo() {
		System.out.println("영화 타이틀 : " + movieTitle);
		System.out.println("감독 : " + director);
		
	}
	
	// 영화 정보 (제목, 감독, 시간, 자리)
	public void getMovieDetail() {
		System.out.println("영화 타이틀 : " + movieTitle);
		System.out.println("감독 : " + director);
		for(int i = 0; i < movieReservations.size(); i++) {
			System.out.print(i + 1 + " : ");
			movieReservations.get(i).showMovieReservation();
			// 자리 정보
			/*if (movieReservations.get(i).getSeat() != null) {
				movieReservations.get(i).getSeat().getSeat();
			}*/
			System.out.println("------------------------");
		}
	}
	
	public void getMoiveDetailUser() {
		System.out.println("영화 타이틀 : " + movieTitle);
		System.out.println("감독 : " + director);
		for(int i = 0; i < movieReservations.size(); i++) {
			movieReservations.get(i).showMovieReservation();
			// 자리 정보
			if (movieReservations.get(i).getSeat() != null) {
				movieReservations.get(i).getSeat().getSeat();
			}
			System.out.println("------------------------");
		}
	}
	

}
