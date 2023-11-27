package javaexp.z02_homework.a07_lge;

public class A01_0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//	    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		Book bk=new Book();
		bk.title="어린 왕자";
		bk.who="홍길동";
		bk.where="출판사1";
		bk.price=10000;
		bk.page=100;
		System.out.println("제목:"+bk.title+"/저자:"+bk.who+"/출판사:"+bk.where
				+"/가격:"+bk.price+"/페이지 수:"+bk.page);

//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		Student stu=new Student();
		stu.no=12345678;
		stu.name="김철수";
		stu.major="english";
		stu.grade=3;
		stu.avg=85;
		System.out.println("학번:"+stu.no+"/이름:"+stu.name+"/전공:"+stu.major
				+"/학년:"+stu.grade+"/평균:"+stu.avg);
		
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		Car c=new Car();
		c.brand="현대자동차";
		c.model="아반떼";
		c.year=10;
		c.color="black";
		c.maxSpd=200;
		c.nowSpd=100;
		System.out.println("브랜드:"+c.brand+"/모델:"+c.model+"/연식:"+c.year
				+"/색상:"+c.color+"/최대속도:"+c.maxSpd+"/현재속도"+c.nowSpd);
		
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		Bank b=new Bank(2134445666, "이가은", 10000, "9월 20일");
		System.out.println("계좌번호:"+b.num+"/예금주:"+b.name+"/잔액:"+b.money+"/개설일:"+b.day);
		
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		Product p=new Product(12345, "공책", 1000, 33, "무지");
		System.out.println("상품코드:"+p.code+"/상품명:"+p.pName+"/가격:"+p.price
				+"/재고수량:"+p.cnt+"/제조사:"+p.make);
		
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
		Movie mv=new Movie("잠","유재선","정유미,이선균","2023.09.06","94분","미스터리");
		System.out.println("제목:"+mv.title+"/감독:"+mv.director+"/배우:"+mv.actor
				+"/개봉일:"+mv.date+"/상영시간:"+mv.time+"/장르:"+mv.genre);
		
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		Exercise ex=new Exercise("손흥민","축구","토트넘","스트라이커",15,7);
		System.out.println("이름:"+ex.name+"/스포츠 종류:"+ex.kind+"/팀명:"+ex.team
				+"/포지션:"+ex.position+"/경력년수:"+ex.years+"/선수 번호:"+ex.no);
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		Music ms1=new Music("hype boy","new jeans");
		Music ms2=new Music(3,"kpop");
		Music ms3=new Music("new jeans 1st");
		System.out.println("제목:"+ms1.title+"/아티스트:"+ms1.artist+"/재생시간:"+ms2.time
				+"분/장르:"+ms2.genre+"/앨범명:"+ms3.album);
		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
		Animal ani1=new Animal("칸");
		Animal ani2=new Animal("먼치킨", 3);
		Animal ani3=new Animal(8);
		Animal ani4=new Animal("white");
		System.out.println("이름:"+ani1.name+"/종류:"+ani2.kind+"/나이:"+ani2.age
				+"/체중:"+ani3.weight+"/색상:"+ani4.name);
		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		User us1=new User("leegaeun","eun0000");
		User us2=new User("이가은","leegaeun@gmail.com","010-1111-2222","2001.09.30");
		System.out.println("id:"+us1.id+"/비번:"+us1.pass+"/이름:"+us2.name
				+"/이메일:"+us2.mail+"/연락처:"+us2.phone+"/생년월일:"+us2.birth);
		
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		// 패키지가 같을 때는 public을 쓰지 않아도 다른 클래스에서 호출이 가능하다.
		// 하지만 패키지가 다를 때는 public이어야만 호출이 가능하다. import도 해야한다.

	}

}

class Book{
	String title;
	String who;
	String where;
	int price;
	int page;
}

class Student{
	int no;
	String name;
	String major;
	int grade;
	int avg;
}

class Car{
	//브랜드, 모델, 연식, 색상, 최대속도, 현재속도
	String brand;
	String model;
	int year;
	String color;
	int maxSpd;
	int nowSpd;
}

class Bank{
	// 계좌번호, 예금주, 잔액, 개설일
	int num;
	String name;
	int money;
	String day;
	
	Bank(int num, String name, int money, String day){
		this.num=num;
		this.name=name;
		this.money=money;
		this.day=day;		
	}
}
	
class Product{
	// 상품코드, 상품명, 가격, 재고수량, 제조사
	int code;
	String pName;
	int price;
	int cnt;
	String make;
	
	Product(int code, String pName, int price, int cnt, String make){
		this.code=code;
		this.pName=pName;
		this.price=price;
		this.cnt=cnt;
		this.make=make;
	}
}
	
class Movie{
	// 제목, 감독, 배우, 개봉일, 상영 시간, 장르
	String title;
	String director;
	String actor;
	String date;
	String time;
	String genre;
	
	Movie(){};
	Movie(String title, String director, String actor, String date, String time, String genre){
		this.title=title;
		this.director=director;
		this.actor=actor;
		this.date=date;
		this.time=time;
		this.genre=genre;
	}
}

class Exercise{
	// 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
	String name;
	String kind;
	String team;
	String position;
	int years;
	int no;
	Exercise(){
		
	}
	Exercise(String name, String kind, String team, String position, int years, int no){
		this.name=name;
		this.kind=kind;
		this.team=team;
		this.position=position;
		this.years=years;
		this.no=no;
	}
	
}

class Music{
	// (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
	String title;
	String artist;
	int time;
	String genre;
	String album;
	
	Music(String title, String artist){
		this.title=title;
		this.artist=artist;
	}
	Music(int time, String genre){
		this.time=time;
		this.genre=genre;
	}
	Music(String album){
		this.album=album;
	}
}

class Animal{
	// (이름), (종류, 나이), 체중, 색상
	String name;
	String kind;
	int age;
	int weight;
	String color;
	
	Animal(String name){
		this.name=name;
	}
	
	Animal(String kind, int age){
		this.kind=kind;
		this.age=age;
	}
	
	Animal(int weight){
		this.weight=weight;
	}
}

class User{
	// 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
	String id;
	String pass;
	String name;
	String mail;
	String phone;
	String birth;
	
	User(String id, String pass){
		this.id=id;
		this.pass=pass;
	}
	
	User(String name, String mail, String phone, String birth){
		this.name=name;
		this.mail=mail;
		this.phone=phone;
		this.birth=birth;
	}
}





