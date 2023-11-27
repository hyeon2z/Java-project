package javaexp.z02_homework.a01_kjh.vo;

public class SmartPhone {
	String brand;
	String model;
	int price;
	
	public SmartPhone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public void smartInfo() {
		System.out.println("#스마트폰 정보#");
		System.out.println("브랜드 : " + brand);
		System.out.println("모델 : " + model);
		getPrice();
	}
	
	public int getPrice() {
		System.out.println("스마트폰 가격 : " + price);
		return price;
	}

	public void setPrice(int price) {
		System.out.println("스마트폰 가격 변경 : " + price + "\n");
		this.price = price;
	}
	
	
}
