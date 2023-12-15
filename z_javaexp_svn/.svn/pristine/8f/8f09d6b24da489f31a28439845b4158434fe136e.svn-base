package javaexp.z02_homework.a21_hcj.vo.a1004;

public class Cunsumer {
	private String name;
	private Order order;
	public Cunsumer() {
		// TODO Auto-generated constructor stub
	}
	public Cunsumer(String name) {
		this.name = name;

	}
	public void ShowOrderInfo() {
		System.out.println("## 고객정보 ##");
		System.out.println("이름:"+ name);
		if(order != null) {
			System.out.println("상품명:"+order.getName());
			System.out.println("상품가격:"+order.getPrice());
			System.out.println("주문수량:"+order.getCnt());
		}else {
			System.out.println("요청된 상품주문이 없습니다.");
		}
		System.out.println("===============");
			
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
