//package javaexp.z02_homework.a20_kjw;
//
//import a07_inherit.Animal;
//import a07_inherit.Company;
//import a07_inherit.Polygon;
//import a07_inherit.Quadrangle;
//import a07_inherit.Triangle;
//import a07_inherit.Vehicle01;
//import javaexp.a06_object.vo.Calculator;
//import javaexp.a07_inherit.Parent;
//import javaexp.a08_access.shapworld.Shape;
//
//public class A1011 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
//		class Parent{
//			String name="abc";
//			void show() {
//				System.out.println("부모 클래스");
//			}
//		}
//		class Child extends Parent{
//			String name = "def"; // 상위 클래스의 필드 재정의
//			void show() {
//				super.show(); // 같은 이름의 부모 메서드 호출
//				System.out.println("현재 객체의 필드:"+this.name);
//				System.out.println("부모 객체의 필드:"+super.name);
//			}
//		}
//위의 코드는 this와 super의 사용처를 알려주는 코드이며 결론적으로 super();형식은 기본적으로 생성되어있지만 보이지않는 기본코드이다.
//super는 부모객체의 필드를 사용해야할때 사용하고, this는 현재(자식)객체의 필드를 사용할때 이용된다.
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
//class Vehicle01{
//	private String Vehicle;
//	public Vehicle01(String Vehicle) {
//		this.Vehicle = Vehicle;
//	}
//	public void Driving() {
//		System.out.println(Vehicle+"을 타고 운행합니다. ");
//	}
//
//}
//Police p01 = new Police();
//w.working();
//class Car01 extends Vehicle01{
//
//	public Car01() {
//		super("자동차");
//	}
//	//오버라이딩.
//	public void Driving() {
//		super.Driving(); //상위내용을 처리
//		System.out.println("안락하게 운행하다.");
//	//추가적으로 하위에서 재정의하여 처리..
//	}	
//}
//다음 코드는 vehicle01,Driving,오버라이딩등을 사용한 코드이다.
//Vehicle01 클래스에서 기본 틀이 되는 추상클래스인 vehicle을 정의 후
//실제적으로 사용되는 공동틀(클래스)인 vehicle과 driving필드를 생성한다.
//그 이후 super.driving을 통해 기본 부모틀의 필드를 가져온후 각각의 구성에 맞게 bus,car등을 넣어
//최종적으로 부모클래스의 필드를 사용자최적에 맞게 수정 및 사용이 가능하다.
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
//오버로딩: 하나의 메소드이름으로 여러기능을 정의(매개변수의 갯수 또는 타입이 다르면 같은 이름으로
//		계속 사용 가능)
//오버라이딩: 상속개념이다. 부모클래스로부터 상속받은 메소드를 자식클래스상에서 자식 클래스의 코드 및 사용자에맞게
//재정의를 하는 행위이다.
//			[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
//class Animal{
//	void sound() {
//	System.out.println("동물이 울다!");
//	}
//}
//class Cat extends Animal{
//	void sound() {
//		System.out.println("고양이가 야옹야옹하다");
//	}
//}
//class Dog extends Animal{
//	void sound() {
//		System.out.println("개가 멍멍하다");
//	}
//}
//
//--main
//  Animal an01 = new Cat();
//  Animal an02 = new Dog();
//  an01.sound(); 
//  an02.sound();
//  
//  
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
//  abstract class Shape{
//
//		abstract void area();
//
//		void cal() {
//			System.out.println("도형");
//		}
//	}
//	class Circle extends Shape{
//		
//		void area() {
//			System.out.println("원(circle)");
//		}
//	}
//	class Rectangle extends Shape{
//		
//
//		void area() {
//			System.out.println("직사각형(rectangle)");
//		}
//	}
//	
//	--main
//	Shape s01 = new Circle();
//	s01.drawing();
//	Shape s02 = new Rectangle();
//	s02.drawing();
//		3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
//	class Calculator{
//		private int a;
//		private int b;
//		public Calculator(int a, int b) {
//			this.a=a;
//			this.b=b;
//		}
//		public void operation() {
//			System.out.println("계산기");
//		}
//
//	}
//	class Adder extends Calculator{
//
//		public void Calculator() {
//			super(3,5);
//		}
//		//오버라이딩.
//		public void operation() {
//			super.operation(); //상위내용을 처리
//			System.out.println(System.out.println(a+"+"+b+"="+a+b););
//		//추가적으로 하위에서 재정의하여 처리..
//		}	
//	}
//	class Substractor extends Calculator{
//
//		public void Calculator() {
//			super(3,5);
//		}
//		//오버라이딩.
//		public void operation() {
//			super.operation(); //상위내용을 처리
//			System.out.println(System.out.println(a+"-"+b+"="+a-b););
//		//추가적으로 하위에서 재정의하여 처리..
//		}	
//	}
		
//		--main
//		Calculator c01 = new Calculator();
//		c01.operation();
//		Calculator c02 = new Calculator();
//		c02.opertaion();
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//		
//		public
//		private
//		default--동일한 패키지안에서만 사용가능
//		ex) 
//		package abc;
//		class def{ //public 이 붙을시 다른 패키지에서도 import를 통해 호출 가능
//			//default가 붙었을시 같은 패키지에서만 호출(접근)가능
//			//protected가 붙었을시 동일 패키지의 클래스 또는 해당 클래스를
//			//상속받은 클래스에서만 접근가능
//			string alphabet="a";
//		}
//		
//		public class abd{
//			string alphabet = "b";
//		
//		public static void main(String[args) {
//			abc a = new abc();
//			System.out.println(abc.alphabet)
//		}
//		}
//		protected
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2 : 당근, 양파
//		         패키지3 : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//		ex)
//package fruit;
//
//class koreamelon() {
//	protected String name;
//	private String id;
//	default String model;
//	public String passportnm;
//};
//class apple() {};
//class melon() extends koreamelon {
//	protected String name; //성공
//	private String id; //성공
//	default String model; //성공
//	public String passportnm; //성공
//};
//class banana() {};
//class strawberry() {};
//
//package fruit2;
//
//class carrot() {};
//class onion() {};
//
//
//
//package fruit3;
//
//
//import fruit;
//class watermelon() extends koreamelon {
//	protected String name; //성공
//	private String id; //실패
//	default String model; //실패
//	public String passportnm; //성공
//};
//
//
//결론: 접근제어자는 public,private,default,protected등이 있으며
//1. 같은 패키지 상에 있는지
//2. 상속관계 클래스 상에 있는지
//3. public으로 공용설정
//인지에 따라 달라진다
//
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
//class Company {
//	void earMoney() {
//		System.out.println("돈을벌다.");
//	}
//	
//}
//class hd extends Company{
//	void earMoney() {
//		System.out.println("배를 건조하다.");
//	}
//}
//class samsung extends Company{
//	void earMoney() {
//		System.out.println("전자제품을 만들어 돈을 벌다");
//	}
//}
//다음 코드와 같이 company라는 기본틀(클래스)를 생성한후
//hd,samsung클래스와 같이 사용자가 원하는 방식,방향,코드규칙을 작성한 후
//기본틀을 상속개념(super)를 통해 끌고온후 필드,메소드등을 사용하는 환경,코드에 맞게 재정의 및 작성하는 것이 다형성이다.

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
	


