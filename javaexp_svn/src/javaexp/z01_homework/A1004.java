package javaexp.z01_homework;

public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
		/*
		1) 필드 선언
			- 포함될 클래스 선언 ex) class Car{}
			- 포함될 클래스 선언하면 필드값으로 선언
			ex) class CarOwner{
				private String name;	// 차주 이름
				private Car car; // 차주가 가지고 있는 차
			}
		2) 생성자 또는 메서드의 매개변수로 객체 전달
			main()
				CarOwner c01 = new CarOwner("홍길동");				
				Car c1 = new Car("현대", "소나타");
				co1.buyCar(c1);	// 객체를 메서드를 통해서 할당.
				co1.buyCar(new Car("기아","K7"));	// 객체를 메서드를 통해서 할당.
												// 다른 객체로 소유 객체를 변경
		
		3) 전달된 객체의 메모리에 따른 기능 함수의 처리..
			void drivingCar(){
					System.out.println("차주의 기본 정보 출력"+name);
				if(car!=null){
					car.speedUp(); // 자동차의 여러가지 기능메서드 활용
				}else{
					System.out.println("차가 없습니다");
				}
			}
			void buyCar(Car car){
				this.car = car;
			}
			// 구매를 통해 Car객체를 CarOwner객체의 구성요소인 Car에 할당.
	*/
//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 
//			2) 학생과 담임교사 
//			3) Person 객체와 Address 객체의 관계
//			4) Book 객체와 Author 객체의 관계
//			5) Member 객체와 Team 객체의 관계
		
		
	}

}
