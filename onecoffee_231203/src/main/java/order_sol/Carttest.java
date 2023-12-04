package order_sol;

public class Carttest {
	private int no;
	private String kind;
	private String type;
	private String name;
	private int price;
	private int cnt;
	public Carttest() {
		// TODO Auto-generated constructor stub
	}
	public Carttest(int no, String kind, String type, String name, int price, int cnt) {
		this.no = no;
		this.kind = kind;
		this.type = type;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
