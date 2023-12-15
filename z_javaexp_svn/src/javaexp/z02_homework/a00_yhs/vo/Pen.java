package javaexp.z02_homework.a00_yhs.vo;

public class Pen {
    private String color;
    private String brand;
    private double price;

    public Pen(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Color: " + color + ", Brand: " + brand + ", Price: " + price);
    }
}
