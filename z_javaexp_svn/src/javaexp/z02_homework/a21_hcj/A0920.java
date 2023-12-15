package javaexp.z02_homework.a21_hcj;



//import org.w3c.dom.css.CSSImportRule;

public class A0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		Book bok1 = new Book();
		bok1.bname = "java"; 
		bok1.compy = "cj";
		bok1.write = "홍길동";
		bok1.price = 30000;
		bok1.page = 354;
		System.out.println(bok1.bname+" "+bok1.write+" "+bok1.compy+" "+bok1.page+" "+bok1.price);
		
		
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		Student std = new Student();
		std.stdnum = 20230920;
		std.name = "홍길동";
		std.subj = "컴퓨터공학";
		std.grade = 3;
		std.avg = "B+";
		System.out.println("이름 : "+std.name+"학번 : "+std.stdnum+"전공 : "+std.subj+"학년 : "+std.grade+"평균성적 : "+std.avg);
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		Car c1 = new Car();
		c1.compy = "현대";
		c1.model = "아이오닉5";
		c1.year = 2023;
		c1.color = "white";
		c1.maxSpeed = 100;
		c1.speed = 60;
		System.out.println("모델 : "+c1.model+"브랜드 : "+c1.compy+"연식 : "+c1.year+"색상 : "+c1.color+"최대속도 : "+c1.maxSpeed+"현재속도 : "+c1.speed);
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		Account ac = new Account(123456789,"홍길동",3000000,20230920);
		System.out.println("계좌번호 : "+ac.acNum+" 예금주 : "+ac.acName+" 잔액 : "+ac.money+" 개설일 : "+ac.date);
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		Product p1 = new Product("DA1001","섬유유연제",23000,13,"다우니");
		System.out.println("상품명 : "+p1.pdName+" 상품가격 : "+p1.pdPrice+" 재고수량 : "+p1.pdCnt+" 제조사 : "+p1.pdCompy+" 상품코드 : "+p1.pdCode);
		
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
		Movie mv1 = new Movie();
		Movie mv2 = new Movie("아이언맨3","셰인 블랙","로다주",20130425,129,"액션");
		System.out.println("영화 : "+mv2.name+" 감독 : "+mv2.produce+" 배우 : "+mv2.actor+" 개봉일 : "+mv2.opDate+" 상영시간 : "+mv2.runtim+"분 장르 : "+mv2.genre);
		
		
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		SpoPlayer sp1 = new SpoPlayer();
		SpoPlayer sp2 = new SpoPlayer("손흥민","축구","토트넘 핫스퍼","FW/ST",9,7);
		System.out.println("이름 : "+sp2.name+" 스포츠 : "+sp2.spo+" 팀명 : "+sp2.team+" 포지션 : "+sp2.position+" 경력 : "+sp2.year+" 번호 : "+sp2.num);
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		Music ms1 = new Music("버터","BTS");
		Music ms2 = new Music(240,"pop");
		
		System.out.println("곡: "+ms1.mname+" 아티스트: "+ms1.art+"\n 재생시간 : "+ms2.runtime+"초 장르 : "+ms2.genre);
		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
		Animol ani1 = new Animol("나비");
		Animol ani2 = new Animol("고양이",3);
		
		System.out.println("이름: "+ani1.name+" 종류: "+ani2.type+" 나이 : "+ani2.age);
		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		User us =new User("abcd","1234","홍길동","abc@naver.com","01012345678",20200513);
		System.out.println("ID: "+us.id+" 비밀번호: "+us.pass+" 이름: "+us.name+" 이메일: "+us.email+" 연락처: "+us.phone+"생년월일: "+us.year);
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		//같은 패키지 내에서는 import하지 않아도 class의 접근제어자가 public이거나
		//protected 일경우 사용 가능하지만
		//패키지가 다른곳에 위치하는경우 class가 위차한 패키지를 import를 해서 class를 사용가능하며
		//이경우에는 class의 접근제어자가 public 인 경우에만 접근하여 class 를 사용할수있다
		/*
		 public class A{
		 ...
		 }
		 private class B{
		 ...
		 }
		 --
		 import classA,B의 패키지위치;
		 A a = new A();(O)
		 B b = new B();(X)
		 * */
		
	}

}

//1.
class Book{
	String bname;
	String write;
	String compy;
	int price;
	int page;
}
//2.
class Student{
	int stdnum;
	String name;
	String subj;
	int grade;
	String avg;
}
//3.
class Car{
	String compy;
	String model;
	int year;
	String color;
	int maxSpeed;
	int speed;
}
//4.
class Account{
	int acNum;
	String acName;
	int money;
	int date;
	Account(int acnum,String acname,int money,int date){
		this.acNum = acnum;
		this.acName = acname;
		this.money = money;
		this.date = date;
	}
}
//5.
class Product{
	String pdCode;
	String pdName;
	int pdPrice;
	int pdCnt;
	String pdCompy;
	Product(String code,String name,int price,int cnt,String compy){
		this.pdCode = code;
		this.pdName = name;
		this.pdPrice = price;
		this.pdCnt = cnt;
		this.pdCompy = compy;
	}
}
//6.
class Movie{
	String name;
	String produce;
	String actor;
	int opDate;
	int runtim;
	String genre;
	Movie(){}
	Movie(String name,String produce,String actor,int opdate,int runtime,String genre){
		this.name = name;
		this.produce = produce;
		this.actor = actor;
		this.opDate = opdate;
		this.runtim = runtime;
		this.genre = genre;
	}
}
//7.
class SpoPlayer{
	String name;
	String spo;
	String team;
	String position;
	int year;
	int num;
	SpoPlayer(){}
	SpoPlayer(String name,String spo,String team,String position,int year,int num){
		this.name = name;
		this.spo = spo;
		this.team = team;
		this.position = position;
		this.year =year;
		this.num = num;
	}
}
//8.
class Music{
	String mname;
	String art;
	int runtime;
	String genre;
	String titleName;
	Music(String name,String art){
		this.mname = name;
		this.art = art;
	}
	Music(int runtime,String genre){
		this.runtime = runtime;
		this.genre = genre;
	}
}
//9.
class Animol{
	String name;
	String type;
	int age;
	int weight;
	String color;
	Animol(String name){this.name = name;}
	Animol(String type,int age){this.type = type;this.age=age;}
}
//10.
class User{
	String id;
	String pass;
	String name;
	String email;
	String phone;
	int year;
	User(String id,String pass,String name,String email,String phone,int year){
		this.id=id;
		this.pass=pass;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.year=year;
	}
}