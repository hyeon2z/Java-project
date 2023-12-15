package javaexp.z02_homework.a02_oys.vo0921;

/*9. **게임 캐릭터 클래스**
    - 필드: 이름, 레벨, 체력
    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
    - 메서드: 레벨 업, 체력 회복, 정보 출력*/
public class Game {
	private String name;
	private int level;
	private int hp;
	
	public Game(String name) {
		this.name = name;
		this.level = 1;
		this.hp = 1;
	}
	
	public int levelUp() {
		return level++;
	}
	
	public int hpUp() {
		return hp++;
	}
	
	public void gameInfo() {
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
	}
	

}
