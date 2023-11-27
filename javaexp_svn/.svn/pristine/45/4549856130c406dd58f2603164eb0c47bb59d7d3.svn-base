package javaexp.z02_homework.a13_ajh.vo0921;

public class Smartphone {
	private String brand;
    private String model;
    private double price;
	public Smartphone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = 0.0;
	}
	public void setPrice1(double price) {
        if (price >= 0) {
            this.price = price;
            System.out.println(brand + " " + model + "의 가격이 변경되었습니다.");
        } else {
            System.out.println("유효하지 않은 가격입니다. 0 이상의 값을 입력하세요.");
        }
    }
	public void printInfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("가격: " + price + "원");
    }
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    

}
