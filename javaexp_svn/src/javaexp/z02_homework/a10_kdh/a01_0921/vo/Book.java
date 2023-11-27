package javaexp.z02_homework.a10_kdh.a01_0921.vo;

public class Book {

//	1. **도서 클래스**
	// - 필드: 제목, 저자, 가격, 출판년도
	// - 생성자: 모든 필드 초기화
	// - 메서드: 도서 정보 출력, 가격 변경

	private String title;
	private String author;
	private int price;
	private int publicYear;

	public Book(String title, String author, int price, int publicYear) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicYear = publicYear;
	}

	public void showInfo() {
		System.out.println("#책 정보#");
		System.out.println("제목:" + title);
		System.out.println("저자:" + author);
		System.out.println("가격:" + price);
		System.out.println("출판년도:" + publicYear);
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
