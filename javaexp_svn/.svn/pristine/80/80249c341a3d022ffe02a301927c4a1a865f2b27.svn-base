package javaexp.z02_homework.a11_mhi;


public class A1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.

		// 부모 클래스와 자식 클래스
		// public class Person5 { // 부모클래스
		// String name;
		// private int age;

		// public void speak() {
		// System.out.println("저는 " + name + "입니다.");
		// }
		// }

		// class Dancer extends Person5 { // 자식클래스 (Person을 상속받음)
		// public void dance() {
		// System.out.println(name + ": 춤을 춥니다.");
		// }
		// }

		// 객체 생성 및 실행

		// Dancer dancer1 = new Dancer();

		// dancer1.name = "홍길동";
		// dancer1.speak(); // 결과 ) 저는 홍길동 입니다.
		// dancer1.dance(); // 결과) 홍길동: 춤을 춥니다.

//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
//		class Parent {
//			public void show() {
//				System.out.println("부모 클래스 메서드 호출");
//		}
//		}
//		class Child extends Parent{
//			public void show () {
//				System.out.println("자식 클래스 메서드 호출");
//		}

//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
		// 1. 부모 클래스의 생성자 호출
		// - 자식 클래스의 생성자에서 super 키워드를 사용하여
		// 부모 클래스의 생성자 호출 가능.
		// 2. 부모 클래스의 메서드 호출 가능

//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
//		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//				introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//				introduce() 메서드를 통해 학년도 함께 소개합니다.
		Person p01 = new Person("김축축", 15);
		Student1 st01 = new Student1("김축구", 13, 5);

		p01.introduce();
		st01.introduce();

		Dog d01 = new Dog();
		d01.sound();
		Cat c01 = new Cat();
		c01.sound();

	}
}

class Person {
	String name;
	int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void introduce() {
		System.out.println("저의 이름은" + name + "이고 나이는" + age + "입니다.");
	}
}

class Student1 extends Person {
	int grade;

	Student1() {
	}

	public Student1(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	void introduce() {
		System.out.println("저의 이름은" + name + "이고 나이는" + age + "살 입니다. 그리고" + grade + " 학년입니다.");

	}
}

//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다.
//       Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
class Animal1 {
	void sound() {
		System.out.println("울음소리 출력");
	}
}

class Dog extends Animal1 {
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal1 {
	void sound() {
		System.out.println("야옹");
	}
}

//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.

class Employee extends Person {
	String company;
	String job;

	Employee() {
	}

	Employee(String name, int age, String company, String job) {
		super("이름없음", 0);
		this.company = null;
		this.job = null;

	}

}

//		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고,
//       Student 클래스의 생성자에서는 grade를 초기화합니다.

class Student3 extends Person {
	String grade;

	Student3(String grade) {
		super("noname", 18);
		this.grade = grade;

	}
}

//      # 위 과제는 개인톡으로 전달부탁합니다.		
//
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 프로젝트 진행관련 의문/요청사항
//		3. 오늘 지각(9:00기준)/수업시간 엄수(매시간0:00)/수업시간 집중 하였는가?




//// 강사님 답안
////[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
////자바의 상속이란 기존의 클래스에 기능을 추가하거나 재정의하여 새로운 클래스를 정의하는 것을 의미합니다.
////상속을 이용하면 기존에 정의되어 있는 클래스의 모든 필드와 메소드를 물려받아, 새로운 클래스를 생성할 수 있습니다.
////즉, 부모 클래스를 자식 클래스가 포함하고 있는 형태입니다.
////1) 상속의 장점
////	1. 기존에 작성된 클래스를 재활용할 수 있습니다.
////	2. 자식 클래스 설계 시 중복되는 멤버를 미리 부모 클래스에 작성해 놓으면, 자식 클래스에서는 해당 멤버를 작성하지 않아도 됩니다.
////	3. 클래스 간의 계층적 관계를 구성함으로써 다형성의 문법적 토대를 마련합니다.
////문법) 부모클래스를 먼저 생성하고
////	class 자식클래스이름 extends 부모클래스이름 { ... }
////[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
////class Parent{
////	String name;
////	int age;
////	public void hi() {
////		System.out.println("안녕하세요 부모입니다.");
////	}
////}
////class Child extends Parent{
////	int childNum;
////	public void hi2() {
////		hi(); //부모에게 상속받은 메서드
////		System.out.println("나는 자식입니다.");
////	}
////}
////[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
////1)super는 자신이 상속받은 부모 클래스에 대한 레퍼런스 변수로, 부모 클래스의 멤버에 접근할 때 사용됩니다.
////		주로 객체안에 있는 부모의 멤버변수를 구별하기 위해 사용됩니다.
////2)super()는 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하기 위해서 사용됩니다.
////		반드시!! 자식 클래스의 모든 생성자는 부모 클래스의 생성자를 포함하고 있어야 합니다. 
////		그런데 만약 자식 클래스의 생성자에 부모 클래스의 생성자가 지정되어 있지 않다면, 
////		컴파일러가 자동으로 부모 클래스의 기본생성자를 호출합니다.//super();
////		하지만 부모생성자에 매개변수가 있는 경우 기본생성자가 자동으로 만들어지지 않기 때문에,
////		부모에게 기본생성자를 추가하던지 super(매개변수)를 통해 부모가 생성될 수 있게 해야합니다.
////[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
////Dog dog= new Dog();
////dog.show();
////[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
////introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
////introduce() 메서드를 통해 학년도 함께 소개합니다.
////  Student st = new Student();
////  st.name = "최톰";
////  st.age = 11;
////  st.grade = 4;
////  st.introduce();
////[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다.
////Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
////Dog dog= new Dog();
////dog.sound();
////Cat cat= new Cat();
////cat.sound();
////[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
////Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
////Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
////class Person3 {
////    public String name;
////    public int age;
////    
////    Person3(String name,int age){
////    	this.name=name;
////    	this.age=age;
////    }
//// }
////class Employee extends Person3{
////	public String company;
////	public String job;
////	
////	Employee(){
////		super("홍길동",35);
////	}
////	
////}
////[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고,
////Student 클래스의 생성자에서는 grade를 초기화합니다.
////# 위 과제는 개인톡으로 전달부탁합니다.		
////class Person4{
////	public String name;
////    public int age;
////    
////    Person4(String name,int age){
////    	this.name=name;
////    	this.age=age;
////    }
////}
////class Student2 extends Person4{
////	public int grade;
////	
////	public Student2(int grade) {
////		super("김길동", 17);
////		this.grade=grade;
////	}
////}
//
//
//}
//
//}
//class Animal2{
//String type="동물의 종류";
//public void sound() {
//System.out.println("동물이 내는 소리");
//}
////public void show() {
////
////}
//
//}
//class Dog extends Animal2{
//String type="강아지";
//public void sound() { //오버라이딩
//System.out.println("멍멍");
//}
//public void show(){
//System.out.println(super.type);
//System.out.println(this.type);
//super.sound();
//this.sound();
//}
//}
//class Cat extends Animal2{
//public void sound() { //오버라이딩
//System.out.println("야옹");
//}
//}
//
//class Person2 {
//public String name;
//public int age;
//public void introduce(){
//System.out.print("이름은 "+name +"이고, 나이는 "+age+"세입니다.");
//}
//}
//
//class Student extends Person2{
//public int grade;
//public void introduce() {
//super.introduce(); 
//System.out.println(" 그리고" + grade + "학년입니다.");
//}
//}

