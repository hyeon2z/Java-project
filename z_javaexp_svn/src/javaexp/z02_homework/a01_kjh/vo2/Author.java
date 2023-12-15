package javaexp.z02_homework.a01_kjh.vo2;

public class Author {
	private String name;
	private String age;
	private Book book;
	
	public Author() {}
	
	public Author(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	public void authorInfo() {
		System.out.println("#작가의 정보#");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		if(book != null) {
			System.out.println("집필한 책 이름 : " + book.getName());
			System.out.println("책 가격 : " + book.getPrice());
		}else {
			System.out.println("집필한 책 없음");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
