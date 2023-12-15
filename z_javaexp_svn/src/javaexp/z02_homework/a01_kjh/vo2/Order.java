package javaexp.z02_homework.a01_kjh.vo2;

public class Order {
	private String product;
	private int price;
	
	public Order() {}
	
	public Order(String product, int price) {
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
