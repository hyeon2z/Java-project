package javaexp.z02_homework;

import java.util.Random;
import java.util.Scanner;

public class Z01_Game {

	public static void main(String[] args) {
		/*
		# 컴퓨터와 하는 가위/바위/보
		0. 배열로 가위/바위/보 선언, 승/무/패 변수 선언
		1. 컴퓨터는 랜덤
		2. 나는 Scanner에 의해 번호로 선택(1.가위 2.바위 3.보)
		3. 두 개의 내용을 비교해 승/무/패 결정
		4. 위 내용을 3회 반복처리하여 승/무/패 누적
		 */
		String[] rcp = {"가위","바위","보"};
		int win,draw,loose; win=draw=loose=0; // 승무패 선언
		System.out.println("#컴퓨터와 가위 바위 보#");
		for(int i = 0; i <= 2; i ++) {
			System.out.print("번호를 입력(1.가위 2.바위 3.보) : ");
			Scanner sc = new Scanner(System.in);
			int usrNum = sc.nextInt();
			String myChoice = rcp[usrNum-1];
			System.out.println("당신의 선택 : " + myChoice);
			

			Random r = new Random();
			int comNum = r.nextInt(3); // 0~2 임의로 나옴
			String comResult = rcp[comNum]; // 임의 index로 컴퓨터 선택
			
			System.out.println("가위/바위/보(컴퓨터) : " + comResult);
		
			if(usrNum == comNum) {
				System.out.println("무승부");
				draw++;
			}else if((usrNum+2)%3 == comNum) {
				System.out.println("승리");
				win++;
			}else {
				System.out.println("패배");
				loose++;
			}
		}
		
		
		// 			{"가위","바위","보"}
		// usrNum      0    1    2
		// comNum      0    1    2
		// 1. 비길때,  usrNum = comNum
		// 2. 내 승리, usrNum 0  1  2
		//           comNum 2  0  1
		//           (usrNum+2)%3 == comNum;
	}

}
