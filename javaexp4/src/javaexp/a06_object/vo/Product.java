package javaexp.a06_object.vo;

public class Product {
	private String name;
	private int price;
	private int num;
	
	public Product(String name, int price, int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}
	public void showInfo() {
		System.out.println("#물건의 정보#");
		System.out.println("물건명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("재고수량 : " + num);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
