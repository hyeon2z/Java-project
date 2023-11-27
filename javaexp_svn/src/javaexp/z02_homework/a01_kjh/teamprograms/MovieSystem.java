package javaexp.z02_homework.a01_kjh.teamprograms;

import java.util.Scanner;

import javaexp.z02_homework.a01_kjh.teamprograms.vo.Cinema;
import javaexp.z02_homework.a01_kjh.teamprograms.vo.MovieDate;
import javaexp.z02_homework.a01_kjh.teamprograms.vo.MovieList;
import javaexp.z02_homework.a01_kjh.teamprograms.vo.MovieSeat;
import javaexp.z02_homework.a01_kjh.teamprograms.vo.MovieTime;
import javaexp.z02_homework.a01_kjh.teamprograms.vo.ReservationSystem;

public class MovieSystem {

	public static void main(String[] args) {
		String[] movieList = {"30일", "화사한그녀", "화란", "크리에이터", "1947보스톤", "그란투리스모"};
		String[] cinemaList = {"강남", "건대입구", "용산아이파크몰", "여의도", "홍대"};
		String[] movieDateList = {"23-10-10", "23-10-11", "23-10-12", "23-10-13", "23-10-14", "23-10-15"};
		String[] movieTimeList = {"08:15", "10:10", "13:40", "15:20", "19:45"};
		
		
		Scanner sc = new Scanner(System.in);
		
		MovieList mvlist = new MovieList(movieList);
		Cinema cinelist = new Cinema(cinemaList);
		MovieDate mvdate = new MovieDate(movieDateList);
		MovieTime mvtime = new MovieTime(movieTimeList);
		MovieSeat mvseat = new MovieSeat(7, 10);
		ReservationSystem resersys = new ReservationSystem();
		
		System.out.println("=======영화 예매 시스템=======");
		System.out.println("현재 상영중인 영화목록");
		
		mvlist.movieSelect();
		cinelist.cinemaSelect();
		mvdate.movieDateSelect();
		mvtime.movieTimeSelect();
				
		mvseat.printSeatList();
		mvseat.seatReservation();
		mvseat.seatStatus();		
		
		System.out.println("\n##선택하신 내용입니다##\n");
		System.out.println("영화 : " + movieList[mvlist.movieSelectResult() -1]);
		
		System.out.println("상영관 : " + cinemaList[cinelist.cinemaSelectResult() -1]);
		
		System.out.println("상영날짜 : " + movieDateList[mvdate.movieDateSelectResult() -1]);
		
		System.out.println("상영시간 : " + movieTimeList[mvtime.movieTimeSelectResult() -1]);
		mvseat.usrSeat();
		
		resersys.isConfirm();
	}
}