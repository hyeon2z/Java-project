package javaexp.z02_homework.a21_hcj.vo;
//	5. **차량 클래스**
//	    - 필드: 차량 번호, 모델, 연식
//	    - 생성자: 차량 번호, 모델 초기화
//	    - 메서드: 연식 변경, 정보 출력
public class Car {

	private String no;
	private String modelName;
	private String date;
	public Car(String no, String modelName) {
		this.no = no;
		this.modelName = modelName;

	}
	
	public void ShowInfo() {
		System.out.println("차량 정보");
		System.out.println("모델명:"+modelName);
		System.out.println("차량번호:"+no);
		System.out.println("연식:"+date);
	}

	public void setDate(String date) {
		System.out.println(date+"연식으로 연식 변경 완료");
		this.date = date;
	}
	
	
	
	
}

