package javaexp.z02_homework.a06_psj;

public class A1011 {

	public static void main(String[] args) {
		Dog3 ad3 = new Dog3();
		Cat3 ac3 = new Cat3();
		ad3.sound();
		ac3.sound();
		
		Circle cc = new Circle();
		Rectangle1 rr = new Rectangle1();
		cc.area(3);
		rr.area(3);
		
		Adder a1 = new Adder(3,5);
		Subtractor a2 = new Subtractor(3,5);
		a1.operation();
		a2.operation();
		
		
	}
}
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
		// this는 같은클래스의 생성자를 사용하고싶을때 쓰고, super는 상위클래스의 생성자를 쓰고싶을때 사용한다
		class Ex1{
			private String name;
			private int age;
			private int grade;
			public Ex1(String name) {
				this.name = name;
			}
			public Ex1(int age, int grade) {
				this("손인욱"); // 매개변수 1개짜리 생성자로 이름 초기화
				this.age = age;
				this.grade = grade;
			}	
		}
		
		class Ex2{
			String name;
			int age;
			public Ex2(String name, int age) {
				this.name = name;
				this.age = age;
			}
		}
		class Ex3 extends Ex2{
			int grade;
			public Ex3(String name, int age, int grade) {
				super(name, age); // 상위클래스의 매개변수 2개짜리 생성자로 필드 초기화
				this.grade = grade;
			}
		
		}
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
		// 같은 이름의 메서드를 재정의 하는것을 말한다.
		class A{
			public void show() {
				System.out.println("이름: 손인욱");
			}
		}
		
		class B extends A{
		public void show() {
				System.out.println("이름: 손인욱");
				System.out.println("나이: 24"); // 나이를 추가해서 재정의함
			}
		}
		
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
		// 오버라이딩은 상위클래스와 하위클래스에서 같은이름의 메서드를 재정의하는 기술이다
		// 오버로딩은 같은클래스내 에서 같은이름의 메서드를 재정의하면서 기능을 확장시킨다.
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
		class Animal3{
			void sound() {
				System.out.println("울음소리");
			}
		}
		class Dog3 extends Animal3{
			void sound() {
				super.sound();
				System.out.println("멍멍");
			}
		}
		class Cat3 extends Animal3{
			void sound() {
				super.sound();
				System.out.println("야옹");
			}
		}
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
		class Shape{
			void area(double a) {
				System.out.println("면적: "+a);
			}
		}
		class Circle extends Shape{
			private double tmp;
			void area(double a) {
				tmp = a*a*3.14;
				super.area(tmp);
			}
		}
		class Rectangle1 extends Shape{
			private double tmp;
			void area(double a) {
				tmp = a*a;
				super.area(tmp);
			}
		}
//			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
		class Calculator{
			void operation(int x) {
				System.out.println("연산결과: "+x);
			}
		}
		class Adder extends Calculator{
			private int a;
			private int b;
			public Adder(int a, int b) {
				this.a = a;
				this.b = b;
			}
			void operation() {
				super.operation(a+b);
			}
		}
		class Subtractor extends Calculator{
			private int a;
			private int b;
			public Subtractor(int a, int b) {
				this.a = a;
				this.b = b;
			}
			void operation() {
				super.operation(a*b);
			}
		}
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2 : 당근, 양파
//		         패키지3 : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//			ex)
//				패키지1(fruit) : 참외(접근제어자 default) taste,		
//				패키지2(bev) : 당근 양파
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
//
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
