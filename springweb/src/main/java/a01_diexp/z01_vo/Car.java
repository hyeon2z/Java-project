package a01_diexp.z01_vo;

public class Car {
	private String color;
	private String brand;
	private int year;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String color, String brand, int year) {
		this.color = color;
		this.brand = brand;
		this.year = year;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
