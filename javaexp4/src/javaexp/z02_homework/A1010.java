package javaexp.z02_homework;

public class A1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
//		class Q1 {
			
//		}
//		
//		class Question extends Q1 {
//			
//		}
		
//		이러한식으로 부모클래스 Q1 과 상속을 받을 Question클래스를 나타내었다.
//		이렇게되면 Question 클래스에서 Q1에 있는 요소들를 사용할 수 있다.
		
//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
//		class Parent {
//			void show() {
//				System.out.println("부모의 메서드");
//			}
//		}
//		class Child extends Parent {
//			void show2() {
//				show()
//				System.out.println("자식의 메서드");
//			}
//		}
//		이러하게 코드를 작성하면 자식클래스에서 부모의 show 메서드를 사용할 수 있음. 자식클래스의 메서드 안에서 호출해도 되고
//		main() 안에서 참조변수를 통해 부모의 show() 메서드를 호출할 수도 있다.
		
//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
//		부모 클래스에서 기본생성자가 아닌 매개변수가 있는 생성자를 사용하는 경우에
//		super("매개변수값") 으로 나타낸다.
		
//		기술하지않는경우 default로 기본 생성자가 나오듯, super도 기본으로 super()상태로 존재한다.
		
//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
		class Animal {
			String kind = "종류 없음";
			
			void sound() {
				System.out.println("울음소리 없슴");
			}
		}
		class Dog extends Animal {
			String kind = "강아지";
			
			void sound() {
				System.out.println("멍멍");
			}
			void show() {
				System.out.println("동물 종류 : " + this.kind);
				System.out.println("동물 종류 : " + super.kind);
				this.sound();
				super.sound();
			}
		}
		
		Dog d01 = new Dog();
		d01.show();
		
//		this = 자식클래스의 요소
//		super = 부모클래스의 요소
		
		
		
//		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//				introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//				introduce() 메서드를 통해 학년도 함께 소개합니다.
//		Student st01 = new Student();
//		st01.name = "홍길동";
//		st01.age = 13;
//		st01.grade = "6학년";
//		st01.introduce2();
		
//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다.
//		 Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
//		Dog d01 = new Dog();
//		Cat c01 = new Cat();
//		
//		d01.Sound = "멍멍";
//		c01.Sound = "야옹";
//		
//		d01.dogSound();
//		c01.catSound();
		
//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
//		Employee emp01 = new Employee();
//		emp01.infoEmp();
		
//		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요.
//		 Person 클래스의 생성자에서 name과 age를 초기화하고, Student 클래스의 생성자에서는 grade를 초기화합니다.
//		Student st01 = new Student("6학년");
//		st01.stuInfo();
		
//      # 위 과제는 개인톡으로 전달부탁합니다.		
//
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 프로젝트 진행관련 의문/요청사항
//		3. 오늘 지각(9:00기준)/수업시간 엄수(매시간0:00)/수업시간 집중 하였는가?
		

	}

}
//class Person {
//	String name;
//	int age;
//	Person(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//}
//class Employee extends Person {
//	String company;
//	String job;
//	
//	Employee(){
//		super("철수", 23);
//	}
//	void infoEmp() {
//		System.out.println("직원의 정보");
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("회사 : " + company);
//		System.out.println("직업 : " + job);
//	}
//}



//class Person {
//	String name;
//	int age;
//	
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//}
//class Student extends Person {
//	String grade;
//	
//	Student(String grade){
//		super("홍길동", 13);
//		this.grade = grade;
//	}
//	void stuInfo() {
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("학년 : " + grade);
//	}
//}
//class Animal {
//	String Sound;
//	
//	void sound() {
//		System.out.println(Sound);
//	}
//}
//class Dog extends Animal {
//	void dogSound() {
//		sound();
//	}
//}
//class Cat extends Animal {
//	void catSound() {
//		sound();
//	}
//}
//class Person {
//	String name;
//	int age;
//	
//	void introduce() {
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//	}
//}
//
//class Student extends Person {
//	String grade;
//	
//	void introduce2() {
//		introduce();
//		System.out.println("학년 : " + grade);
//	}
//}