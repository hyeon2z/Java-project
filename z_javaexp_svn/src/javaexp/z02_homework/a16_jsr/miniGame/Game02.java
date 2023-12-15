package javaexp.z02_homework.a16_jsr.miniGame;

import java.util.Scanner;

public class Game02 {

	public int start() {
		int round=0;
		int wina=0;
		int winb=0;
		Scanner sc=new Scanner(System.in);
		while (round<3) {
			System.out.println("********가위바위보 게임을 시작합니다(3라운드)*********");
			System.out.print(round+1+"라운드 "+"가위(1)바위(2)보(3):");
			int b2 = Integer.parseInt(sc.nextLine());
			int a2=(int)(Math.random()*3+1);
			System.out.println("컴퓨터: "+a2+","+"나: "+b2);
			if (a2==b2) {
				System.out.println("두 플레이어가 비겼음");
			} else if (a2==1&&b2==2) {
				System.out.println("사용자가 이겼음");
				winb+=1;
			} else if (a2==1&&b2==3) {
				System.out.println("컴퓨터가 이겼음");
				wina+=1;
			} else if (a2==2&&b2==3) {
				System.out.println("사용자가 이겼음");
				winb+=1;
			} else if (a2==2&&b2==1) {
				System.out.println("컴퓨터가 이겼음");
				wina+=1;
			} else if (a2==3&&b2==2) {
				System.out.println("사용자가 이겼음");
				winb+=1;
			} else if (a2==3&&b2==1) {
				System.out.println("컴퓨터가 이겼음");
				wina+=1;
			}
			round++;
		}
		System.out.println("****************결과*******************");
		if(wina>winb) {
			System.out.println("컴퓨터 승");
			return -200;
		}else if(wina<winb) {
			System.out.println("승리를 축하합니다!");
			return 1000;
		}else {
			System.out.println("두 플레이어 동점");
			return 0;
		}
	}
}
