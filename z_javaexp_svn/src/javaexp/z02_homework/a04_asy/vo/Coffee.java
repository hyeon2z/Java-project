package javaexp.z02_homework.a04_asy.vo;

public class Coffee {
//		커피 종류,커피가격,커피 생산지
	private String kind; 
	private int price; 
	private String country;

	public Coffee(String kind, int price, String country) {
		this.kind=kind;
		this.price=price;
		this.country=country;
	}
	public void coffeeInfo() {
		System.out.println("# 커피 정보 # ");
		System.out.println("커피종류:"+kind);
		System.out.println("가격:"+price+"원");
		System.out.println("원산지:"+country);
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}