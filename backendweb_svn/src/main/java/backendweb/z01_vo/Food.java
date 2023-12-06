package backendweb.z01_vo;
// backendweb.z01_vo.Food

public class Food {
	private String fname;
	private int ordercnt;
	private int price;
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(String fname, int ordercnt, int price) {
		this.fname = fname;
		this.ordercnt = ordercnt;
		this.price = price;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getOrdercnt() {
		return ordercnt;
	}
	public void setOrdercnt(int ordercnt) {
		this.ordercnt = ordercnt;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
