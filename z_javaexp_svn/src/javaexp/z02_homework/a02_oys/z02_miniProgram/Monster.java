package javaexp.z02_homework.a02_oys.z02_miniProgram;

public class Monster {

	private int monsterHp;
	private int monsterAtack;
	private int monsterExp;
	
	public Monster(int monsterHp, int monsterAtack, int monsterExp) {
		this.monsterHp = monsterHp;
		this.monsterAtack = monsterAtack;
		this.monsterExp = monsterExp;
	}
	
	public int getMonsterHp() {
		return monsterHp;
	}
	public int getMonsterAtack() {
		return monsterAtack;
	}
	public int getMonsterExp() {
		return monsterExp;
	}
	
	public void attackMonster(int atk) {
		this.monsterHp -= atk;
	}
	
}
