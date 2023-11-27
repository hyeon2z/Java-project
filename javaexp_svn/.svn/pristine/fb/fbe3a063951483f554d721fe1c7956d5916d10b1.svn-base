package javaexp.z02_homework.a14_cms;



public class A0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		Book b01 = new Book();
		b01.title = "자바기초";
		b01.athors ="홍길동";
		b01.publisher="쌍용출판사";
		b01.pageNo = 306;
		b01.price = 25000;
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		Student st1 = new Student();
		st1.stNo = 1771440;
		st1.score = 4.5;
		st1.name = "최명신";
		st1.grade = 4;
		st1.major = "컴퓨터공학부";
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		Car c1 = new Car();
		c1.brand = "현대모터스";
		c1.model = "아반떼";
		c1.year = 10;
		c1.color = "white";
		c1.maxSpeed = 180;
		c1.cSpeed = 120;
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		Account a01 = new Account(11111,"홍길동", 200000, "23년 9월 30일");
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		Product p01 = new Product(90,"제주청귤아이스티",2200,15,"inno.N");
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
		Movie m01 = new Movie();
		Movie m02 = new Movie("고양이 톰의 여행", "최명신", "최톰", "23년 9월 20일", "120분", "코미디" );
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		Athlete ath01 = new Athlete();
		Athlete ath02 = new Athlete("전병선", "배구", "OK금융그룹", "아포짓스파이커", 10, 12);
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		Music ms01 = new Music();
		Music ms02 = new Music("천년의 사랑", "박완규" );
		Music ms03 = new Music("천년의 사랑", "박완규", "3분 20초", "락발라드");
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
		Animal ani01 = new Animal();
		Animal ani02 = new Animal("최톰");
		Animal ani03 = new Animal("러시안블루",12);
		Animal ani04 = new Animal("최톰","러시안블루",12, 5.12, "회색");
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		User u01 = new User("java", "script123"); //id와 pw
		User u02 = new User("최명신", 19450815); //이름과 생년월일
		User u03 = new User("java@gmail.com", 01012341234, 19400130); //email, 번호, 생년월일
		
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		
// 		A : 같은 패키지에 있는 class끼리는 접근제어자가 private가 아니면 직접적으로 class를 선언할 수 있고,
		// 필드나 메서드에 접근할 수 있다.
		//다른 package내에 있는 class에 접근하기 위해서는 class import 해야하며 접근제어자가 public 아니면
		//직접적으로 접근할 수 없다.
		Problem11 pb = new Problem11(); //같은 패키지 안에 있는 class를 통해 객체 생성
		pb.age = 10; //default
		pb.grade = 3; //public
		//pb.name = "최명신" private;
		
		
		
		
	}

}
class Book{
	String title;
	String athors;
	String publisher;
	int price;
	int pageNo;
	
}
class Student{
	int stNo;
	String name;
	String major;
	int grade;
	double score;
}
class Car{
	String brand;
	String model;
	int year;
	String color;
	int maxSpeed;
	int cSpeed;
}
class Account{
	int accNo;
	String accHolder;
	int balance;
	String opDate;
	Account(int accNo, String accHolder, int balance, String opDate){
		this.accNo = accNo;
		this.accHolder = accHolder;
		this.balance = balance;
		this.opDate = opDate;
	};
}
class Product{
	int pcode;
	String name;
	int price;
	int cnt; //재고수량
	String manuCompany;
	Product(int pcode, String name, int price, int cnt, String manuCompany){
		this.pcode = pcode;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
		this.manuCompany = manuCompany;
	}
}
class Movie{
	Movie(){};
	Movie(String title,  String director, String actor, String opDate, String runTime, String genre){
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.actor = actor;
		this.runTime = runTime;
		this.opDate = opDate;
	}
	String title;
	String genre;
	String director;
	String actor;
	String runTime;
	String opDate;
	
}
class Athlete{//- 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
	String name;
	String sports;
	String team;
	String position;
	int years;
	int no;
	Athlete(){};
	Athlete(String name, String sports, String team, String position, int years, int no){
		this.name = name;
		this.sports = sports;
		this.team = team;
		this.position = name;
		this.years = years;
		this.no = no;
	};
	
}
class Music{ //- 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
	String title;
	String artist;
	String playTime;
	String genre;
	Music(){};
	Music(String title, String artist){ //매개변수 2개
		this.title = title;
		this.artist = artist;
	} //생성자나 메서드는 호출 시 매개변수의 개수로 분별한다.
	Music(String title, String artist, String playTime, String genre){ //매개변수 4개
		this.title = title;
		this.artist = artist;
		this.playTime = playTime;
		this.genre = genre;
	}
	
}
class Animal{ // 필드: (이름), (종류, 나이), 체중, 색상
	String name;
	String kind;
	int age;
	double weight;
	String color;
	Animal(){};
	Animal(String name){ //매개변수 1개
		this.name = name;
	}
	Animal(String kind, int age){ //매개변수 여러개
		this.kind = kind;
		this.age = age;
	}
	Animal(String name, String kind, int age, double weight, String color){
		this.name = name;
		this.kind = kind;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
}
class User{ // 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
	String id;
	String pw;
	String name;
	String emailAd;
	int phoneNo;
	int birthDate;
	User(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	User(String name, int birthDate){
		this.name = name;
		this.birthDate = birthDate;
		
	}
	User(String emailAd, int phoneNo, int birthDate){
		this.emailAd = emailAd;
		this.phoneNo = phoneNo;
		this.birthDate = birthDate;
	}
	
}