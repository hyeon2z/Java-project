package javaexp.a06_objectreview;

public class A02_Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p01 = new Phone("홍길동", "01012345678");
		System.out.println(p01.owner);
		System.out.println(p01.phoneNumber);
	
		Phone p02 = new Phone();
		p02.owner = "김길동"; p02.phoneNumber = "01045671234";
		System.out.println(p02.owner);
		System.out.println(p02.phoneNumber);
//		p02.owner = "as";
//		System.out.println(p02.owner);
		
		// Car클래스 필드 제조사, 모델, 연식
//			매개변수없는 생성자
//			매개변수3개인 생성자 각각 선언하여 필드값을 출력
		Car c01 = new Car();
		Car c02 = new Car("현대", "제네시스", "23년식");
		c01.company = "쌍용";
		c01.model = "아반떼";
		c01.year = "22년";
		System.out.println(c01.company);
		System.out.println(c01.model);
		System.out.println(c01.year);
		
		System.out.println(c02.company);
		System.out.println(c02.model);
		System.out.println(c02.year);
		
	}

}
/*
# 필드
 1. 클래스 선언에서 객체가 생성되어서 사용할 메모리 저장 구조를 말한다.
 
 2. 주로 객체가 가지고 사용할 저장데이터를 이 클래스 안에서는 전역변수로 사용된다.
 
 3. 접근 제어자는 private로 주로 사용하여 외부에서 메서드(public)으로
 	간접적으로 접근해서 사용한다.
 	
 4. 생성자의 매개변수로 전달된 데이터로 이 필드를 초기화 하는 경우가 많다.
 
*/

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

class Car{ // class
	String company; // 필드
	String model;
	String year;
	public Car() {} // 생성자
	public Car(String company, String model, String year) {
		this.company = company;
		this.model = model;
		this.year = year;
	}
}