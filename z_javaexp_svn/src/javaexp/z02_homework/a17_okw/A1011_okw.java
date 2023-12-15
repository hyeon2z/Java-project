package javaexp.z02_homework.a17_okw;

import javaexp.a08_access.story2.woodcutterhome.WoodCutter;

public class A1011_okw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
		// 현재 클래스에 있는 멤버(구성요소)와 상위 클래스에 있는 내용을
		// 구분하기 위하여 super, this를 사용한다
		/*
		class Mother{
			String name;
			Mother(String name){
				this.name = name;
			}
		}
		class Son{
			String name;
			Son(String name){
				super("박옥자");  // 상위클래스 생성자를 호출하는 것을 구분하기 위해.
			}
		}
		 */
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
		//부모 클래스의 상속 메서드를 동일한 이름(매개변수도 동일) 으로
		// 다시 자식 클래스에서 정의하는 것을 말한다.
		/*
		class Mother {
			void face(){
				System.out.println("얼굴 유전");
			}
		}
		class Son extends Father{
			void face(){
				super.face();
				System.out.println("눈이 크다");
			}
		}
		*/
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
		/*
		1. 오버로딩
			이름이 같은 메소드, 리턴형은 같아도 달라도 상관없으나 parameter 개수가 달라야 한다.
			parameter 개수가 같을 경우 데이터 타입이 달라야 한다.
			이름은 같지만 시그니처(매개변수 수, 타입)이 다른 메소드를 중복으로 선언하는 것을 의미.
		2. 오버라이딩
			오버라이드 하고자 하는 메소드가 상위클래스에 존재해야 한다. 메소드 이름이 같아야 한다.
			메소드 parameter 수와 자료형이 같아야 한다. 또 메소드 리턴형이 같아야 한다.
			상위메소드와 동일하거나 내용이 추가되어야 한다.
			오버라이딩은 부모클래스의 메소드의 동작 방법을 변경(재정의)하여 우선적으로 사용하는 것이다.
			
		 */
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다.
//				Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
			Dog01 dog = new Dog01();
			dog.sound();
			Cat01 cat = new Cat01();
			cat.sound();
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. Circle과 Rectangle 클래스는 Shape을 상속받습니다. 
//				두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
			Rectangle1 rt1 = new Rectangle1(4,3);
			rt1.area();
			Circle cc1 = new Circle(4);
			cc1.area();
//			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 
//				두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
			Adder add1 = new Adder();
			add1.operation();
			Subtractor sub1 = new Subtractor();
			sub1.operation();
			
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2 : 당근, 양파
//		         패키지3 : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
			/*
			1) private : 필드, 생성자, 메서드
					모든 외부 클래스에서 접근할 수 없다. 내부 클래스에서만 사용 가능
			2) default : 클래스, 필드, 생성자, 메서드
					다른 패키지에 소속된 클래스에서는 호출할 수 없다. 같은 패키지에 있는 클래스들끼리 호출
			3) protected : 필드, 생성자, 메서드
					자식 클래스가 아닌 다른 패키지에 소속된 클래스는 접근 불가. 외부패키지라도 상속관계가 있으면 접근 가능하다.
			4) public : 클래스, 필드, 생성자, 메서드
					외부 패키지라도 import만 하면 접근하여 사용할 수 있다. 패키지명.클래스명 선언 형식으로 처리하면 사용할 수 있다.
			# 패키지 1
				class 참외{
					private String color = "노란색";
					String flavor = "달다";
					protected String price = "싸다"
					public String kind = "과일이다" 
					public void call참외() {
					참외 cham = new 참외();
					System.out.println("private:" + cham.color);
					System.out.println("default:" + cham.flavor);
					System.out.println("protected:" + cham.price);
					System.out.println("public:" + cham.kind);
				}
				}
				class 사과{
				}
				class 멜론 extends 참외{
				}
				class 바나나{
				}
				class 딸기{
				}
			*/
			
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
//			# 다형성(Polymorphism)
//				공통 멤버를 가진 상위클래스를 상속받은 하위클래스에서 기능적 분리를 하는 메서드를 상위 클래스의 이름(매개변수)와
//				동일하게 정의하여 다양한 기능을 처리하는 것을 말한다
			/*
			class Company {
				void earnMoney() {
					System.out.println("돈을 벌어들이다.");
				}
			}
			class Hyundai extends Company{
				void earnMoney() {
					System.out.println("배를 건조해서 돈을 벌다.");
				}
			}
			===> 메인 메서드 출력
			Company c01 = new Hyundai();
			c01.earMoney();
			*/
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
				Food f01 = new Pizza();
				Food f02 = new Burger();
				Food f03 = new Salad();
				f01.consume();
				f02.consume();
				f02.consume();
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
	}
}
abstract class Food{
	abstract void consume();
}
class Pizza extends Food{
	String name = "피자";
	@Override
	void consume() {
		System.out.println("음식을 먹는다");
		System.out.println(name + "가 소비되었습니다.");
	}
}
class Burger extends Food{
	String name = "햄버거";
	@Override
	void consume() {
		System.out.println("음식을 먹는다");
		System.out.println(name + "가 소비되었습니다.");
	}
}
class Salad extends Food{
	String name = "샐러드";
	@Override
	void consume() {
		System.out.println("음식을 먹는다");
		System.out.println(name + "가 소비되었습니다.");
	}
}
class Calculator{
	void operation(){
		System.out.println("연산 결과 출력");
	}
}
class Adder extends Calculator{
	@Override
	void operation() {
		super.operation();
		System.out.println("덧셈을 한다.");
	}
}
class Subtractor extends Calculator{
	@Override
	void operation() {
		super.operation();
		System.out.println("뺄셈을 한다.");
	}
	
}
class Shape {
	double area() {
		System.out.println("도형의 넓이 계산");
		return 0.0;
	}
}
class Rectangle1 extends Shape{
	double a;
	double b;
	public Rectangle1(double a, double b) {
		this.a = a;
		this.b = b;
	}
	@Override
	double area() {
		super.area();
		double rectangleArea = a*b;
		System.out.println("사각형의 넓이 : " + rectangleArea);
		return rectangleArea;
	}
}
class Circle extends Shape{
	double a;
	public Circle(double a) {
		this.a = a;
	}
	@Override
	double area() {
		super.area();
		double circleArea = a*a*Math.PI;
		System.out.println("원의 넓이 : "+circleArea);
		return circleArea;
	}
	
}
class Animal01{
	void sound() {
		System.out.println("동물이 울음소리를 낸다.");
	}
}
class Dog01 extends Animal01{
	@Override
	void sound() {
		super.sound();
		System.out.println("컹컹!");
	}
}
class Cat01 extends Animal01{
	@Override
	void sound() {
		super.sound();
		System.out.println("야옹~~");
	}
	
}