package javaexp.a07_inherit;

public class A07_Interface {

	public static void main(String[] args) {
		/*
		# 인터페이스
		1. 이해를 위한 도입
			Robot
			Mz : 지구지키는 로봇, 초기에 하늘 날지못함
			Mz에서 Flyway를 중앙장치로 컨트롤 할 수 있는 메모리와
			외부에서 실제 날개가 부착이 되어 처리할 수 있는 어댑터
			어깨에 만들어 상호 작용할 수 있게 만듬
			
			Flyway(인터페이스) : 날게됨
				껍데기(어깨에 정보를 입/출력 하게 하는 처리장치를 붙여 사용하게 함)
			Wing01(날개1호) 만들기 : 날개가 부착해서 붙여놓은 인터페이스에 의해
				실제 컨트롤로 작동하게 함.
			이후, 날개2호, 날개3호가 계속 만들어지지만
			Mz는 변경하지 않고 더 좋은 성능의 날개를 사용하게 된다
		
		2. 인터페이스란?
			1) 개발 코드와 객체가 서로 통신하는 접점
				- 개발 코드는 인터페이스의 메서드만 알고 있으면 된다.
			2) 역할
				개발코드가 객체에 종속되지 않고 실제 객체가 교체할 수 있도록 하는 역할
				개발코드가 변경 없이 리턴값 또는 실행 내용이 다양해질수 있음.
				
		3. 인터페이스의 활용
			1) 인터페이스의 이름 - 자바 식별자 작성 규칙에 의해 대문자 시작으로 작성
			2) 소스파일 또는 클래스 하위에서 생성
			3) 선언 : 접근제어자 interface 인터페이스 명{}
			4) 구성요소
				상수 : 인터페이스에 선언된 모든 변수는 기본적으로 상수이다.
					int FLYNO = 1; 
					==> 앞에 public static final이 사용으로 붙는다
				메서드 : 인터페이스는 재정의 메서드가 기본적으로 추상메서드로 붙는다.
						void fly(); ==> 앞에 public abstract가 자동으로 붙음
				기타 : default 메서드, 정적 메소드 지원
					default 리턴유형 메서드명(){}
					static 리턴유형 메서드명(){}
			5) 인터페이스의 특징
				인터페이스는 extends를 통해 부모를 여러개 상속받아 사용할 수 있다.
				인터페이스를 상속받은 실제 클래스는 여러개의 인터페이스를 선언하여 사용할 수 있다.
				class 실제객체 implements 인터페이스1, 인터페이스2{
		*/		
		FlyWay f01 = new Wing01();
		f01.fly();
		
		SwimmingWay swim01 = new RuberDuckSwim();
		SwimmingWay swim02 = new NormalDuckSwim();
		
		swim01.Swimming();
		swim02.Swimming();
		
		Mz m1 = new Mz();
		m1.setFlyway(f01);
		m1.flying();
		m1.attack();
		m1.setFlyway(new Wing02());
		m1.flying();
		m1.setFlyway(new Wing03());
		m1.flying();
		
		Duck d1 = new Duck();
		d1.showSwimming(new RuberDuckSwim());
		d1.swimming();
	}

}
class Mz{
	private FlyWay flyway;
	private String name;
	public Mz() {
		name = "MZ로봇";
	}
	public void attack() {
		System.out.println(name + "가 공격을 하며 지구를 지킨다");
	}
	public void setFlyway(FlyWay flyway) {
		this.flyway = flyway;
		System.out.println(name + "가 날개를 장착");
	}
	public void flying() {
		System.out.println(name + "은 !!");
		if(flyway!=null) {
			flyway.fly();
		}else {
			System.out.println("날개가 없어서 뛰어다닙니다.");
		}
	}
}


interface FlyWay{ // 연결하는 껍데이(인터페이스 선언)
	String NAME = "날개인터페이스";
	void fly();
}
class Wing01 implements FlyWay{

	@Override
	public void fly() {
		System.out.println(NAME + "날개 1호로 동네를 날다");
		
	}
	
}
class Wing02 implements FlyWay{
	
	@Override
	public void fly() {
		System.out.println(NAME + "날개 2호로 동네를 날다");
		
	}
	
}
class Wing03 implements FlyWay{

	public void fly() {
		System.out.println(NAME + "날개 3호로 지구의 하늘을 날다");
	}
	
}
// ex1) 날개3호 선언 지구의 하늘을 나르다
//	main()에서 할당 후 처리
// ex2) Duck 클래스 SwimmingWay 필드 선언.
//		addSwimFun() : 인터페이스를 통해 실제객체 할당 메서드 선언
//		showSwimming() : 오리가 수영하는 내용 출력

// ex) interface SwimmingWay	swin();
//		class RuberDuckSwim : 고무장난오리가 목욕탕에서 수영
//		class NormalDuckSwim : 일반집오리 호수 수영
interface addSwimFun {
	
}

class Duck {
	private SwimmingWay swimmingway;
	private String kind;
	public Duck() {
		kind = "오리";
	}
	public void quack() {
		System.out.println(kind + "꽥꽥하며 돌아다닌다");
	}
	void addSwimFun() {
		
	}
	void showSwimming(SwimmingWay swimmingway) {
		this.swimmingway = swimmingway;
		System.out.println("오리가 수영하는 방법을 배웠습니다");
	}
	public void swimming() {
		System.out.println(kind);
		if(swimmingway != null) {
			swimmingway.Swimming();
		}else {
			System.out.println("수영 할줄 몰라요");
		}
	}
}



interface SwimmingWay {
	String ACT = "수영을 하다";
	void Swimming();
}
class RuberDuckSwim implements SwimmingWay{
	public void Swimming() {
		System.out.println("고무장난감 오리가 목욕탕에서 " + ACT);
	}
}
class NormalDuckSwim implements SwimmingWay{
	public void Swimming() {
		System.out.println("일반집오리 가 호수에서 " + ACT);
	}
}




