package javaexp.z02_homework.a03_ls;

import javaexp.z02_homework.a03_ls.vo2.Adder;
import javaexp.z02_homework.a03_ls.vo2.Animal;
import javaexp.z02_homework.a03_ls.vo2.Calculator;
import javaexp.z02_homework.a03_ls.vo2.Cat;
import javaexp.z02_homework.a03_ls.vo2.Circle;
import javaexp.z02_homework.a03_ls.vo2.Dog;
import javaexp.z02_homework.a03_ls.vo2.Rectangle;
import javaexp.z02_homework.a03_ls.vo2.Subtractor;


public class A1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
		/*
		class A{
			String name;
			A(String name){
				this.name=name;
			};
		}
		class B extends A{
			int number;
			B(int number){
				super("홍길동");
				this.number=number
			}
		}
		
		처럼 상위클래스에 있는 생성자를 구분하여 쉽게 호출하기 위해 사용합니다.
		 * */
		
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
		/*
		오버라이딩이란 상위클래스에 어떠한 메소드를 설정했을때 상속받은 하위 클래스에서
		동일한 이름으로 메서드를 호출하고 재정의하는것을 말합니다.
		class A{
			String name;
			A(String name){
				this.name=name;
			}
			public void show(){
				System.out.println("나는 A다");
			}
		}
		class B extends A{
			int number;
			B(int number){
				super("홍길동");
				this.number=number
			}
			public void show(){
				System.out.println("나는 B다");
			}
		}
		
		이런경우 하위 클래스에서 메서드를 재정의해 메인창에서 B클래스에 대한 객체를 생성해 show()라는
		메서드를 호출할경우, 나는 B다 가 출력됩니다.
		 * */
		
		
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
		
		/*
		오버로딩은 생성자를 설정할때 변수를 이렇게 저렇게 바꿔가며 선언하는 방식이고,
		오버라이딩은 상속관계에서 상위 클래스의 메서드와 동일한 이름의 메서드를 하위에서 설정할경우
		재정의하는 개념입니다. 
		 * */
		
		
		
		
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요

//	1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. 
//			Dog와 Cat 클래스는 Animal을 상속받습니다. 
//			두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
		Animal a01 = new Cat();
		Animal a02 = new Dog();
		a01.sound();
		a02.sound();
		
		
//	2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. 
//			Circle과 Rectangle 클래스는 Shape을 상속받습니다. 
//			두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
		Circle c01 = new Circle(5.0);
		c01.area();
		Rectangle r01 = new Rectangle(4,6);
		r01.area();
		
		
		
//	3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다.
//			Adder와 Subtractor 클래스는 Calculator를 상속받습니다/
//			두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
		Calculator c1 = new Adder(1,2);
		c1.operation();
		Calculator c2 = new Subtractor(5,2);
		c2.operation();

//[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2 : 당근, 양파
//		         패키지3 : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
		
		/*
		접근제어자는 private, default, protected, public 이 있습니다. 
		먼저 private 은 같은 클래스가 아니라면 접근할 수 없고, 
		default 는 같은 패키지 내라면 접근이 가능하지만 외부패키지에서는 접근할 수 없습니다.
		protected 는 외부패키지여도 상속관계라면 접근이 가능하고
		public 는 외부패키지여도 import만 해준다면 사용이 가능합니다. 
		
		만약 패키지1에 있는 참외를 호출하려고 한다면 , private 로 선언하면 다른 어떠한 것도 접근할 수 없고,
		default 라면  패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기 와 같이 같이 패키지1에 있는 클래스에 접근할 수 있습니다.
		protected 라면 상속된 패키지3 : 수박(참외상속)에 접근할 수 있고,
		public 이라면 모든 패키지에서 접근이 가능합니다. 
		 * */

		
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
		
		/*
		 * 다형성이란 오버라이딩과 오버로딩을 통해 같은 이름으로 된 메서드 같은 것들을 하위 클래스에서 다양하게 바꾸어 재정의 하고 사용하는 것을
		 * 의미합니다.
		 * 
		 * abstract class Food{ abstract void consume(); } class Pizza extends Food{
		 * 
		 * @Override void consume() { System.out.println("피자가 소비되었습니다."); } } class
		 * Salad extends Food{
		 * 
		 * @Override void consume() { System.out.println("샐러드가 소비되었습니다."); } } class
		 * Burger extends Food{
		 * 
		 * @Override void consume() { System.out.println("버거가 소비되었습니다."); } }
		 * 
		 * 이렇게 오버라이딩을 통해 재정의해 각자 클래스에 맞게 사용할 수 있습니다. 
		 */
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
		Food f01 = new Pizza();
		Food f02 = new Salad();
		Food f03 = new Burger();
		f01.consume();
		f02.consume();
		f03.consume();

	}

}
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
