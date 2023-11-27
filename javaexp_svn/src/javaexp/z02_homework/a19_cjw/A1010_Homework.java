package javaexp.z02_homework.a19_cjw;

public class A1010_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
		/*
		class Parents{}	-> 상위 클래스
		class Son extends Parents{} -> 상속받는 하위 클래스(클래스 선언할때 `extends 상속받을클래스명`을 붙여야한다)
		하위 클래스에서는 상위 클래스의 필드와 메서드, 생성자를 자유롭게 사용할 수 있다.
		 * */
		
		// [1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
		Child c01 = new Child();
		c01.show();
		
		// [1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
		/*
		상위 클래스와 상속받는 클래스의 필드, 메서드의 이름이 겹쳐서 구분이 필요할 때 주로 사용한다.
			ex) super.필드명	super.메서드명()
		생성자의 경우 default값(super())을 사용할 수 있는 경우(상위 클래스에서 매개변수값이 없는 생성자 사용)를 제외하고는
		반드시 super(매개변수값)을 작성해줘야 한다.
		 * */
		
		// [1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
		Dog d01 = new Dog();
		d01.sound();
		
		/*
		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
				introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
				introduce() 메서드를 통해 학년도 함께 소개합니다.
		 * */
		Students s01 = new Students();
		s01.introduce();
		
		/*
		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요.
		Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다.
		Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고,
		Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
		 * */
		Dog2 d02 = new Dog2();
		d02.sound();
		Cat2 c02 = new Cat2();
		c02.sound();
		
		/*
		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고,
			company와 job을 null로 초기화합니다.
		 * */
		Employee e01 = new Employee();
		
		/*
		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요.
		Person 클래스의 생성자에서 name과 age를 초기화하고,
		Student 클래스의 생성자에서는 grade를 초기화합니다.
		 * */
		Student2 s02 = new Student2();
		s02.call();

	}

}

// [1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
class Parent{
	void show() {
		System.out.println("상위 클래스의 메서드");
	}
}
class Child extends Parent{
	void show() {
		super.show();
		System.out.println("현재 클래스의 메서드");
	}
}

//[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
class Animals{
	String kind = "동물";
	void sound() {
		System.out.println(": 울음소리");
	}
}
class Dog extends Animals{
	String kind = "푸들";
	void sound() {
		System.out.print(super.kind);
		super.sound();
		System.out.print(this.kind);
		System.out.println(": 멍멍");
	}
}

/*
[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
		introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
		introduce() 메서드를 통해 학년도 함께 소개합니다.
 * */
class Person{
	String name = "홍길동";
	int age = 25;
	void introduce() {
		System.out.println("# 자기소개 #");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}
class Students extends Person{
	int grade = 2;
	void introduce() {
		super.introduce();
		System.out.println("학년: "+grade);
	}
}

/*
[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요.
Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다.
Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고,
Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
 * */
class Animal2{
	void sound() {
		System.out.println("울음소리");
	}
}
class Dog2 extends Animal2{
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat2 extends Animal2{
	void sound() {
		System.out.println("야옹");
	}
}

/*
[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
	Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
	Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고,
	company와 job을 null로 초기화합니다.
 * */
class Employee extends Person{
	String company="쌍용";
	String job="개발자";
	public Employee(){
		super();
		this.company = null;
		this.job = null;
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(company);
		System.out.println(job);
	}
}

/*
[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요.
Person 클래스의 생성자에서 name과 age를 초기화하고,
Student 클래스의 생성자에서는 grade를 초기화합니다.
 * */
class Person2{
	String name;
	int age;
	Person2(){
		this.name = name;
		this.age = age;
	}
}
class Student2 extends Person2{
	int grade;
	Student2(){
		super();
		this.grade = grade;
	}
	void call() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("학년: "+grade);
	}
}
