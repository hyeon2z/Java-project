package javaexp.z02_homework.a16_jsr.miniGame;

import java.util.Scanner;

public class BullsAndCows {
	
	
	public int start() {
		Scanner sc02=new Scanner(System.in);
		System.out.println("*******************숫자 야구를 시작합니다*******************");
		int[] random = new int[3];
		int[] input= new int[3];
		for (int i = 0; i < random.length; i++) {
			random[i]=(int)(Math.random()*9+1);
			for(int j = 0;j < i;j++ ) {
				if(random[i]==random[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < input.length; i++) {
			System.out.println(random[i]);
		}
//		boolean game=true;
		while (true) {
			int ball=0;
			int strike=0;
			for (int i = 0; i < input.length; i++) {
				System.out.print("1~9정수를 입력해주세요(중복불가) : ");
				input[i] = sc02.nextInt();
			}
			
			for (int i = 0; i < random.length; i++) {
				for (int j = 0; j < input.length; j++) {
					if(random[i]==input[j]&&i==j) {
						strike++;
					}else if (random[i]==input[j]&&i!=j) {
						ball++;
					}
				}
			}
			System.out.println(strike+"스트라이트 "+ball+"볼");
			if (strike==3) {
				System.out.println(" 정답입니다!!");
				return 500;
		}
	}

}
}
