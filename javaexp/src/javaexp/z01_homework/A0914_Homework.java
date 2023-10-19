package javaexp.z01_homework;

import java.util.Scanner;

public class A0914_Homework {

	public static void main(String[] args) {
		// 1번
		int one1 = 7;
		int one2 = 13;
		double answer1 = (one1 + one2) / 2;
		System.out.println("1번 문제 정답 : " + answer1);

		// 2번
		int two1 = 12;
		int two2 = 35;
		int two3 = 7;
		int two4 = 13;
		int two5 = 103;
		int answer2 = (two1 + two2 + two3 + two4 + two5) / 5;
		System.out.println("2번 문제 정답 : " + answer2);

		Scanner sc = new Scanner(System.in);
//		// sc.nextInt(); 입력된 데이터 정수로 변환하여 처리
//		System.out.print("첫번째 점수 입력 : ");
//		int pt01 = Integer.parseInt(sc.nextLine());
//		System.out.print("두번째 점수 입력 : ");
//		int pt02 = Integer.parseInt(sc.nextLine());
//		System.out.print("세번째 점수 입력 : ");
//		int pt03 = Integer.parseInt(sc.nextLine());
//		System.out.print("네번째 점수 입력 : ");
//		int pt04 = Integer.parseInt(sc.nextLine());
//		System.out.print("다섯번째 점수 입력 : ");
//		int pt05 = Integer.parseInt(sc.nextLine());
//		int avg = (pt01 + pt02 + pt03 + pt04 + pt05)/5;
//		System.out.println("5개 점수의 평균 : " + avg);
//		
		// 3번
		int dollor = 50;
		int won = (dollor * 13);
		System.out.println("13장의 달러를 원화로 변환한 결과는 " + won + "원");

		// 4번
		int width = 67;
		int length = 117;
		int area = (width * length);
		int around = (width + length) * 2;
		/*
		우선연산자
		1. ()
		2. *, /
		3. +, -
		 */
		System.out.println("사각형의 면적 : " + area);
		System.out.println("사각형의 둘레 : " + around);

		// 5번*
		byte byteValue = 42;
		double byteValue2 = byteValue; // 자동형변환
		System.out.println(byteValue2);

		// 6번
		float floatValue = 123.456f;
		int floatValue2 = (int)floatValue;
		// 큰 ==> 작 : 강제형변환(casting) 필요
		System.out.println(floatValue2);

		// 7번
		int intValue = 100;
		double doubleValue = 150.5;
		int intdouble = (int) (intValue + doubleValue);
		System.out.println(intdouble);

		// 8번***
		String eight = "5678";
		int eight1 = Integer.parseInt(eight);
		System.out.println(eight1);
		
		/*
		int num01 = Integer.parseInt("5678");
		System.out.println("정수형 변환 1:" +num01);
		 */

		// 9번
		String nine = "-456.789";
		double nine1 = Double.parseDouble(nine);
		System.out.println(nine1);

		// 10번
		int ten = 1;
		System.out.println("    " + ten);
		System.out.print("   " + (ten += 1));
		System.out.println(" " + (ten += 1));
		System.out.print("  " + (ten += 1));
		System.out.print(" " + (ten += 1));
		System.out.println(" " + (ten += 1));
		System.out.print(" " + (ten += 1));
		System.out.print(" " + (ten += 1));
		System.out.print(" " + (ten += 1));
		System.out.println(" " + (ten += 1));
	}

}
