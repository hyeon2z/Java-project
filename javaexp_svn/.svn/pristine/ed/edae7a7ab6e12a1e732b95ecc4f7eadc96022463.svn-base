package javaexp.z02_homework.a20_kjw;



public class A1010 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Child01 c01 = new Child01();
		c01.show();
		d1.show();
	
	}
}

		// TODO Auto-generated method stub
//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
		class Parent{
			String name = "기본물건";
			int age = 20;
		}
		class Child extends Parent{
			// public Parent() {} 컴파일 하는 순간 호출된다.(안보이지만 존재) 
			//Child클래스는 Parent의 요소(name,age)를 상속받았기때문에 child클래스를 
			//호출시 "기본물건",20이 출력된다.
		}	
		
		
//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
		class Parent01{
			String name="홍길동";
			void show() {
				System.out.println("3번문제: ");
				System.out.println("부모 클래스의 메서드");
			}
		}
		class Child01 extends Parent01{
			String name = "자식";
			void show() {
				super.show();
				System.out.println("자식 클래스의 메서드");
				System.out.println("#필드 #");
				System.out.println("현재 객체의 필드: "+this.name);
				System.out.println("부모 객체의 필드: "+super.name);
			}
			}
//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
		/*--super,this는 각각 부모객체에서의 필드, 현재 객체에서의 필드를 뜻한다. 
		부모객체의 기본 디폴드 생성자는 super(),현재 객체의 디폴드 생성자는 this()이다.
		*상위 하위객체 필드를 나누는 용도로 사용된다.
		*/
		
//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
		class Animal {
			String kind= "치와와";
			String sound="멍멍";
			void show() {
				System.out.println("animal 클래스의 메서드");
			}
		}
		class Dog extends Animal{
			String name = "치와와1";
			String sound ="으르렁";
			void show() {
				super.show();
				System.out.println("4번문제: 자식 클래스의 메서드");
				System.out.println("#필드 #");
				System.out.println("현재 객체의 필드"+this.name);
				System.out.println("부모 객체의 필드"+super.kind);
			}
				
		
	
		
//		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//				introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//				introduce() 메서드를 통해 학년도 함께 소개합니다.
//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
		class Person{
		String name1="name";
		int age;
			Person(String name,int age){
		this.name1 = name;
		this.age = age;
	}
		}
		}
//			
//		}
//		
//		class Employee extends Person{
//			String company;
//			String job;
//	Employee(String company,int age){
//		this.company = company;
//		this.age = age;
//		}
//	}
//	
//		
////			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
////		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고, Student 클래스의 생성자에서는 grade를 초기화합니다.
////      # 위 과제는 개인톡으로 전달부탁합니다.		
//class Person{
//	String name;
//	int age;
//	Person01(String name,int age){
//		this.name = name;
//	}
//			
//			
//		}
//		
//		class Employee extends Person{
//			String company;
//			String job;
//		}
		
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 프로젝트 진행관련 의문/요청사항
//		3. 오늘 지각(9:00기준)/수업시간 엄수(매시간0:00)/수업시간 집중 하였는가?
	




