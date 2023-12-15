package javaexp.z02_homework.a13_ajh.vo0921;

public class Coffee {
	private String type;
    private double price;
    private String origin;
	public Coffee(String type) {
		this.type = type;
		this.price = 0.0;
		this.origin = "미입력";
	}
	public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            System.out.println(type + " 커피의 가격이 변경되었습니다.");
        } else {
            System.out.println("유효하지 않은 가격입니다. 0 이상의 값을 입력하세요.");
        }
    }
	public void setOrigin(String origin) {
        this.origin = origin;
        System.out.println(type + " 커피의 원산지가 입력되었습니다.");
    }
	public void printInfo() {
        System.out.println("종류: " + type);
        System.out.println("가격: " + price + "원");
        System.out.println("원산지: " + origin);
    }
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice1(double price) {
		this.price = price;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin1(String origin) {
		this.origin = origin;
	}
	

}
