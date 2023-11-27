package javaexp.z02_homework.a19_cjw;

import java.util.*;

public class A1011_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
		/*
		1. super() 생성자는 상속받는 클래스에서 상위클래스의 생성자를 호출(필수)하기 위해 사용한다.
			1) super()을 작성하지 않더라도 default값으로 존재한다.
			2) 상속받는 클래스의 생성자에 매개변수가 존재할 경우 반드시 suepr(매개변수)를 사용하여 호출해야 한다.
		2. this() 생성자는 현재 클래스에서 앞서 정의된 생성자를 호출(재사용 목적)하기 위해 사용한다.
			1) this() => 매개변수가 없는 생성자 호출
			2) this(매개변수) => 해당 매개변수가 있는 생성자 호출
		
		-----예제-----
		class Parent{
			String str;
			Parent(String str){
				this.str = str;
				System.out.println("상위클래스의 생성자");
			}
		}
		class Son extends Parent{
			int num01;
			String str2;
			Son(){
				super("문자열");
				System.out.println("하위클래스의 생성자");
			}
			Son(int num01){
				this();
				this.num01 = num01;
			}
			Son(int num01,String str2){
				this(num01);
				this.str2 = str2;
			}
		}
		 * */
		
		// [1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
		/*
		오버라이딩(overriding) : 상위클래스에서 정의된 메서드를 하위클래스(상속받는 클래스)에서
							   같은 이름, 같은 매개변수로 재정의하는 것을 의미한다.
							   상위클래스의 메서드를 하위클래스에서 다양하게 활용할 수 있도록 하는 것이 목적이다.
		
		-----예제-----
		class Parent{
			void call(){
				System.out.println("상위클래스의 메서드");
			}
		}
		class Son extends Parent{
			@Override	// 컴파일시 상위클래스의 메서드 선언부와 동일한지 확인하는 코드
			void call(){
				super.call();	// 이 부분은 꼭 사용하지 않아도 상관없다.
				System.out.println("하위클래스의 메서드");
			}
		}
		 * */
		
		// [1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
		/*
		오버로딩 : 하나의 클래스 안에서 여러 생성자를 생성하는 것을 의미한다.
				 이때 생성자끼리 매개변수의 수 또는 데이터타입이 달라야 한다.
		오버라이딩 : 상위클래스에서 정의된 메서드를 하위클래스에서 재정의하는 것을 의미한다.
		 * */
		
		/*
		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다.
			   Dog와 Cat 클래스는 Animal을 상속받습니다.
			   두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다.
			   Circle과 Rectangle 클래스는 Shape을 상속받습니다.
			   두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다.
               Adder와 Subtractor 클래스는 Calculator를 상속받습니다.
               두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
		 */
		// 1)
		Animal01[] animal = {new Dog01(),new Cat01()};
		animal[0].sound();
		animal[1].sound();
		// 2)
		Shape s01 = new Circle();
		s01.area(3);
		Shape s02 = new Rectangle01();
		s02.area(2);
		// 3)
		ArrayList<Calculator> calculator = new ArrayList<Calculator>();
		calculator.add(new Adder());
		calculator.add(new Subtractor());
		calculator.get(0).operation(3,5);
		calculator.get(1).operation(5,3);
		
		/*
		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
		         패키지2 : 당근, 양파
		         패키지3 : 수박(참외상속)
		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
		 */
		/*
		public : import만 하면 모든 클래스에서 접근 가능
		X(default) : 같은 패키지의 클래스들에서만 접근 가능
		protected : 같은 패키지의 클래스들과 상속받는 클래스들(외부패키지여도 상관없음)에서만 접근 가능
		private : 해당 클래스에서만 접근 가능
		
		---------------------------------------
		package z01_Homework.vo2.package1;

		public class KoMelon {
			public String str1 = "가";
			String str2 = "나";
			protected String str3 = "다";
			private String str4 = "라";
	
			// 상속하는 클래스에서 호출
			void show1() {
				System.out.println("public: "+str1);
				System.out.println("X(default): "+str2);
				System.out.println("protected: "+str3);
				System.out.println("private: "+str4);
			}
	
			// 상속하지 않는 일반 클래스에서 호출
			void show2() {
				KoMelon km = new KoMelon();
				System.out.println("public: "+km.str1);
				System.out.println("X(default): "+km.str2);
				System.out.println("protected: "+km.str3);
				System.out.println("private: "+km.str4);
			}
		}
		---------------------------------------
		package z01_Homework.vo2.package1;

		public class Apple {	// 같은 패키지, 상속받지 않음
			// 상속하지 않는 일반 클래스에서 호출
				void show2() {
					KoMelon km = new KoMelon();
					System.out.println("public: "+km.str1);
					System.out.println("X(default): "+km.str2);
					System.out.println("protected: "+km.str3);
					// System.out.println("private: "+km.str4);
				}
		}
		-----------------------------------------
		package z01_Homework.vo2.package1;

		public class Melon extends KoMelon {	// 같은 패키지, 상속받음
			// 상속하는 클래스에서 호출
				void show1() {
					System.out.println("public: "+str1);
					System.out.println("X(default): "+str2);
					System.out.println("protected: "+str3);
					// System.out.println("private: "+str4);
				}
		}
		------------------------------------------
		package z01_Homework.vo2.package2;

		import z01_Homework.vo2.package1.KoMelon;

		public class Carrot {	// 다른패키지, 상속받지 않음
			// 상속하지 않는 일반 클래스에서 호출
				void show2() {
					KoMelon km = new KoMelon();
					System.out.println("public: "+km.str1);
					// System.out.println("X(default): "+km.str2);
					// System.out.println("protected: "+km.str3);
					// System.out.println("private: "+km.str4);
				}
		}
		------------------------------------------
		package z01_Homework.vo2.package3;

		import z01_Homework.vo2.package1.KoMelon;

		public class Watermelon extends KoMelon {	// 다른패키지, 상속받음
			// 상속하는 클래스에서 호출
				void show1() {
					System.out.println("public: "+str1);
					// System.out.println("X(default): "+str2);
					System.out.println("protected: "+str3);
					// System.out.println("private: "+str4);
				}
		}
		 * */
		
		// [1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
		/*
		다형성 : 같은 상위클래스들 가진 하위클래스들이 상위클래스의 메서드를 오버라이딩하여
			    다양한 기능을 처리할 수 있는 것.
			    상위 = 하위
		-----예제-----
		class Parent{
			void show(){
				System.out.println("상위클래스의 메서드");
			}
		}
		class Son extends Parent{
			void show(){
				System.out.println("하위클래스 Son의 메서드");
			}
		}
		class Daughter extends Parent{
			void show(){
				System.out.println("하위클래스 Daughter의 메서드");
			}
		}
		Parent p01 = new Son();
		p01.show();
		Parent p02 = new Daughter();
		p02.show();
		 */
		
		/*
		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
				음식 추상 클래스:
				Food라는 추상 클래스를 생성하세요.
				consume라는 추상 메소드를 추가하세요.
				이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요.
				각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
		 */
		Food f01 = new Pizza();
		f01.consume();
		Food f02 = new Salad();
		f02.consume();
		Food f03 = new Burger();
		f03.consume();
		
	}

}

/*
[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
	1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다.
	   Dog와 Cat 클래스는 Animal을 상속받습니다.
	   두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
	2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다.
	   Circle과 Rectangle 클래스는 Shape을 상속받습니다.
	   두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
	3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다.
       Adder와 Subtractor 클래스는 Calculator를 상속받습니다.
       두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
 */
// 1)
class Animal01{
	void sound() {
		System.out.println("동물소리");
	}
}
class Dog01 extends Animal01{
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat01 extends Animal01{
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
// 2)
class Shape{
	int num;
	void area(int num) {
		System.out.println("면적출력");
	}
}
class Circle extends Shape{
	int diameter;
	@Override
	void area(int diameter) {
		System.out.println("원의 면적: "+(diameter*diameter*Math.PI));
	}
}
class Rectangle01 extends Shape{
	int length;
	@Override
	void area(int length) {
		System.out.println("사각형의 면적: "+(length*length));
	}
}
// 3)
class Calculator{
	int num01;
	int num02;
	void operation(int num01, int num02) {
		System.out.println("연산결과");
	}
}
class Adder extends Calculator{
	int num01;
	int num02;
	@Override
	void operation(int num01, int num02) {
		System.out.println(num01+" + "+num02+" = "+(num01+num02));
	}
}
class Subtractor extends Calculator{
	int num01;
	int num02;
	@Override
	void operation(int num01, int num02) {
		System.out.println(num01+" - "+num02+" = "+(num01-num02));
	}
}

/*
[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
		음식 추상 클래스:
		Food라는 추상 클래스를 생성하세요.
		consume라는 추상 메소드를 추가하세요.
		이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
		이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요.
		각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
 */
abstract class Food{
	String name;
	Food(String name){
		System.out.println("음식종류 : "+name);
	}
	abstract void consume();
}
class Pizza extends Food{
	Pizza(){
		super("피자");
	}
	void consume() {
		System.out.println("피자가 소비되었습니다.");
	}
}
class Salad extends Food{
	Salad(){
		super("샐러드");
	}
	void consume() {
		System.out.println("샐러드가 소비되었습니다.");
	}
}
class Burger extends Food{
	Burger(){
		super("버거");
	}
	void consume() {
		System.out.println("버거가 소비되었습니다.");
	}
}
