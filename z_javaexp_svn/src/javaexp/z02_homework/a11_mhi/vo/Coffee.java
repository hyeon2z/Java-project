package javaexp.z02_homework.a11_mhi.vo;

public class Coffee {
	private String type;
	private int price;
	private String origin;

	public Coffee(String type, int price, String origin) {
		this.type = type;
		this.price = price;
		this.origin = origin;
	}

	// 직접 입력
	public void showInf() {
		System.out.println("# coffee객체의 정보 #");
		System.out.println("종류:" + type);
		System.out.println("가격:" + price);
		System.out.println("원산지:" + origin);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
