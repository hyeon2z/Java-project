package javaexp.z02_homework.a12_ljh.a0927;

import java.util.Scanner;
import javaexp.z02_homework.a12_ljh.a0927.game_vo.Character;
import javaexp.z02_homework.a12_ljh.a0927.game_vo.Monster;

public class A0927_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Character 객체 생성
        Character character = new Character();

        System.out.println("*****JAVA RPG*****");
        System.out.println("[직업 선택]");
    	System.out.println("1. 전사");
        System.out.println("2. 마법사");
        System.out.print("직업의 번호를 선택하세요: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println();
        
        while(num != 1 && num != 2) {
        	System.out.println("[직업 선택]");
        	System.out.println("1. 전사");
            System.out.println("2. 마법사");
            System.out.print("직업의 번호를 선택하세요: ");
            num = Integer.parseInt(sc.nextLine());
            System.out.println();
        }
        
        if (num == 1) {
            System.out.println("전사를 선택하였습니다.");
            character.setDefense(25);
            character.setPower(15);
            character.setLevel(1);
            character.setHp(80);
            character.setMp(30);
        } else if(num==2) {
        	System.out.println("마법사를 선택하였습니다.");
            character.setDefense(10);
            character.setPower(20);
            character.setLevel(1);
            character.setHp(60);
            character.setMp(60);
        }
        
        System.out.println();
        System.out.print("캐릭터의 이름을 입력하세요: ");
        character.setName(sc.nextLine());
        System.out.println();
        System.out.println("당신은 " + character.getName() + "님 입니다.");
        System.out.println();
        System.out.println("***** 게임에 입장합니다! *****");
        System.out.println();
        
        while(true) {
        	System.out.println("************************");
        	System.out.println("현재 " + character.getName() + "의 레벨:\t" + character.getLevel());
        	System.out.println("현재 " + character.getName() + "의 힘\t: " + character.getPower());
        	System.out.println("현재 " + character.getName() + "의 방어력\t: " + character.getDefense());
        	System.out.println("현재 " + character.getName() + "의 HP:\t" + character.getHp());
        	System.out.println("현재 " + character.getName() + "의 MP:\t" + character.getMp());
        	System.out.println("현재 " + character.getName() + "의 경험치:\t" + character.getExperience());
        	System.out.println("************************");
        	System.out.println();
        	
        	Monster monster = new Monster();
        	System.out.println("[사냥터 선택]");
        	System.out.println("1. 너구리 동굴");
        	System.out.println("2. 멧돼지 서식지");
        	System.out.println("3. 게임 종료");
        	System.out.print("입장할 사냥터를 선택하세요: ");
        	num = Integer.parseInt(sc.nextLine());
        	System.out.println();
        	
        	while(num != 1 && num != 2 && num !=3) {
        		System.out.println("[사냥터 선택]");
            	System.out.println("1. 너구리 동굴");
            	System.out.println("2. 멧돼지 서식지");
            	System.out.println("3. 게임 종료");
            	System.out.println("입장할 사냥터를 선택하세요. ");
            	num = Integer.parseInt(sc.nextLine());
            	System.out.println();
        	}
        	
        	if(num == 1) {
        		monster.setName("너구리");
        		monster.setHp(100);
        		monster.setLevel(1);
        		monster.setPower(20);
        		monster.setDefense(10);
        		monster.setExperience(10);
        		System.out.println(monster.getName() + "과 전투를 시작합니다!");
        		System.out.println();
        	}
        	
        	if(num == 2) {
        		monster.setName("멧돼지");
        		monster.setHp(2000);
        		monster.setLevel(5);
        		monster.setPower(100);
        		monster.setDefense(20);
        		monster.setExperience(50);
        		System.out.println(monster.getName() + "과 전투를 시작합니다!");
        		System.out.println();
        	}
        	
        	if(num == 3) {
        		System.out.println("***** 게임을 종료합니다! *****");
        		break;
        	}
        	
        	
        	while(true) {
        		System.out.println(character.getName() + "의 공격입니다.");
        		monster.attacked(character.attack());
        		System.out.println();
        		
        		if(monster.getHp() <= 0) {
        			System.out.println(monster.getName() + "가 죽었습니다.");
        			character.setExperience(character.getExperience() + monster.getExperience());
        			System.out.println();
        			break;
        		}
        		
        		System.out.println(monster.getName() + "가 공격합니다.");
        		character.attacked(monster.attack());
        		System.out.println();
        		
        		if(character.getHp() <= 0) {
        			System.out.println(character.getName() + "이(가) 죽었습니다.");
        			character.setHp(50);
        			System.out.println(character.getName() + "이(가) 체력 " + character.getHp() + "으로 부활했습니다.");
        			System.out.println();
        			break;
        		}
        	}
        	
        	if(character.getExperience() >= character.getLevel() * 80) {
        		character.levelup();
        		System.out.println(character.getName() + "의 레벨이 " + character.getLevel() + "이 되었습니다!");
        		System.out.println();
        	}
        	
        }
        
    }
}
