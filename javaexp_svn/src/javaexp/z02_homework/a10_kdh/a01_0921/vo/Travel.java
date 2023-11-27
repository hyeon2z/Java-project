package javaexp.z02_homework.a10_kdh.a01_0921.vo;

public class Travel {
	// 7. **여행 정보 클래스**
	// - 필드: 목적지, 출발일, 도착일
	// - 생성자: 모든 필드 초기화
	// - 메서드: 여행 일수 계산, 정보 출력
	//
	private String destination;
	private int departualDate;
	private int arrivalDate;

	public Travel(String destination, int departualDate, int arrivalDate) {
		this.destination = destination;
		this.departualDate = departualDate;
		this.arrivalDate = arrivalDate;
	}

	public int calcDate() {
		int travelDate = arrivalDate - departualDate + 1;
		return travelDate;
	}

	public void showInfo() {
		System.out.println("목적지:" + destination);
		System.out.println("출발일:" + departualDate);
		System.out.println("도착일:" + arrivalDate);
		System.out.println("여행일수:" + calcDate());
	}

}
