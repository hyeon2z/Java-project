package javaexp.z02_homework.a14_cms.vo;

public class Coffee {
	private String brand;
	private int price;
	private String origin;
	
	public Coffee(String brand) {
		this.brand = brand;
	}
	public void showCoffeeInfo() {
		System.out.println("커피의 종류는 " + brand);
		System.out.println("커피의 가격은 " + price);
		System.out.println("커피의 원산지는 " + origin);
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	
	
	

}
