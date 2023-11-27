package javaexp.z02_homework.a02_oys.z02_miniProgram;

public class GameService {

	// 치명타
		public int fatalBlow(Monster monster, Player player) {
			// 몬스터의 체력을 가져오고 치명타이니 플레이어 공격력보다 2배높혀 공격을 입힌다.
			monster.attackMonster(player.getPlayerAtack() * 2);
			return monster.getMonsterHp();
		}
		
		// 일반 공격
		public int attackMonster(Monster monster, Player player) {
			monster.attackMonster(player.getPlayerAtack());
			return monster.getMonsterHp();
		}
		
		// 몬스터 -> 플레이어 공격
		public int attackPlayer(Monster monster, Player player) {
			player.attackPlayer(monster.getMonsterAtack());
			return player.getPlayerHp();
		}
		
		// 몬스터 처치
		public void clearMonster(Monster monster, Player player) {
			int playerNowExp = player.clearMonster(monster.getMonsterExp());
			if (player.getPlayerExp() <= playerNowExp) {
				System.out.println("레벨업!");
				player.levelUp();
			}
		}
	
}
