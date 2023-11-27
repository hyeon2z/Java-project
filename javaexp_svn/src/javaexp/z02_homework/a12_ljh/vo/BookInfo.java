package javaexp.z02_homework.a12_ljh.vo;

import java.util.Scanner;

public class BookInfo {
	private String name;
	private String writer;
	private int price;
	private int year;
	
	public BookInfo(String name, String writer, int price, int year) {
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.year = year;
	}
	
	public void showInfo() {
		System.out.println("책 제목: " + name);
		System.out.println("저자: " + writer);
		System.out.println("가격: " + price);
		System.out.println("출판년도: " + year);
	}
	
	public void changePrice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경 금액을 입력하세요: ");
		price = Integer.parseInt(sc.nextLine());
		System.out.println("변경된 금액: " + price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
