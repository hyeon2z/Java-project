package a01_diexp.z01_vo;

public class Food {
	private String type;
	private int price;
	private int cnt;
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(String type, int price, int cnt) {
		this.type = type;
		this.price = price;
		this.cnt = cnt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
