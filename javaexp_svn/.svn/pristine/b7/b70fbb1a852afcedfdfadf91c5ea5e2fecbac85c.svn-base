package javaexp.z02_homework.a17_okw;

import java.util.Scanner;

public class A00_diceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		System.out.println("---게임 설명--- ");
		System.out.println("나와 컴퓨터가 각각 주사위를 두 번 굴립니다.\n그 결과, 두 번의 주사위 눈의 합이 큰 쪽이 승리합니다."
				+ "\n게임은 내가 이길때 까지 진행됩니다.");
		System.out.println("...주사위 게임을 시작합니다!");
		
		while(true) {
			System.out.println("## 먼저 컴퓨터가 주사위를 굴립니다..");
			int comDice1 = (int)(Math.random()*6+1);
			System.out.println("컴퓨터의 첫번째 주사위 눈 : "+comDice1);
			int comDice2 = (int)(Math.random()*6+1);
			System.out.println("컴퓨터의 두번째 주사위 눈 : "+comDice2);
			int comSum = comDice1 + comDice2;
			System.out.println("컴퓨터 주사위 눈의 합 : "+comSum);
			
			System.out.println("## 내 차례입니다. Enter키를 누르면 주사위를 굴립니다..");
			System.out.print("첫번째 굴리기!");
			String enter = sc.nextLine();
			int myDice1 = (int)(Math.random()*6+1);
			System.out.println("나의 첫번째 주사위 눈 : "+myDice1);
			System.out.print("두번째 굴리기!");
			enter = sc.nextLine();
			int myDice2 = (int)(Math.random()*6+1);
			System.out.println("나의 두번째 주사위 눈 : "+myDice2);
			int mySum = myDice1 + myDice2;
			System.out.println("나의 주사위 눈의 합 : "+mySum);
			System.out.println("컴퓨터:"+comSum+"나:"+mySum);
			if(mySum > comSum) {
				break;
			}else if(mySum < comSum){
				System.out.println("패배 ㅠㅠ");
				cnt++;
			}else {
				System.out.println("무승부 입니다.");
				cnt++;
			}
		}
		System.out.println(cnt+"번 만에 이겼습니다!");
			
	}

}
