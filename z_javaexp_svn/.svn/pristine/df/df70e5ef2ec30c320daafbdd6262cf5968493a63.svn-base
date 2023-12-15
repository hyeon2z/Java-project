package javaexp.z02_homework.a19_cjw;

public class A0920_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
//		
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
//		
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
//		
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
//		
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
//		
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
//		
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
//		
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
//		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
//		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
//		
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		
		System.out.println("1. **책 정보 클래스**(생성자X)");
		Book b1 = new Book();
		b1.bname = "자바 프로그래밍 핵심";
		b1.writer = "채규태";
		b1.publisher = "쌤즈";
		b1.price = 27000;
		b1.page = 450;
		System.out.println(b1.bname+" : "+b1.writer+" : "+b1.publisher+" : "+b1.price+" : "+b1.page);
		System.out.println();
		
		System.out.println("2. **학생 정보 클래스**(생성자X)");
		Student s1 = new Student();
		s1.stnum = 19;
		s1.stname = "추지원";
		s1.major = "화학";
		s1.grade = 3;
		s1.point = 80;
		System.out.println(s1.stnum+" : "+s1.stname+" : "+s1.major+" : "+s1.grade+" : "+s1.point);
		System.out.println();
		
		System.out.println("3. **자동차 클래스**(생성자X)");
		Car c1 = new Car();
		c1.brand = "아우디";
		c1.model = "a8";
		c1.age = 3;
		c1.color = "black";
		c1.maxspeed = 200;
		c1.nowspeed = 130;
		System.out.println(c1.brand+" : "+c1.model+" : "+c1.age+" : "
							+c1.color+" : "+c1.maxspeed+" : "+c1.nowspeed);
		System.out.println();
		
		System.out.println("4. **계좌 정보 클래스**(생성자O)");
		Account a1 = new Account(1028094,"추지원",300000,"2009.10.21");
		System.out.println(a1.act+" : "+a1.actname+" : "+a1.money+" : "+a1.madedate);
		System.out.println();
		
		System.out.println("5. **상품 정보 클래스**(생성자O)");
		Goods g1 = new Goods(2342,"가방",300000,7,"칸골");
		System.out.println(g1.code+" : "+g1.gname+" : "+g1.price+" : "+g1.quantity+" : "+g1.made);
		System.out.println();
		
		System.out.println("6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)");
		Movie m1 = new Movie();
		Movie m2 = new Movie("영화","이감독","김배우","2023.10.21",150,"판타지");
		System.out.println(m2.mname+" : "+m2.director+" : "+m2.actor+" : "+m2.opendate
				+" : "+m2.runningtime+" : "+m2.genre);
		System.out.println();
		
		System.out.println("7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)");
		Sports s01 = new Sports();
		Sports s02 = new Sports("최건","야구","ssg","외야수",15,6);
		System.out.println(s02.sname+" : "+s02.kind+" : "+s02.team+" : "+s02.position
				+" : "+s02.years+" : "+s02.num);
		System.out.println();
		
		System.out.println("8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)");
		Music m01 = new Music("노래", "김가수");
		Music m02 = new Music(3, "발라드");
		System.out.println(m01.title+" : "+m01.artist+" : "+m02.time+" : "+m02.genre);
		System.out.println();
		
		System.out.println("9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)");
		Animal a01 = new Animal("나비");
		Animal a02 = new Animal("고양이",7);
		System.out.println(a01.aname+" : "+a02.kind+" : "+a02.age);
		System.out.println();
		
		System.out.println("10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)");
		Profile p1 = new Profile("hijava","java123","추지원","java@gmail.com",0321234567,"2000.03.13");
		System.out.println(p1.id+" : "+p1.password+" : "+p1.name+" : "+p1.email
				+" : "+p1.phonenum+" : "+p1.birthday);
		System.out.println();
		
		System.out.println("11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.");
		/*
		접근제어자: public, protected, default, private
		public -> 패키지가 달라도 자유롭게 class 사용 가능
		protected -> 패키지 내에서만 사용 가능. 하지만 상속한 class에서는 사용 가능
		default -> 접근제어자를 지정하지 않았을때. 같은 패키지에서만 사용 가능
		private -> 해당 class 내에서만 사용 가능.

		패키지가 다르다면 public이나 상속한 class라면 protected까지 사용 가능
		 * */
		
	}

}

//1. **책 정보 클래스**(생성자X)
class Book{
	String bname;
	String writer;
	String publisher;
	int price;
	int page;
}

//2. **학생 정보 클래스**(생성자X)
class Student{
	int stnum;
	String stname;
	String major;
	int grade;
	int point;
}

//3. **자동차 클래스**(생성자X)
class Car{
	String brand;
	String model;
	int age;
	String color;
	int maxspeed;
	int nowspeed;
}

//4. **계좌 정보 클래스**(생성자O)
class Account{
	int act;
	String actname;
	int money;
	String madedate;
	Account(int act,String actname,int money,String madedate){
		this.act = act;
		this.actname = actname;
		this.money = money;
		this.madedate = madedate;
	}
}

//5. **상품 정보 클래스**(생성자O)
class Goods{
	int code;
	String gname;
	int price;
	int quantity;
	String made;
	Goods(int code,String gname,int price,int quantity,String made){
		this.code = code;
		this.gname = gname;
		this.price = price;
		this.quantity = quantity;
		this.made = made;
	}
}

//6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
class Movie{
	String mname;
	String director;
	String actor;
	String opendate;
	int runningtime;
	String genre;
	Movie(){}
	Movie(String mname,	String director, String actor, String opendate, int runningtime, String genre){
		this.mname = mname;
		this.director = director;
		this.actor = actor;
		this.opendate = opendate;
		this.runningtime = runningtime;
		this.genre = genre;
	}
}

//7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
class Sports{
	String sname;
	String kind;
	String team;
	String position;
	int years;
	int num;
	Sports(){}
	Sports(String sname, String kind, String team, String position, int years, int num){
		this.sname = sname;
		this.kind = kind;
		this.team = team;
		this.position = position;
		this.years = years;
		this.num = num;
	}
}

//8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
class Music{
	String title;
	String artist;
	int time;
	String genre;
	String album;
	Music(String title, String artist){
		this.title = title;
		this.artist = artist;
	}
	Music(int time, String genre){
		this.time = time;
		this.genre = genre;
	}
}

//9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
class Animal{
	String aname;
	String kind;
	int age;
	int weight;
	String color;
	Animal(String aname){
		this.aname = aname;
	}
	Animal(String kind, int age){
		this.kind = kind;
		this.age = age;
	}
}

//10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//- 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
class Profile{
	String id;
	String password;
	String name;
	String email;
	int phonenum;
	String birthday;
	Profile() {}
	Profile(String id, String password, String name, String email, int phonenum, String birthday){
		this.id =id;
		this.password =password;
		this.name =name;
		this.email =email;
		this.phonenum =phonenum;
		this.birthday =birthday;
	}
}