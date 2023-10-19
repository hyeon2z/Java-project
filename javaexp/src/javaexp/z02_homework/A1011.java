package javaexp.z02_homework;

public class A1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
//		super는 상위클래스에 있는 요소들을 사용하기 위해 사용하고
//		this는 클래스 자체에 있는 요소들을 사용하기 위해 사용한다
//		
//		class Ex {
//			String ex;
//			Ex(){
//				System.out.println(ex + "예시");
//			}
//		}
//		class Ex1 extends Ex{
//			String ex;
//			Ex1(){
//				System.out.println(super.ex + "상위 ex 출력"); // 상위클래스의 문자열을 가지고 옴
//				System.out.println(this.ex + "하위 ex 출력");
//			}
//		}
		
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요

//		오버라이딩은 상위클래스에서 상속받은 메서드를 자식클래스에서 동일한 이름과 매개변수로 재 정의하는것을 말한다.
//		상위클래스에 있는 메서드의 접근제어자보다 하위클래스의 접근제어자가 더 클 수 없음.

//		class Father{
//			void height() {
//				System.out.println("아빠의 키는 170");
//			}
//		}
//		class Son extends Father{
//			void height() {
//				super.height();
//				System.out.println("아들의 키는 180");
//			}
//		}
//		Son s01 = new Son();
//		s01.height();
		
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
//		오버라이딩은 상위클래스의 매개변수를 하위클래스가 받아서 쓰되, 기능적인 면을 추가하는것이 다르고
//		오버로딩은 이름이 같더라도 매개변수의 갯수나 순서등을 달리해서 여러번 사용할 수 있게 만드는것이다.
		
		
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. 
//				Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
//		class Animal{
//			void sound() {
//				System.out.println("동물의 소리");
//			}
//		}
//		class Dog extends Animal{
//			void sound() {
//				super.sound();
//				System.out.println("강아지는 멍멍");
//			}
//		}
//		class Cat extends Animal{
//			void sound() {
//				super.sound();
//				System.out.println("고양이는 야옹");
//			}
//		}
//		Dog d01 = new Dog();
//		Cat c01 = new Cat();
//		d01.sound();
//		c01.sound();
		
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. 
//				Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
//		class Shape{
//			void area() {
//				System.out.println("도형의 면적");
//			}
//		}
//		class Circle extends Shape{
//			int r;
//			
//			public Circle(int r) {
//				this.r = r;
//			}
//			
//			double circleArea() {
//				return 2 * r * Math.PI;
//			}
//			
//			void area() {
//				super.area();
//				System.out.println(circleArea());
//			}
//		}
//		class Rectangle extends Shape{
//			int num1;
//			int num2;
//			
//			public Rectangle(int num1, int num2) {
//				this.num1 = num1;
//				this.num2 = num2;
//			}
//			
//			int rectangleArea() {
//				return num1 * num2;
//			}
//			
//			void area() {
//				super.area();
//				System.out.println(rectangleArea());
//			}
//		}
//		
//		Circle c01 = new Circle(5);
//		c01.area();
//		
//		Rectangle rec01 = new Rectangle(5,10);
//		rec01.area();
		
//			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. 
//				Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
//		class Calculator{
//			void operation() {
//				System.out.println("연산결과");
//			}
//		}
//		class Adder extends Calculator{
//			int i;
//			int e;
//			
//			
//			public Adder(int i, int e) {
//				this.i = i;
//				this.e = e;
//			}
//
//			int result() {
//				return i + e;
//			}
//			
//			void operation() {
//				super.operation();
//				System.out.println(result());
//			}
//		}
//		class Subtractor extends Calculator{
//			int i;
//			int e;
//			
//			public Subtractor(int i, int e) {
//				this.i = i;
//				this.e = e;
//			}
//
//			int result() {
//				int subtrac = 0;
//				if(i > e) {
//					subtrac = i - e;
//				}else if(e > i) {
//					subtrac = e - i;
//				}
//				
//			return subtrac;
//			}
//			
//			void operation() {
//				super.operation();
//				System.out.println(result());
//			}
//		}
//		Adder add01 = new Adder(10,5);
//		Subtractor sub01 = new Subtractor(4,10);
//		
//		add01.operation();
//		sub01.operation();
				
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2 : 당근, 양파
//		         패키지3 : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//		접근제어자 4개
//		private
//		protected
//		X(default)
//		public
		
//		(예시로 몇개)
//		package javaexp.z02_homework.package1;
//
//		public class Melon {
//			private void melon1() {
//				System.out.println("private 참외");
//			}
//			protected void melon2() {
//				System.out.println("protected 참외");
//			}
//			void melon3() {
//				System.out.println("default 참외");
//			}
//			public void melon4() {
//				System.out.println("public 참외");
//			}
//		}
		
//		package javaexp.z02_homework.package2;
//
//		import javaexp.z02_homework.package1.Melon;
//
//		public class Carrot {
//			
//			public void melonCall() {
//				Melon ml = new Melon();
//				ml.melon1(); 
//				ml.melon2();
//				ml.melon3(); 
//				ml.melon4(); // public만 가능
//			}
//		}
		
//		package javaexp.z02_homework.package3;
//
//		import javaexp.z02_homework.package1.Melon;
//
//		public class WaterMelon extends Melon {
//			public void melonCall() {
				
//				melon1(); 
//				melon2(); // 타 패키지지만 상속받았으므로 protected 가능
//				melon3(); 
//				melon4(); // public 가능
//			}
//			
//		}


		
		
		
		
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
//		상위클래스에서 상속받은 하위클래스에서 기능적 분리를 하는 메서드를 상위클래스의 이름과 동일하게 해서 다양한 기능을 수행하는것
//		부모클래스의 타입을 참조변수로 사용하여 자식클래스의 인스턴스를 참조할수있다.
//		class Animal{
//			void show() {
//				System.out.println("동물입니다");
//			}
//		}
//		class Dog extends Animal{
//			void show() {
//				System.out.println("강아지입니다");
//			}
//		}
//		Animal ani01 = new Dog();
//		ani01.show();
				
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
//		abstract class Food{
//			
//			abstract void consume();	
//		}
//		
//		class Pizza extends Food{
//			String food;
//			
//			public Pizza(String food) {
//				this.food = food;
//			}
//			void consume() {
//				System.out.println(food + "이(가) 소비되었습니다.");
//			}
//		}
//		class Salad extends Food{
//			String food;
//			
//			public Salad(String food) {
//				this.food = food;
//			}
//			void consume() {
//				System.out.println(food + "이(가) 소비되었습니다.");
//			}
//			
//		}
//		class Burger extends Food{
//			String food;
//			
//			public Burger(String food) {
//				this.food = food;
//			}
//			void consume() {
//				System.out.println(food + "이(가) 소비되었습니다.");
//			}
//		}
//		Food f01 = new Pizza("페퍼로니");
//		f01.consume();
//		Food f02 = new Salad("샐러드");
//		f02.consume();
//		Food f03 = new Burger("빅맥");
//		f03.consume();
		
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
	}

}
