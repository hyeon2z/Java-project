package javaexp.z02_homework.a14_cms;

import javaexp.z02_homework.a14_cms.vo.Customer;
import javaexp.z02_homework.a14_cms.vo.Home;
import javaexp.z02_homework.a14_cms.vo.Human;
import javaexp.z02_homework.a14_cms.vo.Order;
import javaexp.z02_homework.a14_cms.vo.Student2;
import javaexp.z02_homework.a14_cms.vo.Teacher;
import javaexp.z02_homework.a14_cms.vo.Member;
import javaexp.z02_homework.a14_cms.vo.Team;

public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
		Home home01 = new Home("서울특별시 강남구 역삼동", "오피스텔", 10 ); //포함될 객체
		Human hum01 = new Human("홍길동", 25); // 포함할 객체
		System.out.println("Home정보가 아직 없는 Human");
		hum01.showHumanInfo();
		System.out.println("==============");
		hum01.setHome(home01);
		hum01.showHumanInfo();
		
		
//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문
		Order o01 = new Order();
		Customer c01 = new Customer("최명신", "엘리트");
		o01.setPname("핸드크림");
		c01.show();
		
		
//			2) 학생과 담임교사 
		Student2 st = new Student2("양정인", 3, 4);
		st.setTeacher(new Teacher("조수희", "영어"));
//			3) Person 객체와 Address 객체의 관계
		Person p01 = new Person("마길동", 30 );
		p01.setAddress(new Address("서울특별시", "강동구"));
		p01.showPersonInfo();
		
//			4) Book 객체와 Author 객체의 관계
		BookSecond b01 = new BookSecond("자바기초", 23000);
		Author a01 = new Author("황기태", "한국");
		b01.setAuthor(a01);
		b01.showBookInfo();
//			5) Member 객체와 Team 객체의 관계
		Member m01 = new Member("전병선", 193, 31, 12);
		m01.setTeam(new Team("OK금융그룹 배구단", "안산"));
		m01.show();

	}

}
class BookSecond{
	private String title;
	private int price;
	private Author author;
	public BookSecond() {
		
	}
	public BookSecond(String title, int price) {
		this.title = title;
		this.price = price;
	};
	public void showBookInfo() {
		System.out.println("책 제목은: " + title);
		System.out.println("책 가격은: " + price);
		if(author!=null) {
			author.showAuthorInfo();
			
		}else System.out.println("작가 정보 없음.");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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

class Author{
	private String name;
	private String nationality; //작가의 국적
	public Author() {}
	public Author(String name, String nationality) {
		this.name = name;
		this.nationality = nationality;
	};
	public void showAuthorInfo() {
		System.out.println("작가명: " + name);
		System.out.println("작가의 국적: " + nationality);
	}
	
}
class Person{
	private String name;
	private int age;
	private Address address;
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void showPersonInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + name);
		if(address!=null) {
			address.showAddressInfo();
		}else System.out.println("주소 정보 없음");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	};
	
}
class Address{
	private String city; //도시
	private String gu; //구
	public Address() {
		
	}
	public Address(String city, String gu) {
		this.city = city;
		this.gu = gu;
	}
	void showAddressInfo() {
		System.out.println("도시명: " + city);
		System.out.println("구 이름: " + gu);
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGu() {
		return gu;
	}
	public void setGu(String gu) {
		this.gu = gu;
	}
	
	
}


