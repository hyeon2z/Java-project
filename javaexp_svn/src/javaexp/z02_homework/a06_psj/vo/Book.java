package javaexp.z02_homework.a06_psj.vo;

public class Book {
	private String name;
	private String author;
	private int price;
	private int year;
	public Book(String name, String author, int price, int year) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	public void BookInfo() {
		System.out.println("제목: "+name);
		System.out.println("저자: "+author);
		System.out.println("가격: "+price);
		System.out.println("출판년도: "+year);
	}
}
