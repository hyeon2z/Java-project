package javaexp.z02_homework.a21_hcj;

public class A1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
					class Car{}
					class ElectronCar extends Car{}//extends키워드를 사용하여 상속
//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
					class Parent{
						void eat() {
							System.out.println("밥을 먹는다");
						}
					}
					class Child extends Parent{
						
					}
					Child c01 = new Child();
					c01.eat();
//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
					//부모의 메서드,생성자,필드 를 호출 또는 재할당 할때 사용
//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
					class Animal{
						String kind;
						Animal(String kind){
							this.kind = kind;
						}
						void Sound(){
							System.out.println(kind+"의 소리!");
						}
					}
					class Dog extends Animal{
						Dog(String kind){
							super(kind);
						}
						void Sound() {
							super.Sound();
							System.out.println("멍멍");
						}
					}
					
					Dog d = new Dog("치와와");
					d.Sound();
//		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//				introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//				introduce() 메서드를 통해 학년도 함께 소개합니다.
					class Person{
						String name;
						int age;
						Person(String name,int age){
							this.name = name;
							this.age = age;
						}
						void introduce(){
							System.out.println("저의 이름은 "+name+"이고 나이는"+age+"입니다");
						}
					}
					
	
					class Student extends Person{
						int grade;
						Student(String name,int age,int grade){
							super(name,age);
							this.grade = grade;
						}
						void introduce() {
							super.introduce();
							System.out.println("학년은 "+this.grade+"입니다.");
							
						}
						
					}
					Student std = new Student("홍길동",20,1);
					std.introduce();
//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
					class Animal1{
						String kind;
						Animal1(String kind){
							this.kind = kind;
						}
						void Sound(){
							System.out.println("자신의 울음소리!");
						}
					}
					class Dog1 extends Animal1{
						Dog1(String kind){
							super(kind);
						}
						void Sound() {
							System.out.println("멍멍");
						}
					}
					class Cat extends Animal1{
						Cat(String kind){
							super(kind);
						}
						void Sound() {
							System.out.println("냐옹");
						}
						
					}
					Animal ani = new Animal("동물");
					ani.Sound();
					
					Dog1 d1 = new Dog1("시츄");
					d1.Sound();
					Cat c1 = new  Cat("샴고양이");
					c1.Sound();
//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
				/*
					class Person{
						String name;
						int age;
						Person(String name,int age){
							this.name = name;
							this.age = age;
						}
						void introduce(){
							System.out.println("저의 이름은 "+name+"이고 나이는"+age+"입니다");
						}
					}*/
					class Employee extends Person{
						String company;
						String job;
						Employee(){
							super("",0);
							this.company = null;
							this.job = null;
						}
					
					}
					Employee emp = new Employee();
					System.out.println("이름:"+emp.name);
					System.out.println("나이:"+emp.age);
					System.out.println("회사:"+emp.company);
					System.out.println("직업:"+emp.job);
					
//		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고, Student 클래스의 생성자에서는 grade를 초기화합니다.
//      # 위 과제는 개인톡으로 전달부탁합니다.		
					class Person1{
						String name;
						int age;
						Person1(String name,int age){
							this.name = name;
							this.age = age;
						}
					}
					class Studnet1 extends Person1{
						int grade;
						Studnet1(String name,int age,int grade){
							super(name,age);
							this.grade = grade;
						}
					}
//
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 프로젝트 진행관련 의문/요청사항
//		3. 오늘 지각(9:00기준)/수업시간 엄수(매시간0:00)/수업시간 집중 하였는가?
		

	}

}
