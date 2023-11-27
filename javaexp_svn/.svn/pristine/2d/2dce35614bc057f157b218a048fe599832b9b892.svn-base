package javaexp.z01_homework;

import java.util.Scanner;

public class A0914_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1. 두 개의 정수 변수를 선언하고 값들을 할당하십시오. 
//	이들의 평균을 double로 계산하고 출력하십시오. */
		int score01 = 70;	
		int score02 = 80;
		/// () : 최우선 연산
		double avgScore = (score01+score02)/2.0;
		System.out.println("두수의 평균:"+avgScore);
//2. 평균 계산: 사용자로부터 5개의 숫자를 입력받아 그 평균을 출력하십시오.
//		Scanner sc = new Scanner(System.in);
//		// sc.nextInt();  입력된 데이터 정수으로 변환하여 처리
//		// Integer.parseInt(sc.nextLine()) : 입력된 문자열을
//		// 정수로 변환 처리..
//		System.out.print("첫번째 점수입력:");
//		int pt01 = Integer.parseInt(sc.nextLine());
//		System.out.print("두번째 점수입력:");
//		int pt02 = Integer.parseInt(sc.nextLine());
//		System.out.print("세번째 점수입력:");
//		int pt03 = Integer.parseInt(sc.nextLine());
//		System.out.print("네번째 점수입력:");
//		int pt04 = Integer.parseInt(sc.nextLine());
//		System.out.print("다섯번째 점수입력:");
//		int pt05 = Integer.parseInt(sc.nextLine());
//		int avg = (pt01+pt02+pt03+pt04+pt05)/5;
//		System.out.println("5개 점수의 평균:"+avg);
//3. 환율 변환:
//	사용자로부터 달러 금액을 입력받아 원화로 변환하여 출력하십시오. 
//		(환율은 임의로 1달러 = 1,100원으로 설정)
//4. 사각형의 면적 및 둘레 계산:
//	사용자로부터 사각형의 가로와 세로 길이를 입력받아 면적 및 둘레를 계산하여 출력하십시오.
		int width = 70;
		int height = 80;
		int area = width*height;
		int round = (width + height)*2;
		// # 우선연산자(상기) : 선언된 순서에 우선하여 먼저 처리 된다.
		// 1. () 
		// 2. *,/ 곱셈과 나눗셈
		// 3. +,-
		System.out.println("면적은 "+area);
		System.out.println("둘레는 "+round);
//5. byte byteValue = 42;
//// 암시적 형변환을 사용하여 byteValue 값을 double 타입의 변수에 저장하십시오.
//// 두 변수의 값을 출력하십시오.
		byte byteValue = 42;
		double doubleValue = byteValue; // 자동형변환
		System.out.println("byte값:"+byteValue);
		System.out.println("double값:"+doubleValue);
//7. float floatValue = 123.456f;
//// 명시적 형변환을 사용하여 floatValue 값을 int 타입의 변수에 저장하십시오.
//// 두 변수의 값을 출력하십시오.
		float floatValue = 123.456f;
		int intValue = (int)floatValue; 
		// 큰 ==> 작 : 강제형변환(casting) 필요
		System.out.println("float값:"+floatValue);
		System.out.println("int값:"+intValue);
//
//int intValue = 100;
//double doubleValue = 150.5;
//// intValue와 doubleValue를 더하고 그 결과를 int 타입의 변수에 저장하십시오.
//// 결과 값을 출력하십시오.
		int intValue1 = 100;
		double doubleValue1 = 150.5;
		int sumInt = (int)(intValue1+doubleValue1);
		System.out.println("합산되어 casting결과:"+sumInt);
//"5678"이라는 문자열을 int 타입으로 변환하십시오.
		int num01 = Integer.parseInt("5678");
		System.out.println("정수형 변환1:"+num01);
//"-456.789"라는 문자열을 double 타입으로 변환하십시오.
		double num02 = Double.parseDouble("-456.789");
		System.out.println("실수형 변환1:"+num02);
//
//1. 숫자 피라미드 출력(System.print(), System.out.println()) 등을 활용
//숫자 피라미드를 증감 연산자를 사용하여 출력하는 예제입니다.
/*     1
 *   2    3
 * 4   5     6  
 7   8    9     10   ~11:05
 * */
		int no = 1;
		System.out.println("\t\t\t"+(no++));
		System.out.print("\t\t"+(no++));
		System.out.println("\t\t"+(no++));
		System.out.print("\t"+(no++));
		System.out.print("\t\t"+(no++));
		System.out.println("\t\t"+(no++));
		System.out.print(no++);
		System.out.print("\t\t"+(no++));
		System.out.print("\t\t"+(no++));
		System.out.println("\t\t"+(no++));

	}

}
