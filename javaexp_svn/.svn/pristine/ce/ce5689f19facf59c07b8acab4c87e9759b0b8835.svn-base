package javaexp.z02_homework.a06_psj;

import javaexp.z02_homework.a06_psj.vo.Customer1;
import javaexp.z02_homework.a06_psj.vo.Order;

public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
		Customer ct1 = new Customer("홍길동", "서울"); // Customer 생성자 만들기
		Train tr1 = new Train("KTX",500,ct1); // Train클래스에 필드2개와 ct1이라는 Customer객체를 넣어 생성자 tr1을 만듬.
		tr1.trainInfo(); // tr1 생성자의 정보를 출력하는 메서드

//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문
		System.out.println("==================================");
		Order o1 = new Order("감자",500);
		Customer1 cc1 = new Customer1("박성중",25,o1);
		cc1.info();
//			2) 학생과 담임교사 
//			3) Person 객체와 Address 객체의 관계
//			4) Book 객체와 Author 객체의 관계
//			5) Member 객체와 Team 객체의 관계
		
	}
}

class Student1{
	private String stdentName;
	private Teacher tc;
	
	public Student1(String stdentName) {
		this.stdentName = stdentName;
	}

	public void setStdentName(String stdentName) {
		this.stdentName = stdentName;
	}
	
}
class Teacher{
	
}


class Customer{
	private String cusName; // 필드
	private String destination; // 필드
	public Customer(String cusName, String destination) { // 클래스 생성자
		this.cusName = cusName;
		this.destination = destination;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	} // 필드에대한 get set 메서드들
	
}
class Train{ 
	private String trainName; // Train클래스에서 쓸 필드
	private int cap; // Train클래스에서 쓸 필드
	Customer cus; // 다른 객체를 가져와서 Train에 필드로 쓸 생성자
	
	public Train(String trainName, int cap, Customer cus) {
		this.trainName = trainName;
		this.cap = cap;
		this.cus = cus;
	}

	public void trainInfo() {
		System.out.println(trainName+" "+cap); // Train 필드정보 출력
		System.out.println(cus.getCusName()+" "+cus.getDestination());
		// Train의 필드가된 다른객체 정보 cus에대해 출력
	}
}