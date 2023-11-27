package javaexp.z02_homework.a19_cjw.programming.games;

import java.util.Scanner;

public class Dice {
	
	private String name;
	private String how;
	
	//주사위게임에 대한 정보
	public Dice(String name, String how) {
		this.name = "~~주사위 게임~~";
		this.how = "컴퓨터가 먼저 주사위 하나 굴린다.\n"
				+ "그리고 플레이어가 주사위 두개를 굴리는데\n"
				+ "플레이어가 얻은 주사위 값이 컴퓨터가 얻은 주사위값의 배수가 되면 승리 아니면 패배이다.";
	}

	//게임 이름 불러오기
	public String getName() {
		return name;
	}
	//게임 방법 불러오기
	public String getHow() {
		return how;
	}
	
	//주사위게임 실행
	public void playDice() {
		Scanner sc1 = new Scanner(System.in);
		int comDice = (int)(Math.random()*6+1);	//컴퓨터의 주사위 굴리기
		int playerDice;
		System.out.println("주사위 굴리기(확인시 아무거나 입력)");
		String enter = sc1.nextLine();
		
		if(!enter.equals("")) {	//아무거나 입력 후 엔터키를 누르면 실행
			playerDice = ( (int)(Math.random()*6+1) + (int)(Math.random()*6+1) );	// 플레이어의 주사위 굴리기
			
			if(playerDice%comDice==0) {	//우승조건에 부합하는지 확인
				System.out.println("우승");
			}else {
				System.out.println("패배");
			}//내부 if-else문
			
			System.out.println("컴퓨터 주사위값: "+comDice);		//주사위값 공개
			System.out.println("플레이어 주사위값: "+playerDice);
			
		}else {	//그냥 엔터키를 눌러도 실행되도록 설정
			playerDice = ( (int)(Math.random()*6+1) + (int)(Math.random()*6+1) );	// 플레이어의 주사위 굴리기
			
			if(playerDice%comDice==0) {	//우승조건에 부합하는지 확인
				System.out.println("우승");
			}else {
				System.out.println("패배");
			}//내부 if-else문
			
			System.out.println("컴퓨터 주사위값: "+comDice);		//주사위값 공개
			System.out.println("플레이어 주사위값: "+playerDice);
		}//if-else문
	}//playDice 메서드
	
}//class Dice
