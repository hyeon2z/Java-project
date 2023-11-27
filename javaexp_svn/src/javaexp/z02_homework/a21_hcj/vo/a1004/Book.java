package javaexp.z02_homework.a21_hcj.vo.a1004;

public class Book {
	private String name;
	private String company;
	private int price;
	private Author author;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String name, String company, int price) {
		this.name = name;
		this.company = company;
		this.price = price;
	}
	public void showBookInfo() {
		System.out.println("##책 정보##");
		System.out.println("제목:"+name);
		System.out.println("제작사:"+company);
		System.out.println("가격:"+price);
		if(author != null) {
			System.out.println("작가:"+author.getName());
		}else System.out.println("작가가 존재하지 않습니다.");
		System.out.println("===============");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
}
