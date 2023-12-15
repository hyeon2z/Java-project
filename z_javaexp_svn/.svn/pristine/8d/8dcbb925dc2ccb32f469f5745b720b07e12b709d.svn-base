package javaexp.z02_homework.a02_oys;

import javaexp.z02_homework.a02_oys.ex.A01_ExClass;

public class A0920_HomeWork {
	public static void main(String[] args) {
		
		Book book = new Book();
		StudentInfo studentInfo = new StudentInfo();
		Car car = new Car();
		Account account = new Account("123-456", "오윤서", 5000, "2023년9월20일");
		ItemInfo itemInfo = new ItemInfo("A123", "지갑", 10000, 3, "브랜드A");
		MovieInfo movieInfo = new MovieInfo();
		MovieInfo movieInfo2 = new MovieInfo("영화명", "김개똥", "김말똥", "2020년2월2일", "2시간20분", "코미디");
		Athlete athlete = new Athlete("홍길동", "야구", "야구1팀", "포수", 2, 5);
		Music music = new Music("노래이름", "홍길동");
		Music music2 = new Music(4, "발라드");
		Animal animal = new Animal("흰둥이");
		Animal animal2 = new Animal("말티즈", 3);
		User user = new User();
		User user2 = new User("asdf", "1234", "플레이어1", "123@gamil.com", "010-1234-5678", 20040618);
		
		
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		// 클래스 접근제어자가 private가 아니라면 -> 
		// 같은 패키지 안에 있는 클래스는 그냥 참조 할 수 있고,
		// 다른 패키지 안에 있는 클래스라면 import를 해주어야 한다.
		A01_ExClass ex = new A01_ExClass();

	}

}

/*1. **책 정보 클래스**(생성자X)
- 필드: 제목, 저자, 출판사, 가격, 페이지 수	*/	
class Book {
	String title;
	String company;
	int price;
	int page;
}

/*2. **학생 정보 클래스**(생성자X)
- 필드: 학번, 이름, 전공, 학년, 평균 성적*/
class StudentInfo {
	int num;
	String name;
	String major;
	int grade;
	double avgScore;
}

/*3. **자동차 클래스**(생성자X)
- 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도*/
class Car {
	String brand;
	String model;
	int year;
	String color;
	int maxSpeed;
	int speed;
}

/*4. **계좌 정보 클래스**(생성자O)
- 필드: 계좌번호, 예금주, 잔액, 개설일*/
class Account {
	String accountNum;
	String name;
	int money;
	String createDay;
	
	Account(String accountNum, String name, int money, String createDay) {
		this.accountNum = accountNum;
		this.name = name;
		this.money = money;
		this.createDay = createDay;
	}
}

/*5. **상품 정보 클래스**(생성자O)
- 필드: 상품코드, 상품명, 가격, 재고수량, 제조사*/
class ItemInfo {
	String itemCord;
	String name;
	int price;
	int stock;
	String company;
	
	ItemInfo(String itemCord, String name, int price, int stock, String company) {
		this.itemCord = itemCord;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.company = company;
	}
}

/*6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
- 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르*/
class MovieInfo {
	String title;
	String director;
	String actor;
	String openDay;
	String runningTime;
	String genre;
	
	MovieInfo() {
		
	}
	MovieInfo(String title, String director, String actor, String openDay, String runningTime, String genre) {
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.openDay = openDay;
		this.runningTime = runningTime;
		this.genre = genre;
	}
}

/*7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
- 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호*/
class Athlete {
	String name;
	String sports;
	String teamName;
	String position;
	int year;
	int playerNum;
	
	Athlete(String name, String sports, String teamName, String position, int year, int playerNum) {
		this.name = name;
		this.sports = sports;
		this.teamName = teamName;
		this.position = position;
		this.year = year;
		this.playerNum = playerNum;
	}
}

/*8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
- 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명*/
class Music {
	String title;
	String artist;
	int time;
	String genre;
	String albumName;
	
	Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	Music(int time, String genre) {
		this.time = time;
		this.genre = genre;
	}
}

/*9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
- 필드: (이름), (종류, 나이), 체중, 색상*/
class Animal {
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

/*10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
- 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일*/
class User {
	String id;
	String pass;
	String name;
	String mail;
	String phoneNumber;
	int birthday;
	
	User() {
		
	}
	
	User(String id, String pass, String name, String mail, String phoneNumber, int birthday) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.mail = mail;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
}