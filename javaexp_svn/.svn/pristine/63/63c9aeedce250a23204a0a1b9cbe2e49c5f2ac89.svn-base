package javaexp.z02_homework.a10_kdh.a01_1011;

public class A02_1011 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
		// this()는 클래스내에 자기 자신의 생성자를 호출하는 키워드, super()는 자기 자신의 상위 클래스의 생성자를 호출하는 키워드.
		/*
		 class Animal{
		 	String kind;
		 	public Animal(String kind){
		 		this.kind = kind;
		 	}
		 }
		 class Dog extends Animal{
		 	String sound;
		 	public Dog(String kind,String sound){
		 		super(kind);
		 		this.sound = sound;
		 		
		 	}
		 }
		 부모 클래스가 먼저 생성되어야 자식 클래스가 생성될 수 있다.
		 */
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
		/*
		 오버라이딩이란 상위클래스의 메서드를 하위클래스에서 재정의하는 것이다.
		 class Animal{
		 	public void sound(){
		 		System.out.println("울음소리");
		 	}
		 }
		 class Dog extends Animal{
		 	@Overriding
		 	public void sound(){
		 		System.out.println("멍멍");
		 	}
		 }
		 */
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
		// 오버로딩은 기본생성자를 제외한 다른형태의 생성자를 여러가지 만드는 것이고, 오버라이딩은 상위클래스의 메서드를 하위클래스에서 재정의하는 것이다.
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
			/*
			 class Animal{
		 	
		 		public void sound(){
		 			System.out.println("동물 소리");
		 		}
		 	 }
		 	class Dog extends Animal{
		 		@Overriding
		 		public void sound(){
		 			System.out.println("멍멍");
		 		}
		    }
		    class Cat extends Animal{
		 		@Overriding
		 		public void sound(){
		 			System.out.println("야옹야옹");
		 		}
		    }
		    Animal cat = new Cat();
		    Animal dog = new Dog();
		    cat.sound();
		    dog.sound();
			 */
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
			/*
		 	class Shape{
	 			int height;
	 			int width;
	 			final int PI = 3.14;
	 			public void area(){
	 				System.out.println("면적 계산");
	 			}
	 	 	}
	 		class Circle extends Shape{
	 			double radius;
	 			@Overriding
	 			public int area(){
	 				return width * height;
	 			}
	    	}
	    	class Rectangle extends Shape{
	 			@Overriding
	 			public double sound(){
	 				return PI * (radius * radius); 
	 			}
	    	}
	    
			 */
//			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
			/*
	 		class Calculator{
 				int num1;
 				int num2;
 				public void operation(){
 					System.out.println("면적 계산");
 				}
 	 		}
 			class Adder extends Calculator{
 				@Overriding
 				public int operation(){
 					return num1 + num2;
 				}
    		}
    		class Substractor extends Calculator{
 				@Overriding
 				public int operation(){
 					return num1 - num2; 
 				}
    		}
		 */
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
		/*
					 class OrientalMelon{
					 	private String name;
					 	protected String kind;
					 	int price;
					 	public int cnt;
					 }
					 class Melon extends OrientalMelon{
					 }
					 class Apple{
					 }
					 class Banana{
					 }
					 class StrawBerry{
					 }
//		         패키지2 : 당근, 양파
 * 					class Carrot{
 * 					}
 * 					class Onion{
 * 					}
//		         패키지3 : 수박(참외상속)
 * 					class WaterMelon{
 * 					}
		         	패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
		         	
					private 접근제어자 필드는 OrientalMelon의 클래스에서만 사용이 가능하고
		 			OrientalMelon의 클래스를 상속받은 Melon과 WaterMelon은 protected 접근제어자로 선언된 필드 사용가능
		 			default(X) 접근제어자로 선언된 필드는 같은 패키지 내에서 사용 가능
		 			public은 import만 한다면 어떤 클래스든 사용가능.
		 */
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
		//		class Part{
		//			void showInf(){
		//				System.out.println("컴퓨터의 부품");
		//			}
		//		}
		//		class Cpu extends Part{
		//			void showInf(){
		//			    super.showInf();
		//				System.out.println("중앙처리장치")
		//			}
		//		}
		//		class Ram extends Part{
		//			void showInf(){
		//				super.showInf();
		//				System.out.println("메모리장치")
		//			}
		//		}
		//		Part p01 = new Cpu();
		//		Part p02 = new Ram();
		//		p01.showInf(); // 중앙처리장치
		//		p02.showInf(); // 메모리장치 출력..
		// 		이처럼 다형성은 같은 상위클래스를 상속받는 클래스들을 상위 타입으로 선언하여 상위타입의 클래스명으로 제어하는것이다.
		
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
				/*
				 abstract Class Food{
				 	abstract void consume();
				 }
				 class Pizza extends Food{
				 	@Overriding
				 	public void consume(){
				 		System.out.println("Pizza가 소비되었습니다.");
				 	}
				 }
				 class Salad extends Food{
				 	@Overriding
				 	public void consume(){
				 		System.out.println("Salad가 소비되었습니다.");
				 	}
				 }
				 class Burger extends Food{
				 	@Overriding
				 	public void consume(){
				 		System.out.println("Burger가 소비되었습니다.");
				 	}
				 }
				 Food pizza = new Pizza();
				 Food salad = new Salad();
				 Food burger = new Burger();
				 
				 ArrayList<Food> fList = new ArrayList<Food>();
				 
				 fList.add(pizza);
				 fList.add(salad);
				 fList.add(burger);
				 
				 for(Food fd : fList){
				 	fd.consume();
				 }
				 */
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
	}
}

