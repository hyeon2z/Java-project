package javaexp.z02_homework.a10_kdh.a01_1010;

public class A02_1010 {

}

//[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
//			==> 상속은 부모클래스와 그 부모클래스를 상속받는 자식클래스로 이루어지며 상위하위의 계층구조이다. extends라는 키워드를 이용해 상속을 할 수 있다.
//[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
class Parent{
	void show() {
		System.out.println("부모 메서드");
	}
}
class Child extends Parent{
	
}
//[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
//			==> 자식클래스에서 부모 클래스의 필드에 접근하거나 생성자를 만들때 이용
//[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
class Animal{
	String kind = "동물";
	void sound() {
		System.out.println("울음 소리");
	}
}
class Dog extends Animal{
	
	public Dog() {
		this.kind = super.kind;
	}
	void sound() {
		super.sound();
	}
}
//[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//		introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//		introduce() 메서드를 통해 학년도 함께 소개합니다.
class Person{
	String name;
	int age;
	public Person() {
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("저의 이름은"+name+"이고 나이는 "+age+"입니다.");
	}
}
class Student extends Person{
	int grade;

	@Override
	void introduce() {
		System.out.println("저의 이름은"+name+"이고 나이는 "+age+"이며 " + grade +"학년 입니다.");
	}
	
}
//[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. 
// 		Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. 
//		Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.

class Animal2{
	void sound() {
		System.out.println("울음소리");
	}
}
class Dog2 extends Animal2{

	@Override
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal2{
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
//[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//	Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//	Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
class Employee extends Person{
	String company;
	String job;
	public Employee() {
		super("이름없음",0);
		this.company = null;
		this.job = null;
	}
}
//[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고, Student 클래스의 생성자에서는 grade를 초기화합니다.
class Student2 extends Person{
	int grade;
	public Student2(String name,int age) {
		super(name,age);
		this.grade = (int)(Math.random()*4+1);
	}
}
//# 위 과제는 개인톡으로 전달부탁합니다.		
//
//# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//2. 프로젝트 진행관련 의문/요청사항
//3. 오늘 지각(9:00기준)/수업시간 엄수(매시간0:00)/수업시간 집중 하였는가?