package javaexp.z02_homework.a03_ls;

import javaexp.a06_object.Puppy;

public class A0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		Book b01 = new Book();
		b01.name ="정글에서 살아남기";  //얘네가 필드
		b01.wri = "임솔";
		b01.company = "임씨출판사";
		b01.money = 10000;
		b01. page = 200;
		System.out.println("책이름 : "+b01.name+ "글쓴이 : "+b01.wri+"출판사 : "+b01.company+"가격 : "+b01.money+"페이지수 : "+b01.page);
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		Student s01 = new Student(); Student s02 = new Student(); Student s03 = new Student();
		s01.no = 1; s02.no = 2; s03.no = 3;
		s01.name = "홍길동"; s02.name = "김길동"; s03.name = "박길동";
		s01.major = "경영학과"; s02.major = "국어국문학과"; s03.major = "영어영문학과";
		s01.grade = 1; s02.grade = 1; s03.grade = 1;
		s01.avg = 80; s02.avg = 84; s03.avg = 86;
		System.out.println(s01.no+"번째 학생의 이름은 :"+s01.name+ "이고,"+ s01.major+"에 진학중인 "+s01.grade+"학년이다. 평균성적은 "+s01.avg+"이다.");
		System.out.println(s02.no+"번째 학생의 이름은 :"+s02.name+ "이고,"+ s02.major+"에 진학중인 "+s02.grade+"학년이다. 평균성적은 "+s02.avg+"이다.");
		System.out.println(s03.no+"번째 학생의 이름은 :"+s03.name+ "이고,"+ s03.major+"에 진학중인 "+s03.grade+"학년이다. 평균성적은 "+s03.avg+"이다.");
		
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		Car c01 = new Car();
		c01.brand = "현대";
		c01.model = "케스퍼";
		c01.year = 3;
		c01.color = "녹색";
		c01.maxSpeed = 160;
		c01.speed = 100;
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		Acount a01= new Acount(53970104094715l,"임솔",1000,"23년9월20일");
		
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		Gift g01 = new Gift(4902778568149l,"볼펜",2000,1,"시그노");
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
		Movie m01 = new Movie();
		m01.name="타짜";
		m01.dir="나도모름";
		m01.act="조승우";
		Movie m02 = new Movie("09월20일","5시40분","느와르");
		
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		Player p01 = new Player();
		p01.name = "구자철";
		p01.type = "축구";
		p01.no = 7;
		Player p02= new Player("제주FC","미드필더","꽤오랜기간");
		
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르, 앨범명)
		Music m1 = new Music("문득","비오");
		//매개변수가 2개일떄
		
		Music m2 = new Music("앨범명은 모름","3분","힙합"); //-->그래서
		// 매개변수 3개일때
		// 생성자나 메서드는 호출시 매개변수의 갯수로 식별하여
		// 호출이 가능하기 때문에 동일한 이름이라도 선언할 수 있다.
		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름, 종류), (나이, 체중), 색상
		Animal a1 = new Animal ();
		a1.color = "갈색";
		Animal a2 = new Animal ("봉이","강아지");
		Animal a3 = new Animal (10,5);
		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		User u01 = new User("dlathf0202","dla159");
		User u02 = new User("dlathf0202@naver.com","임솔");
		User u03 = new User(20264701,"96년2월2일");
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		
		/*
		동일한 패키지 내에 class가 있으면 public이 없어도 불러올수 있으나,
		 같은 패키지에 있는게 아니라면 public이 없는경우 직접적으로 불러올 수 없다.
		 만약 다른 패키지에 불러오고 싶다면, 우선 public이 있는지 확인해보고 있다면
		 import를 통해 불러올 수 있다.
		 * */
		Puppy p11 = new Puppy(); // package javaexp.a06_object;에 있는 클래스를 불러와 객체생성 예시
		
	}

}
class User{
	String id;
	int pass;
	String name;
	String email;
	int phono;
	String bri;
	User(String id,int pass){
		this.id=id;
		this.pass=pass;
	}User(String email,String name){
		this.email=email;
		this.name=name;
	}User(int phono,String bri){
		this.phono=phono;
		this.bri=bri;
	}
}
class Animal{
	String name;
	String type;
	int age;
	int weight;
	String color;
	Animal(){}
	Animal(String name,String type){
		this.name=name;
		this.type=type;
	}Animal( int age,int weight){
		this.age=age;
		this.weight=weight;
	}
	
}
class Music{
	String muName;
	String ari;
	String time;
	String type;
	String abName;
	Music(String muName,String ari){
		this.muName=muName;
		this.ari=ari;
	}Music(String abName,String time,String type){
		this.abName=abName;
		this.time=time;
		this.type=type;
	}
	
}
class Player{
	String name;
	String type;
	String team;
	String pos;
	String year;
	int no;
	Player(){}
	Player(String team,String pos,String year){
		this.team=team;
		this.pos=pos;
		this.year=year;
	}
}
class Movie{
	String name;
	String dir;
	String act;
	String day;
	String time;
	String type;
	Movie(){}
	Movie(String day,String time,String type){ // 위에 디폴트로 만들어놓고 여기에도 다 때려박으면 
		this.day=day;
		this.time=time;
		this.type=type;
	}
}
//Movie m01  = new Moive();
//Movie m02  = new Moive("영화명","감독명","배우","9월21일","영화시간","장르"){}
//
class Gift{
	long code;
	String name;
	int money;
	int no;
	String company;
	Gift(long code,String name,int money,int no,String company){
		this.code=code;
		this.name=name;
		this.money=money;
		this.no=no;
		this.company=company;
	}
}
class Acount{
	long number;
	String name;
	int money;
	String day;
	Acount(long number,String name,int money,String day){
		this.number=number;
		this.name=name;
		this.money=money;
		this.day=day;
		
	}
}
class Car {
	String brand;
	String model;
	int year;
	String color;
	int maxSpeed;
	int speed;
}
class Book {
	String name;
	String wri;
	String company;
	int money;
	int page;
}
class Student {
	int no;
	String name;
	String major;
	int grade;
	int avg;
}