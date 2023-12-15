package javaexp.z02_homework.a21_hcj.vo;
//7. **여행 정보 클래스**
	//	    - 필드: 목적지, 출발일, 도착일
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 여행 일수 계산, 정보 출력
public class Travel {
	private String destination;
	private int stardDate;
	private int endDate;
	
	
	
	public Travel(String destination, int stardDate, int endDate) {
		this.destination = destination;
		this.stardDate = stardDate;
		this.endDate = endDate;
	}
	public void ShowInfo() {
		System.out.println("여행 정보");
		System.out.println("여행 목적지:"+destination);
		System.out.println("여행 출발일:"+stardDate);
		System.out.println("여행 종료일:"+endDate);
	}
	public int travelDate() {
		int date=0; 
		if(endDate/100>stardDate/100) {
			switch(stardDate/100){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				date = 31 -((stardDate%100)-(endDate%100));
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				date = 30 -((stardDate%100)-(endDate%100));
				break;
			default:
				date = 29 -((stardDate%100)-(endDate%100));
			}
		}
		else date = (endDate%100)-(stardDate%100);
		
		return date;
		}
	}
	
	

