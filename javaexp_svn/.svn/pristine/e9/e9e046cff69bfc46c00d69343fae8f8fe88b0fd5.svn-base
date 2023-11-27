package javaexp.z02_homework.a12_ljh.vo;

public class Client {
	private int id;
	private String name;
	private Order order;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void showClient() {
		System.out.println("** 고객 정보 **");
		System.out.println("회원 번호: " + id);
		System.out.println("회원 이름: " + name);
		if(order != null) {
			order.showOrder();
			System.out.println();
		}else {
			System.out.println("물건을 구매하지 않았습니다.");
			System.out.println();
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
}
