package javaexp.z02_homework.a16_jsr;

public class A01_0920 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			# 아래 내용을 객체를 생성하세요
//			1. **책 정보 클래스**(생성자X)
//			    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
			Book b = new Book();
			b.title="자바기초";
			b.name="채규태";
			b.pub="쌤즈";
			b.price=27000;
			b.page=500;
			System.out.println(b.title+"의 정보-> 저자:"+b.name+" 출판사:"+b.pub+" 가격:"+b.price+" 페이지수:"+b.page);
			
//			2. **학생 정보 클래스**(생성자X)
//			    - 필드: 학번, 이름, 전공, 학년, 평균 성적
			Class c = new Class();
			c.cnum=12345;
			c.cname="홍길동";
			c.major="자바풀스택";
			c.age=1;
			c.avgScore=88;
			System.out.println("학번:"+c.cnum+" 이름:"+c.cname+" 전공:"+c.major+" 학년:"+c.age+" 평균성적:"+c.avgScore);
			
//			3. **자동차 클래스**(생성자X)
//			    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
			Car car=new Car();
			car.brand="기아";
			car.model="셀토스";
			car.old=1;
			car.color="챠콜";
			car.maxSpeed=220;
			car.nowSpeed=80;
			System.out.println("브랜드:"+car.brand+" 모델:"+car.model+" 연식:"+car.old+" 색상:"+car.color+" 최대속도:"+car.maxSpeed+" 현재속도:"+car.nowSpeed);
			
//			4. **계좌 정보 클래스**(생성자O)
//			    - 필드: 계좌번호, 예금주, 잔액, 개설일
			Bank bank = new Bank("12345-67890","김길동", 105000, "2019-03-05");
			System.out.println("계좌번호:"+bank.account+" 예금주:"+bank.mem+" 잔액:"+bank.balance+" 개설일:"+bank.start);
			
			
//			5. **상품 정보 클래스**(생성자O)
//			    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
			Goods g = new Goods(1004, "엔젤인형", 15000, 5, "문구완구");
			System.out.println("상품코드:"+g.code+" 상품명:"+g.gName+" 가격:"+g.gPrice+" 재고수량:"+g.stock+" 제조사:"+g.man);
			
//			6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//			    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
			Movie m=new Movie("장항준","하하", "2023-08-06", 2, "코믹");
			m.title="하하엄마처럼하하하";
			System.out.println("제목:"+m.title+" 감독:"+m.name+" 배우:"+m.act+" 개봉일:"+m.open+" 상영 시간:"+m.time+"시간"+" 장르:"+m.type);
			
//			7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//			    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
			Sport sp=new Sport("축구", "맨유", "공격수", 15, 7);
			Sport sp2=new Sport();
			sp.name="박지성";
			System.out.println("이름:"+sp.name+" 스포츠 종류:"+sp.sType+" 팀명:"+sp.team+" 포지션:"+sp.pos+" 경력년수:"+sp.time+"년"+" 선수번호:"+sp.sNum);
			
			
//			8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//			    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
			Music m01 = new Music();
			Music m02 = new Music(3, "댄스");
			Music m03 = new Music("ETA", "뉴진스");
			m01.name="ETA3";
			System.out.println("앨범명:"+m01.name);
			System.out.println("재생 시간:"+m02.time+"분"+" 장르:"+m02.mType);
			System.out.println("곡 제목:"+m03.title+" 아티스트:"+m03.act);
			
			
//			9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//			    - 필드: (이름), (종류, 나이), 체중, 색상
			Animal a01 = new Animal("강아지");
			Animal a02 = new Animal("포메라니안",3);
			Animal a03 = new Animal();
			a03.kg=5;
			a03.color="브라운";
			System.out.println("이름:"+a01.name);
			System.out.println("종류:"+a02.type+" 나이:"+a02.age+"살");
			System.out.println("체중:"+a03.kg+" 색상:"+a03.color);
			
//			10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//			    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
			User user=new User("shi1234", 7777);
			User user2=new User();
			
			
//			# 패키지와 접근제어자 연습.
//			11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
			/*
			 * 1. 패키지: 클래스 파일들을 체계적으로 관리하도록 사용(캡슐화)
			 * 2. 접근제어자
			 * 	- public : 모든 패키지에서 직접 접근하거나 호출할 수 있다. 
			 * 	- default : 현재 클래스와 동일 패키지 내에서만 접근하거나 호출할 수 있다.
			 * 	- private : 현재 클래스내에서만 사용할 수 있다.
			 * 	- protected : 현재 클래스와 동일 패키지이거나 다른 패키지이더라도 상속 시에는 접근하거나 호출할 수 있다.
			 * 3. 패키지가 다른 클래스를 사용하고 싶은 때
			 * 	1) 사용하고자 하는/호출하는 클래스에서 import로 선언하여야 한다.
			 * 	2) 해당 클래스에 구성요소도 public 접근제어자로 선언해야만 객체생성과 호출이 가능하다.
			 */
			
		}

	}
	class Book{
		String title;
		String name;
		String pub;
		int price;
		int page;
	}
	class Class{ 
		int cnum;
		String cname;
		String major;
		int age;
		double avgScore;
	}
	class Car{//브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		String brand;
		String model;
		int old;
		String color;
		int maxSpeed;
		int nowSpeed;
	}
	class Bank{//계좌번호, 예금주, 잔액, 개설일
		String account;
		String mem;
		int balance;
		String start;
		
		Bank(String account,String mem,int balance,String start){
			this.account=account;
			this.mem=mem;
			this.balance=balance;
			this.start=start;
		}
	}
	class Goods{ //상품코드, 상품명, 가격, 재고수량, 제조사
		int code;
		String gName;
		int gPrice;
		int stock;
		String man;
		
		Goods(int code,String gName,int gPrice,int stock,String man) {
			this.code=code;
			this.gName=gName;
			this.gPrice=gPrice;
			this.stock=stock;
			this.man=man;
		}
	}
	class Movie{//제목, 감독, 배우, 개봉일, 상영 시간, 장르
		String title;
		String name;
		String act;
		String open;
		int time;
		String type;
		
		Movie(){
			
		}
		Movie(String name,String act,String open,int time,String type){
			this.name=name;
			this.act=act;
			this.open=open;
			this.time=time;
			this.type=type;
		}
	}
	class Sport{//이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		String name;
		String sType;
		String team;
		String pos;
		int time;
		int sNum;
		
		Sport(){
			
		}
		Sport(String sType,String team,String pos,int time,int sNum){
			this.sType=sType;
			this.team=team;
			this.pos=pos;
			this.time=time;
			this.sNum=sNum;
		}
	}
	class Music{ //(곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		String title;
		String act;
		int time;
		String mType;
		String name;
		
		Music(){}
		
		Music(String title,String act){
			this.title=title;
			this.act=act;
		}
		Music(int time,String mType){
			this.time=time;
			this.mType=mType;
			
		}
	}
	class Animal{ //(이름), (종류, 나이), 체중, 색상
		String name;
		String type;
		int age;
		int kg;
		String color;
		
		Animal(){}
		
		Animal(String name){
			this.name=name;
		}
		Animal(String type,int age){
			this.type=type;
			this.age=age;
			
		}
	}
	class User{//사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		String id;
		int pass;
		String name;
		String email;
		String num;
		String bir;
		
		User(){}
		
		public User(String id,int pass) {
			this.id=id;
			this.pass=pass;
		}
		
	}