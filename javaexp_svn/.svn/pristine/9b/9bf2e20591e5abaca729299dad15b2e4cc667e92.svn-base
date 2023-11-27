package javaexp.z02_homework.a10_kdh.mini;

import java.util.Scanner;

public class Product {

	Scanner scanner = new Scanner(System.in);
	
	private int productNumber;
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	private String productName;
	private int productPrice;
	
	public Product() {}
	public Product(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public void makeProduct() {
		System.out.print("물건의 이름을 입력하세요:");
		String pd = scanner.nextLine();
		setProductName(pd);
		System.out.print("물건의 가격을 입력하세요:");
		int pp = scanner.nextInt();
		setProductPrice(pp);
		System.out.println("물건 등록!");
		System.out.println();
	}
	
}
