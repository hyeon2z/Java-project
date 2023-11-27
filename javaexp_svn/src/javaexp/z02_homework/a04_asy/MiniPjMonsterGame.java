package javaexp.z02_homework.a04_asy;

import java.util.Random;

public class MiniPjMonsterGame {

	public static void main(String[] args) {

		      System.out.println("운빨 랜덤 몬스터 죽이기!");
		      int player = 100;
		      int monster = 100;
		      
		      Random random = new Random();   //랜덤 값 생성을 위해 Random 객체 생성
		      while(player > 0 && monster > 0) {
		      
		         int playerDamage = random.nextInt(11); //0~10은 11개 숫자 이므로
		         int monsterDamage = random.nextInt(11); //0~10은 11개 숫자 이므로
		         
		         
		         if(playerDamage==0) {
		            System.out.println("플레이어의 공격이 빗나갔습니다!");
		         }else {
		            System.out.println("플레이어가 몬스터에게 "+playerDamage + "의 데미지를 입혔습니다!");
		            monster-=playerDamage;
		         }
		         if(monsterDamage==0) {
		            System.out.println("몬스터의 공격이 빗나갔습니다!");
		         }else {
		            System.out.println("몬스터가 플레이어에게 "+monsterDamage + "의 데미지를 입혔습니다!");
		            player-=monsterDamage;
		         }
		          System.out.println("플레이어의 체력: " + playerDamage);
		            System.out.println("몬스터의 체력: " + monsterDamage);
		            System.out.println();
		      
		            //승패 판별
		            
		            if (player <= 0 && monster <= 0) {
		                   System.out.println("무승부!");
		               } else if (player <= 0) {
		                   System.out.println("몬스터의 승리!");
		                   break; // 플레이어 패배로 루프 종료
		               } else if (monster <= 0) {
		                   System.out.println("플레이어의 승리!");
		                   break; // 몬스터 패배로 루프 종료
		               }
		      }
		      
		      
		   }
		
	}


