package javaexp.z02_homework.a16_jsr.miniGame;

import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("********************미니게임을 시작합니다********************");
		Player player =new Player();
		while (true) {
		System.out.println("| 1.회원가입 | 2.나의 정보 | 3.게임 머니 충전 | 4.숫자야구 | 5.가위바위보 | 6. 종료 |");
		System.out.print("옵션을 선택해주세요(!회원가입 필수!) : ");
		int option=Integer.parseInt(sc.nextLine());
		switch (option) {
		case 1:
			System.out.println("| 1.회원가입 |");
			System.out.print("이름 : ");
			player.setName(sc.nextLine());
			System.out.print("나이 : ");
			player.setAge(Integer.parseInt(sc.nextLine()));
			System.out.print("전화번호 : ");
			player.setNumber(sc.nextLine());
			System.out.println("회원가입 성공!");
			break;
		case 2:
			System.out.println("| 2.나의 정보 |");
			player.playerInfo();
			break;
		case 3:
			System.out.println("| 3.게임 머니 충전 |");
			System.out.print("얼마를 충전할까요? : ");
			player.setCoin(Integer.parseInt(sc.nextLine()));
			break;
		case 4:
			System.out.println("| 4.숫자야구 |");
			BullsAndCows game1=new BullsAndCows();
			if(player.minusCoin(500)==-1) {
				break;
			}
			player.setPoint(game1.start());
			player.levelUp();
			break;
		case 5:
			Game02 gm=new Game02();
			if(player.minusCoin(300)==-1) {
				break;
			}
			player.setPoint(gm.start());
			player.levelUp();
			break;
		case 6:
			System.out.println("*********************게임을 종료합니다**********************");
			return;
		default:
			System.out.println("옵션을 맞게 골라주세요.");
		}
	}
		
		
		
		
  }
}
