package javaexp.z02_homework.a18_LSD.homework1011;

public class A1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
//		class Worker{
//			private String kind;
//			//this는 이 클래스의 필드를 쓰겠다
//			public Worker(String kind) {
//				this.kind = kind;
//			}
//			public void working() {
//				System.out.println(kind+" 일을 합니다.");
//			}
//		}
//		
//		class Police extends Worker{
//			public Police() {
//				super("경찰관");
//			}
//			// 오버라이딩
//			public void working() {
//				super.working(); // 상위 내용을 처리
//				System.out.println("치안을 유지합니다.");
//				// 추가적으로 하위에서 재정의하여 처리
//			}	
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
		//# 메소드 재정의(overriding)
		//1. 부모 클래스의 상속 메서드를 동일한 이름(매개변수도 동일)으로
			//다시 자식 클래스에서 정의하는 것을 말한다.
		
//		class Programmer extends Worker{
//			public Programmer() {
//				super("프로그래머");
//			}
//			public void working() {
//				super.working();
//				System.out.println("소프트웨어 개발합니다.");
//			}
//		}
//		
//		class Fireman extends Worker{
//			public Fireman() {
//				super("소방관");
//				
//			}
//			
//			@Override 
//			public void working() {
//				super.working();
//				System.out.println("불을 끄다!!!");
//			}
//			
//		}
		
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
//		오버로딩(overloading)은 이름은 같지만 시그니처(파라미터 수, 타입) 데는 다른 메소드를 중복으로 선언하는 것을 의미하고, 
//		오버라이딩(overriding)은 부모 클래스의 메소드의 동작 방법을 변경(재정의)하여 우선적으로 사용하는 것이다.
		
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. 
//		Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
		
//		Animal a = new Dog();
//		a.sound();
//		Animal a1 = new Cat();
//		a1.sound();
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. 
//		Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
//		Shape s1 = new Circle();
//		s1.area();
//		Shape s2 = new Rectangle();
//		s2.area();
//			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 
//		두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
//		Calculator c = new Adder();
//		c.operation();
//		Calculator c1 = new Subtractor();
//		c1.operation();
//		
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2 : 당근, 양파
//		         패키지3 : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
//		# 다형성(Polymorphism)
//		1. 공통 멤버를 가진 상위클래스를 상속받은 하위클래스에서
//			기능적 분리를 하는 메서드를 상위 클래스의 이름(매개변수)와
//			동일하게 정의하여 다양한 기능을 처리하는 것을 말한다.
//		2. 상위 ==> 여러가지 하위 객체를 통해, 다양한 기능을
//			처리하는 것을 말한다.
//			ex) 컴퓨터 부분(Cpu, Ram, Ssd..)
//			class Part{
//				void showInf(){
//					System.out.println("컴퓨터의 부품");
//				}
//			}
//			class Cpu extends Part{
//				void showInf(){
//				    super.showInf();
//					System.out.println("중앙처리장치")
//				}
//			}
//			class Ram extends Part{
//				void showInf(){
//					super.showInf();
//					System.out.println("메모리장치")
//				}
//			}
//			// 상위 = 하위 : 같은 Part에서 상속받아서 여러가지
//			// 재정의 된 메소드에 의해 다양한 기능을 처리한다는 개념으로
//			// 다형성이라고 하고 있다.
//			Part p01 = new Cpu();
//			p01.showInf(); // 중앙처리장치
//			Part p02 = new Ram();
//			p02.showInf(); // 메모리장치 출력
		
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
		Food f = new Pizza();
		f.consume();
		Food f1 = new Salad();
		f1.consume();
		Food f2 = new Burger();
		f2.consume();
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
	}//main()

}//A1011{}

//[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. 
//Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.

class Animal{
	void sound() {
		System.out.println("동물소리");
	}
}//Animal{}

class Dog extends Animal{
	void sound() {
		System.out.println("멍멍");
	}
}//Dog{}

class Cat extends Animal{
	void sound() {
		System.out.println("냐옹");
	}
}//Dog{}

//2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. 
//Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
class Shape{
	int cm=5;
	
	void area(){
		int s = cm*cm;
		System.out.println(s);
	}
}//Shape{}

class Circle extends Shape{
	void area(){
		double s = cm*cm*3.14;
		System.out.println("원 넓이:"+s);
	}
}//Circle{}

class Rectangle extends Shape{
	int cc = 6;
	void area(){
		int sc = cm*cc;
		System.out.println("직사각형 넓이:"+sc);
	}
}//Rectangle{}

//3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. 
//Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 
//두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
class Calculator{
	int num1=1;
	int num2=5;
	
	void operation(){
		int add = num1+num2;
		int sub = num2-num1;
		System.out.println(add);
		System.out.println(sub);
	}
}//Calculator{}

class Adder extends Calculator{
	void operation(){
		int a = 5;
		int b = 6;
		int c = a+b;
		System.out.println("더한값="+c);
	}
}//Adder{}

class Subtractor extends Calculator{
	void operation(){
		int a = 5;
		int b = 10;
		int c = b-a;
		System.out.println("뺸값="+c);
	}
}//Subtractor{}

abstract //[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//음식 추상 클래스:
//Food라는 추상 클래스를 생성하세요.
//consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.

class Food{
	String ingredient;
	
	public Food(String ingredient) {
		// TODO Auto-generated constructor stub
		this.ingredient = ingredient;
	}
	
	abstract void consume();
	
	public void info() {
		System.out.println(ingredient+"소비됨");
	}

	
}//Food{}

class Pizza extends Food{
	public Pizza() {
		super("Pizza");
		// TODO Auto-generated constructor stub
	}
	
	void consume() {
		System.out.println(ingredient+"소비됐습니다.");
	};
	
	
}//Pizza{}

class Salad extends Food{
	public Salad() {
		super("Salad");
		// TODO Auto-generated constructor stub
	}

	void consume() {
		System.out.println("Salad 소비됐습니다.");
	};
}//Salad{}

class Burger extends Food{
	
	public Burger() {
		super("Burger");
		// TODO Auto-generated constructor stub
	}
	void consume() {
		System.out.println("Burger 소비됐습니다.");
	};
}//Burger{}

