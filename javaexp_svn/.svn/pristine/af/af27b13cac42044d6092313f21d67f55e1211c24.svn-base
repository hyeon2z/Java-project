package javaexp.z02_homework.a01_kjh.teamprograms.vo;

import java.util.Scanner;

public class MovieList {
	private String[] movieList;
	int movchoice;
	Scanner sc = new Scanner(System.in);
	
	public MovieList() {}
	
	public MovieList(String[] movieList) {
		this.movieList = movieList;
	}
	
	public int movieSelect() {
		
		while(true) { // 영화순번 잘 될때까지 반복하는 while문
			for(int i = 0; i < movieList.length; i ++) { 
				System.out.println((i + 1) + ") " + movieList[i]); // 영화목록출력
			}
			
			System.out.print("희망하는 영화의 순번을 입력하세요 : "); // 영화목록 출력이 끝났을 때
			
			try {	
				movchoice = Integer.parseInt(sc.nextLine()); // 순번저장		
				if(movchoice > 0 && movchoice <= movieList.length) {
					break;
				}else { // 순번이 잘못된 경우
					System.out.println("잘못된 순번입니다.");
				} // 맞게적은지 아닌지 조건문 틀리게고르면 다시반복	
			} catch(NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}

		} // while 끝
		return movchoice;
	} // movieSelect 끝
	
	public int movieSelectResult() {
		return movchoice;
	}
	
} // class 끝
