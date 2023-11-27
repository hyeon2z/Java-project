package javaexp.z02_homework.a06_psj.vo;

public class Market {
	private String name;
	private int price;
	private int m;
	public Market() {
	}
	public Market(String name, int price, int m) {
		this.name = name;
		this.price = price;
		this.m = m;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
}
