package a01_diexp.z02_vo;

import org.springframework.stereotype.Component;

@Component("prod") // 설정하지 않으면 product, 설정하면 설정값으로
public class Product {
	private String name;
	private int price;
	private int cnt;
	public Product(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	public Product() {
		// TODO Auto-generated constructor stub
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
