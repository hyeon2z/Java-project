package javaexp.z02_homework.a02_oys.z03_miniProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTicketController {

	public static void main(String[] args) {
		
//		8. **영화 티켓 예매 시스템**:
//	    - 영화 선택, 시간 선택, 좌석 선택, 결제 기능뒫
		
		List<Movie> movies = new ArrayList<Movie>();
		List<User> users = new ArrayList<User>();
		Scanner scan = new Scanner(System.in);
		
		movies.add(new Movie("부산행", "연상호"));
		movies.get(0).setMovieTime(new MovieReservation(10, 6, 15, 20));
		movies.get(0).setMovieTime(new MovieReservation(10, 6, 18, 10));
		movies.get(0).setSeat(1, 5, 10);
		movies.get(0).setSeat(2, 3, 5);
		movies.get(0).reservationSeat(1, 2, 3);
		movies.get(0).reservationSeat(1, 5, 4);
		movies.get(0).reservationSeat(2, 3, 5);
		
		movies.add(new Movie("기생충", "봉준호"));
		movies.get(1).setMovieTime(new MovieReservation(10, 10, 9, 45));
		movies.get(1).setMovieTime(new MovieReservation(10, 11, 20, 30));
		movies.get(1).setSeat(1, 10, 10);
		movies.get(1).setSeat(2, 6, 4);
		movies.get(1).reservationSeat(1, 4, 6);
		movies.get(1).reservationSeat(1, 7, 8);
		movies.get(1).reservationSeat(2, 1, 1);
		movies.get(1).reservationSeat(2, 3, 2);
		movies.get(1).reservationSeat(2, 4, 3);
		
		users.add(new User("test", "1234", "테스트1"));
		
		User user = users.get(0);
		/*movies.get(0).setMovieTime(new MovieReservation(10, 6, 6, 10));
		movies.get(0).setMovieTime(new MovieReservation(10, 6, 7, 30));
		movies.get(0).setMovieTime(new MovieReservation(10, 7, 9, 20));
		movies.get(0).setMovieTime(new MovieReservation(10, 6, 11, 40));
		movies.get(0).setSeat(1, 5, 10);
		movies.get(0).reservationSeat(1, 2, 3);
		movies.get(0).reservationSeat(1, 2, 4);
		movies.get(0).getMovieInfo();*/
		
		// 관리자 => 영화 추가, 좌석 설정
		/*while (true) {
			System.out.println("# 관리자 #");
			System.out.println("1. 영화 추가");
			System.out.println("2. 영화 날짜 설정");
			System.out.println("3. 시간별 좌석 설정");
			System.out.println("4. 영화 리스트 확인");
			System.out.println("0. 종료");
			System.out.print("메뉴를 입력해주세요 : ");
			int managerNum = Integer.parseInt(scan.nextLine());
			System.out.println("\n------------------------\n");
			
			
			if(managerNum == 1) {
				System.out.print("영화명 : ");
				String movieTitle = scan.nextLine();
				System.out.print("감독명 : ");
				String director = scan.nextLine();
				
				movies.add(new Movie(movieTitle, director));
			
				System.out.println("\n------------------------\n");
			} else if (managerNum == 2) {
				for (int i = 0; i < movies.size(); i++) {
					System.out.println(i + 1 + " : " + movies.get(i).getMovieTitle());
				}
				System.out.print("날짜 설정할 영화 번호를 고르세요 : ");
				int movieNum = Integer.parseInt(scan.nextLine());
				Movie movie = movies.get(movieNum - 1);
				System.out.println("\n------------------------\n");
				System.out.println(movie.getMovieTitle());
				System.out.println("\n------------------------\n");
				System.out.print("달 입력 : ");
				int month = Integer.parseInt(scan.nextLine());
				System.out.print("일 입력 : ");
				int day = Integer.parseInt(scan.nextLine());
				System.out.print("시간 입력 : ");
				int hour = Integer.parseInt(scan.nextLine());
				System.out.println("분 입력 : ");
				int minute = Integer.parseInt(scan.nextLine());
				
				movie.setMovieTime(new MovieReservation(month, day, hour, minute));
			} else if (managerNum == 3) {
				for (int i = 0; i < movies.size(); i++) {
					System.out.println(i + 1 + " : " + movies.get(i).getMovieTitle());
				}
				System.out.print("시간 설정할 영화 번호를 고르세요 : ");
				int movieNum = Integer.parseInt(scan.nextLine());
				Movie movie = movies.get(movieNum - 1);
				System.out.println("\n------------------------\n");
				System.out.println(movie.getMovieTitle());
				System.out.println("\n------------------------\n");
				
				// 해당 영화에 시간이 있으면 출력, 없으면 초기 메뉴로
				if (movie.getMovieReservationList()) {
					System.out.print("좌석 설정할 시간대 : ");
					int timeNum = Integer.parseInt(scan.nextLine());
					System.out.print("행 갯수를 입력 : ");
					int column = Integer.parseInt(scan.nextLine());
					System.out.print("열 갯수를 입력 : ");
					int row = Integer.parseInt(scan.nextLine());
					
					movie.setSeat(timeNum, column, row);
				} else {
					break;
				}
				
			} else if (managerNum == 4) { 
				for (int i = 0; i < movies.size(); i++) {
					System.out.println("# 영화 정보 - " + (i + 1) + " #");
					movies.get(i).getMovieInfo();
					System.out.println("\n------------------------\n");
				}
				System.out.print("상세 확인할 영화 (뒤로가기 : 0) : ");
				int movieNum = Integer.parseInt(scan.nextLine());
				if (movieNum == 0) {
					continue;
				}
				movies.get(movieNum - 1).getMovieDetail();
			} else if (managerNum == 0) {
				break;
			}
			
		}*/
		
		// 고객 => 영화 확인, 좌석 확인, 예매 (+ 예매취소), 예약확인 => 로그인 기능 구현되면
		while (true) {
			System.out.println("1. 상영 중인 영화 확인 & 예매");
			System.out.println("2. 예매 확인");
			System.out.println("0. 종료");
			System.out.print("메뉴를 입력해주세요 : ");
			int userNum = Integer.parseInt(scan.nextLine());
			System.out.println("\n------------------------\n");
			
			if (userNum == 1) {
				for (int i = 0; i < movies.size(); i++) {
					System.out.println("# 영화 정보 - " + (i + 1) + " #");
					movies.get(i).getMovieInfo();
					System.out.println("\n------------------------\n");
				}
				System.out.print("상세 확인할 영화 (뒤로가기 : 0) : ");
				int movieNum = Integer.parseInt(scan.nextLine());
				if (movieNum == 0) {
					continue;
				}
				movies.get(movieNum - 1).getMovieDetail();
				System.out.print("이 영화로 예매하시겠습니까? (예 : 1, 아니오 : 2) : ");
				if (Integer.parseInt(scan.nextLine()) == 1) {
					// 해당 영화의 시간대 노출
					System.out.println("\n------------------------\n");
					movies.get(movieNum - 1).getMovieReservationList();
					System.out.print("예매할 시간 번호를 입력해주세요 : ");
					int timeNum = Integer.parseInt(scan.nextLine());
					movies.get(movieNum - 1).getMovieReservationWithSeat(timeNum - 1);
					System.out.println("\n------------------------\n");
					
					// 예매
					System.out.print("예매하실 자리에 열을 입력해주세요 : ");
					int column = Integer.parseInt(scan.nextLine());
					System.out.print("행을 입력해주세요 : ");
					int row = Integer.parseInt(scan.nextLine());
					
					if (movies.get(movieNum - 1).checkReservationSeat(timeNum, column, row)) {
						movies.get(movieNum - 1).reservationSeat(timeNum, column, row);
						System.out.println("예매 성공!");
						// 유저에게 정보 전달
						Movie userMovie = 
								new Movie(movies.get(movieNum - 1).getMovieTitle(), movies.get(movieNum - 1).getDirector());
						userMovie.setMovieTime(new MovieReservation(movies.get(movieNum - 1).getMovieMonth(timeNum - 1),
								movies.get(movieNum - 1).getMovieDay(timeNum - 1),
								movies.get(movieNum - 1).getMovieHour(timeNum - 1),
								movies.get(movieNum - 1).getMovieMinute(timeNum - 1)));
						userMovie.setSeat(1, movies.get(movieNum - 1).getSeatColumn(timeNum - 1)
								, movies.get(movieNum - 1).getSeatRow(timeNum - 1));
						userMovie.reservationSeat(1, column, row);
						user.reservationMovie(userMovie);
					} else {
						System.out.println("이미 예매 된 좌석입니다.");
					}
					
				} else {
					continue;
				}
				
			} else if (userNum == 2) {
				user.checkMovie();
			} else if (userNum == 0) {
				break;
			}
		}

	}

}
