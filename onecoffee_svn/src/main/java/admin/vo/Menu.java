package admin.vo;

public class Menu {

	/*
	  no NUMBER,
	  category varchar2(50),
	  name varchar2(50),
	  drink_type varchar2(50),
	  price number,
	  detail varchar2(200)
	  */
	
	int no;
	String category;
	String name;
	String drink_type;
	int price;
	String detail; 
	
	public Menu() {
	}

	public Menu(int no, String category, String name, String drink_type, int price, String detail) {
		super();
		this.no = no;
		this.category = category;
		this.name = name;
		this.drink_type = drink_type;
		this.price = price;
		this.detail = detail;
	}
	

	public Menu(String category, String name, String drink_type, int price, String detail) {
		super();
		this.category = category;
		this.name = name;
		this.drink_type = drink_type;
		this.price = price;
		this.detail = detail;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrink_type() {
		return drink_type;
	}

	public void setDrink_type(String drink_type) {
		this.drink_type = drink_type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	
	
}
