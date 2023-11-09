package javaexp.z04_project02.vo;

public class Oneway{ // 편도
	private String[] station = {"서울", "대전", "대구", "부산", "광주"};
	private String[] date = {"2023-11-13","2023-11-14","2023-11-15","2023-11-16"};
	private int adult;
	private int child;
	private String departureStation;
	private String arrivalStation;
	
	public Oneway() {
	
	}
	public void stationInfo() {
		int cnt = 0;
		for(String stationList : station) {
			System.out.println(cnt+1 + ") " + stationList);
			cnt++;
		}
	}
	public void dateInfo() {
		int cnt = 0;
		for(String dateList : date) {
			System.out.println(cnt+1 + ") " + dateList);
			cnt++;
		}
	}
	public int dateLength() {
		return date.length+1;
	}

	public String getDate(int i) {
		return date[i];
	}
	public void setDate(String[] date) {
		this.date = date;
	}
	public void setDepartureStation(int i) {
		departureStation = station[i];	
	}
	public void setArrivalStation(int i) {
		arrivalStation = station[i];
	}
	public String getDepartureStation() {
		return departureStation;
	}
	public String getArrivalStation() {
		return arrivalStation;
	}
	public int stationLength() {
		return station.length+1;
	}
	public String[] getStation() {
		return station;
	}
	public void setStation(String[] station) {
		this.station = station;
	}

	public int getAdult() {
		return adult;
	}
	public void setAdult(int adult) {
		this.adult = adult;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	
}
