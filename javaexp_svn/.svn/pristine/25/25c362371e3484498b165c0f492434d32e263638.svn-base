package javaexp.z02_homework.a13_ajh;

import java.util.Scanner;

public class A0922_MiniGame_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("#가위 바위 보 게임#");
			Scanner sc = new Scanner(System.in);
			System.out.println("\n(1->가위)/(2->바위)/(3->보)/(4->종료)");
			System.out.print("=> 가위바위보 숫자를 입력하세요: ");
			int user = sc.nextInt();
			int ranNum = (int)(Math.random()*3+1);
			int score = user-ranNum;
			if(user>=4) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			if(score==0) {
				System.out.println(ranNum);
				System.out.println("비겼습니다");
			}
			else if(score==-1 || score==2) {
				System.out.println(ranNum);
				System.out.println("졌습니다");
			}else {
				System.out.println(ranNum);
				System.out.println("이겼습니다");
			}
		
		}
		
	}

}
