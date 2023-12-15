package javaexp.z02_homework.a17_okw;

public class A1010_okw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
		/*
		# 가장 기본적인 상속 형태 
		class Parents{
		
		}
		class Child extends Parents{
		
		}
		 */
//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
		// 클래스는 메인 메서드 밑 참조
		Child c01 = new Child();
		c01.habit();
//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
		/*
		1. 필드
			상위에서 선언된 필드를 그대로 사용할 수 있지만, 재정의했을 때, 상위에 선언된 필드와 하위에 선언된 필드를 구분할 때, super를 이용한다.
			this.필드 : 현재 필드
			super.필드 : 상위 필드 (실무적 활용도는 낮다.)
		2. 생성자
			상속을 하는 순간, 반드시 상위에 선언된 생성자를 호출하여야 한다.
			1) default 생성자 (super();가 자식클래스 생성자 안에 생략되있는 상태)
			2) 사용자정의 생성자
				- 매개변수가 있는 경우 : super(매개변수); 의 형식으로 반드시!! 상위클래스의 생성자를 호출하여야 한다
				- 매개변수가 없는 경우 : default 생성자랑 경우가 같다.
			
		3. 메서드
			상위에 선언된 메서드와 구분을 위해서 사용
			super.상위클래스메서드명(매개변수);  이런식으로 쓰면 됨.
		*/
//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
		// 클래스는 메인 메서드 밑 참조
		Dog d01 = new Dog("강아지");
		d01.sound();
//		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//				introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//				introduce() 메서드를 통해 학년도 함께 소개합니다.
		Student2 st = new Student2();
		st.name = "최톰";
		st.age = 11;
		st.grade = 4;
		st.introduce();
//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다.
//		Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
		Animal1 dog = new Dog();
		dog.sound();
		Animal1 cat = new Cat();
		cat.sound();
		
//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
		Employee ep1 = new Employee();
		ep1.show();
		ep1.name= "홍길동";
		ep1.age= 25;
		ep1.company= "쌍용건설";
		ep1.job= "토목기사";
		ep1.show();
			
//		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고,
//		Student 클래스의 생성자에서는 grade를 초기화합니다.
		Student2 st2 = new Student2("박길동", 17, 1);
		st2.introduce();
		
		
//      # 위 과제는 개인톡으로 전달부탁합니다.		

//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 프로젝트 진행관련 의문/요청사항
//		3. 오늘 지각(9:00기준)/수업시간 엄수(매시간0:00)/수업시간 집중 하였는가?
		

	}

}

class Student2 extends Person02{
	public int grade;
	
	public Student2() {
		
	}
	public Student2(String name, int age, int grade) {
		super(name,age);
		this.grade = grade;
	}
    public void introduce() {
    	super.introduce(); 
    	System.out.println("\t그리고 " + grade + "학년입니다.");
    }
}


class Person02{
	public String name;
	public int age;
	public Person02() {
		
	}
	public Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void introduce(){
		System.out.print("이름은 "+name +"이고, 나이는 "+age+"세입니다.");
	}
}
class Employee extends Person02{
	public String company;
	public String job;
	public Employee() {
		this.company = null;
		this.job = null;
	}

	public void show() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("회사 : "+ company);
		System.out.println("직업 : "+ job);
		System.out.println();
	}
}
class Animal1{
	public String kind;
	public Animal1() {
		
	}
	public Animal1(String kind) {
		this.kind = kind;
	}
	public void sound() {
		System.out.println("울음소리를 낸다.");
	}
}
class Dog extends Animal1{
	public String kind;
	public Dog() {
		
	}
	public Dog(String kind) {
		super("포유류");
		this.kind = kind;
	}
	public void sound() {
		super.sound();
		System.out.println("멍멍!!\n");
	}
}
class Cat extends Animal1{
	public String kind;
	public Cat() {
		
	}
	public void sound() {
		super.sound();
		System.out.println("야옹~\n");
	}
}
class Parent{
	public void habit() {
		System.out.println("운동이 취미랍니다.");
	}
}
class Child extends Parent{
	public void habit() {
		super.habit();
		System.out.println("부모님 닮아서요.\n");
	}
}
