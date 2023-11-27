package javaexp.z02_homework.a19_cjw.programming.games;

import java.util.Scanner;

public class Gugudan {

	private String name;
	private String how;
	
	//구구단 게임에 대한 정보
	public Gugudan(String name, String how) {
		super();
		this.name = "~~구구단 게임~~";
		this.how = "컴퓨터가 구구단 5문제를 낸다\n"
				+ "플레이어가 3문제 이상 맞추면 우승";
	}

	//게임 이름 불러오기
	public String getName() {
		return name;
	}
	//게임 방법 불러오기
	public String getHow() {
		return how;
	}
	
	//구구단게임 실행
	public void playGugudan() {
		Scanner sc1 = new Scanner(System.in);
		int correctNum = 0;	//정답횟수 카운트용 변수
		
		for(int cnt=1;cnt<=5;cnt++) {	//5문제 제출할 것이므로 5번 반복
			//곱셈할 임의의 수 지정
			int num1 = (int)(Math.random()*9+1);	
			int num2 = (int)(Math.random()*9+1);
			//문제 제출 밑 정답 입력
			System.out.println(num1+" x "+num2+" = ?");
			System.out.print("정답: ");
			int num3 = Integer.parseInt(sc1.nextLine());
			
			if(num3==(num1*num2)) {	//정답확인
				System.out.println((num1*num2)+" 정답!");
				correctNum++;
			}else {
				System.out.println(num3+"오답!\n"
						+ "정답은 "+(num1*num2));
			}//if-else문
		}//for문
		
		if(correctNum>=3) {	//우승여부 확인
			System.out.println(correctNum+"회 정답");
			System.out.println("우승!");
		}else {
			System.out.println(correctNum+"회 정답");
			System.out.println("패배");
		}//if-else문
	}//playGugudan 메서드
	
}//class Gugudan
