package javaexp.z02_homework.a17_okw.vo;

public class Author {
	private String authorName;
	private Book book;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void showBookInfo() {
		System.out.println("작가명 : " + authorName);
		if(book != null) {
			System.out.println("# 책 정보 #");
			System.out.println("책 제목 : "+book.getBookName());
			System.out.println("출판사 : "+book.getPublisher());
		}else {
			System.out.println("책 정보 입력 안됨.");
		}
		System.out.println("==================");
	}
}
