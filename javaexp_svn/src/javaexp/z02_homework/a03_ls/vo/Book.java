package javaexp.z02_homework.a03_ls.vo;

public class Book {
	String name;
	String person;
	int price;
	int year;
	public Book(String name, String person, int price, int year) {
		this.name = name;
		this.person = person;
		this.price = price;
		this.year = year;
	}
	public void bookInfo() {
		System.out.println("# 도서 정보 #");
		System.out.println("책 이름:"+name);
		System.out.println("책 저자:"+person);
		System.out.println("책가격:"+price);
		System.out.println("출판년도:"+year);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
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
