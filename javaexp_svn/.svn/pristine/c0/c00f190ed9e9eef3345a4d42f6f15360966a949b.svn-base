package javaexp.z02_homework.a06_psj;

public class A0920_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		Book b1 = new Book();
		System.out.println("책 제목: "+b1.name);
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		Student s1 = new Student();
		System.out.println("평균 성적 : "+s1.avgScore);
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		Car c1 = new Car();
		System.out.println("자동차 연식 : "+c1.year);
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		Account a1 = new Account(35609, "박성중", 500, 1020);
		System.out.println("계좌번호: "+a1.acNum+", 예금주 : "+a1.acName+", 잔액 : "+a1.money
				+", 개설일: "+a1.day);
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		Product p1 = new Product(170, "스마트폰", 1000000, 5, "삼성");
		System.out.println("상품코드 : "+p1.pCode+", 상품명: "+p1.pName+", 가격: "+p1.price);
		System.out.println("재고수량: "+p1.remain+", 제조사: "+p1.brand);
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
		Movie m1 = new Movie();
		Movie m2 = new Movie("존윅3","몰라","키아누 리브스",2022,180,"액션");
		System.out.println("제목: "+m2.name+", 감독: "+m2.dir+", 배우: "+m2.actor);
		System.out.println("개봉일: "+m2.day+", 상영 시간: "+m2.rt+", 장르: "+m2.genre);
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		Player p7 = new Player();
		Player p8 = new Player("김선빈","야구","기아타이거즈","유격수",2000,99);
		System.out.println("이름: "+ p8.name+", 포지션: "+p8.position+", 소속: "+p8.teamName);;
		
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		Music m8 = new Music("심","디셈버");
		Music m9 = new Music(240, "발라드");
		System.out.println("제목 : "+m8.MusicName+", 가수: "+m8.artist+", 장르 : "+m9.genre);
		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
		Animal a9 = new Animal("상덕이");
		Animal a10 = new Animal("개",7);
		System.out.println("이름 : "+a9.name+", 종류 : "+a10.kind+", 체중 : "+a10.w);
		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		// import javaexp.z02_homework.a00_yhs.클래스명
		// 가져오려는 클래스의 접근제어자가 public, 변수의 접근제어자가 private가 아니어야함
	}
}
class Book{
	String name="하이";
	String author;
	String chu;
	int price;
	int page;
}

class Student{
	int sNum;
	String name;
	String major;
	int grade;
	double avgScore = 4.2;
}

class Car{
	String brand;
	String model;
	int year=2009;
	String color;
	int maxSp;
	int curSp;
}

class Account{
	int acNum;
	String acName;
	int money;
	int day;
	Account(int a, String b, int c, int d){
		acNum = a;
		acName = b;
		money = c;
		day = d;
	}
}

class Product{ //		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
	int pCode;
	String pName;
	int price;
	int remain;
	String brand;
	public Product(int a, String b, int c, int d, String e) {
		pCode = a;
		pName = b;
		price = c;
		remain = d;
		brand = e;
	}
}

//6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//- 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
class Movie{
	String name;
	String dir;
	String actor;
	int day;
	int rt;
	String genre;
	Movie(){}
	Movie(String a,String b, String c, int d, int e, String f){
		name = a; dir = b; actor = c; day=d; rt=e; genre=f;
	}
}

//7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//- 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호

class Player{
	String name;
	String sports;
	String teamName;
	String position;
	int year;
	int backNum;
	Player(){}
	Player(String a, String b, String c, String d, int e, int f){
		name =a; sports = b; teamName = c; position = d; year=e; backNum = f;
	}
}
//8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//- 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명

class Music{
	String MusicName;
	String artist;
	int raptime;
	String genre;
	String albumName;
	Music(String a, String b){
		MusicName= a; artist = b;
	}
	Music(int a, String b){
		raptime= a; genre = b;
	}
	Music(String a){
		albumName = a;
	}
}
//9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//- 필드: (이름), (종류, 나이), 체중, 색상
class Animal{
	String name;
	String kind;
	int age;
	int w=4;
	String color;
	Animal(String a){
		name=a;
	}
	Animal(String a, int b){
		kind =a; age = b;
	}
	Animal(int a, String b){
		w=a; color = b;
	}
}
//10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//- 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
class Profile{
	String id;
	String pwd;
	String name;
	String emailAdress;
	int pNum;
	int birth;
	Profile(String a, String b, String c, String d){
		id = a; pwd= b; name = c; emailAdress = d;
	}
	Profile(int a, int b){
		pNum =a; birth= b;
	}
}
