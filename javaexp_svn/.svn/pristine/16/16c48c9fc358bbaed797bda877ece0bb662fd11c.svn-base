package javaexp.z02_homework.a21_hcj.TextRpg;

public class BattleSystem {

	private Charactor user;
	private Charactor monster;
	
	
	public BattleSystem(Charactor user, Charactor monster) {
		this.user = user;
		this.monster = monster;
	}

	public void BasicMessage() {
		System.out.println(user.getName()+"의 체력:"+user.getHp()+"\t"+monster.getName()+"의 체력:"+monster.getHp());
		System.out.println(user.getName()+"의마나:"+user.getMp());
		
		System.out.println("1.공격");		
		System.out.println("2.스킬사용");
		System.out.println("3.아이템사용");
	}
	
	public void BasicAttack(int damage) {
		System.out.println("공격 적중!!");
		monster.setHp(-(damage));
		System.out.println(damage+"의 피해를 입힘");
		
	}
	public void SkillAttack(int damage) {
		BasicAttack(damage);
		user.setMp(-10);
	}
	

	
	
	
	
	
}
