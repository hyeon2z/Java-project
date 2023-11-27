package javaexp.z02_homework.a19_cjw.programming.games;

import java.util.Scanner;

public class CorrectNum {

	private String name;
	private String how;
	
	//숫자맞추기 게임에 대한 정보
	public CorrectNum(String name, String how) {
		this.name = "~~숫자맞추기~~";
		this.how = "1~100사이의 임의의 수를 맞추는 게임";
	}
	
	//게임 이름 불러오기
	public String getName() {
		return name;
	}
	//게임 방법 불러오기
	public String getHow() {
		return how;
	}
	
	//숫자맞추기 실행
	public void playCorrectNum() {
		Scanner sc1 = new Scanner(System.in);
		int rdNum = (int)(Math.random()*100+1);	//컴퓨터가 낼 임의의 숫자 할당
		
		while(true) {		//숫자를 맞출 때까지 입력받기
			System.out.print("숫자 입력(1~100): ");
			int inputnum = (int)Integer.parseInt(sc1.nextLine());
			//숫자를 맞추면 입력받기가 종료된다.
			if(inputnum==rdNum) {
				System.out.println(inputnum+" 정답!");
				break;
			}else {
				System.out.print("오답");
				//숫자를 맞추지 못하면 컴퓨터의 숫자보다 큰지 작은지 힌트를 준다.
				if(inputnum>rdNum) {
					System.out.println("\thint) "+inputnum+"보다 아래");
				}else {
					System.out.println("\thint) "+inputnum+"보다 위");
				}//if-else문
			}//if-else문(while문 종료 조건)
		}//while문
	}//playCorrectNum 메서드
	
}//class CorrectNum
