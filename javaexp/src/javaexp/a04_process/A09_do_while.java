package javaexp.a04_process;

import java.util.Scanner;

public class A09_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# do_while 문
//		 1. 반복시, 최소한 1번을 수행하고 반복을 중단 처리할 때 사용하는 구문이 do{}while(조건); 구문이다.
//
//		 2. 기본 형식
//		     do{
//		         반복수행할 내용 : 최소 1번은 수행
//		     }while(반복조건);
		// 비밀번호확인 올바른 비밀번호 입력까지 계속 비번 물어보는 내용
//		Scanner sc = new Scanner(System.in);
//		String corPass = "java123";
//		String inPass;
//		do { // 우선 수행할 내용 (최소 1번은 수행)
//			System.out.println("비밀번호를 입력하세요 : ");
//			inPass = sc.nextLine();
//		}while(!inPass.equals(corPass));
//		// 비밀번호와 입력내용 같지 않을 때 계속반복
//		System.out.println("비밀번호 일치");
//		
		// ex1) 점수를 입력받아 누적합을 출력하되, 종료시 0을 입력처리
//		Scanner sc = new Scanner(System.in);
//		int score = 0;
//		int inPass = 0;
//		do {
//			System.out.println("점수를 입력하세요(종료시 0) : ");
//			inPass = sc.nextInt();
//			score += inPass;
//			System.out.println("누적합 : " + score);
//		}while(inPass != 0);
//		System.out.println("종료");
		
			// do-while = while() <- while 안이 true 일때 계속 반복, false가 되면 중지
		
		
		// ex2) 컴퓨터와 숫자맞추기 게임, 컴퓨터의 임의의 숫자를 맞출 때 까지 반복하는데,
//				중간에 보다 큰지 보다 작은지를 hint로 준다
		Scanner sc = new Scanner(System.in);
		int comNum = (int)(Math.random() * 100 + 1);
		int usrNum = 0;
		System.out.println("컴퓨터와 숫자맞추기 게임");
		do {
			System.out.println("숫자를 입력하세요 : ");
			usrNum = sc.nextInt();
			if(comNum < usrNum) {
				System.out.println("틀렸습니다!!");
				System.out.println("hint : 더 작은 수를 입력하세요");
			}else if (comNum > usrNum) {
				System.out.println("틀렸습니다!!");
				System.out.println("hint : 더 큰 수를 입력하세요");
			}
		}while(comNum != usrNum);
		System.out.println("정답입니다.\n입력한 수 : " + usrNum);
		
		
		
		
	}

}
