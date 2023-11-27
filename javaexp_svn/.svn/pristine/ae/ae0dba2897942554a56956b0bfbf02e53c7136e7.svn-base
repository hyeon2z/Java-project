package javaexp.z02_homework.a12_ljh.a0927.game_vo;

import java.util.Scanner;

public class Character {
	private String name;
	private int hp;
	private int mp;
	private int level;
	private int power;
	private int defense;
	private int experience;
	
	public Character() {
		// TODO Auto-generated constructor stub
	}
	
	public int attack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 일반공격");
        System.out.println("2. 스킬공격");
        System.out.println("공격 번호를 선택하세요: ");
        int num = Integer.parseInt(sc.nextLine());

        int sum = 0;

        if(num == 1) {
        	sum += level * 10;
            sum += power * 15;
            System.out.println("일반공격으로 " + sum + "의 데미지를 입혔다!");
            return sum;
        } else if(num == 2) {
        	sum += level * 10;
            sum += power * 30;
            mp -= 5;
            System.out.println("스킬공격으로 " + sum + "의 데미지를 입혔다!");
            return sum;
        }
        System.out.println("몬스터에게 총 " + sum + "의 데미지를 입혔다.");
        return sum;
    }
	
	public void attacked(int sum) {
		if(defense >= sum) {
			hp = hp - 0;
		} else {
			hp = hp + defense - sum;
		}
	}
	
	public void levelup() {
		level += 1;
		power += 10;
		defense += 5;
		hp += 50;
		mp += 5;
		experience = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
}
