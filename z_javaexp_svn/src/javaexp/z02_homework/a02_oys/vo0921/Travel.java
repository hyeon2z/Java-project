package javaexp.z02_homework.a02_oys.vo0921;

/*7. **여행 정보 클래스**
    - 필드: 목적지, 출발일, 도착일
    - 생성자: 모든 필드 초기화
    - 메서드: 여행 일수 계산, 정보 출력*/
public class Travel {
	private String destination;
	private int departure;
	private int arrival;
	
	public Travel(String destination, int departure, int arrival) {
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
	}
	
	public int travelDay() {
		return arrival - departure + 1;
	}
	
	public void travelInfo() {
		System.out.println("목적지 : " + destination);
		System.out.println("출발일 : " + departure);
		System.out.println("도착일 : " + arrival);
	}

}
