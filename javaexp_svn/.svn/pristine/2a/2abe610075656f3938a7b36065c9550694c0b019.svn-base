package javaexp.z02_homework.a12_ljh.vo;

import java.util.Scanner;

public class Coffee {
	private String kind;
	private int price;
	private String country;
	
	public Coffee(String kind) {
		this.kind = kind;
	}
	
	public void changePrice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 가격을 입력하세요: ");
		price = Integer.parseInt(sc.nextLine());
	}
	
	public String inputCountry() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원산지를 입력하세요: ");
		country = sc.nextLine();
		return country;
	}
	
	public void showInfo() {
		System.out.println("[커피 정보]");
		System.out.println("커피 종류: " + kind);
		System.out.println("가격: " + price);
		System.out.println("원산지: " + country);
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
