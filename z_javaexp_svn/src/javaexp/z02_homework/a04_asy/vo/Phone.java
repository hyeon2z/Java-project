package javaexp.z02_homework.a04_asy.vo;

public class Phone {
//	브랜드모델가격
	private String brand;
	private String model;
	private int price;
	
	public Phone(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public void phoneInfo() {
		System.out.println("# 휴대폰 정보 # ");
		System.out.println("브랜드:"+brand);
		System.out.println("모델:"+model);
		System.out.println("가격:"+price+"원");
		
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
