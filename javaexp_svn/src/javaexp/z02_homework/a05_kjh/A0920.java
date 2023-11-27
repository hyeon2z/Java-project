package javaexp.z02_homework.a05_kjh;

import javaexp.z02_homework.a05_kjh.Thing.Movie;

public class A0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//	    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		Book b1 = new Book();
		b1.title="채쌤의 자바 프로그래밍 핵심";
		b1.author="채규태";
		b1.publisher="쌤즈";
		b1.price=27000;
		b1.page=450;
				
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		Student s1 = new Student();
		s1.number=20233397;
		s1.name="홍길동";
		s1.major="도둑질";
		s1.grade=3;
		s1.avr='A';
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		Car c1 = new Car();
		c1.brand="쌍용자동차";
		c1.model="코란도";
		c1.yearly=4;
		c1.color="black";
		c1.maxSpeed=200;
		c1.currentSpeed=70;
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		Account a1 = new Account(1235412, "홍길동", 1000, "1996년 3월 1일");
		
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		Thing t1 = new Thing(97911867, "책:채쌤", 27000, 1, "쌤즈");
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
//		Movie m1 = new Movie("오펜하이머", "크리스토퍼 놀란", "킬리언 머피", " 2023년 8월 15일", "180분", "드라마");
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
//		Athlete a2 = new Athlete("손흥민", "축구", "토트넘 핫스퍼", "공격수", 13, 7);
////		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
////		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
//		Music m2 = new Music("Clair de Lune", "Debussy",);
//		Music m3 = new Music(334, "solo piano",)
//		Music m4 = new Music("베르가 마스크 모음곡",)
//		
////		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
////		    - 필드: (이름), (종류, 나이), 체중, 색상
//		Animal a1 new Animal("엣지");
//		Animal a2 new Animal("포메리안", 13);
//		Animal a3 new Animal(8, "갈색");
////		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
////		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
//		User u1 new User("hong123", "h7777", "hong gil dong", 0100000000, 19980011);
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		//패키지 아래에 class가 있으며 class에 접근하려고 하는 것을 접근제어자가 관리합니다.
		//패키지가 다를 때는 class에 public 접근제어자와 import 명령어가 있어야 접근이 가능합니다.
		//ex) 패키지가 같을 때 class 클래스명
		//ex) 패키지가 다를 떄 public class 클래스명+import
		
	}

}
//		# 아래 내용을 객체를 생성하세요
//1. **책 정보 클래스**(생성자X)
// - 필드: 제목, 저자, 출판사, 가격, 페이지 수
class Book {
	String title;
	String author;
	String publisher;
	int price;
	int page;
}
//2. **학생 정보 클래스**(생성자X)
//- 필드: 학번, 이름, 전공, 학년, 평균 성적
class Student{
	int number;
	String name;
	String major;
	int grade;
	char avr;
}
//3. **자동차 클래스**(생성자X)
//- 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
class Car{
	String brand;
	String model;
	int yearly;
	String color;
	int maxSpeed;
	int currentSpeed;
}
//4. **계좌 정보 클래스**(생성자O)
//- 필드: 계좌번호, 예금주, 잔액, 개설일
class Account{
	int acNumber;
	String holder;
	int balance;
	String opDate;
	Account(){}
	Account(int acNumber, String holder, int balance, String opDate){
		this.acNumber = acNumber;
		this.holder = holder;
		this.balance = balance;
		this.opDate = opDate;
		
	}

}
//5. **상품 정보 클래스**(생성자O)
//- 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
class Thing{
	int code;
	String thName;
	int price;
	int stock;
	String manufac;
	Thing(){}
	Thing(int code, String thName, int price, int stock, String manufac){
		this.code=code;
		this.price=price;
		this.stock=stock;
		this.manufac=manufac;
	}

//6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//- 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
class Movie{
	String mvTitle;
	String producer;
	String actor;
	String releaseDay;
	String runningTime;
	String genres;
	Movie(){}
	Movie(String mvTitle, String producer, String actor, String releaseDay, String runningTime, String genres){
	this.mvTitle=mvTitle;
	this.producer=producer;
	this.actor=actor;
	this.releaseDay=releaseDay;
	this.runningTime=runningTime;
	this.genres=genres;
	}
  }

//7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//- 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
class Athlete{
	String name;
	String evnet;
	String teamName;
	String position;
	int yearly;
	int atNum;
	Athlete(){}
	Athlete(String name, String evnet, String temaName, String position, int yearly, int atNum){
	this.name=name;
	this.evnet=evnet;
	this.teamName=temaName;
	this.position=position;
	this.yearly=yearly;
	this.atNum=atNum;
	}	
}
//8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//- 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
class Music{
	String musicTitle;
	String artist;
	int playTime;
	String genre;
	String albumName;
	Music(){}
	Music(String musicTitle, String artist){
		this.musicTitle=musicTitle;
		this.artist=artist;
	}	
//	Music(String musicTitle, int playTime){
//		this.playTime=playTime;
//		this.artist=artist;
//	}매개변수의 갯수가 같더라도 타입이 다르면 가능하다.
	Music(int playTime, String genre){
		this.playTime=playTime;
		this.genre=genre;
	}
//	Music(int playTime,String musicTitle, String artist){
//	this.playTime=playTime;
//	this.musicTitle=musicTitle;
//	this.artist=artist;
//}	매개변수의 갯수가 다르면 선언이 가능하다.
	Music(String albumName){
		this.albumName=albumName;
	}
//Music(String genre, int playTime){
//this.playTime=playTime;
//this.genre=genre;
//} 매개변수의 갯수가 같고, 타입도 같더라도 타입의 순서를 다르게 하면 선언가능하다.
   }
}
//9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//- 필드: (이름), (종류, 나이), 체중, 색상
class Animal{
	String nameA;
	String species;
	int ageA;
	int rad;
	String colorA;
	Animal(){}
	Animal(String nameA){
		this.nameA=nameA;
	}
Animal(String species, int ageA){
		this.species=species;
		this.ageA=ageA;
	}
Animal(int rad, String colorA){
	this.rad=rad;
	this.colorA=colorA;
}
}
//10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//- 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
class User{
	String id;
	String pw;
	String userName;
	String eMail;
	int pNum;
	int bDay;
	User(){}
User(String id, String pw, String userName, int pNum, int bDay){
		this.id=id;
		this.pw=pw;
		this.userName=userName;
		this.pNum=pNum;
		this.bDay=bDay;
	}
}
	