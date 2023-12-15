package javaexp.z02_homework.a02_oys.z02_miniProgram;

public class Player {

	private String playerName;
	private int playerAtack;
	private int playerLevel;
	private int playerHp;
	private int playerExp;
	private int playerNowExp;
	
	public Player(String playerName) {
		this.playerName = playerName;
		this.playerLevel = 1;
		this.playerHp = 100;
		this.playerExp = 200;
		this.playerAtack = 100;
	}

	public String getPlayerName() {
		return playerName;
	}
	public int getPlayerAtack() {
		return playerAtack;
	}
	public int getPlayerHp() {
		return playerHp;
	}
	public int getPlayerLevel() {
		return playerLevel;
	}
	public int getPlayerExp() {
		return playerExp;
	}
	public int getPlayerNowExp() {
		return playerNowExp;
	}

	public void attackPlayer(int atk) {
		this.playerHp -= atk;
	}
	
	public int clearMonster(int exp) {
		return this.playerNowExp += exp;
	}

	public void levelUp() {
		this.playerLevel++;
		this.playerExp += 150;
		this.playerNowExp = 0;
		this.playerHp += 80;
		this.playerAtack += 10;
	}
	
}
