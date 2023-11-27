package javaexp.z02_homework.a12_ljh.vo;

public class Order {
	private String product;
	private int price;
	private int total;
	private int amount;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(String product, int price, int amount) {
		this.product = product;
		this.price = price;
		this.amount = amount;
	}



	public void showOrder() {
		System.out.println("구매 물품: " + product);
		System.out.println("가격: " + price + "원");
		System.out.println("개수: " + amount);
		System.out.println("총 가격: " + total + "원");
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

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		total = price * amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
