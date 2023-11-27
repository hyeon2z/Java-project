package javaexp.z02_homework.a19_cjw.vo;

public class Book {

	private String title;
	private String writer;
	private int price;
	private String publishDt;

	public Book(String title, String writer, int price, String publishDt) {
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publishDt = publishDt;
	}
	
	public void bookInfo() {
		System.out.println("# 도서 정보 #");
		System.out.println("제목: "+title);
		System.out.println("저자: "+writer);
		System.out.println("가격: "+price);
		System.out.println("출판년도: "+publishDt);
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
}
