package javaexp.z02_homework.a15_shs;

public class A01_0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      1. **책 정보 클래스**(생성자X)
//      - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		System.out.println("서지정보");
		Book b1 = new Book();
		b1.title = "자바의 정석";
		b1.writter = "남궁성";
		b1.publisher = "도우출판";
		b1.price = 30000;
		b1.pageNum = 515;
		System.out.println("제목:" + b1.title);
		System.out.println("저자:" + b1.writter);
		System.out.println("출판사:" + b1.publisher);
		System.out.println("가격:" + b1.price + "원");
		System.out.println("페이지 수:" + b1.pageNum + "쪽");
		System.out.println();

//     2. **학생 정보 클래스**(생성자X)
//     - 필드: 학번, 이름, 전공, 학년, 평균 성적
		System.out.println("학생정보");
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		stu1.id = 52871;
		stu2.id = 84837;
		stu3.id = 92847;
		stu1.name = "김상진";
		stu2.name = "이하늘";
		stu3.name = "한가람";
		stu1.field = "사회학과";
		stu2.field = "사회학과";
		stu3.field = "사회학과";
		stu1.grade = 42;
		stu2.grade = 38;
		stu3.grade = 40;
		System.out.println("학번:" + stu1.id);
		System.out.println("학번:" + stu2.id);
		System.out.println("학번:" + stu3.id);
		System.out.println("이름:" + stu1.name);
		System.out.println("이름:" + stu2.name);
		System.out.println("이름:" + stu3.name);
		System.out.println("전공:" + stu1.field);
		System.out.println("전공:" + stu2.field);
		System.out.println("전공:" + stu3.field);
		double avg = (double) (stu1.grade + stu2.grade + stu3.grade) / 3;
		System.out.printf("평균 성적: %.2f", avg);
		System.out.println();
		System.out.println();

//     3. **자동차 클래스**(생성자X)
//     - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		System.out.println("차량정보");
		Car c1 = new Car();
		c1.brand = "기아";
		c1.model = "카니발";
		c1.age = 5;
		c1.color = "흑색";
		c1.maxSpeed = 190;
		c1.currentSpeed = 55;
		System.out.println("브랜드:" + c1.brand);
		System.out.println("차종:" + c1.model);
		System.out.println("연식:" + c1.age + "년");
		System.out.println("색상:" + c1.color);
		System.out.println("최대속도:" + c1.maxSpeed + "km/h");
		System.out.println("현재속도:" + c1.currentSpeed + "km/h");
		System.out.println();

//     4. **계좌 정보 클래스**(생성자O)
//      - 필드: 계좌번호, 예금주, 잔액, 개설일
		System.out.println("계좌정보");
		Account a1 = new Account(1768976541, 13000, "홍민준", "2016년 9월 29일");
		System.out.println("계좌번호:" + a1.accountNum);
		System.out.println("잔액:" + a1.leftOver + "원");
		System.out.println("예금주:" + a1.name);
		System.out.println("개설일:" + a1.date);
		System.out.println();

//     5. **상품 정보 클래스**(생성자O)
//      - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		System.out.println("상품정보");
		Prize p1 = new Prize(273659, "참치세트", 34000, 50, "동원");
		System.out.println("상품코드:" + p1.prizeCode);
		System.out.println("상품명:" + p1.prizeName);
		System.out.println("가격:" + p1.prizePrice + "원");
		System.out.println("수량:" + p1.prizeCnt + "개");
		System.out.println("제조사:" + p1.manufacturer);
		System.out.println();

//  6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//      - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
		System.out.println("영화정보");
		Movie m1 = new Movie();
		m1.title = "괴물";
		m1.director = "봉준호";
		m1.actor = "송강호";
		m1.releaseDate = "2006년 7월 27일";
		m1.runningTime = 119;
		m1.genre = "괴수";
		System.out.println("제목:" + m1.title);
		System.out.println("감독:" + m1.director);
		System.out.println("배우:" + m1.actor);
		System.out.println("개봉일:" + m1.releaseDate);
		System.out.println("상영시간:" + m1.runningTime + "분");
		System.out.println("장르:" + m1.genre);
		System.out.println();

//  7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//      - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		System.out.println("선수정보");
		Athlete a11 = new Athlete();
		a11.name = "손흥민";
		a11.profession = "축구";
		a11.teamName = "토트넘";
		a11.position = "스트라이커";
		a11.careerYear = 9;
		a11.playerNum = 7;
		System.out.println("성명:" + a11.name);
		System.out.println("종목:" + a11.profession);
		System.out.println("구단:" + a11.teamName);
		System.out.println("포지션:" + a11.position);
		System.out.println("경력:" + a11.careerYear + "년");
		System.out.println("등번호:" + a11.playerNum + "번");
		System.out.println();

//  8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//      - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		System.out.println("곡 정보");
		Track t1 = new Track();
		Track t2 = new Track();
		Track t3 = new Track();
		Track t4 = new Track();
		Track t5 = new Track();
		t1.songTitle = "우리의 꿈";
		t2.artist = "김종민";
		t3.playingTime = 3;
		t4.genre = "주제곡";
		t5.albumTitle = "reborn";
		System.out.println("제목, 아티스트:" + t1.songTitle + "," + t2.artist);
		System.out.println("재생시간, 장르:" + t3.playingTime + "분" + "," + t4.genre);
		System.out.println("앨범명:" + t5.albumTitle);
		System.out.println();

//  9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//      - 필드: (이름), (종류, 나이), 체중, 색상
		System.out.println("동물정보");
		Animal am1 = new Animal();
		Animal am2 = new Animal();
		Animal am3 = new Animal();
		Animal am4 = new Animal();
		Animal am5 = new Animal();
		am1.name = "왈리";
		am2.kind = "악어";
		am3.age = 9;
		am4.weight = 14;
		am5.color = "흑색";
		System.out.println("이름:" + am1.name);
		System.out.println("종류, 나이:" + am2.kind + "," + am3.age + "세");
		System.out.println("체중:" + am4.weight + "kg");
		System.out.println("색상:" + am5.color);

//  10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//      - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일

//  # 패키지와 접근제어자 연습.
//  11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		// 패키지가 저택이라면 class는 방 그리고 접근제어자는 출입구라고 할 수 있다. 접근제어자가 막힐 시(private 선언) class는
		// 다른
		// 패키지로 이동할 수 없다.
		// class가 public일 때 다른 패키지에 class를 옮길 경우 먼저 import 후 적용한다.

	}

}

class Book {
	String title;
	String writter;
	String publisher;
	int price;
	int pageNum;
}

class Student {
	int id;
	String name;
	String field;
	int grade;
	double score;
}

class Car {
	String brand;
	String model;
	int age;
	String color;
	int maxSpeed;
	int currentSpeed;
}

class Account {
	int accountNum;
	int leftOver;
	String name;
	String date;

	Account() {
	}

	Account(int accountNum, int leftOver, String name, String date) {
		this.accountNum = accountNum;
		this.leftOver = leftOver;
		this.name = name;
		this.date = date;
	}
}

class Prize {
	int prizeCode;
	String prizeName;
	int prizePrice;
	int prizeCnt;
	String manufacturer;

	Prize() {
	}

	Prize(int prizeCode, String prizeName, int prizePrice, int prizeCnt, String manufacturer) {
		this.prizeCode = prizeCode;
		this.prizeName = prizeName;
		this.prizePrice = prizePrice;
		this.prizeCnt = prizeCnt;
		this.manufacturer = manufacturer;
	}
}

class Movie {
	String title;
	String director;
	String actor;
	String releaseDate;
	int runningTime;
	String genre;
}

class Athlete {
	String name;
	String profession;
	String teamName;
	String position;
	int careerYear;
	int playerNum;
}

class Track {
	String songTitle;
	String artist;
	int playingTime;
	String genre;
	String albumTitle;

	Track() {
	}

	Track(String songTitle, String artist) {
		this.songTitle = songTitle;
		this.artist = artist;
	}

	Track(int playingTime, String genre) {
		this.playingTime = playingTime;
		this.genre = genre;
	}

	Track(String albumTitle) {
		this.albumTitle = albumTitle;
	}
}

class Animal {
	String name;
	String kind;
	int age;
	int weight;
	String color;

	Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}

	Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}

	Animal(int weight) {
		this.weight = weight;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}
}

//10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//- 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
class UserProfile {
	String id;
	String pw;
	String name;
	String email;
	int teleNum;
	int birthDate;

	UserProfile() {
	}

	UserProfile(String id, String pw, String name, String email, int teleNum, int birthDate) {

	}

}
