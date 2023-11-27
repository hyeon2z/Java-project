package javaexp.z02_homework.a11_mhi.vo;

public class Smartphone {
	private String brand;
	private String model;
	private int price;

	public Smartphone(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	// 직접 입력
	public void showInf() {
		System.out.println("# smartPhon객체의 정보 #");
		System.out.println("브랜드:" + brand);
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
