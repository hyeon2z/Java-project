package javaexp.z02_homework.a21_hcj.TextRpg;

public class Charactor {
	private String name;
	private	int level;
	private int maxhp;
	private int hp;
	private int maxmp;
	private int mp;
	private int maxexp;
	private int exp;
	private int ad;
	private int am;
	private String job;
	private int givexp;
	private Inventory inv;
	
	

	public Charactor(String name) {
		this.name = name;
		this.level = 1;
		this.maxhp = 500;
		this.hp = 500;
		this.maxmp = 30;
		this.mp = 30;
		this.ad = 5;
		this.job = "초보자";
		this.maxexp = 6;
		this.givexp = 5;
	}
	public Inventory getInv() {
		return inv;
	}
	public void newinven(int num) {
		inv = new Inventory(num);
	}
	public int getGivexp() {
		return givexp;
	}
	public void setGivexp(int givexp) {
		this.givexp = givexp;
	}
	public void showinfo() {
		System.out.println("캐릭터 정보");
		System.out.println("닉네임\t: "+ name);
		System.out.println("레벨\t: "+ level);
		System.out.println("체력\t: "+ hp);
		System.out.println("마나\t: "+ mp);
		System.out.println("공격력\t: "+ ad);
		System.out.println("직업\t: "+ job);
		System.out.println("경험치\t: "+ exp);
			
		
	}
	public void heal() {
		this.hp = maxhp;
		this.mp = maxmp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getmaxHp() {
		return hp;
	}

	public void setmaxHp(int hp) {
		this.hp = hp;
	}

	public int getmaxMp() {
		return mp;
	}

	public void setmaxMp(int mp) {
		this.mp = mp;
	}

	
	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp += exp;
	}

	public int getMaxexp() {
		return maxexp;
	}
	public void setMaxexp(int maxexp) {
		this.maxexp = maxexp;
	}
	public int getAd() {
		return ad;
	}

	public void setAd(int ad) {
		this.ad = ad;
	}

	public int getAm() {
		return am;
	}

	public void setAm(int am) {
		this.am = am;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp += hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp += mp;
	}

	
	
	
	
}
