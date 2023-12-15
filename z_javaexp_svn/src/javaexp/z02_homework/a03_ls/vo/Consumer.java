package javaexp.z02_homework.a03_ls.vo;

public class Consumer {
	int no;
	String sex;
	Order order;
	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	public Consumer(int no, String sex) {
		this.no = no;
		this.sex = sex;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public void show() {
		if (order!=null) {
			System.out.println("손님정보");
			System.out.println("손님의 번호 : "+no);
			System.out.println("손님의 성별 : "+sex);
			System.out.println("주문 메뉴 : "+order.getMenu());
			System.out.println("주문 메뉴 가격 : "+order.getPrice());
		}else {
			System.out.println("주문을 해주세요");
		}
	}
	

}
