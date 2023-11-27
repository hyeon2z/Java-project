package javaexp.z02_homework.a21_hcj.h1011;

public class A1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
				class Person{
					private String name;
					private int age;
					Person(){
						this.name = "이름없음";	// this는 자기 자신
						this.age = 1;
					}
					
				}
				class Man extends Person{
					Man(int age){	
						super();	// super는 상속받은 조상
						super.age = age;
					}
				}
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
				// 같은 메소드명을 가지고있고 같은 매개변수를 가지고있는 메서드를 재정의 하는것
				class Draw{
					void Drawing() {
						System.out.println("그림을 그리다");
					}
				}
				class Triangle extends Draw{
					void Drawing() {
						System.out.println("삼각형을 그리다");
						
					}
				}
				
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
				//오버로딩은 같은 매소드명을 매개변수에 따라 다르게 처리하기위해
				//같은 메소드명으로 다양한 메서드를 정의하는것 ex)void show(){},void show(string name){}..
				//오버라이딩은 같은 메소드명 같은 매개변수를 가진 매서드를 재정의해서 사용하는것
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
//			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
			class Animal{
				void sound() {
				System.out.println("동물의 소리를 출력합니다.");
				}
			}
			class Dog extends Animal{
				void sound() {
					System.out.println("멍멍");
				}
			}
			class Cat extends Animal{
				void sound() {
					System.out.println("멍멍");
				}
			}
			Animal ani = new Animal();
			ani.sound();
			Cat cat = new Cat();
			cat.sound();
			Dog dog = new Dog();
			dog.sound();
			//------2--------
			class Shape{
				void area() {
					System.out.println("면적을 출력합니다.");
				}
			}
			class Circle extends Shape{
				private int radius = 3;
				void area() {
					System.out.println("원의 면적을 출력합니다.");
					System.out.println(radius * radius / Math.PI);
				}
			}
			class Rectangle extends Shape{
				private int width = 5;
				private int height = 7;
				void area() {
					System.out.println("직사각형의 면적을 출력합니다.");
					System.out.println(width * height);
				}
			}
			Shape sp = new Shape();
			Circle cle = new Circle();
			Rectangle rec = new Rectangle();
			sp.area();
			cle.area();
			rec.area();
			//-------------3-----------
			class Calculator{
				Calculator(){}
				void operation() {
					System.out.println("연산 결과를 출력합니다");		
				}
			}
			class Adder extends Calculator{
				private int num1;
				private int num2;
				Adder(int num1,int num2){
					super();
					this.num1 = num1;
					this.num2 = num2;
				}
				void operation() {
					System.out.println("더한 연산 결과는"+(num1+num2));		
				}
			}
			class Subtractor extends Calculator{
				private int num1;
				private int num2;
				Subtractor(int num1,int num2){
					super();
					this.num1 = num1;
					this.num2 = num2;
				}
				void operation() {
					System.out.println("뺄셈한 연산 결과는"+(num1-num2));		
				}
			}
			Adder ad = new Adder(1,2);
			ad.operation();
			Subtractor sb = new Subtractor(5,1);
			sb.operation();
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2 : 당근, 양파
//		         패키지3 : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
			//package1,2,3참조

		
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
			//같은 행위의 매소드를 다양한 자손에서 다르게 사용할수 있는것
			class fruit{
				void showName() {}
			}
			class grape extends fruit{
				void showName() {
					System.out.println("포도");
				}
			}
			fruit f01=new grape();
			f01.showName();
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
//		
			abstract class Food{
				abstract void consume();
			}
			class Pizza extends Food{
				private String name = "피자";
				@Override
				void consume() {
					System.out.println(name+"이 소비되었습니다.");
				}
			}
			class Salad extends Food{
				private String name = "샐러드";
				@Override
				void consume() {
					System.out.println(name+"이 소비되었습니다.");
				}
			}
			class Burger extends Food{
				private String name = "버거";
				@Override
				void consume() {
					System.out.println(name+"이 소비되었습니다.");
				}
			}
			Food[] f1 = {new Pizza(),new Salad(),new Burger()};
			for(Food f:f1) {
				f.consume();
			}
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
	}

}
