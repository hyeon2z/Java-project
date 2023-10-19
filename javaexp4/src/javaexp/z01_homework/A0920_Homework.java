package javaexp.z01_homework;

public class A0920_Homework {

	public static void main(String[] args) {
		
		// 1. 책 정보
		
		Book b01 = new Book();
		
		b01.bookName = "Java의 정석";
		b01.bookWrite = "조정석";
		b01.bookSale = "교보출판";
		b01.bookPrice = 22000;
		b01.bookTotalPage = 322;
		
		System.out.println("책 제목 : " + b01.bookName);
		System.out.println("책 저자 : " + b01.bookWrite);
		System.out.println("출판사 : " + b01.bookSale);
		System.out.println("가격 : " + b01.bookPrice);
		System.out.println("책 페이지 수 : " + b01.bookTotalPage);
		
		System.out.println();
		
		// 2. 학생 정보 클래스
		
		Student s01 = new Student();
		
		s01.stuNum = 230920;
		s01.stuName = "김철수";
		s01.stuSub = "기계공학과";
		s01.stuGrade = 4;
		s01.stuAvr = 4.21;
		
		System.out.println("학생 학번 : " + s01.stuNum);
		System.out.println("학생 이름 : " + s01.stuName);
		System.out.println("전공과목 : " + s01.stuSub);
		System.out.println("학년 : " + s01.stuGrade);
		System.out.println("평균성적 : " + s01.stuAvr);
		
		System.out.println();
		
		// 3. 자동차 클래스
		
		Car c01 = new Car();
		
		c01.brand = "현대";
		c01.model = "그렌저";
		c01.year = 23;
		c01.color = "Black";
		c01.maxSpeed = 250;
		c01.speed = 80;
		
		System.out.println("자동차 브랜드 : " + c01.brand);
		System.out.println("자동차 모델 : " + c01.model);
		System.out.println("자동차 년식 : " + c01.year);
		System.out.println("자동차 색 : " + c01.color);
		System.out.println("최고 속도 : " + c01.maxSpeed);
		System.out.println("현재 속도 : " + c01.speed);
		
		System.out.println();
		
		// 4. 계좌 정보 클래스
		
		Account a01 = new Account(8160210054756L, "김길동", 100000000, "16.09.20");
		
		System.out.println("계좌번호 : " + a01.accountNum);
		System.out.println("예금주 : " + a01.accountOwner);
		System.out.println("계좌잔액 : " + a01.accountMoney);
		System.out.println("계좌개설일 : " + a01.accountDay);
		
		System.out.println();
		
		// 5. 상품 정보 클래스
		
		Product p01 = new Product(13546870, "모니터", 200000, 15, "LG"); 
		
		System.out.println("상품코드 : " + p01.pCode);
		System.out.println("상품명 : " + p01.pName);
		System.out.println("가격 : " + p01.pPrice);
		System.out.println("재고수량 : " + p01.pAmount);
		System.out.println("제조사 : " + p01.pFrom);
		
		System.out.println();
		
		// 6. 영화 정보 클래스 (매개변수X)
		
		Movie m01 = new Movie(); 
		
		m01.mvName = "콘스탄틴";
		m01.mvDirec = "놀란";
		m01.mvActor = "차태현";
		m01.mvOpen = 160520;
		m01.mvRuntime = "3시간 10분";
		m01.mvType = "SF";
		
		System.out.println("영화 제목 : " + m01.mvName);
		System.out.println("영화 감독 : " + m01.mvDirec);
		System.out.println("출연 배우 : " + m01.mvActor);
		System.out.println("개봉일 : " + m01.mvOpen);
		System.out.println("상영시간 : " + m01.mvRuntime);
		System.out.println("영화 장르 : " + m01.mvType);
		
		System.out.println();
		
		// 6-1. 영화 정보 클래스 (매개변수O)
		
		Movieinfo m02 = new Movieinfo("기생충", "봉준호", "송강호", 20190530, "2시간 11분", "드라마");
		
		System.out.println("영화 제목 : " + m02.mvName);
		System.out.println("영화 감독 : " + m02.mvDirec);
		System.out.println("출연 배우 : " + m02.mvActor);
		System.out.println("개봉일 : " + m02.mvOpen);
		System.out.println("상영시간 : " + m02.mvRuntime);
		System.out.println("영화 장르 : " + m02.mvType);
		
		System.out.println();
		
		// 7. 운동선수 클래스 (매개변수X)
		
		Athlete ath01 = new Athlete();
		
		ath01.athName = "손흥민";
		ath01.athType = "축구";
		ath01.athTeam = "토트넘";
		ath01.athPosi = "공격수";
		ath01.athCareer = 13;
		ath01.athNum = 7;
		
		System.out.println("운동선수 이름 : " + ath01.athName);
		System.out.println("종목 : " + ath01.athType);
		System.out.println("팀명 : " + ath01.athTeam);
		System.out.println("포지션 : " + ath01.athPosi);
		System.out.println("경력 : " + ath01.athCareer);
		System.out.println("등번호 : " + ath01.athNum);
			
		System.out.println();
		
		// 7-1. 운동선수 클래스 (매개변수O)
		
		Athlete1 ath02 = new Athlete1("이강인", "축구", "파리생제르맹", "미드필더", 5, 19);
		
		System.out.println("운동선수 이름 : " + ath02.athName);
		System.out.println("종목 : " + ath02.athType);
		System.out.println("팀명 : " + ath02.athTeam);
		System.out.println("포지션 : " + ath02.athPosi);
		System.out.println("경력 : " + ath02.athCareer);
		System.out.println("등번호 : " + ath02.athNum);
		
		// 8. 음악 트랙 클래스
		// - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		Music ms01 = new Music("맨정신", "BIGBANG", 185, "pop", "D");
		
		System.out.println("곡 제목 : " + ms01.mName);
		System.out.println("아티스트 : " + ms01.mArti);
		System.out.println("재생시간 : " + ms01.mPtime);
		System.out.println("장르 : " + ms01.mType);
		System.out.println("앨범명 : " + ms01.mAlbum);
		
		System.out.println();
		
		Music ms02 = new Music("맨정신", "BIGBANG", "pop", 185, "D");
		
		System.out.println("곡 제목 : " + ms02.mName);
		System.out.println("아티스트 : " + ms02.mArti);
		System.out.println("장르 : " + ms02.mType);
		System.out.println("재생시간 : " + ms02.mPtime);
		System.out.println("앨범명 : " + ms02.mAlbum);
		
		System.out.println();
		
		// 9. 동물 클래스
		// - 필드: (이름), (종류, 나이), 체중, 색상
		Animal ani01 = new Animal("멍멍이", "리트리버", 5, 20, "갈색");
		
		System.out.println("이름 : " + ani01.aniName);
		System.out.println("종류 : " + ani01.aniType);
		System.out.println("나이 : " + ani01.aniAge);
		System.out.println("체중 : " + ani01.aniWeight);
		System.out.println("색상 : " + ani01.aniColor);
		
		System.out.println();
		
		Animal ani02 = new Animal("멍멍이", 5, 20, "갈색");
		
		System.out.println("이름 : " + ani02.aniName);
		System.out.println("나이 : " + ani02.aniAge);
		System.out.println("체중 : " + ani02.aniWeight);
		System.out.println("색상 : " + ani02.aniColor);
		
		System.out.println();
		
		// 10. 사용자 프로필 클래스
		// - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
		User usr01 = new User("abc123", "123abc", "김길동", "kd2@gmail.com", "010-1234-5678", 900426);
		
		System.out.println("아이디 : " + usr01.usrId);
		System.out.println("비밀번호 : " + usr01.usrPass);
		System.out.println("이름 : " + usr01.usrName);
		System.out.println("이메일 : " + usr01.usrEmail);
		System.out.println("연락처 : " + usr01.usrPhone);
		System.out.println("생년월일 : " + usr01.usrBirth);
		
		System.out.println();
		
		User usr02 = new User("abc123", "123abc", "김길동", "010-1234-5678", 900426);
		
		System.out.println("아이디 : " + usr02.usrId);
		System.out.println("비밀번호 : " + usr02.usrPass);
		System.out.println("이름 : " + usr02.usrName);
		System.out.println("연락처 : " + usr02.usrPhone);
		System.out.println("생년월일 : " + usr02.usrBirth);
		
	}
}
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
class Book {
	String bookName;
	String bookWrite;
	String bookSale;
	int bookPrice;
	int bookTotalPage;
	
}
		
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
class Student {
	int stuNum;
	String stuName;
	String stuSub;
	int stuGrade;
	double stuAvr;
}
		
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
class Car {
	String brand;
	String model;
	int year;
	String color;
	int maxSpeed;
	int speed;
}
		
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
class Account {
	long accountNum;
	String accountOwner;
	int accountMoney;
	String accountDay;
	Account(long accountNum, String accountOwner, int accountMoney, String accountDay) {
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
		this.accountMoney = accountMoney;
		this.accountDay = accountDay;
	}
}
		
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
class Product {
	
	int pCode;
	String pName;
	int pPrice;
	int pAmount;
	String pFrom;
	
	Product(int pCode, String pName, int pPrice, int pAmount, String pFrom) {
		this.pCode = pCode;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pAmount = pAmount;
		this.pFrom = pFrom;
	}
}
		
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
class Movie { // 매개변수없는 생성자
	String mvName;
	String mvDirec;
	String mvActor;
	int mvOpen;
	String mvRuntime;
	String mvType;
}

class Movieinfo { // 매개변수 입력 생성자
	String mvName;
	String mvDirec;
	String mvActor;
	int mvOpen;
	String mvRuntime;
	String mvType;
	
	Movieinfo(String mvName, String mvDirec, String mvActor, int mvOpen, String mvRuntime, String mvType) {
		this.mvName = mvName;
		this.mvDirec = mvDirec;
		this.mvActor = mvActor;
		this.mvOpen = mvOpen;
		this.mvRuntime = mvRuntime;
		this.mvType = mvType;
		
	}
}
		
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
class Athlete { // 매개변수 없는 생성자
	String athName;
	String athType;
	String athTeam;
	String athPosi;
	int athCareer;
	int athNum;
}

class Athlete1 { // 매개변수 입력 생성자
	String athName;
	String athType;
	String athTeam;
	String athPosi;
	int athCareer;
	int athNum;
	
	Athlete1(String athName, String athType, String athTeam, String athPosi, int athCareer, int athNum) {
		this.athName = athName;
		this.athType = athType;
		this.athTeam = athTeam;
		this.athPosi = athPosi;
		this.athCareer = athCareer;
		this.athNum = athNum;
	}
}



//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
class Music {
	String mName;
	String mArti;
	int mPtime;
	String mType;
	String mAlbum;
	
	Music(String mName, String mArti, int mPtime, String mType, String mAlbum) {
		this.mName = mName;
		this.mArti = mArti;
		this.mPtime = mPtime;
		this.mType = mType;
		this.mAlbum = mAlbum;
	}
	
	Music(String mName, String mArti, String mType, int mPtime, String mAlbum) {
		this.mName = mName;
		this.mArti = mArti;
		this.mPtime = mPtime;
		this.mType = mType;
		this.mAlbum = mAlbum;
	}
	
}
// 매개변수 4개일 때/2개일 때
// 생성자나 메서드는 호출 시 매개변수의 갯수로 식별하여 호출이 가능하기 때문에 동일한 이름이라도 선언할 수 있다.



		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
class Animal {
	String aniName;
	String aniType;
	int aniAge;
	int aniWeight;
	String aniColor;
	
	Animal(String aniName, String aniType, int aniAge, int aniWeight, String aniColor) {
		this.aniName = aniName;
		this.aniType = aniType;
		this.aniAge = aniAge;
		this.aniWeight = aniWeight;
		this.aniColor = aniColor;
	}
	
	Animal(String aniName, int aniAge, int aniWeight, String aniColor) {
		this.aniName = aniName;
		this.aniAge = aniAge;
		this.aniWeight = aniWeight;
		this.aniColor = aniColor;
	}

}
		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
class User {
	String usrId;
	String usrPass;
	String usrName;
	String usrEmail;
	String usrPhone;
	int usrBirth;
	
	User(String usrId, String usrPass, String usrName, String usrEmail, String usrPhone, int usrBirth) {
		this.usrId = usrId;
		this.usrPass = usrPass;
		this.usrName = usrName;
		this.usrEmail = usrEmail;
		this.usrPhone = usrPhone;
		this.usrBirth = usrBirth;
	}
	
	User(String usrId, String usrPass, String usrName, String usrPhone, int usrBirth) {
		this.usrId = usrId;
		this.usrPass = usrPass;
		this.usrName = usrName;
		this.usrPhone = usrPhone;
		this.usrBirth = usrBirth;
	}
	
}
		
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		/*
		
		동일한 패키지 안의 class는 접근제어자가 private가 아닐 때 선언없이 호출이 가능하고
		다른 패키지의 class는 접근제어자가 public일 때 import로 해당 패키지를 선언 후 호출가능하다.
		
	ex) box 와 air 라는 서로 다른 두 패키지가 있다.
		box 패키지 안에는 Gift라는 class가 있을 때, 이를 air 패키지에서 호출하고자 한다.
		
		1. 사용하고자 하는 class 앞에 public을 붙인다
			-> public class Gift {}
		
		2. 호출하고자 하는 패키지에서 import를 선언한다.
			-> import box;
		
		3. class 안에 선언된 필드를 호출할때 또한 public이 있어야 한다.
			-> public String giftName;
	
		 */
		