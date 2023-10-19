package javaexp.mini_program.vo2;

public class Slime {
	private int hp = 3;
	private int mp = 0;
	private int atk = 5;
	private int def = 3;
	private int maxHp;
	private int maxMp;
	public Slime() {
		this.maxHp = this.hp;
		this.maxMp = this.mp;
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
}
