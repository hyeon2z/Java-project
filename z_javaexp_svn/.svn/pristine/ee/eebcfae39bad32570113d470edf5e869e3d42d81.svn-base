package javaexp.z02_homework.a01_kjh.teamprograms.vo;

import java.util.Scanner;

public class MovieDate {
	private String[] movieDateList;
	int movieDateChoice;
	Scanner sc = new Scanner(System.in);
	
	public MovieDate() {}
	
	public MovieDate(String[] movieDateList) {
		this.movieDateList = movieDateList;
	}
	
	public int movieDateSelect() {
		System.out.println();
		while(true) { // 좌석선택
			for(int i = 0; i < movieDateList.length; i ++) { 
				System.out.println((i + 1) + ") " + movieDateList[i]); // 상영시간 출력
			}
			
			System.out.print("상영을 희망하는 날짜를 선택하세요 : "); // 시간 출력이 끝났을 때
			
			try {	
				movieDateChoice = Integer.parseInt(sc.nextLine()); // 상영시간 저장		
				if(movieDateChoice > 0 && movieDateChoice <= movieDateList.length) {
					break;
				}else { // 시간이 잘못된 경우
					System.out.println("잘못된 입력입니다. 다시 입력하세요");
				} // 맞게적은지 아닌지 조건문 틀리게고르면 다시반복	
			} catch(NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}

		} // while 끝
		return movieDateChoice;
	} // 시간선택 끝
	
	public int movieDateSelectResult() {
		return movieDateChoice;
	}
	
}
