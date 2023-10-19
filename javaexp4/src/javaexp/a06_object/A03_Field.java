package javaexp.a06_object;

import java.util.ArrayList;
import java.util.List;

public class A03_Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 클래스의 구성 요소
 			1. 필드 : 객체의 데이터가 저장되는곳
     			ex) 사람을 비유로 하면 두뇌에 정보를 저장하는 것을 말한다.
 
 			2. 생성자 : 객체가 가지는 기능메서드 중에서 클래스명과 동일하면 주로 필드값을 초기화 할 때 사용된다.
             			주로 new 키워드를 통해서 해당 선언된 생성자가 호출되는데, 기본적으로 default 생성자를 통해서 내장된 생성자를 사용할 뿐만 아니라
	     				선언된 생성자를 호출해서 처리하는 경우도 많다.
	         				ex) 선언
		     						public Baby(String name, String gender, int age) {
		         						this.name = name;
			 							this.gender = gender;
		         						this.age = age;
		     						}
		      					호출
		     							new Baby("아기1", "남자", 0);
		     							new Car("그렌저", 3500);

 			3. 메서드 : 데이터입력, 데이터의 리턴 처리, 조건문이나 반복문에 의해 알고리즘 처리 등
             			여러가지 기능적인 처리를 하는 함수를 말한다.
	         				1) 리턴값 선언/리턴값 처리

		 					2) 입력값 처리

		 					3) 중괄호({})블럭을 통한 여러가지 비즈니스 로직 처리
	
		# 필드
 			1. 필드의 종류
     			1) 객체의 고유 데이터 선언

     			2) 객체가 가져야할 부품 객체
         			1:1, 1:다객체

     			3) 객체의 현재 상태 데이터

 			2. 필드의 접근제어자
     			1) 필드는 일반적으로 private로 접근제어자를 선언하여 외부에서 직접적으로 접근할 수 없게 한다.
         			간접적인 접근을 할 수 있다.(특정한 기능 메서드를 통해서)
	     				ex) 리모콘과 TV에서 채널을 변경할 때, 리모콘의 버튼을 통해서만 가능

 			3. 필드의 사용.
     			1) 객체의 생성 후.
         			ex) Person p01 = new Person();
     
     			2) 참조변수.필드명 형태(접근제어자가 호출가능한 범위로 선언시)
         			ex) p01.name = "홍길동";
	     				System.out.println(p01.name);

     			3) 하나의 객체 안에는 여러가지 형태의 필드를 선언할 수 있다.
         			이름, 나이, 사는곳 등으로 여러가지 다른 유형으로 선언
     
     			4) 이 필드는 클래스의 관점에서 보면, 전역변수로 해당 클래스내에서 다른 구성요소(생성자, 메서드)에서는 접근해서 할당할 수 있다.

     			5) 생성자나 메서드의 매개변수나 지역변수가 동일한 명으로 선언되어 있을 때는 this.필드명으로 구분하여 사용한다.
         			String name;
	 				public Person(String name) {
	     			this.name = name;
	 				}
	 				public void setName(String name) {
	     			this.name = name;
	 				}
	 				public void call() {
	     			String name = "안녕"; <- 메서드 지역변수
	     			지역변수를 전역변수에 할당.
	     			this : 지역변수와 전역변수 구분을 위해 사용한다.
	     			this.name = name; 
		*/
		Car c01 = new Car();
		c01.kind = "그렌저";
		c01.maxSpeed = 220;

		Car c02 = new Car();
		c02.kind = "소나타";
		c02.maxSpeed = 200;

		System.out.println("c02의 차량의 종류 : " + c02.kind);
		System.out.println("c02의 차량의 최대속도 : " + c02.maxSpeed);

		/*
		 * # 아래와 같은 속성을 가진 클래스를 선언하고, main()에서 호출하세요.
		 * 1. Bus(버스번호, 경유지(시작~끝)
		 * 2. Car(종류,나이,성별)
		 * 3. Computer(제조사, 사양)
		 * 4. Student(번호, 이름, 국어)
		 * 		학생 3명을 생성하고 국어의 평균 점수를 출력하세요
		 */
		Bus b01 = new Bus();
		b01.busNum = 775;
		b01.start = "강남";
		b01.arrive1 = "인천";
		
		System.out.println(b01.busNum + b01.start + b01.arrive1);
		
		Cat c1 = new Cat();
		c1.age = 12;
		c1.kind = "트럭";
		c1.sexual = "남";
		
		Computer cpt1 = new Computer();
		cpt1.make = "삼성";
		cpt1.high = "고사양";
		
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
//		Student[] arry = new Student[3];
//		arry[0].number = 1;
//		arry[0].name = "길동";
//		arry[0].score = 100;
//		List<Student> slist = new ArrayList<Student>();
//		slist.add(new Student());
		// 국어 평균점수 출력
		
		std1.name = "진규";
		std1.number = 1;
		std1.score = 100;
		std2.name = "진우";
		std2.number = 2;
		std2.score = 90;
		std3.name = "민수";
		std3.number = 3;
		std3.score = 80;
		
		System.out.println("국어의 평균 점수 : " + (std1.score + std2.score + std3.score) / 3.0);
	}

}

class Car {
	String kind;
	int maxSpeed;
	// public Car(){} : 컴파일시, 자동 생성
}

class Bus {
	int busNum;
	String start;
	String arrive1;
}

class Cat {
	String kind;
	int age;
	String sexual;
}

class Computer {
	String make;
	String high;
}
class Student {
	String name;
	int score;
	int number;
}