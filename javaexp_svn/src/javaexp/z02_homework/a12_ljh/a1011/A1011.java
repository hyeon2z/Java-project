package javaexp.z02_homework.a12_ljh.a1011;

public class A1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
		/*
		// this 생성자 : 현재 클래서에서 정의된 생성자를 호출하여 사용
		// super 생성자 : 상위 클래서에서 정의된 생성자를 호출하여 사용
		 
		
		class Insect{
			int numLeg;
			String name;
			Insect(int numLeg){
				this.numLeg = numLeg;
			}
			Insect(int numLeg, String name){
				this(numLeg);
				this.name = name;
			}
		}
		class Ant extends Insect{
			String color;
			
			Ant(int numLeg, String name, String color){
				super(numLeg, name);
				this.color = color;
			}
			
		}
		
		*/
		
		
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
		
		/*
		// 오버라이딩: 부모 클래스의 상속 메서드를 동일한 이름으로 자식 클래스에서 재정의 한 것
		class Insect{
			void crawl() {
				System.out.println("기어가다.");
			}
		}
		
		class Ant extends Insect{
			@Override
			void crawl() {
				System.out.println("무리지어 기어가다.");
			}
		}
		
		*/
		
		
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
		
		/*
		 오버라이딩은 상속 관계에서 부모 클래스의 메소드를 자식 클래스에서 재정의하는 것이며, 
		 오버로딩은 같은 클래스 내에서 메소드 이름은 같지만 매개변수 목록이 다른 여러 개의 메소드를 정의하는 것이다.
		*/
		
		
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. 
//			   Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
		
		/*
		class Animal{
			void sound() {
				System.out.print("동물소리: ");
			}
		}
		class Dog extends Animal{
			@Override
			void sound() {
				super.sound();
				System.out.println("멍멍");
			}
		}
		class Cat extends Animal{
			@Override
			void sound() {
				super.sound();
				System.out.println("야옹");
			}
		}
		
		Animal a01 = new Dog();
		Animal a02 = new Cat();
		a01.sound();
		a02.sound();
		
		*/
		
		
//		2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. Circle과 Rectangle 클래스는 Shape을 상속받습니다. 
//		   두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
		
		/*
		class Shape{
			void area() {
				System.out.println("[면적 출력]");
			}
		}
		
		class Circle extends Shape{
			int radius = 3;
			
			@Override
			void area() {
				super.area();
				System.out.println("원의 반지름: " + radius);
				System.out.println("원의 면적: " + radius * radius * Math.PI);
			}
		}
		
		class Rectangle extends Shape{
			int width = 3;
			int height = 5;
			
			@Override
			void area() {
				super.area();
				System.out.println("사각형의 밑변: " + width + " 사각형의 높이: " + height);
				System.out.println("사각형의 면적: " + width * height);
			}
		}
		
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		
		s1.area();
		s2.area();
		
		*/
		
		
//		3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 
//		   두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
		
		/*
		class Calculator{
			int a = 1;
			int b = 2;
			
			void operation() {
				System.out.println("[연산 결과 출력]");
			}
		}
		
		class Adder extends Calculator{
			@Override
			void operation() {
				super.operation();
				System.out.println("두수의 합: " + (a + b));
			}
		}
		
		class Subtractor extends Calculator{
			@Override
			void operation() {
				super.operation();
				System.out.println("두수의 차: " + (b-a));
			}
			
		}
		
		Calculator cc1 = new Adder();
		Calculator cc2 = new Subtractor();
		
		cc1.operation();
		cc2.operation();
		 */
		
		
		
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1(fruit) : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2(bev) : 당근, 양파
//		         패키지3(fruit2) : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//		  ex)
//        패키지1(fruit) : 참외(접근제어자 default) taste, 
//						 사과(접근제어자 private로 변수 선언해서 - 외부클래스에서 호출), 멜론(참외상속), 바나나, 딸기
//        패키지2(bev) : 당근, 양파	
		  
//		  ex) 패키지1(fruit) : 참외에 접근제어자 protected로 참외와 가까운 친척이라는 변수를 간단하게 선언
//			  패키지1(fruit) : 멜론(참외 상속)
//			  패키지3(fruit2) : 수박(참외 상속)
//			  상속되는 것과 상속되지 않는 곳에서 호출하여 확인하세요.
		
		/*
		class 참외{
			
			public void 종류() {		// import를 통해 모든 클래스에서 호출 가능
				System.out.println("과일");
			}
			
			protected void 껍질() {	// 상속 관계인 멜론, 수박 클래스에서만 호출 가능
				System.out.println("줄무늬가 있다.");
			}
			
			void 맛() {				// 같은 패키지 내의 클래스에서만 호출 가능
				System.out.println("달콤하다.");
			}
			
			private void 색깔() {		// 같은 클래스 내에서만 호출 가능
				System.out.println("노란색이다.");
			}
							
			
		}
		*/
		
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
		
		// 다형성 : 상위 클래스에서 상속 받은 하위 클래스의 메서드를 상위 클래스의 메서드 이름과 동일하게 정의하여 다양한 기능을 처리할 수 있게 하는 것.
		
		/*
		class Animal{
			void sound() {
				System.out.print("동물소리: ");
			}
		}
		class Dog extends Animal{
			@Override
			void sound() {
				super.sound();
				System.out.println("멍멍");
			}
		}
		class Cat extends Animal{
			@Override
			void sound() {
				super.sound();
				System.out.println("야옹");
			}
		}
		
		Animal a01 = new Dog();
		Animal a02 = new Cat();
		a01.sound();
		a02.sound();
		
		*/
		
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
//
		
		/*
		abstract class Food{
			abstract void consume();
		}
		
		class Pizza extends Food{
			@Override
			void consume() {
				System.out.println("피자가 소비되었습니다.");
			}
		}

		class Salad extends Food{
			@Override
			void consume() {
				System.out.println("샐러드가 소비되었습니다.");
			}
		}

		class Burger extends Food{
			@Override
			void consume() {
				System.out.println("버거가 소비되었습니다.");
			}
		}
		
		Food f1 = new Pizza();
		Food f2 = new Salad();
		Food f3 = new Burger();
		f1.consume();
		f2.consume();
		f3.consume();
		
		*/
		
		
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
	}

}
