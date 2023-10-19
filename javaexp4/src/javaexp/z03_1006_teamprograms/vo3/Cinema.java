package javaexp.z03_1006_teamprograms.vo3;

import java.util.Scanner;

public class Cinema {
	private String[] cinemaList;
	int cinemaChoice;
	Scanner sc = new Scanner(System.in);
	
	public Cinema() {}
	
	public Cinema(String[] cinemaList) {
		this.cinemaList = cinemaList;
	}
	
	public int cinemaSelect() {
		System.out.println();
		while(true) { // 좌석선택
			for(int i = 0; i < cinemaList.length; i ++) { 
				System.out.println((i + 1) + ") " + cinemaList[i]); // 영화관 출력
			}
			
			System.out.print("상영을 희망하는 영화관을 선택하세요 : "); // 영화관 출력이 끝났을 때
			
			try {	
				cinemaChoice = Integer.parseInt(sc.nextLine()); // 상영관 저장		
				if(cinemaChoice > 0 && cinemaChoice <= cinemaList.length) {
					break;
				}else { // 순번이 잘못된 경우
					System.out.println("잘못된 입력입니다. 다시 입력하세요");
				} // 맞게적은지 아닌지 조건문 틀리게고르면 다시반복	
			} catch(NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}

		} // while 끝
		return cinemaChoice;
	} // 영화관선택 끝
	
	public int cinemaSelectResult() {
		return cinemaChoice;
	}
	
}
