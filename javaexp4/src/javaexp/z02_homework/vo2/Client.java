package javaexp.z02_homework.vo2;

public class Client {
	private String name;
	private int age;
	private Order order;
	
	public Client() {}
	
	public Client(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void clientInfo() {
		System.out.println("#고객의정보#");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		if(order != null) {
			System.out.println("주문한 상품 : " + order.getProduct());
			System.out.println("상품의 금액 : " + order.getPrice());
		}else {
			System.out.println("주문이 없습니다.");
		}
	}
	
	public String getName() {
		return name;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
