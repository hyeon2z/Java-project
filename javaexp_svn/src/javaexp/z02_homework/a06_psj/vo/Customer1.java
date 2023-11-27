package javaexp.z02_homework.a06_psj.vo;

public class Customer1 {
	private String name;
	private int age;
	private Order od;
	public Customer1(String a,int b,Order c){
			name=a;
			age=b;
			od=c;
	}
	public void info(){
		System.out.println("고객명:"+name+", 나이:"+age);
		System.out.println("주문상품:"+od.getPName()+", 가격:"+od.getPrice());
	}
}
