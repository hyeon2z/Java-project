package javaexp.z02_homework.a12_ljh.a0927.game_vo;

import java.util.Scanner;

public class Monster {
	private String name;
	private int power;
	private int defense;
	private int experience;
	private int hp;
	private int level;
	public Monster() {
		// TODO Auto-generated constructor stub
	}
	
	public int attack() {
        int sum = 0;
    	sum += level * 20;
        sum += power * 5;
        System.out.println("몬스터에게 " + sum + "의 데미지를 입었다!");
        return sum;
        
    }
	
	public void attacked(int sum) {
		if(defense >= sum) {
			hp = hp - 0;
		} else {
			hp = hp + defense - sum;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
