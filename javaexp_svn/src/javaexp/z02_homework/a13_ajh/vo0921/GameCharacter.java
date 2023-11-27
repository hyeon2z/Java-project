package javaexp.z02_homework.a13_ajh.vo0921;

public class GameCharacter {
	private String name;
    private int level;
    private int health;
	public GameCharacter(String name) {
        this.name = name;
        this.level = 1;
        this.health = 100;
    }
    public void levelUp() {
        level++;
        System.out.println(name + " 캐릭터가 레벨 업했습니다. 현재 레벨: " + level);
    }
    public void heal(int amount) {
        if (amount > 0) {
            health += amount;
            System.out.println(name + " 캐릭터가 " + amount + " 체력을 회복했습니다. 현재 체력: " + health);
        } else {
            System.out.println("유효하지 않은 회복량입니다. 0 이상의 값을 입력하세요.");
        }
    }
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("레벨: " + level);
        System.out.println("체력: " + health);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	

}
