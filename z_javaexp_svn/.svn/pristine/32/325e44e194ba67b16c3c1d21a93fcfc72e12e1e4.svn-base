package javaexp.z02_homework.a17_okw;

public class A0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		System.out.println("# 1번 #");
			Book b01 = new Book();
			b01.title = "자바의정석";
			b01.author = "남궁성";
			b01.publisher = "도우출판";
			b01.bPrice = 25000;
			b01.pages = 363;
			System.out.println(b01.title+"("+b01.author+")"+","+b01.publisher+": 가격 "+b01.bPrice+"원,"+b01.pages+"p");
			
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
			System.out.println("\n# 2번 #");
			Student s01 = new Student();
			s01.sNo = 202312990;
			s01.sName = "오근우";
			s01.major = "경영학과";
			s01.grade = 1;
			s01.avgScore = "A+";
			System.out.println("학번:"+s01.sNo);
			System.out.println("이름:"+s01.sName);
			System.out.println("전공:"+s01.major);
			System.out.println("학년:"+s01.grade);
			System.out.println("평균성적:"+s01.avgScore);
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
			System.out.println("\n# 3번 #");
			Car c01 = new Car();
			c01.brand = "제네시스";
			c01.model = "G80";
			c01.years = 2023;
			c01.colors = "gray";
			c01.maxSpeed = 240;
			c01.curSpeed = 60;
			System.out.println(c01.brand+c01.model+"("+c01.years+"년식),"+c01.colors+"색상, "
								+"최고속력:"+c01.maxSpeed+", 현재속력:"+c01.curSpeed);
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
			System.out.println("\n# 4번 #");
			Account a01 = new Account();
			a01.accNum = 110356254205L;
			a01.aName = "오근우";
			a01.balance = 500_000;
			a01.openDate = "2012.03.05";
			System.out.println(a01.accNum+"("+a01.aName+"),"+"잔액 "+a01.balance+"원, "+"개설일:"+a01.openDate);
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
			System.out.println("\n# 5번 #");
			Goods g01 = new Goods();
			g01.codes = 295;
			g01.gName = "키보드";
			g01.gPrice = 33_000;
			g01.stock = 23;
			g01.gCompany = "Logitech";
			System.out.println("상품코드:"+g01.codes+" "+g01.gName+", "+g01.gPrice+"원, 수량:"+g01.stock+ " (제조사:" +
							  g01.gCompany +")");
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
			System.out.println("\n# 6번 #");
			Movie m01 = new Movie();
			Movie m02 = new Movie("오펜하이머","크리스토퍼 놀란","킬리언 머피 외","23.07.21",180, "드라마");
			System.out.println(m02.mTitle+"\n감독:"+m02.director+"\n출연진:"+m02.actor+"\n개봉일:"
								+m02.movieOpen+"\n상영시간:"+ m02.runTime+"분"+"\n장르:"+m02.genre);
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
			System.out.println("\n# 7번 #");
			Athlete at1 = new Athlete();
			Athlete at2 = new Athlete("스티븐 제라드","축구","Liverpool FC","미드필더",15,8);
			System.out.println("이름:"+at2.aName+"\n종목:"+at2.sport+"\n팀명:"+at2.teamName+"\n포지션:"+
								at2.position+"\n경력:"+at2.career+"년"+"\n등번호:"+at2.pNo);
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
			System.out.println("\n# 8번 #");
			Music mu01 = new Music("Misty", "Ella Fitzgerald");
			Music ge01 = new Music(3, "Jazz");
			Music ab01 = new Music("Let No Man Write My Epitaph");
			System.out.println("곡 제목:"+mu01.subject+"\n아티스트:"+mu01.artist+"\n재생시간:"+ge01.playTime+"분"
								+"\n장르:"+ge01.mGenre+"\n앨범명:"+ab01.album);
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
			System.out.println("\n# 9번 #");
			Animal an01 = new Animal("못냥이");
			Animal an02 = new Animal("고양이",2);
			Animal an03 = new Animal(2.54, "검/흰");
			String aniName;
			String species;
			int aniAge;
			double weight;
			String color;
			System.out.println("이름:"+an01.aniName+"\n종류:"+an02.species+"\n나이:"+an02.aniAge+"살"
								+"\n체중:"+an03.weight+"kg"+"\n색상:"+an03.color);
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
			System.out.println("\n# 10번 #");
			Profile p01 = new Profile("okw9344","kw7777","오근우","okw9344@gmail.com");
			Profile p02 = new Profile(1086447336,930404);
			System.out.println("ID:"+p01.id+"\nPassword:"+p01.pw+"\n이름:"+p01.pName+"\n이메일:"+p01.email
								+"\n연락처:0"+p02.pNum+"\n생년월일:"+p02.ymd);
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
			
		// Answer) 같은 패키지 내 클래스는 따로 선언 없이 호출 가능. 그러나 private 접근제어자의 경우, 불가능
		// ex) 다른 패키지에 있는 class를 호출하고 싶은 경우
		// package javaexp.z01_homework;
		// import javaexp.a06_object.Book;   ==> (1)이렇게 import
		// 										 (2) 사용하고자 하는 class의 접근제어자가 public 이어야함.
		// Book b1 = new Book();				 (3) 해당 클래스 내 구성요소도 public 접근제어자 여야 호출 가능.
		// b1.title = "자바의정석";
			
	}

}


//1. **책 정보 클래스**(생성자X)
class Book{
	String title;
	String author;
	String publisher;
	int bPrice;
	int pages;
}
//2. **학생 정보 클래스**(생성자X)
class Student{
	int sNo;
	String sName;
	String major;
	int grade;
	String avgScore;
}
//3. **자동차 클래스**(생성자X)
class Car{					//브랜드, 모델, 연식, 색상, 최대속도, 현재속도
	String brand;
	String model;
	int years;
	String colors;
	int maxSpeed;
	int curSpeed;
}
//4. **계좌 정보 클래스**(생성자O)
class Account{				// 계좌번호, 예금주, 잔액, 개설일
	long accNum;
	String aName;
	int balance;
	String openDate;
	public Account(){}
//	Account(long accNum, String aName, int balance, String openDate) {
//		this.accNum = accNum;
//		this.aName = aName;
//		this.balance = balance;
//		this.openDate = openDate;
//	}
}
//5. **상품 정보 클래스**(생성자O)
class Goods{				// 상품코드, 상품명, 가격, 재고수량, 제조사
	int codes;
	String gName;
	int gPrice;
	int stock;
	String gCompany;
	Goods(){}
//	Goods(int codes, String gName, int gPrice, int stock, String gCompany){
//		this.codes = codes;
//		this.gName = gName;
//		this.gPrice = gPrice;
//		this.stock = stock;
//		this.gCompany = gCompany;
//	}
}
//6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
class Movie{				//- 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
	String mTitle;
	String director;
	String actor;
	String movieOpen;
	int runTime;
	String genre;
	Movie(){}
	Movie(String mTitle, String director, String actor, String movieOpen, int runTime, String genre){
		this.mTitle = mTitle;
		this.director = director;
		this.actor = actor;
		this.movieOpen = movieOpen;
		this.runTime = runTime;
		this.genre = genre;
	}
}
//7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
class Athlete {				//- 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
	String aName;
	String sport;
	String teamName;
	String position;
	int career;
	int pNo;
	Athlete(){}
	Athlete(String aName, String sport, String teamName, String position, int career, int pNo){
		this.aName = aName;
		this.sport = sport;
		this.teamName = teamName;
		this.position = position;
		this.career = career;
		this.pNo = pNo;
	}
}
//8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
class Music {				//- 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
	String subject;
	String artist;
	int playTime;
	String mGenre;
	String album;

	Music(String subject, String artist) {
		this.subject = subject;
		this.artist = artist;
	}
	Music(int playTime, String mGenre) {
		this.playTime = playTime;
		this.mGenre = mGenre;
	}
	Music(String album) {
	this.album = album;
	}
}
//9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
class Animal{					//- 필드: (이름), (종류, 나이), 체중, 색상
	String aniName;
	String species;
	int aniAge;
	double weight;
	String color;
	Animal(String aniName){
		this.aniName = aniName;
	}
	Animal(String species,int aniAge){
		this.species = species;
		this.aniAge = aniAge;
	}
	Animal(double weight, String color){
		this.weight = weight;
		this.color = color;
	}
}
//10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
class Profile{			//- 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
	String id;
	String pw;
	String pName;
	String email;
	int pNum;
	int ymd;
	Profile(String id,String pw,String pName, String email){
		this.id = id;
		this.pw = pw;
		this.pName = pName;
		this.email = email;
	}
	Profile(int pNum,int ymd){
		this.pNum = pNum;
		this.ymd = ymd;
	}
}