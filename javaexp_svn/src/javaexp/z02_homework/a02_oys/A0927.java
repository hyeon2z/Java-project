package javaexp.z02_homework.a02_oys;

public class A0927 {

	public static void main(String[] args) {
		
		/*
		- **개념문제**: 자바의 메모리 분류 및 기본 데이터 유형에 대한 설명.
		heap, stack
		논리 : boolean (true, false)
		정수 : byte, short, int(defalut), long
		실수 : float, double(default)
		문자 : char
		- **코드연습문제**: 다양한 기본 데이터 유형을 가진 변수를 선언하고 값을 할당하는 코드 작성.
		1. 실수 유형의 10.5 값을 `정수` 유형으로 형변환하여 출력하세요.
		자바 : double a = 10.5;
		   (int)a;
		자바 스크립트 : parseInt(); 사용
		2. 변수명으로 적절하지 않은 것들을 선언해보고, 왜 그것이 적절하지 않은지 설명하세요.
		int int;
		double return;
		-> 예약어
		
		---
		### 09/29 (금요일)
		- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
		작은 데이터 유형 -> 큰 데이터 유형 (자동 형변환)
		큰 데이터 유형 -> 작은 데이터 유형 (강제 형변환)
		- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.
		사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고, 두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.
		---
		### 09/30 (토요일)
		- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.
		증감 연산자
		산술 연산자
		비교연산자
		논리 연산자
		조건 연산자 
		대입 연산자
		- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.
		사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		a > 0 ? "양수" : (a < 0 ? "음수" : "0");
		---
		### 10/01 (일요일)
		- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.
		if문
		if - else문
		if - elseif - else 문
		switch문
		
		- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.
		사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		int a = scan.nextInt();
		if (a > 0) {
		   // 양수
		} else if (a < 0) {
		   // 음수
		} else {
		   // 0
		}
		---
		
		### 10/02 (월요일)
		- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.
		for문
		while문
		do-while문
		- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.
		1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.
		int a = scan.nextInt();
		int sum = 0;
		for ( int i = 1; i <= a; i++) {
		   sum += i;
		}
		---
		### 10/03 (화요일)
		- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.
		- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.
		사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요. 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.
		
		 * */
		
		Rectangle rectangle = new Rectangle(2, 3);
		System.out.println(rectangle.area());
		System.out.println(rectangle.circumference());

	}

}

class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int area() {
		return width * height;
	}
	
	public int circumference() {
		return (width + height) * 2;
	}
	
}
