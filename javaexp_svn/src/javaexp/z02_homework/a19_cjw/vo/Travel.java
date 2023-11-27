package javaexp.z02_homework.a19_cjw.vo;

public class Travel {

	private String destination;
	private int godate;
	private int comedate;
	
	public Travel(String destination, int godate, int comedate) {
		this.destination = destination;
		this.godate = godate;
		this.comedate = comedate;
	}
	
	public int traveldate() {
		System.out.print("여행일수: ");
		return comedate-godate;
	}
	
	public void travelInfo() {
		System.out.println("목적지: "+destination);
		System.out.println("출발일: "+godate);
		System.out.println("도착일: "+comedate);
		System.out.println("여행일수: "+(comedate-godate));
	}
	
}
