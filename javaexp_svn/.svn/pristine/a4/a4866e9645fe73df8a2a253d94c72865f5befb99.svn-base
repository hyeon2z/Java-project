package javaexp.a04_process;

import java.util.Scanner;

public class A09_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 반복시, 최소한 1번을 수행하고, 반복을 중단 처리할 때 
			사용하는 구문이 do{}while(조건); 구문이다.
		2. 기본 형식
			do{
				반복수행할 내용:최소1번은 수행
			}while(반복조건);
		 * */
		// 비밀번호확인 올바른 비밀번호 입력까지 계속 비번 물어보는 내용
//		Scanner sc = new Scanner(System.in);
//		String corPass = "java123";
//		String inPass;
//		do { // 우선 수행할 내용(최소1번은 수행)
//			System.out.print("비밀번호를 입력:"); //
//			inPass = sc.nextLine();
//		}while(!inPass.equals(corPass));
//		//비번호와 입력내용 같지 않을 때 계속 반복 
//		System.out.println("비밀번호 일치! 인증처리!");
		// ex1) 점수를 입력받아서 누적합을 출력하되, 종료시 0을 입력처리
//		Scanner sc2 = new Scanner(System.in);
//		int sum = 0;
//		int inPt;
//		do {
//			System.out.print("점수를 입력하세요:");
//			inPt = sc2.nextInt();
//			sum += inPt;
//			System.out.println("현재까지 누적합:"+sum);
//		}while(inPt!=0);
//		System.out.println("종료!!");
		// ex2) 컴퓨터와 숫자맞추기 게임, 컴퓨터의 임의의 숫자(1~100)를
		//      맞출 때까지 반복하는데, 중간에 보다 큰지 보다 작은지를
		//      hint로 준다.
		Scanner sc3 = new Scanner(System.in);
		int comRan = (int)(Math.random()*100+1);
		int inNum;
		do {
			System.out.print("1부터 100사이 숫자입력:");
			inNum = sc3.nextInt();
			if(inNum<comRan) {
				System.out.println("보다 큰 수를 입력하세요(hint)");
			}
			if(inNum>comRan) {
				System.out.println("보다 작은 수를 입력하세요(hint)");
			}
		}while(comRan!=inNum);
		System.out.println("정답 완료!");
		
		
		
		
	}

}
