package javaexp.z02_homework.a06_psj;

public class A1010_Homework {
	public static void main(String[] args) {
		Student3 ss3 = new Student3("홍박사",30,2);
		System.out.println("이름: "+ss3.name);
		System.out.println("나이: "+ss3.age);
		System.out.println("학년: "+ss3.grade);
	}
}
//	[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
//	class Father{ 상위 클래스
//		String name = "아빠";
//		void Work(){
//			System.out.println("아빠는 일하는중");
//		}
//	}
//
//	class Son extends Father{ 하위클래스에서 extends로 상위클래스를 상속받음
//		void process() {
//			System.out.println("아들은 공부중");
//			Work(); // 상위클래스의 메소드를 사용가능
//		}
//	}
//	
//	public void main(){
//		Son ss = new Son();
//		ss.process();
//		System.out.println(ss.name); 상위클래스의 필드도 가져올수있음
//	}
//	[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
class Parent{
	void show() {
		System.out.println("엄마 아빠");
	}
}

class Child extends Parent{
	Child(){
		show();// 상속받은 메서드 사용
	}
}
//	[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
class National{
	String name="Korea";
}
class City extends National{
	String name = "Seoul";
	void showN() {
		System.out.println(super.name); // Seoul이 아니라 상위클래스의 Korea출력
	}
}
//	[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
class Animal1{
	String kind;
	void Animal1(String a) {
		kind = a;
	}
	void sound() {
		System.out.println("울음소리는");
	}
}
class Dog extends Animal1{
	String kind;
	Dog(String kind){
		this.kind = kind;
	}
	void sound() {
		super.sound();
		System.out.println("멍멍");
	}
}

//void main(){
//	Dog dd = new Dog("강아지");
//	dd.sound();
//}


//	[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//			introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//			introduce() 메서드를 통해 학년도 함께 소개합니다.
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("내 이름은: "+name);
		System.out.println("나이는?: "+age);
	}
}
class Student2 extends Person{
	int grade;
	public Student2(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	void introduce() {
		super.introduce();
		System.out.println("학년은?: "+grade);
	}
}
//	[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
class Animal2{
	void sound() {
		System.out.println("울음소리는?");
	}
}
class Dog2 extends Animal2{
	void sound() {
		super.sound();
		System.out.println("멍멍~");
	}
}
class Cat extends Animal2{
	void sound() {
		super.sound();
		System.out.println("야옹~");
	}
}


//	[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//		Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//		Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
class Employee extends Person{
	String company;
	String job;
	public Employee() {
		super("홍박사",30);
		company="null";
		job="null";
	}
	
}
//	[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고, Student 클래스의 생성자에서는 grade를 초기화합니다.
//  # 위 과제는 개인톡으로 전달부탁합니다.
class Student3 extends Person{
	int grade;
	public Student3(String name, int age, int grade) {
		super(name, age);
		this.grade=grade;
	}
	void introduce() {
		super.introduce();
		System.out.println("학년은?: "+grade);
	}
}
//
//	# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//	1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//	2. 프로젝트 진행관련 의문/요청사항
//	3. 오늘 지각(9:00기준)/수업시간 엄수(매시간0:00)/수업시간 집중 하였는가?



