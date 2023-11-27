package javaexp.z02_homework.a02_oys.z02_miniProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameService gameService = new GameService();
		List<Player> players = new ArrayList<Player>();
		List<Monster> monsters = new ArrayList<Monster>();
		
		players.add(new Player("테스트"));
		
		for (int i = 1; i <= 10; i++) {
			int hp = 100 + (i * 50);
			int atack = i + 14;
			int exp = 200 + (i * 10);
			monsters.add(new Monster(hp, atack, exp));
		}
		
		/*while (true) {
			System.out.println("게임을 시작하겠습니까?\n(y : 예, n : 아니오)");
			char answer = scan.nextLine().charAt(0);
			
			if (answer == 'n') {
				break;
			} else if (answer != 'y') {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			System.out.print("플레이어명을 입력해주세요 : ");
			Player player = new Player(scan.nextLine());
			
		
			System.out.println(player.getPlayerName() + "님 환영합니다.");
			break;
		}*/
		
		for (int i = 0; i < monsters.size(); i++) {
			Monster monster = monsters.get(i);
			Player player = players.get(0);
			
			while (monster.getMonsterHp() > 0) {
				int randomNum = (int)(Math.random() * 5 + 1);
				System.out.println("\n1 ~ 5까지의 랜덤한 숫자를 맞출경우 치명타!");
				System.out.print("숫자를 입력해주세요 : ");
				int userNum = scan.nextInt();
				
				if (userNum == randomNum) {
					System.out.println("치명타!");
					System.out.println("몬스터의 남은 체력 : " + gameService.fatalBlow(monster, player));
				} else {
					System.out.println("일반 공격");
					System.out.println("몬스터의 남은 체력 : " + gameService.attackMonster(monster, player));
				}
				
				if (monster.getMonsterHp() <= 0) {
					System.out.println(i + 1 + "단계 클리어!\n");
					gameService.clearMonster(monster, player);
					break;
				}
				
				System.out.println("\n**몬스터 공격**");
				System.out.println("1 ~ 5까지의 랜덤한 숫자를 맞출 경우 공격 방어!");
				System.out.print("숫자를 입력해주세요 : ");
				userNum = scan.nextInt();
				randomNum = (int)(Math.random() * 5 + 1);
				
				if (userNum == randomNum) {
					System.out.println("공격방어 성공!");
				} else {
					System.out.println("공격방어 실패");
					System.out.println("남은 플레이어 체력 : " + gameService.attackPlayer(monster, player));
				}
				
				if (player.getPlayerHp() <= 0) {
					System.out.println("게임오버");
					break;
				}
			}
			
			if (player.getPlayerHp() <= 0) {
				break;
			}
			
			System.out.println("게임 클리어!");
		}
		
		

	}
	
}
