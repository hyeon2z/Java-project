package javaexp.z02_homework.a11_mhi.vo;

public class Travel {
	private String destination;
	// Date
	private int departureDate;
	private int arrivalDate;
	
	public Travel(String destination, int departureDate, int arrivalDate) {
		this.destination = destination;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}

	// 직접 입력
	public void showInf() {
		System.out.println("# travel객체의 정보 #");
		System.out.println("목적지:" + destination);
		System.out.println("출발일:" + departureDate);
		System.out.println("도착일:" + arrivalDate);
		System.out.println("여행일수:" + durationOfTrave()+"일");

	}
	
	
	public int durationOfTrave() {
		return arrivalDate-departureDate; 
	}
	
	
	
	
	
	public int getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(int departureDate) {
		this.departureDate = departureDate;
	}

	public int getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(int arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

}