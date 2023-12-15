package javaexp.z02_homework.a03_ls;

import java.util.Scanner;

public class A0922_CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 컴퓨터랑 나랑 4게임함. 카드게임
		// 한게임씩 해서 더 큰 숫자를 뽑는사람이 그 게임에서 점수를 딴다.
		// 4게임을 마치면, 더 많은 점수을 얻은 사람이 이기는 방식.
		
		// 우선 컴퓨터 랜덤숫자 만들기
		// 내 스캐너 넣기
		// 반복문 통해서 4게임 반복하기
		// 조건문 통해서 승패가르기
		
		Scanner sc = new Scanner(System.in);
		int com1 = 0;
		int com2 = 0;
		int com1Pt = 0;
		int com2Pt = 0;
		for (int i = 0; i<=4; i++) {
			com1 = (int)(Math.random()*15+1);
			com2 = (int)(Math.random()*15+1);
			if (com1>com2) {
				com1Pt++;
				System.out.println("`컴퓨터1` 의 숫자 : " +com1);
				System.out.println("`컴퓨터2` 의 숫자 : " +com2);
				System.out.println("**`컴퓨터1` 1점 획득**\n");
			} else if(com1==com2) {
				System.out.println("`컴퓨터1`의 숫자 : " +com1);
				System.out.println("`컴퓨터2`의 숫자 : " + com2);
				System.out.println("**무승부**\n");
			}else {
				
				com2Pt++;
				System.out.println("`컴퓨터1`의 숫자 : " +com1);
				System.out.println("`컴퓨터2`의 숫자 : " + com2);
				System.out.println("**`컴퓨터2` 1점 획득**\n");
			}
		}
		if(com1Pt>com2Pt) {
			System.out.println("#최종스코어#");
			System.out.println("`컴퓨터1`의 최종 스코어 : "+com1Pt);
			System.out.println("`컴퓨터2`의 최종 스코어 : "+com2Pt+"\n");
			System.out.println("**`컴퓨터1`의 승리**");
		}else if(com1Pt==com2Pt) {
			System.out.println("#최종스코어#");
			System.out.println("`컴퓨터1`의 최종 스코어 : "+com1Pt);
			System.out.println("`컴퓨터2`의 최종 스코어 : "+com2Pt+"\n");
			System.out.println("**무승부**");
		}else {
			System.out.println("#최종스코어#");
			System.out.println("`컴퓨터1`의 최종 스코어 : "+com1Pt);
			System.out.println("`컴퓨터2`의 최종 스코어 : "+com2Pt);
			System.out.println("**`컴퓨터2`의 승리**");
		}

	}

}
