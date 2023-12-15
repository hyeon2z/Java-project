package javaexp.z02_homework.a12_ljh.project.vo;

import java.util.Scanner;

public class Status {
	private int level = 1;
	private int nowExp;
	private int fullExp = 30;
	private int str = 5;
	private int dex = 5;
	private int mp = 5;
	private int luc = 5;
	private Charactor cloth;
	private Charactor job;
	private Charactor name;
	private boolean levelup;
	
	Scanner sc = new Scanner(System.in);
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 캐릭터 스테이터스 창
	public void showStatus() {
		System.out.println("[캐릭터 Status]");
		System.out.println("닉네임: " + name);
		System.out.println("힘: " + str + "민첩: " + dex + "마나: " + mp + "운: " + luc);
		System.out.println("옷: " + cloth);
		System.out.println("직업: " + job);
		System.out.println("전체 exp: " + fullExp + "현재 exp: " + nowExp);
		System.out.println();
	}
	
	
	// 레벨 설정 메소드
	public int getLevel() {
		return level;
	}

	public void setLevel() {
		if(levelup) {
			level++;
		}
	}
	
	// 레벨업 메소드
	public boolean isLevelup() {
		return levelup;
	}

	public void setLevelup() {
		this.levelup = nowExp/fullExp == 1;
	}
	
	// 현재 경험치
	public int getNowExp() {
		return nowExp;
	}

	public void setNowExp() {
		this.nowExp = nowExp;
	}

	
	// 최대 경험치
	public int getFullExp() {
		return fullExp;
	}

	public void setFullExp() {
		for(level=1; level<100; level++) {
			if(levelup) {
				fullExp += 50;
			}
		}
	}

	// 스테이터스 힘
	public int getStr() {
		return str;
	}

	public void setStr() {
		if(cloth.equals("갑옷")) {
			str += 10;
		}
		if(job.equals("전사")) {
			str += 10;
			if(levelup) {
				str += 3;
			}
		}
	}

	// 스테이터스 민첩
	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	// 스테이터스 마나
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	// 스테이터스 운
	public int getLuc() {
		return luc;
	}

	public void setLuc(int luc) {
		this.luc = luc;
	}
	
	
	
}
