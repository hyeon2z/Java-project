package javaexp.z02_homework.a01_kjh.vo;

public class Pen {
	String color;
	String brand;
	int price;
	
	public Pen(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

	public void penInfo() {
		System.out.println("#펜 정보#");
		System.out.println("펜 색상 : " + color);
		System.out.println("펜 브랜드 : " + brand);
		getPrice();
	}
	
	public int getPrice() {
		System.out.println("가격 : " + price);
		return price;
	}

	public void setPrice(int price) {
		System.out.println("변경된 가격 : " + price + "\n");
		this.price = price;
	}
	
	
	
	
}
