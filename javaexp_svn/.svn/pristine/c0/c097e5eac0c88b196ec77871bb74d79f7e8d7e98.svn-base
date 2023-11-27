package javaexp.z02_homework.a05_kjh;

import java.util.Scanner;

public class make_r_s_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] computer= {"가위", "바위", "보"};	
		// 0, 1, 2 : (int)(Math.random()*3)
		// computer[0] computer[1] computer[2]
		String com2 = computer[(int)(Math.random()*3)];
		String player;
		while(true) {
			System.out.println("\t**가위바위보 게임 시작**");
			System.out.println("\t [가위바위보 게임 규칙!]");
			System.out.println("가위, 바위, 보 입력하기!");
			System.out.println("끝 을 입력하면 종료됩니다!");
			//int computer=0;
			//computer = (int)(Math.random()*3+1);
			//int rsp = player-computer;
			player = sc.nextLine();	
			System.out.println("컴퓨터:"+com2);
			System.out.print("결과값:");
			if(player.equals("끝")) {	
				System.out.println("게임 끝");
				break;												
			}else if(player.equals(com2)) {
				System.out.println("무승부 한번 더");
			}else if(player.equals("가위")&&com2.equals("바위")) {
				System.out.println("패배");
			}else if(player.equals("바위")&&com2.equals("보")) {
				System.out.println("패배");
			}else if(player.equals("보")&&com2.equals("가위")) {
				System.out.println("패배");
			}else if(player.equals("가위")&&com2.equals("보")) {
				System.out.println("승리");
			}else if(player.equals("바위")&&com2.equals("가위")) {
				System.out.println("승리");
			}else if(player.equals("보")&&com2.equals("바위")) {
				System.out.println("승리");
			}else {
				System.out.println("명령어를 제대로 입력해주세요!");
			}
			
			
		}
	}
}
