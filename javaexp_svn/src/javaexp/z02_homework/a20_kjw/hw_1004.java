package javaexp.z02_homework.a20_kjw;

import java.util.Scanner;


import javaexp.z02_homework.a20_kjw.rectangle;

public class hw_1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바의 메모리 분류는 힙,스텍등으로 분류된다.
		//기본 데이터 유형은 정수,실수,문자,문자열,불리언,객체형등으로 분류된다.
		//char c='c',int a=5;,string s="안녕하세요"
		//변수명 적절하지 않은 것: char !s; 변수명 선언 규칙,
		//객체형 데이터: 배열,class,내장된 객체들
		
		//2. 문자열<->숫자
		//형변환이 자유로운편.
		//명시적,암묵적 형변환
		System.out.println("숫자입력");
		Scanner sc = new Scanner(System.in);
		double var = Integer.parseInt(sc.nextLine());
		double var1 = Integer.parseInt(sc.nextLine());
		double divide = var / var1;
		System.out.println("나눈값은"+divide+"입니다");
		//자바의 연산자는 +,-,/,*,=,==,()등으로 나뉜다.
		 System.out.println("숫자입력");
		Scanner sc1 = new Scanner(System.in);
		double var2 = Integer.parseInt(sc1.nextLine());
		if(var2==0) {
			System.out.println("0입니다");
		}else if(var2>=0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		//삼항연산자 활용도 동일
		
		// 10/02
		int sum = 0;
		 System.out.println("숫자입력");
		 Scanner sc2 = new Scanner(System.in);
		 double var4 = Integer.parseInt(sc2.nextLine());
		 for(int i=0;i<=var4;i++){
		 sum+=i;
		 }System.out.println("총합:"+sum);
		//System.out.println(sum);
		//10/03
		rectangle rt = new rectangle(20,30);
		System.out.println("높이"+rt.getHeight());
		System.out.println("폭"+rt.getWidth());
		System.out.println("면적"+rt.getArea());
		
		
		

	}

}
