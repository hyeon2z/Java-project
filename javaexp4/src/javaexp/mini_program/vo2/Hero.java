package javaexp.mini_program.vo2;

public class Hero {
	private int hp = 15;
	private int mp = 0;
	private int atk = 4;
	private int def = 0;
	private int lv = 1;
	private int exp = 0;
	private int maxHp;
	private int maxMp;
	
	
	public Hero() {
		this.maxHp = this.hp;
		this.maxMp = this.mp;
	}
	
	public void heroInfo() {
		System.out.println("유저정보");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + maxMp);
		System.out.println("공격력 : " + atk);
		System.out.println("방어력 : " + def);
		System.out.println("레벨 : " + lv);
		System.out.println("경험치 : " + exp);
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	

}
