package javaexp.z02_homework.a13_ajh;

import java.util.Scanner;

public class A0922_MiniGame_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#가위 바위 보 게임#");
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("\n# (1->가위)/(2->바위)/(3->보) #");
		System.out.print("=> 해당 숫자를 입력하세요: ");
		int user = sc.nextInt();
		if(user==1) {
			System.out.println("유저: 가위");
		}if(user==2) {
			System.out.println("유저: 바위");
		}if(user==3) {
			System.out.println("유저: 보");
		}
		int ranNum = (int)(Math.random()*3+1);
			if(user==1) {
				if(ranNum==1) { 
					System.out.println("컴퓨터: 가위");
					System.out.println("\n게임결과: 비겼습니다");
				}else if(ranNum==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("\n게임결과: 졌습니다");
				}else {
					System.out.println("컴퓨터: 보");
					System.out.println("\n게임결과: 이겼습니다");
				}
			}else if(user==2) {
				if(ranNum==1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("\n게임결과: 이겼습니다");
				}else if(ranNum==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("\n게임결과: 비겼습니다");
				}else {
					System.out.println("컴퓨터: 보");
					System.out.println("\n게임결과: 졌습니다");
				}
			}else if(user==3) {
				if(ranNum==1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("\n게임결과: 졌습니다");
				}else if(ranNum==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("\n게임결과: 이겼습니다");
				}else {
					System.out.println("컴퓨터: 보");
					System.out.println("\n게임결과: 비겼습니다");
				}
			}else {
				System.out.println("\n※다시 실행하세요:1~3까지 입력※");
				break;
			}
		}

	}

}
