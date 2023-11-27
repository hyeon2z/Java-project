package javaexp.z02_homework.a06_psj.vo;

public class Order {
	private String pName;
	private int price;
	public Order(String a, int b){
		pName=a;
		price=b;
	}
	public String getPName(){
		return pName;
	}
	public int getPrice(){
		return price;
	}
}
