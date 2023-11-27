package javaexp.z02_homework.a17_okw.vo;

public class Order {
	private String productName;
	private int quantity;
	private Customer customer;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(String productName, int quantity) {
		this.productName = productName;
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void showOrderInfo() {
		System.out.println("# 주문 정보 #");
		System.out.println("주문한 상품 : "+ productName);
		System.out.println("수량 : "+ quantity);
		if(customer != null) {
			System.out.println("주문자 정보 : " + customer.getCustomerName());
		}else {
			System.out.println("주문자 정보가 없습니다.");
		}
		System.out.println("===========================");
	}
}
