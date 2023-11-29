package order_sol;

public class Beverage {
	private int no;
	private String kind;
	private String type;
	private String name;
	private int price;
	public Beverage() {
		// TODO Auto-generated constructor stub
	}
	public Beverage(int no, String kind, String type, String name, int price) {
		this.no = no;
		this.kind = kind;
		this.type = type;
		this.name = name;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
}
