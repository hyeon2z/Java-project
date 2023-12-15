package javaexp.z02_homework.a06_psj.vo;

import java.util.Scanner;

public class Baseball {
	Scanner sc = new Scanner(System.in);
	int hit_power;
	int ball_power;
	public int out=0;
	int myNum=1;
	int hit_mode;
	int base_state=0;
	int score=0;
	public int getOut() {
		return out;
	}
	public int getmyNum() {
		return myNum;
	}
	public int getScore() {
		return score;
	}
	public void baseInfo() {
		System.out.println("주자 "+base_state+"루");
		System.out.println("아웃카운트: "+out);
	}
	public void setHitmode() {
		System.out.println("\n@ 타격모드 입력@");
		System.out.println("1: 슬러거, 2: 히트");
		hit_mode=sc.nextInt();
	}
	public void setPower() {
		ball_power=(int)(Math.random()*55);
		if (hit_mode==1) {
			hit_power=(int)(Math.random()*20);
		}
		else if (hit_mode==2) {
			hit_power=(int)(Math.random()*36);
		}
//		else if (hit_mode==3) {
//			hit_power=(int)(Math.random()*75);
//		}
	}
	public void resultHit() {
		if (ball_power>hit_power) {
			out++;
			System.out.println("아웃");
		}
		else if(hit_power>ball_power) {
			if (hit_mode==1) {
				System.out.println("홈런!");
				score+=(base_state+1);
				base_state=0;
			}
			else if(hit_mode==2) {
				System.out.println("안타~");
				base_state++;
				
			}
//			else if(hit_mode==3) {
//				System.out.println("번트성공");
//				base_state++;
//				out++;
//			}
		}
		myNum++;
	}
	
}
