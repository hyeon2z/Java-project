package javaexp.z02_homework.a09_khm;

public class A0920_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 객체를 생성하세요
		
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		

		
		class Book {
			String title;
			int price;
			int Pnumber;
			String writer;
			String company;
		}
		
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		

		class Student {
			String name;
			int snumber;
			int schoolYear;
			int avGrade;
			String major;
		}
		
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도

		class car {
			String brand;
			int modelYear;
			int maxSpeed;
			int currentSpeed;
			String model;
			String color;
		}
		
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		
		class Account{
		String accountHolder;
		int accountNumber;
		int balance;
		int openingDate;
		Account(String accountHolder, int accountNumber, int balance, int openingDate){
			this.accountHolder = accountHolder;
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.openingDate = openingDate;
		}
	}
		
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		
		class Product{
		String pname;
		String company;
		int price;
		int pcode;
		int availableStock;
		Product(String pname, String company, int price, int pcode, int availableStock){
			this.pname = pname;
			this.company = company;
			this.price = price;
			this.pcode = pcode;
			this.availableStock = availableStock;

		}
	}
		
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
		
		class Movie{
			String title;
			String director;
			String actor;
			String genre;
			int releaseDate;
			int showTime;
	
			Movie(){}
			Movie(String title, String director, String actor, String genre, int releaseDate, int showTime){
				this.title = title;
				this.director = director;
				this.actor = actor;
				this.genre = genre;
				this.releaseDate = releaseDate;
				this.showTime = showTime;
			}	
		}
		
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
		
		class athlete{
			String name;
			String kind;
			String teamName;
			String position;
			int experienceYears;
			int number;
	
			athlete(){}
			athlete(String name, String kind, String teamName, String position, int experienceYears, int number){
				this.name = name;
				this.kind = kind;
				this.teamName = teamName;
				this.position = position;
				this.experienceYears = experienceYears;
				this.number = number;
			}	
		}
		
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		
		
	}

}
