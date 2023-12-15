package javaexp.z02_homework.a14_cms.vo;

public class Customer {
	private String name; //고객명
	private String level; //고객등급
	private Order order;
	public Customer() {
	}
	public Customer(String name, String level) {
		this.name = name;
		this.level = level;

	}
	public void show() {
		System.out.println("고객명: " + name);
		System.out.println("고객등급: " + level);
		System.out.println(order!=null?order.getPname():"주문이 없습니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	

}
