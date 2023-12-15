package javaexp.z02_homework.a12_ljh.vo;

import java.util.Scanner;

public class Car {
	private int num;
	private String model;
	private int year;
	
	public Car(int num, String model, int year) {
		this.num = num;
		this.model = model;
		this.year = year;
	}
	
	public void showInfo() {
		System.out.println("[차량 정보]");
		System.out.println("차량 번호: " + num);
		System.out.println("모델: " + model);
		System.out.println("연식: " + year);
	}
	
	public void changeYear() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연식을 변경해주세요: ");
		year = Integer.parseInt(sc.nextLine());
		System.out.println("변경된 연식: " + year);
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
