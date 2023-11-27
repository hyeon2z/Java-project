package javaexp.z02_homework.a11_mhi.vo;

public class Car {
	private String carNum;
	private String model;
	private int year;

	// 이 작업이 생성자: 모든 필드 초기화임
	public Car(String carNum, String modle, int year) {
		this.carNum = carNum;
		this.model = modle;
		this.year = year;
	}

	// 직접 입력
	public void showInf() {
		System.out.println("# car객체의 정보 #");
		System.out.println("차량번호:" + carNum);
		System.out.println("모델:" + model);
		System.out.println("연식:" + year);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}