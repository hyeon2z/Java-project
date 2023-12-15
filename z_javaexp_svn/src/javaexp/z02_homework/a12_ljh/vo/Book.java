package javaexp.z02_homework.a12_ljh.vo;

public class Book {
	private String title;
	private String company;
	private int page;
	private Author author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String company, int page) {
		this.title = title;
		this.company = company;
		this.page = page;
	}

	public void showBookInfo() {
		System.out.println("## 책 정보 ##");
		System.out.println("제목: " + title);
		System.out.println("출판사: " + company);
		System.out.println("페이지 수: " + page);
		if(author != null) {
			System.out.println("저자: " + author.getName());
			System.out.println();
		}else {
			System.out.println("저자 미상입니다.");
			System.out.println();
		}
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
