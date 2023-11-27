package javaexp.z02_homework.a12_ljh.vo;

public class Travel {
	private String arrive;
	private int start;
	private int end;
	
	public Travel(String arrive, int start, int end) {
		this.arrive = arrive;
		this.start = start;
		this.end = end;
	}
	
	public void showInfo() {
		System.out.println("[여행 정보]");
		System.out.println("목적지: " + arrive);
		System.out.println("시작일: " + start + "일");
		System.out.println("도착일: " + end + "일");
		
	}
	
	public int travelDate() {
		return end - start;
	}

	public String getArrive() {
		return arrive;
	}

	public void setArrive(String arrive) {
		this.arrive = arrive;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	
	
	
}
