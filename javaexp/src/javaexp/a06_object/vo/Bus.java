package javaexp.a06_object.vo;

public class Bus {
	// 필드 : 데이터
	private int speed; // 속도
	private String bno; // 버스번호
	private String target; // 노선
	private int pCount; // 탑승자 수
	
	// 생성 : 필드의 초기화
	// 1. 매개변수 없이 생성
	public Bus() {}
	// 2. 필요한 필드값의 초기화(객체 생성)
	//		숫자데이터는 기본적으로 0을 초기화해준다.
	//		main()에서 객체가 생성될 때, 초기화된다.
	//		Bus p01 = new Bus("8001", "서울~인천");
	//		Bus p02 = new Bus("8002", "서울~평택");
	
	public Bus(String bno, String target) {
		this.bno = bno;
		this.target = target;
	}
	// 3. 기능 메서드
	//		1) 데이터를 직접적으로 호출해서 사용할 수 없지만 간접적으로 특정한 기능에 의해서 처리할 수 있게 한다.
	//			변경/수정 가능
	//		Bus p03 = new Bus();
	//		p03.setBno("9999");
	//		p03.setTarget("서울~오산");
	//		p03.getSpeed(); 현재속도 확인
	//		p03.setSpeed(10);
	//		p03.speedUp();
	//		p03.speedUp();
	//		p03.speedDown();
	//		p03.speedUp();
	//		2) 특정 기능수행에 의해서 출력 및 특정 형식으로 처리
	public void speedUp() {
		speed += 10; // 속도를 해당 메서드가 호출될때마다 올려준다.
		if(speed >= 200) {
			speed = 200; // 속도가 200이상이면 더 증가 못하게 처리
		}
		System.out.println("속도가 증가되어 현재 속도 : " + speed + "km/h");
		
	}
	public void speedDown() {
		speed -= 10;
		if(speed <= 0) {
			speed = 0;
		}
		System.out.println("속도가 감소되어 현재 속도 : " + speed + "km/h");
		
	}
	// 외부에서 호출하지 않고, 현재 클래스 내부에서만 재활용할 때
	// private로 선언하여 처리
	private void showSpeed() {
		System.out.println("현재속도 : " + speed + "km/h");
	}
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getpCount() {
		return pCount;
	}

	public void setpCount(int pCount) {
		this.pCount = pCount;
	}
	
	// 메서드 : 객체를 통해서 처리하는 기능적인 수행
		// 1) 필드 저장
		// 2) 필드 호출
		// 3) 기능적인 내용에 따라 필드값을 변경
}
