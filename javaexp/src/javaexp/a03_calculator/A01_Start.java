package javaexp.a03_calculator;

public class A01_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 자바에서 산술연산자.
		1. +, -, *, /, %
		
		 */
		int num01 = 25;
		int num02 = 7;
		double num03 = 7.0;
		System.out.println(num01 + " + " + num02 + " = " + (num01 + num02));
		System.out.println(num01 + " - " + num02 + " = " + (num01 - num02));
		System.out.println(num01 + " * " + num02 + " = " + (num01 * num02));
		System.out.println(num01 + " / " + num02 + " = " + (num01 / num02));
		System.out.println(num01 + " / " + num03 + " = " + (num01 / num03));
		System.out.println(num01 + " % " + num02 + " = " + (num01 % num02));
		// % : 나머지 연산자로 나머지값을 사용할 때 쓰는데
		// 프로그램에서 알고리즘에 많이 활용할 수 있다.
		// 연속된 데이터에서 규칙을 지정해서 처리해야 할 때, 주로 활용된다
		// 짝수만 합산 if(cnt%2==0)
		// 3의 배수 일 때는 짝으로 표시 그외는 숫자 표시
		// cnt%3==0?"짝":cnt => 3항 연산자 활용
	}

}
