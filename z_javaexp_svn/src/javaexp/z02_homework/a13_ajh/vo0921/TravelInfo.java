package javaexp.z02_homework.a13_ajh.vo0921;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TravelInfo {
	private String destination;
    private Date departureDate;
    private Date arrivalDate;
	public TravelInfo(String destination, Date departureDate, Date arrivalDate) {
		this.destination = destination;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}
	public int calculateTravelDuration() {
        // 여행 일수 계산
        long diff = arrivalDate.getTime() - departureDate.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24)); // 밀리초를 일수로 변환
    }
	public void printInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("목적지: " + destination);
        System.out.println("출발일: " + dateFormat.format(departureDate));
        System.out.println("도착일: " + dateFormat.format(arrivalDate));
        System.out.println("여행 일수: " + calculateTravelDuration() + "일");
    }
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
    

}
