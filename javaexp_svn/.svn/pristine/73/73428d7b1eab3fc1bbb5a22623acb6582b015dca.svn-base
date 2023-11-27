package javaexp.z02_homework.a03_ls;

import java.util.Random;

import javaexp.z02_homework.a03_ls.vo.Monster;
import javaexp.z02_homework.a03_ls.vo.Character;


public class A0927_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character c01 = new Character ("봉봉",1,100,15,15,0);
		// 캐릭터 생성
		
		
		int i01 = 0; // while 을 위한 변수 설정
		
		while(i01<=10) {
		
			
		Monster[]monsters = new Monster[5];
		monsters[0]= new Monster("달팽이",1,20,5,5,20);
		monsters[1]= new Monster("슬라임",2,30,7,7,30);
		monsters[2]= new Monster("주황버섯",3,40,9,9,40);
		monsters[3]= new Monster("리본돼지",4,50,11,11,50);
		monsters[4]= new Monster("스톤골렘",5,60,13,13,60);
		// 몬스터 클래스 호출해, 몬스터 정보 배열로 나열
		
		Random random = new Random();
		int randomIdx = random.nextInt(monsters.length);
		// 위에 선언한 다섯가지 몬스터중 랜덤으로 하나 호출
		
		int exp01 = 0;	// 경험치 누적 변수 설정
		
		System.out.println("=================");
		System.out.println("***battle***");
		System.out.println("=================");
		
		if (monsters[randomIdx].getMdefen()<c01.getPower()) {
			c01.show(); monsters[randomIdx].mshow();
		 for (int i = 0; i<10; i++) {
			 int mhp01 = monsters[randomIdx].getMhp();
			 mhp01-=8;
			 monsters[randomIdx].setMhp(mhp01);
			 // 랜덤한 몬스터의 방어력이 내 캐릭터의 공격력보다 낮으면 그냥 바로 물리칠수 있게 설정
			 if(monsters[randomIdx].getMhp()<=0) {
				 System.out.println("몬스터를 물리쳤습니다!!");
				 exp01 = c01.getExp();
				 int mexp01 = monsters[randomIdx].getMexp();
				 exp01 += mexp01;
				 c01.setExp(exp01);
				 c01.show();
				 monsters[randomIdx].mfull();	// 몬스터의 체력 회복
				 break;
				 // 몬스터를 물리친 경우 보상
			 }
		}
		if(exp01 >=50) {
			System.out.println("!!레벨업!!");
			c01.levelUp();
			c01.show();
		}	
		}else {
			System.out.println("몬스터가 너무 강해 도망쳤습니다");
			System.out.println("다시 실행해주세요");
			
			// 몬스터의 방어력이 내 공격력 보다 높을경우 도망가게 설정
		}
		 
		
		i01++; // 몬스터 나오는 턴수는 총 10턴
		}
		
		
	

	}

}
