package javaexp.z02_homework.a14_cms.vo;

public class Travel {
	private String target;
	private int arrivalDate;
	private int departureDate;
	
	public Travel(String target, int arrivalDate, int departureDate) {
		this.target = target;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
	
	public void showTravleInfo() {
		System.out.println("도착지는 : " + target);
		System.out.println("출발일자는 : " + arrivalDate);
		System.out.println("도착일자는 : " + departureDate);
	}
	public void getTravelDay() {
		System.out.println("여행일수는 : " + (departureDate - arrivalDate));
	}

}
