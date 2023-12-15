package javaexp.z02_homework.a03_ls.vo;

public class Coffee {
	String kind;
	int price;
	String make;
	public Coffee(String kind) {
		this.kind = kind;
		int price = 4500;
	}
	
	public void coffeeInfo() {
		System.out.println("# 커피 정보 #");
		System.out.println("커피종류:"+kind);
		System.out.println("커피원산지:"+make);
		System.out.println("커피가격:"+price);
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
}
