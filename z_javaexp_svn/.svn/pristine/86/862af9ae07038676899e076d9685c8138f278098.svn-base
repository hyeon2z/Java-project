package javaexp.z02_homework.a20_kjw.vo;

public class Customer {//필드생성
	private order order;

	private String name;
	public Customer(){
		
	}
	public Customer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showMyOrderInfo() {//메서드 호출
		System.out.println("유저이름:"+name);
		if(order!=null) {//객체할당시
			System.out.println("주문 메뉴 정보");
			System.out.println(order.getMenu());
			System.out.println(order.getPrice());

		}else {//할당아닐
			System.out.println("주문이 없군요");
		}
	}
	public order getOrder() {
		return order;
	}
	public void setOrder(order order) {
		this.order = order;
	}
}

