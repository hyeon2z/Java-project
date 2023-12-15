package javaexp.z02_homework.a03_ls;

import java.util.Scanner;

public class A0922_Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 나랑 컴퓨터랑 게임을 할꺼야 주사위를 굴려서 더 많이 간놈이 이기는걸로 --> 누적합 사용, 누적합이 20 되면 세턴 쉬자
		// 한턴은 40이 되면 한턴돔. 몇 턴 돌았는지 확인해서 최종 승자를 내자
		// 턴수는 20턴. 이건 반복문 통해서 돌리고
		// 스캐너로 내가 주사위굴리기! 하면 랜덤으로 굴릴꺼고, 컴퓨터는 알아서 랜덤으로 돌아갈꺼야
		// 배열을 써볼까? 아 배열 아직 잘 모르겠어
//		double meTurn1 = (double) (meSum % 15); // 턴 돌고 더 간만큼
//		double meTurn2 = (double) (meSum / 15); // 턴수
//
//		double comTurn1 = (double) (comSum % 15);
//		double comTurn2 = (double) (comSum / 15);
		//넌 왜 변수이름으로 해놓으면 0으로 밖에 인식이안되니? 나한테 왜그러니???

		Scanner sc = new Scanner(System.in);

		System.out.println("주사위를 굴리시겠습니다? yes / no");
		String selet = sc.nextLine();

		int meSum = 0;
		int comSum = 0;


		if (selet.equals("yes")) {
			for (int i = 1; i <= 10; i++) {

				int me = (int) (Math.random() * 6 + 1);
				int com = (int) (Math.random() * 6 + 1);
				System.out.println(i + "번째 나의 주사위 숫자 : " + me);
				System.out.println(i + "번째 컴퓨터의 주사위 숫자 : " + com);
				meSum += me;
				comSum += com;
				System.out.println("현재 사용자의 주사위 합계 = " + meSum);
				System.out.println("현재 컴퓨터의 주사위 합계 = " + comSum);
				System.out.println("주사위를 굴리시겠습니다? yes / no");
				if (i == 10) {
					System.out.println("yes 를 누르면 결과가 표시됩니다.");
				}
				String selet1 = sc.nextLine();
				for (int j = 1; j < i; ++j) {

					while (true) {
						if (selet.equals("no")) {
							System.out.println("주사위를 굴리시겠습니다? yes / no");
							selet = sc.nextLine();
						}
						if (selet.equals("yes")) {
							break;

						}
					}
				}
				if (selet.equals("no")) {
					while (true) {
						System.out.println("주사위를 굴리시겠습니다? yes / no");
						selet = sc.nextLine();
					}
				}

			}
			if ((double) (meSum / 15) == (double) (comSum / 15)) {
				if ((double) (meSum % 15) > (double) (comSum % 15)) {
					System.out.println("사용자의 결과 : " + (double) (meSum / 15) + "턴 + " + (double) (meSum % 15) + "칸");
					System.out.println("컴퓨터의 결과 : " + (double) (comSum / 15) + "턴 + " + (double) (comSum % 15) + "칸");
					System.out.println("사용자의 승리!");
				} else if ((double) (meSum % 15) == (double) (comSum % 15)) {
					System.out.println("사용자의 결과 : " + (double) (meSum / 15) + "턴 + " + (double) (meSum % 15) + "칸");
					System.out.println("컴퓨터의 결과 : " + (double) (comSum / 15) + "턴 + " + (double) (comSum % 15) + "칸");
					System.out.println("무승부");
				}
			}
			if ((double) (meSum / 15) > (double) (comSum / 15)) {
				System.out.println("사용자의 결과 : " + (double) (meSum / 15) + "턴 + " + (double) (meSum % 15) + "칸");
				System.out.println("컴퓨터의 결과 : " + (double) (comSum / 15) + "턴 + " + (double) (comSum % 15) + "칸");
				System.out.println("사용자의 승리!");
			}
			if ((double) (meSum / 15) < (double) (comSum / 15)) {
				System.out.println("사용자의 결과 : " + (double) (meSum / 15) + "턴 + " + (double) (meSum % 15) + "칸");
				System.out.println("컴퓨터의 결과 : " + (double) (comSum / 15) + "턴 + " + (double) (comSum % 15) + "칸");
				System.out.println("컴퓨터의 승리!");
			}

		}

	}
}

