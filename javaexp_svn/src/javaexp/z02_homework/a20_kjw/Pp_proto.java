package javaexp.z02_homework.a20_kjw;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Pp_proto {

	public static void main(String[] args) {
		// 변수 모음//
		// int: choice
		int choice = 0;

		// TODO Auto-generated method stub

		System.out.println("------------------New Personal project----------------------\n"
				+ "\t\t아래 메뉴 중 하나를 숫자로 선택하세요\n" + "\t\t1)(역)숫자야구\n" + "\t\t2)눈 내리는창\n" + "\t\t3)움직이는 배열\n"
				+ "\t\t4)계산기 프로그램\n" + "\t\t5)마방진\n" + "\t\t6)종료");
		Scanner sc = new Scanner(System.in);
		choice = Integer.parseInt(sc.nextLine());
		if (choice > 6) {
			System.out.println("메뉴에 있는 숫자를 입력해주세요");
			Scanner sc1 = new Scanner(System.in);
			choice = Integer.parseInt(sc1.nextLine());
		} else if (choice == 0) {
			System.out.println("메뉴에 있는 숫자를 입력해주세요");
			Scanner sc2 = new Scanner(System.in);
			choice = Integer.parseInt(sc2.nextLine());
		}
		switch (choice) {

		case 1:

			System.out.println(choice + "를 선택하셨습니다. (역)숫자야구로 전환됩니다.");

			int d = 0; // 100자리 수

			int e = 0; // 10자리 수

			int f = 0; // 1자리 수

			int innum = 0; // input number

			int count = 0;

			// TODO Auto-generated method stub

			System.out.print("사용자가 지정한 숫자 세자리를 입력해주세요: ");

			Scanner scanner = new Scanner(System.in);

			innum = scanner.nextInt();

			// 사용자 숫자

			if (innum != 0) {

				d += innum / 100;

			} else {

				d = 0;

			}

			if (innum != 0) {

				e += (innum - 100 * d) / 10;

			} else {

				e = 0;

			}
			
			

			if (innum != 0) {

				f += (innum - 100 * d - 10 * e) / 1;

			} else {

				f = 0;

			}

			// 돌리는 루틴 시작.
			for (int i = 0; i < 100; i++) {

				count++;

				int a = 0;

				int b = 0;

				int c = 0;

				int abc = (int) (Math.random() * 999);

				if (abc != 0) {

					a = abc / 100;

				} else if (a == d) {

					break;

				}

				if (abc != 0) {

					b = (abc - 100 * a) / 10;

				} else if (a == d) {

					break;

				}

				if (abc != 0) {

					c = (abc - 100 * a - 10 * b) / 1;

				} else if (c == f) {

					break;
				}

				System.out.println("사용자입력: " + innum);

				System.out.println("난수: " + abc);

				if (Math.abs(a - d) <= 3 && Math.abs(a - d) >= 1) {

					System.out.println("볼! " + "컴퓨터 예측 백의자리수: " + a + "사용자입력 백의자리수: " + d + "시도횟수" + count);

				} else if (a == d) {

					System.out.println("스트라이크!" + "컴퓨터 예측 백의자리수: " + a + "사용자입력 백의자리수: " + d + "시도횟수" + count);

					continue;

				} else if (Math.abs(a - d) > 3) {

					System.out.println("아웃!" + "컴퓨터 예측 백의자리수: " + a + "사용자입력 백의자리수: " + d + "시도횟수" + count);

				}
				//십의자리
				if (b == e) {

					System.out.println("스트라이크!" + "컴퓨터 예측 십의자리수: " + b + "사용자입력 십의자리수: " + e + "시도횟수" + count);

					continue;

				} else if (Math.abs(b - e) > 3) {

					System.out.println("아웃!" + "컴퓨터 예측 십의자리수: " + b + "사용자입력 십의자리수: " + e + "시도횟수" + count);

				} else if (Math.abs(b - e) <= 3 && Math.abs(b - e) >= 1) {

					System.out.println("볼!" + "컴퓨터 예측 십의자리수: " + b + "사용자입력 십의자리수: " + e + "시도횟수" + count);

				}
				// 1의자리매칭루틴

				if (c == f) {

					System.out.println("스트라이크!" + "컴퓨터 예측 일의자리수: " + c + "사용자입력 일의자리수: " + f + "시도횟수" + count);
					continue;
				} else if (Math.abs(c - f) <= 3 && Math.abs(c - f) >= 1) {

					System.out.println("볼!" + "컴퓨터 예측 일의자리수: " + c + "사용자입력 일의자리수: " + f + "시도횟수" + count);

				}

				else if (Math.abs(c - f) > 3) {

					System.out.println("아웃!" + "컴퓨터 예측 일의자리수: " + c + "사용자입력 일의자리수: " + f + "시도횟수" + count);

				}

				if (a == d && b == e && c == f) {
					System.out.println("컴퓨터가 스트라이크를 기록했습니다.");

					System.out.println("press Q to quit.");
					String str6 = sc.nextLine();
					if (str6.equals("Q")) {
						System.out.println("프로그램이 종료됩니다.");
						break;
					}
					

				}

			}break;

		case 2:
			System.out.println(choice + "를 선택하셨습니다. 눈 내리는 창으로 전환됩니다.\n");
			for (int s = 0; s < 100; s++) {
				for (int l = 0; l < (int) (Math.random() * 1000 + 1); l++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			System.out.println("press Q to quit.");
			String str5 = sc.nextLine();
			if (str5.equals("Q")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}break;
		case 3:
			System.out.println(choice + "를 선택하셨습니다. 움직이는 배열로 전환됩니다.");
//오리지널    
			System.out.println("오리지널 배열");
			int i = 0;
			int[] arry = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			for (i = 0; i < 3; i++) {
				System.out.print(arry[i] + " \t");
			}
			System.out.print(" \n");
			for (i = 3; i < 6; i++) {
				System.out.print(arry[i] + " \t");
			}
			System.out.print(" \n");
			for (i = 6; i < 9; i++) {
				System.out.print(arry[i] + " \t");
			}
			System.out.print(" \n\n");

//회전	
			// 첫줄

			System.out.println("하나씩 미루기");
			for (i = 0; i < 1; i++) {
				System.out.print(arry[i + 3] + " \t");
			}
			for (i = 1; i < 3; i++) {
				System.out.print(arry[i - 1] + " \t");
			}
			System.out.print(" \n\n");

			// 2
			for (i = 3; i < 4; i++) {
				System.out.print(arry[i + 3] + " \t");
			}

			for (i = 4; i < 5; i++) {
				System.out.print(arry[i] + " \t");

			}

			for (i = 5; i < 6; i++) {
				System.out.print(arry[i - 3] + "\t");
			}
			System.out.print(" \n\n");

			for (i = 6; i < 7; i++) {
				System.out.print(arry[i + 1] + "\t");
			}
			// 33
			for (i = 6; i < 7; i++) {
				System.out.print(arry[i + 2] + "\t");
			}
			for (i = 8; i < 9; i++) {
				System.out.println(arry[i - 3] + "\t");
			}
			System.out.print(" \n\n");

			System.out.println("한줄씩 위로 올리기");
			for (i = 0; i < 3; i++) {
				System.out.print(arry[i + 6] + " \t");

			}
			System.out.print(" \n\n");
			System.out.print(" \n");
			for (i = 3; i < 6; i++) {
				System.out.print(arry[i] + " \t");
			}
			System.out.print(" \n\n");
			System.out.print(" \n");
			for (i = 6; i < 9; i++) {
				System.out.print(arry[i - 6] + " \t");
			}
			System.out.print(" \n\n");
			System.out.print(" \n\n");

			System.out.println("press Q to quit.");
			String str = sc.nextLine();
			if (str.equals("Q")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}break;

		case 4:

			System.out.println(choice + "를 선택하셨습니다. 계산기 프로그램로 전환됩니다.");
			System.out.println("계산할 사칙연산을 입력하세요:(1.+,2.-,3.*,4./,5.루트. \n 계산시 숫자하나씩 입력후 엔터)\n");
			Scanner sc1 = new Scanner(System.in);
			int pick = Integer.parseInt(sc1.nextLine());
			switch (pick) {

			case 1:

				System.out.print(pick + "를 선택하셨습니다. 계산할 숫자를 입력해주세요: ");
				Scanner sc2 = new Scanner(System.in);
				int var = Integer.parseInt(sc2.nextLine());
				int var1 = Integer.parseInt(sc2.nextLine());
				int sum = var + var1;
				System.out.println(var + "+" + var1 + "=" + sum + "입니다.");

				System.out.println("press Q to quit.");
				String str1 = sc.nextLine();
				if (str1.equals("Q")) {
					System.out.println("프로그램이 종료됩니다.");
					break;
				}break;

			case 2:
				System.out.print(pick + "를 선택하셨습니다. 계산할 숫자를 입력해주세요: ");
				Scanner sc3 = new Scanner(System.in);
				int var2 = Integer.parseInt(sc3.nextLine());
				int var3 = Integer.parseInt(sc3.nextLine());
				int minus = var2 - var3;
				System.out.println(var2 + "-" + var3 + "=" + minus + "입니다.");

				System.out.println("press Q to quit.");
				String str2 = sc.nextLine();
				if (str2.equals("Q")) {
					System.out.println("프로그램이 종료됩니다.");
					break;
				}break;

			case 3:
				System.out.print(pick + "를 선택하셨습니다. 계산할 숫자를 입력해주세요: ");
				Scanner sc4 = new Scanner(System.in);
				double var4 = Integer.parseInt(sc4.nextLine());
				double var5 = Integer.parseInt(sc4.nextLine());
				double multi = var4 * var5;
				System.out.println(var4 + "X" + var5 + "=" + multi + "입니다.");

				System.out.println("press Q to quit.");
				String str3 = sc.nextLine();
				if (str3.equals("Q")) {
					System.out.println("프로그램이 종료됩니다.");
					break;

				}break;
			case 4:
				System.out.print(pick + ": 나눗셈을 선택하셨습니다. 계산할 숫자를 입력해주세요: (첫 수/두번쨰 수)순입니다\n");
				Scanner sc5 = new Scanner(System.in);
				double var6 = Integer.parseInt(sc5.nextLine());
				double var7 = Integer.parseInt(sc5.nextLine());
				double divide = var6 / var7;
				System.out.println(var6 + "/" + var7 + "=" + divide + "입니다.");

				System.out.println("press Q to quit.");
				String str4 = sc.nextLine();
				if (str4.equals("Q")) {
					System.out.println("프로그램이 종료됩니다.");
					break;

				}break;

			case 5:
				System.out.print(pick + "를 선택하셨습니다. 계산할 숫자를 입력해주세요: ");
				Scanner sc6 = new Scanner(System.in);
				double var8 = Integer.parseInt(sc6.nextLine());
				double root = Math.sqrt(var8);
				System.out.println(var8 + "의 제곱근은" + root + "입니다.");

				System.out.println("press Q to quit.");
				String str6 = sc.nextLine();
				if (str6.equals("Q")) {
					System.out.println("프로그램이 종료됩니다.");
					break;
				}
			}break;

		case 5:
			System.out.println(choice + "를 선택하셨습니다. 마방진(가제)로 전환됩니다.");
			int[][] array = new int[3][3];
			array[0][0] = 4;
			array[0][1] = 9;
			array[0][2] = 2;
			array[1][0] = 3;
			array[1][1] = 5;
			array[1][2] = 7;
			array[2][0] = 8;
			array[2][1] = 1;
			array[2][2] = 6;

			for (int i1 = 0; i1 < array.length; i1++) {
				for (int j = 0; j < array[i1].length; j++) {
					System.out.print(array[i1][j] + "");
					if (j == 2 || j == 7 || j == 6) {
						System.out.print("\n");
					}
				}
				System.out.println("");

			}
			System.out.println("press Q to quit.");
			String str7 = sc.nextLine();
			if (str7.equals("Q")) {
				System.out.println("프로그램이 종료됩니다.");
				break;

			}break;

		case 6:
			System.out.println(choice + "를 선택하셨습니다. 종료됩니다.");
			System.out.println("press Q to quit.");
			String str8 = sc.nextLine();
			if (str8.equals("Q")) {
				System.out.println("프로그램이 종료됩니다.");

			}break;
		}
	}
}
