package javaexp.z02_homework.a00_yhs.vo;

public class Smartphone {
    private String brand;
    private String model;
    private double price;

    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}
