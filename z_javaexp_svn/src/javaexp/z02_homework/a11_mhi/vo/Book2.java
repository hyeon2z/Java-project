package javaexp.z02_homework.a11_mhi.vo;

public class Book2 {
	private String title;
	private String publisher; 
	private int publicationDate;
	private Author author;
	public Book2() {
		// TODO Auto-generated constructor stub
	}
	public Book2(String title, String publisher, int publicationDate) {
		this.title = title;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	}
	
	public  void showInfo() {
		System.out.println("#책 정보#");
		System.out.println("책이름:"+title);
		System.out.println("출판사:"+publisher);
		System.out.println("출판일:"+publicationDate);
		if(author!=null) {
			System.out.println("작가 이름:"+author.getName());
			System.out.println("작가 소속:"+author.getAffiliation());
			System.out.println("작가 전화번호:"+author.getPhoneNumber());
		
		}else {
			System.out.println("작가 정보가 아직 없습니다.");
		}
		System.out.println("============");
	}
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	
	
}
