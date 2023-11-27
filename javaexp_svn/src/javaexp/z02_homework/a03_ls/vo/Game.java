package javaexp.z02_homework.a03_ls.vo;

public class Game {
	String name;
	int level;
	int hp;
	public Game(String name, int level, int hp) {
		this.name = name;
		this.level = 1;
		this.hp = 1;
		
	}
	public void gameInfo() {
		System.out.println("# 게임 캐릭터 정보 #");
		System.out.println("캐릭터 이름:"+name);
		System.out.println("캐릭터 레벨 :"+level);
		System.out.println("캐릭터 체력 : "+hp);
	}
	public int up() {
		int levelUp=level +1;

		return levelUp;
		
	}
	public int full() {
		int fullHp=100;
		
		return fullHp;
		
	}
	public void gameInfo1() {
	System.out.println("# 게임 캐릭터 정보 #");
	System.out.println("캐릭터 이름:"+name);
	System.out.println("캐릭터 레벨 :"+up());
	System.out.println("캐릭터 체력 : "+full());
	}
}
