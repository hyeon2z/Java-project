package javaexp.z02_homework.a21_hcj.vo;
//9. **게임 캐릭터 클래스**
	//	    - 필드: 이름, 레벨, 체력
	//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
	//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
public class Charactor{
	private String name;
	private int level;
	private int hp;
	public Charactor(String name) {
		this.name = name;
		this.level = 1;
		this.hp = 1;
	}
	public void ShowInfo() {
		System.out.println("캐릭터 정보");
		System.out.println("레벨:"+level);
		System.out.println("HP:"+hp);
		
	}
	public void LevelUp(int no) {
		System.out.println(no+"레벨 업!!");
		level +=no;
	}
	public void Heal(int heal) {
		System.out.println("체력 "+heal+" 회복");
		hp +=heal;
	}
	
	
}
