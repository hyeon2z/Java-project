package javaexp.z02_homework.a03_ls.vo;

public class Car {
	int num;
	String model;
	int year = 3;
	public Car(int num, String model) {
		this.num = num;
		this.model = model;
	}
	public void carInfo() {
		System.out.println("# 차량 정보 #");
		System.out.println("차량번호 : "+num);
		System.out.println("차량모델 : "+model);
		System.out.println("차량연식 : "+year);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
