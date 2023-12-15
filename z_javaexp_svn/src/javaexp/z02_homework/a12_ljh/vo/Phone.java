package javaexp.z02_homework.a12_ljh.vo;

import java.util.Scanner;

public class Phone {
	private String brand;
	private String model;
	private int price;
	
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public int changePrice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격을 입력하세요: ");
		price = Integer.parseInt(sc.nextLine());
		return price;
	}
	
	public void showInfo() {
		System.out.println("[스마트폰 정보]");
		System.out.println("브랜드: " + brand);
		System.out.println("모델: " + model);
		System.out.println("가격: " + price + "원");
	}
	
	
	
}
