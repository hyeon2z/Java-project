package javaexp.z02_homework.a14_cms.vo;

public class Game {
	private String name;
	private int level;
	private int hp;
	
	public Game(String name) {
		this.name = name;
		this.level = 1;
		this.hp = 1;
	}
	public void increLevel() {
		level++;
	}
	public void healHp() {
		hp+=10;
	}
	public void showGameInfo() {
		System.out.println("닉네임은 " + name);
		System.out.println("레벨은 " + level);
		System.out.println("체력은 " + hp);
	}

}
