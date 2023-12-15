package javaexp.z02_homework.a11_mhi;

import java.util.Scanner;

public class B01_0927_miniproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // rpg 게임 캐릭터 생성 및 전투
	      Scanner sc = new Scanner(System.in);
	      Hero hero = new Hero();

	      System.out.println("닉네임을 정해주세요");
	      String name = sc.nextLine();

	      System.out.println(name + "님 캐릭터 직업을 입력하세요(전사, 궁수, 도적 중 택 1)");
	      String inputCharacter = sc.nextLine();

	      if (inputCharacter.equals("전사")) {
	         System.out.println(name + "님 당신은 전사 입니다.");
	         hero = new Warrior();
	         hero.defense = 25;
	         hero.power = 15;
	         hero.level = 1;
	         hero.hp = 80;

	      } else if (inputCharacter.equals("궁수")) {
	         System.out.println(name + "님 당신은 궁수입니다.");
	         hero = new Archer();
	         hero.defense = 5;
	         hero.power = 20;
	         hero.level = 1;
	         hero.hp = 50;

	      } else if (inputCharacter.equals("도적")) {
	         System.out.println(name + "님 당신은 도적입니다.");
	         hero = new thief();
	         hero.defense = 10;
	         hero.power = 18;
	         hero.level = 1;
	         hero.hp = 60;
	      } else {
	         System.out.println("전사, 궁수, 도적 중에서 입력해주세요");
	      }

	      Monster monster = new Monster();
	      while (true) {
	         System.out.println("현재 " + name + "의 이름 : " + name);
	         System.out.println("현재 " + name + "의 레벨 : " + hero.level);
	         System.out.println("현재 " + name + "의 힘 : " + hero.power);
	         System.out.println("현재 " + name + "의 방어력 : " + hero.defense);
	         System.out.println("현재 " + name + "의 HP : " + hero.hp);
	         System.out.println("현재 " + name + "의 경험치 : " + hero.experience);

	         System.out.println("사냥할 몬스터를 입력하세요");
	         String inputMonster = sc.nextLine();

	         if (inputMonster.equals("슬라임")) {
	            monster = new Slime();
	            monster.name = "슬라임";
	            monster.hp = 100;
	            monster.level = 1;
	            monster.power = 15;
	            monster.defense = 25;
	            monster.experience = 40;
	            System.out.println(monster.name + " 과 전투 시작");

	         } else if (inputMonster.equals("달팽이")) {
	            monster = new Snail();
	            monster.name = "달팽이";
	            monster.hp = 2000;
	            monster.level = 5;
	            monster.power = 100;
	            monster.defense = 30;
	            monster.experience = 10;
	            System.out.println(monster.name + " 와 전투 시작");

	         }
	      
	      int attackCount=0;
	      
	      while (true) {
	         attackCount++;
	         System.out.println(name +"의 "+ attackCount+"번째 공격");
	         monster.attacked(hero.attack());

	         if (monster.hp <= 0) {
	            System.out.println(monster.name + "(이)가 죽었습니다.");
	            hero.experience += monster.experience;
	            break;
	         }
	         attackCount++;
	         System.out.println(monster.name +"의 "+ attackCount+"번째 공격");
	         hero.attacked(monster.attack());

	         if (hero.hp <= 0) {

	            System.out.println(name + "가 죽었습니다. 게임이 끝났습니다.");
	            return;

	         }
	         
	      
	   }
	         if (hero.experience >= hero.level * 80) {

	            hero.level += 1;
	            System.out.println(name + "의 레벨이" + hero.level + "이 되었습니다.");
	            hero.experience = 0;
	         }
	         
	         
	   }
	}
	}
	class Character {
	   public String name;
	   public int hp;
	   public int level;
	}

	class Hero extends Character {
	   public int power;
	   public int defense;
	   public int experience = 0;

	   public int attack() {
	      return power;
	   }

	   public void attacked(int sum) {

	      if (defense >= sum) {
	         hp = hp - 0;
	      } else {
	         hp = hp + defense - sum;
	      }
	   }
	}

	class Warrior extends Hero {
	   public int attack() {
	      int sum = 0;
	      sum += level * 10;
	      sum += power * 30;
	      System.out.println("데미지는" + sum + "입니다.");
	      return sum;
	   }

	   public void attacked(int sum) {

	      if (defense >= sum) {
	         hp = hp - 0;
	      } else {
	         hp = hp + defense - sum;
	      }

	   }

	}

	class thief extends Hero {
	   public int attack() {
	      int sum = 0;
	      sum += level * 10;
	      sum += power * 15;
	      sum += defense * 5;

	      System.out.println("데미지는" + sum + "입니다.");
	      return sum;
	   }

	   public void attacked(int sum) {

	      if (defense >= sum) {
	         hp = hp - 0;
	      } else {
	         hp = hp + defense - sum;
	      }

	   }

	}

	class Archer extends Hero {
	   public int attack() {
	      int sum = 0;
	      sum += level * 10;
	      sum += power * 15;
	      sum += defense * 5;

	      System.out.println("데미지는" + sum + "입니다.");
	      return sum;
	   }

	   public void attacked(int sum) {

	      if (defense >= sum) {
	         hp = hp - 0;
	      } else {
	         hp = hp + defense - sum;
	      }

	   }

	}

	class Monster extends Character {
	   public int power;
	   public int defense;
	   public int experience = 0;

	   public int attack() {
	      return power;
	   }

	   public void attacked(int sum) {

	      if (defense >= sum) {
	         hp = hp - 0;
	      } else {
	         hp = hp + defense - sum;
	      }
	   }
	}

	class Slime extends Monster {

	   public int attack() {

	      System.out.println("데미지는 " + power + " 입니다.");
	      return power;

	   }

	   public void attacked(int sum) {

	      if (defense >= sum) {
	         hp = hp - 0;
	      } else {
	         hp = hp + defense - sum;
	      }
	   }
	}

	class Snail extends Monster {

	   public int attack() {

	      System.out.println("데미지는 " + power + " 입니다.");
	      return power;

	   }

	   public void attacked(int sum) {

	      if (defense >= sum) {
	         hp = hp - 0;
	      } else {
	         hp = hp + defense - sum;
	      }
	   }
	}