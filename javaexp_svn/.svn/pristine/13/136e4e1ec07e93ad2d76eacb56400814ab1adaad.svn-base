package javaexp.z02_homework.a10_kdh.a01_0920;

import javaexp.z02_homework.a10_kdh.a01_0920.vo.Baby;

public class A01_0920 {

	public static void main(String[] args) {
		
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
			Book book = new Book();
			book.bookName = "피노키오";
			book.author = "김도현";
			book.publisher = "동화나라";
			book.NumberOfPages = 320;
			
			System.out.println("책 이름:" + book.bookName);
			System.out.println("저자:" + book.author);
			System.out.println();
			
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
			Student studentKim = new Student();
			studentKim.studentId = 1234;
			studentKim.studentName = "김도현";
			studentKim.major = "컴퓨터공학";
			studentKim.year = "졸업자";
			studentKim.avgGrade = "4.5";
			
			System.out.println("학번:" + studentKim.studentId);
			System.out.println("전공:" + studentKim.major);
			System.out.println("학년:" + studentKim.year);
			System.out.println();
			
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
			Car car = new Car();
			car.brand = "현대";
			car.model = "싼타페";
			car.yearOfyear = "2023";
			car.maxSpeed = 400;
			car.curSpeed = 120;
			System.out.println("브랜드:" + car.brand);
			System.out.println("모델:" + car.model);
			
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
			Account account = new Account("000-000~", "김도현", "0원", "2023/09/20");

//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
			Product product1 = new Product();
			product1.productCode = "1234";
			product1.productName = "우비";
			product1.price = 6000;
			product1.quantity = 100;
			product1.manufacturer = "우비소년";
			Product product2 = new Product("1111", "우산", 12000, 50, "비가오는날엔");

//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
			Movie movie1 = new Movie();
			movie1.movieTitle = "잠";
			movie1.director = "유재선";
			movie1.actor = "이선균";
			movie1.releaseDate = "2023/09/06";
			movie1.runTime = "94min";
			movie1.genre = "스릴러";
			Movie movie2 = new Movie("코딩", "양현수", "김도현", "2023/09/02", "8hours", "스릴러");
			
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
			SportsMan player1 = new SportsMan();
			SportsMan player2 = new SportsMan("마이클 조던", "NBA", "슈팅가드", 100, 23);
			
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
			MusicTrack music1 = new MusicTrack(4, "pop");
			MusicTrack music2 = new MusicTrack("Seven", "정국");
			
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
			Animal animal1 = new Animal("호랑이");
			Animal animal2 = new Animal("고양이", 5);
			
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
			User user1 = new User("dohyeon123", 1234);
			User user2 = new User("dohyeon@gamil.com", "1888.12.25");
			
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		/*
		 접근제어자는 필드 또는 클래스에 사용되어 해당하는 필드 또는 클래스를 외부에서 
		 접근하지 못하도록 제한하는 역할을 함
		 접근제어자는 생략가능하며 생략했을 때는 자동으로 default 임을 뜻하게 된다. 
		 접근제어자가 사용될 수 있는 곳 : 클래스, 필드, 메서드, 생성자
		1) private : 같은 클래스 내에서만 접근 가능
		2) default : 같은 패키지 내에서만 접근 가능
		3) protected : 같은 패키지 내에서 접근 가능, 상속 관계
		4) public : 접근 제한이 전혀 없다. 
		 */
		Person person = new Person();
		Baby baby = new Baby(); //javaexp.z02_homework.a10_kdh.a01_0920 패키지라는 
								//다른 패키지 있는 class이므로 public으로 선언시 사용가능.(import)
								
	}
}
class Person{
	String name;
	int age;
}
class User{
	String userId;
	int pass;
	String userName;
	String email;
	String phoneNumber;
	String birth;
	
	User(String userId, int pass) {
		this.userId = userId;
		this.pass = pass;
	}
	
	User(String email, String birth) {
		this.email = email;
		this.birth = birth;
	}
}

class Animal{
	String name;
	String kind;
	int age;
	int weight;
	String color;
	
	Animal(String name) {
		this.name = name;
	}
	
	Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}
	
}
class MusicTrack{
	String musicName;
	String artist;
	int playTime;
	String genre;
	String albumName;
	MusicTrack(String musicName, String artist) {
		this.musicName = musicName;
		this.artist = artist;
	}
	MusicTrack(int runtime, String genre) {
		this.playTime = runtime;
		this.genre = genre;
	}
	// 매개변수 4개일 때..
	// 생성자나 메서드는 호출시 매개변수의 갯수로 식별하여
	// 호출이 가능하기 때문에 동일한 이름이라도 선언할 수 있다.
	MusicTrack(String musicName, String artist, int runtime, String genre) {
		this.musicName = musicName;
		this.artist = artist;
		this.playTime = runtime;
		this.genre = genre;
	}
}
class SportsMan{
//	이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
	String name;
	String teamName;
	String position;
	int year;
	int playerNumber;
	public SportsMan(){}
	SportsMan(String name, String teamName, String position, int year, int playerNumber) {
		this.name = name;
		this.teamName = teamName;
		this.position = position;
		this.year = year;
		this.playerNumber = playerNumber;
	}
	
}
class Movie{
	String movieTitle;
	String director;
	String actor;
	String releaseDate;
	String runTime;
	String genre;
	
	Movie(){}
	
	Movie(String movieTitle, String director, String actor, String releaseDate, String runTime, String genre) {
		this.movieTitle = movieTitle;
		this.director = director;
		this.actor = actor;
		this.releaseDate = releaseDate;
		this.runTime = runTime;
		this.genre = genre;
	}
	
}
class Product{
	String productCode;
	String productName;
	int price;
	int quantity;
	String manufacturer;
	
	Product(){}
	
	Product(String productCode, String productName, int price, int quantity, String manufacturer) {
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
	}

}
class Account{
	String accountNumber;
	String depositer;
	String money;
	String openDate;
	
	Account(String accountNumber, String depositer, String money, String openDate) {
		this.accountNumber = accountNumber;
		this.depositer = depositer;
		this.money = money;
		this.openDate = openDate;
	}
}
class Car{
	String brand;
	String model;
	String yearOfyear;
	int maxSpeed;
	int curSpeed;
}
class Student{
	int studentId;
	String studentName;
	String major;
	String year;
	String avgGrade;
}
class Book{
	String bookName;
	String author;
	String publisher;
	int NumberOfPages;
}


