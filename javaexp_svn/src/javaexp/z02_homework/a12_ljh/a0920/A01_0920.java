package javaexp.z02_homework.a12_ljh.a0920;

public class A01_0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		System.out.println("No.1 **책 정보 클래스**");
		Book b1 = new Book();
		b1.bName = "양쌤의 자바 프로그래밍 기초";
		b1.bWriter = "양현수";
		b1.bPublisher = "쌍용교육센터";
		b1.bPrice = 32000;
		b1.bPage = 450;
		
		System.out.printf("제목: %s | 저자: %s | 출판사: %s | 가격: %d | 페이지수: %d\n", b1.bName, b1.bWriter, b1.bPublisher, b1.bPrice, b1.bPage);
		System.out.println();
		
		
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		System.out.println("No.2 **학생 정보 클래스**");
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu1.stuId = 2016162052;
		stu1.stuName = "이준호";
		stu1.stuMajor = "의료IT학과";
		stu1.stuGrade = 4;
		stu1.stuAvg = 3.0;
		
		stu2.stuId = 2018162035;
		stu2.stuName = "신준식";
		stu2.stuMajor = "우주항공공학과";
		stu2.stuGrade = 4;
		stu2.stuAvg = 3.5;
		System.out.printf("학번: %d | 이름: %s | 전공: %s | 학년: %d | 평균성적: %.1f\n", stu1.stuId, stu1.stuName, stu1.stuMajor, stu1.stuGrade, stu1.stuAvg);
		System.out.printf("학번: %d | 이름: %s | 전공: %s | 학년: %d | 평균성적: %.1f\n", stu2.stuId, stu2.stuName, stu2.stuMajor, stu2.stuGrade, stu2.stuAvg);
		System.out.println();
		
		
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		System.out.println("No.3 **자동차 클래스**");
		Car car1 = new Car();
		car1.brand = "제네시스";
		car1.model = "g80";
		car1.year = 5;
		car1.color = "black";
		car1.maxSpeed = 250;
		car1.nowSpeed = 80; 

		Car car2 = new Car();
		car2.brand = "현대";
		car2.model = "그랜저";
		car2.year = 2;
		car2.color = "gray";
		car2.maxSpeed = 200;
		car2.nowSpeed = 57; 

		Car car3 = new Car();
		car3.brand = "벤츠";
		car3.model = "e클래스";
		car3.year = 7;
		car3.color = "white";
		car3.maxSpeed = 240;
		car3.nowSpeed = 100; 
		
		System.out.println("[브랜드]\t[모델]\t[연식]\t[색상]\t[최고속도]\t[현재속도]");
		System.out.printf("%s\t%s\t %d년\t%s\t %dkm\t %dkm\n", car1.brand, car1.model, car1.year, car1.color, car1.maxSpeed, car1.nowSpeed);
		System.out.printf("%s\t%s\t %d년\t%s\t %dkm\t %dkm\n", car2.brand, car2.model, car2.year, car2.color, car2.maxSpeed, car2.nowSpeed);
		System.out.printf("%s\t%s\t %d년\t%s\t %dkm\t %dkm\n", car3.brand, car3.model, car3.year, car3.color, car3.maxSpeed, car3.nowSpeed);
		
		System.out.println();
		
		
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		System.out.println("No.4 **계좌 정보 클래스");
		Account act1 = new Account("123456789012", "이준호", 2300000, "2023.09.20");
		Account act2 = new Account("987654321098", "홍길동", 300000, "2021.11.13");
		Account act3 = new Account("459841321456", "김철수", 15000000, "2018.03.22");
		Account act4 = new Account("753159456852", "박영희", 90000, "2006.12.19");
		Account act5 = new Account("258456753159", "신짱구", 4500000, "1995.07.11");
		System.out.println();
		
		
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		System.out.println("No.5 **상품 정보 클래스**");
		Product prd1 = new Product(123456, "바나나킥", 2500, 12, "해태");
		Product prd2 = new Product(789456, "프링글스", 4000, 30, "농심");
		Product prd3 = new Product(654321, "꼬북칩", 4000, 25, "농협");
		System.out.println();
		
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
		System.out.println("No.6 **영화 정보 클래스**");
		Movie m1 = new Movie("니모를 찾아서", "앤드류", "니모", "2003.06.05", "16시 30분", "애니메이션");
		Movie m2 = new Movie("아이언맨1", "존", "로다주", "2008.04.30", "20시 00분", "SF");
		System.out.println();
		
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		System.out.println("No.7 **운동선수 클래스**");
		Sports s1 = new Sports("손흥민", "축구", "토트넘", "공격수", "18", "7");
		Sports s2 = new Sports("이준호", "당구", "로데오", "아마추어", "7", "27");
		System.out.println();
		
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		System.out.println("No.8 **음악 트랙 클래스**");
		Music ms1 = new Music("광대", "리쌍");
		Music ms2 = new Music(3, "랩");
		Music ms3 = new Music("3번재 앨범");
		System.out.println(ms1.mArtist + " " + ms3.mTitle + ": " + ms1.mName + " " + ms2.mTime + "분 " + ms2.mGenre);
		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
		System.out.println("No.9 **동물 클래스**");
		Animal ani1 = new Animal("댕댕이");
		Animal ani2 = new Animal("강아지", 3);
		Animal ani3 = new Animal(10, "Black");
		System.out.println();
		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		System.out.println("No.10 **사용자 프로필 클래스**");
		User user1 = new User("junho123", "pass123");
		User user2 = new User("이준호");
		User user3 = new User("junho@naver.com", "010-1234-5678", "1월 2일");
		System.out.println();
		
		
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		// 패키지가 다를 때는 class 접근제어자가 public이어야 하고, import를 해주어야 한다.
		// 같은 패키지에서는 public, import가 필요하지 않고 class를 활용할 수 있다.
		/*
		ex)
		javaexp.a06_object; 패키지 내의 Puppy 클래스 활용
		==> project.week2; 패키지에 import javaexp.a06_object.Puppy;
		==> 클래스 내 필드의 접근제어자가 public일 때 객체 생성 및 호출 가능
		 */

	}

}

class Book {
	String bName;
	String bWriter;
	String bPublisher;
	int bPrice;
	int bPage;
}

class Student {
	int stuId;
	String stuName;
	String stuMajor;
	int stuGrade;
	double stuAvg;
}

class Car {
	String brand;
	String model;
	int year;
	String color;
	int maxSpeed;
	int nowSpeed;
}

class Account {
	String aId;
	String aPerson;
	int aMoney;
	String aDate;
	
	Account(String aId, String aPerson, int aMoney, String aDate){
		this.aId = aId;
		this.aPerson = aPerson;
		this.aMoney = aMoney;
		this.aDate = aDate;
	}
}

class Product {
	int pId;
	String pName;
	int pPrice;
	int pNumber;
	String pCompany;
	
	Product(int pId, String pName, int pPrice, int pNumber, String pCompany){
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pNumber = pNumber;
		this.pCompany = pCompany;
	}
}

class Movie {
	String name;
	String pd;
	String actor;
	String date;
	String time;
	String genre;
	
	Movie(){
	}
	Movie(String name, String pd, String actor, String date, String time, String genre){
		this.name = name;
		this.pd = pd;
		this.actor = actor;
		this.date = date;
		this.time = time;
		this.genre = genre;
	}
	
}

class Sports {
	String sName;
	String sKind;
	String sTeam;
	String sForm;
	String sYear;
	String sNum;
	
	Sports(){
	}
	Sports(String sName, String sKind, String sTeam, String sForm, String sYear, String sNum){
		this.sName = sName;
		this.sKind = sKind;
		this.sTeam = sTeam;
		this.sForm = sForm;
		this.sYear = sYear;
		this.sNum = sNum;
	}
}

class Music {
	String mName;
	String mArtist;
	int mTime;
	String mGenre;
	String mTitle;
	
	Music(String mName, String mArtist){
		this.mName = mName;
		this.mArtist = mArtist;
	}
	Music(int mTime, String mGenre){
		this.mTime = mTime;
		this.mGenre = mGenre;
	}
	Music(String mTitle){
		this.mTitle = mTitle;
	}
}


class Animal {
	String aName;
	String aKind;
	int aAge;
	int aWeight;
	String aColor;
	
	Animal(String aName){
		this.aName = aName;
	}
	Animal(String aKind, int aAge){
		this.aKind = aKind;
		this.aAge = aAge;
	}
	Animal(int aWeight, String aColor){
		this.aWeight = aWeight;
		this.aColor = aColor;
	}
}


class User {
	String uId;
	String uPw;
	String uName;
	String email;
	String uPhone;
	String uBirth;
	
	User(String uName){
		this.uName = uName;
	}
	User(String uId, String uPw){
		this.uPw = uPw;
		this.uId = uId;
	}
	User(String email, String uPhone, String uBirth){
		this.email = email;
		this.uPhone = uPhone;
		this.uBirth = uBirth;
	}
}