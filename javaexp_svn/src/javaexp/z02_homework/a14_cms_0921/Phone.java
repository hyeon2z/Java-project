package javaexp.z02_homework.a14_cms_0921;

public class Phone {

	private String brandName;
	private String model;
	private int price;
	
	public Phone(String brandName, String model) {
		this.brandName = brandName;
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void showPhoneInfo() {
		System.out.println("브랜드명: " + brandName);
		System.out.println("모델명: " + model);
		System.out.println("가격 " + price);
	}
}
