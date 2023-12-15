package javaexp.a06_objectreview;

public class A02_Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p01 = new Phone("홍길동","01088889999");
		System.out.println(p01.owner);
		System.out.println(p01.phoneNumber);
		Phone p02 = new Phone();
		p02.owner="김길동"; p02.phoneNumber="01077777777";
		System.out.println(p02.owner);
		System.out.println(p02.phoneNumber);
		// Car클래스 필드 제조사, 모델, 연식
		//    매개변수없는 생성자,
		//    매개변수3개인 생성자 각각 선언하여 필드값을 출력..
		Car c1 = new Car();
		c1.make = "현대자동차";
		c1.model = "그랜저";
		c1.year = 2023;
		Car c2 = new Car("삼성자동차","QM3",2019);
		System.out.println("첫번째 자동차");
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.year);
		System.out.println("두번째 자동차");
		System.out.println(c2.make);
		System.out.println(c2.model);
		System.out.println(c2.year);
		
	}

}
class Car{
	String make;
	String model;
	int year;
	Car(){}
	Car(String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
}

/*
# 필드
1. 클래스 선언에서 객체가 생성되어서 사용할 메모리 저장 구조를
	말한다.
2. 주로 객체가 가지고 사용할 저장데이터를 이 클래스 안에서는 전역변수로
	사용된다.
3. 접근 제어자는 private로 주로 사용하여 외부에서 메서드(pubic)으로
	간접적으로 접근해서 사용한다.
4. 생성자의 매개변수로 전달된 데이터로 이 필드를 초기화 하는 경우가 많다.
 * */
class Phone{
	String owner;
	String phoneNumber;
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	public Phone(String owner, String phoneNumber) {
		this.owner = owner;
		this.phoneNumber = phoneNumber;
	}
	
}








