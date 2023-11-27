package javaexp.z02_homework.a11_mhi.vo;

public class Customer {
	private String name;
	private String address;
	private Order order;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public  void showInfo() {
		System.out.println("#고객 정보#");
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		if(order!=null) {
			System.out.println("물품"+order.getProduct());
			System.out.println("가격"+order.getPrice());
		
		}else {
			System.out.println("주문 정보가 아직 없습니다.");
		}
		System.out.println("============");
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
