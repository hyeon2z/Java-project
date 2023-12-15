package javaexp.z02_homework.a03_ls.vo;

public class Phone {
	String brand;
	String model;
	int price=140000;
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	public void phoneInfo() {
		System.out.println("#스마트폰 정보출력#");
		System.out.println("스마트폰 브랜드 : "+brand);
		System.out.println("스마트폰 모델 : "+model);
		System.out.println("스마트폰 가격 : "+price);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
