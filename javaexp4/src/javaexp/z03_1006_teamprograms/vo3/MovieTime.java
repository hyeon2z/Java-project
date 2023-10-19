package javaexp.z03_1006_teamprograms.vo3;

import java.util.Scanner;

public class MovieTime {
	private String[] movieTimeList;
	int movieTimeChoice;
	Scanner sc = new Scanner(System.in);
	
	public MovieTime() {}
	
	public MovieTime(String[] movieTimeList) {
		this.movieTimeList = movieTimeList;
	}
	
	public int movieTimeSelect() {
		System.out.println();
		while(true) { // 시간선택
			for(int i = 0; i < movieTimeList.length; i ++) { 
				System.out.println((i + 1) + ") " + movieTimeList[i]); // 상영시간 출력
			}
			
			System.out.print("상영을 희망하는 시간을 골라주세요 : "); // 시간 출력이 끝났을 때
			
			try {	
				movieTimeChoice = Integer.parseInt(sc.nextLine()); // 상영시간 저장		
				if(movieTimeChoice > 0 && movieTimeChoice <= movieTimeList.length) {
					break;
				}else { // 시간이 잘못된 경우
					System.out.println("잘못된 입력입니다. 다시 입력하세요");
				} // 맞게적은지 아닌지 조건문 틀리게고르면 다시반복	
			} catch(NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}

		} // while 끝
		return movieTimeChoice;
	} // 시간선택 끝
	
	public int movieTimeSelectResult() {
		return movieTimeChoice;
	}
}
