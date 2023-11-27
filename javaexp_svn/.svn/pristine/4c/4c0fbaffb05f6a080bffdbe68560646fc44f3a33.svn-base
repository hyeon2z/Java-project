package javaexp.z02_homework.a12_ljh.vo;

import java.util.Scanner;

public class Pen {
	private String color;
	private String brand;
	private int price;
	
	public Pen(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	public void ShowInfo() {
		System.out.println("[펜 정보]");
		System.out.println("브랜드: " + brand);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
	
	public void ChangePrice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 금액을 입력하세요: ");
		price = Integer.parseInt(sc.nextLine());
		System.out.println("변경된 금액: " + price);
	}
	
}
