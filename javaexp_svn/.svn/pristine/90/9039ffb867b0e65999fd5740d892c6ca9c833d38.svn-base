package javaexp.z02_homework.a08_jsw;

public class A01_0920
{
	public static void main(String[] args) 
	{
		/*
		--------------------------------------------------------------------------------
		과제 시작
		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				1. **책 정보 클래스**(생성자X)
//			    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
				Book myBook=new Book();
				myBook.title="JAVA AWS Full Stack";
				myBook.author="Yang Hyun Soo";
				myBook.release="Ssang Yong Education";
				myBook.price=6000000;
				myBook.pages=500;
				System.out.println("제목은 "+myBook.title+"입니다.");
				System.out.println("작가는 "+myBook.author+"입니다.");
				System.out.println("출판사는 "+myBook.release+"입니다.");
				System.out.println("가격은 "+myBook.price+"입니다.");
				System.out.println("총 페이지는 "+myBook.pages+"입니다.");
			}

		}

		class Book
		{
			String title;
			String author;
			String release;
			int price;
			int pages;
		}

		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				2. **학생 정보 클래스**(생성자X)
//			    - 필드: 학번, 이름, 전공, 학년, 평균 성적
				Student me=new Student();
				me.number=2018110523;
				me.name="Jang Sun Woong";
				me.major="Electronic Engineering";
				me.grade=4;
				me.GPA=3.14f;
				
				System.out.println("나의 학생 정보");
				System.out.println("number : "+me.number);
				System.out.println("name : "+me.name);
				System.out.println("major : "+me.major);
				System.out.println("grade : "+me.grade);
				System.out.println("GPA : "+me.GPA);
			}
		}

		class Student
		{
			int number;
			String name;
			String major;
			int grade;
			float GPA;
		}
		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				3. **자동차 클래스**(생성자X)
//			    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
				Car myCar=new Car();
				myCar.brand="Hyundai";
				myCar.model="Genesis";
				myCar.year=2023;
				myCar.color="Black";
				myCar.speedmax=200;
				myCar.speednow=300;
				
				System.out.println("brand : "+myCar.brand);
				System.out.println("model : "+myCar.model);
				System.out.println("year : "+myCar.year);
				System.out.println("color : "+myCar.color);
				System.out.println("speedmax : "+myCar.speedmax);
				System.out.println("speednow : "+myCar.speednow);
			}
		}

		class Car
		{
			String brand;
			String model;
			int year;
			String color;
			int speedmax;
			int speednow;
		}

		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				4. **계좌 정보 클래스**(생성자O)
//			    - 필드: 계좌번호, 예금주, 잔액, 개설일
				
				bankAccount mine=new bankAccount("3x2-0xx8-12xx-x3","장선웅","20000","2014.04.04");
				System.out.println("number = "+mine.number);
				System.out.println("owner = "+mine.owner);
				System.out.println("change = "+mine.change);
				System.out.println("date = "+mine.date);
			}
		}

		class bankAccount
		{
			String number;
			String owner;
			String change;
			String date;
			
			bankAccount()
			{
				
			}
			
			bankAccount(String number,String owner ,String change,String date)
			{
				this.number=number;
				this.owner=owner;
				this.change=change;
				this.date=date;
			}
			
		}

		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				5. **상품 정보 클래스**(생성자O)
//			    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
				Product prod=new Product("12345","아이퐁",1200000,5,"Apple");
				System.out.println("code : " +  prod.code);
				System.out.println("name : " +  prod.name);
				System.out.println("price : " +  prod.price);
				System.out.println("rest : " +  prod.rest);
				System.out.println("company : " +  prod.company);
			}
		}

		class Product
		{
			String code;
			String name;
			int price;
			int rest;
			String company;
			
			Product(String code,String name,int price,int rest,String company)
			{
				this.code=code;
				this.name=name;
				this.price=price;
				this.rest=rest;
				this.company=company;
			}
		}
		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//			    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
				Movie movie=new Movie("Oppenheimer","Christoper","Muffy","2023.08.20",180,"biography");
				System.out.println("title : "+movie.title);
				System.out.println("director : "+movie.director);
				System.out.println("actor : "+movie.actor);
				System.out.println("release : "+movie.release);
				System.out.println("time : "+movie.time);
				System.out.println("genre : "+movie.genre);
			}
		}

		class Movie
		{
			String title;
			String director;
			String actor;
			String release;
			int time;
			String genre;
			
			Movie()
			{
				
			}
			
			Movie(String title,String director,String actor,String release,int time,String genre)
			{
				this.title=title ;
				this.director=director ;
				this.actor=actor;
				this.release=release ;
				this.time=time ;
				this.genre=genre ;
			}

		}
		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//			    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
				Athelete fighter=new Athelete("jung chan sung","UFC","Top Team","Striker",10,5);
				
				System.out.println("name : "+fighter.name);
				System.out.println("sports : "+fighter.sports);
				System.out.println("team : "+fighter.team);
				System.out.println("position : "+fighter.position);
				System.out.println("years : "+fighter.years);
				System.out.println("number : "+fighter.number);
			}
		}

		class Athelete
		{
			String name;
			String sports;
			String team;
			String position;
			int years;
			int number;
			
			Athelete()
			{
				
			}
			Athelete(String name,String sports,String team,String position,int years,int number)
			{
				this.name =name ;
				this.sports =sports ;
				this.team = team;
				this.position =position;
				this.years =years ;
				this.number = number;
			}
		}
		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//			    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
				Song song=new Song("Flower Dance","Hisahishi Joe",180,"Piano","Flower");
				
				System.out.println("title : "+song.title);
				System.out.println("artist : "+song.artist);
				System.out.println("time : "+song.time);
				System.out.println("genre : "+song.genre);
				System.out.println("album : "+song.album);
			}
		}

		class Song
		{
			String title;
			String artist;
			int time;
			String genre;
			String album;
			
			Song()
			{
				
			}
			Song(String title,String artist,int time,String genre,String album)
			{
				this.title =title ;
				this.artist =artist ;
				this.time = time;
				this.genre = genre;
				this.album = album;
			}
		}
		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//			    - 필드: (이름), (종류, 나이), 체중, 색상
				Animal animal=new Animal("Simba","Cat",13,14,"Yellow");
				System.out.println("name : "+animal.name);
				System.out.println("kind : "+animal.kind);
				System.out.println("age : "+animal.age);
				System.out.println("weight : "+animal.weight);
				System.out.println("color : "+animal.color);
			}
		}

		class Animal
		{
			String name;
			String kind;
			int age;
			int weight;
			String color;
			Animal( )
			{

			}
			Animal(	String name,String kind,int age,int weight,String color)
			{
				this.name = name;
				this.kind = kind;
				this.age =age ;
				this.weight =weight ;
				this.color =color ;
			}
		}
		--------------------------------------------------------------------------------
		package javaexp.z02_homework.a08_jsw;

		public class A01_0920
		{
			public static void main(String[] args) 
			{
//				10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//			    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
				User me=new User("eric","wkdtjsdnd","장선웅","cozyeric@naver.com","010-8772-4286","1995.09.23");
				System.out.println("ID : "+me.ID);
				System.out.println("PW : "+me.PW);
				System.out.println("name : "+me.name);
				System.out.println("mail : "+me.mail);
				System.out.println("phone : "+me.phone);
				System.out.println("birthday : "+me.birthday);	
			}
		}

		class User
		{
			String ID;
			String PW;
			String name;
			String mail;
			String phone;
			String birthday;
			
			User()
			{
				
			}
			User(String ID,String PW,String name,String mail,String phone,String birthday)
			{
				this.ID = ID;
				this.PW = PW;
				this.name = name;
				this.mail =mail ;
				this.phone = phone;
				this.birthday =birthday ;
			}
		}
		*/
	}
}
