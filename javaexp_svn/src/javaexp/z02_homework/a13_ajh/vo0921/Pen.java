package javaexp.z02_homework.a13_ajh.vo0921;

public class Pen {
	private String color;
    private String brand;
    private double price;
	public Pen(String color, String brand, double price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	public Pen(String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.price = 0.0;
    }
    public void setPrice1(double price) {
        if (price >= 0) {
            this.price = price;
            System.out.println(color + " " + brand + " 펜의 가격이 변경되었습니다.");
        } else {
            System.out.println("유효하지 않은 가격입니다. 0 이상의 값을 입력하세요.");
        }
    }
    public void printInfo() {
        System.out.println("색상: " + color);
        System.out.println("브랜드: " + brand);
        System.out.println("가격: " + price + "원");
    }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
