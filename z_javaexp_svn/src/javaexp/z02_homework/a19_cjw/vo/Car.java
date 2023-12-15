package javaexp.z02_homework.a19_cjw.vo;

public class Car {

	private int carnum;
	private String model;
	private int age;

	public Car(int carnum, String model) {
		this.carnum = carnum;
		this.model = model;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void carInfo() {
		System.out.println("차번호: "+carnum);
		System.out.println("모델: "+model);
		System.out.println("연식: "+age);
	}
	
}
