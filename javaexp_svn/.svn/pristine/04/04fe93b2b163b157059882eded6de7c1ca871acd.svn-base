package javaexp.z02_homework.a11_mhi;


public class A01_0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 자바과제 올립니다.

//      # 아래 내용을 객체를 생성하세요
//      1. **책 정보 클래스**(생성자X)
//          - 필드: 제목, 저자, 출판사, 가격, 페이지 수
//      2. **학생 정보 클래스**(생성자X)
//          - 필드: 학번, 이름, 전공, 학년, 평균 성적
//      3. **자동차 클래스**(생성자X)
//          - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
//      4. **계좌 정보 클래스**(생성자O)
//          - 필드: 계좌번호, 예금주, 잔액, 개설일
//      5. **상품 정보 클래스**(생성자O)
//          - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
//      6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//          - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
//      7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//          - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
//      8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//          - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
//      9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//          - 필드: (이름), (종류, 나이), 체중, 색상
//      10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//          - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
//      # 패키지와 접근제어자 연습.
//      11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
      /*
       *-class 접근 제어자를 사용하여 다른 클래스나 패키지에서의 접근을 제한할 수 있다.
       * public : 내부 패키지는 물론이고, 외부패키지에서도 호출 가능한 접근 제어자.
       * private: 내부 클래스에서만 호출 가능한 접근 제어자.
       * -패키지가 다를때, 접근제어자 처리예시
       * 1. 사용하고자하는 클래스에서, import 선언을 한다.
       * 2. 클래스 앞에 접근제어자가 public로 선언되어 있는지 확인한다.
       * 3. 외부 클래스 호출시, 해당 클래스에 구성요소가 pubilc이상의 접근제어자여야지만 호출/사용이 가능하다.
       */
      
      
      
      // 책 정보 객체 생성 (생성자x)
      Book book = new Book();
      book.name = "어린왕자";
      book.author = "생택쥐베리";
      book.publisher = "쌍용";
      book.price = 5000;
      book.pageCnt = 100;
      System.out.println("책이름: " + book.name);
      System.out.println("저자: " + book.author);

      // 학생 정보 객체 생성 (생성자x)
      Student stu = new Student();
      stu.stuNo = 1;
      stu.name = "민지";
      stu.major = "경영";
      stu.grade = 3;
      stu.aveGrade = 3.5;
      System.out.println("평균성적: " + stu.aveGrade);

      // 자동차 정보 객체 생성 (생성자x)
      Car car = new Car();
      car.brand = "현대";
      car.modelName = "k5";
      car.modelYear = 2019;
      car.color = "노랑";
      car.maxSpeed = 431.072;
      car.currentSpeed = 5.072;
      System.out.println("최대속도:" + car.maxSpeed);

      // 계좌 정보 객체 생성 (생성자O)
      Account a01 = new Account("110-288-544-323", "문해인", 500, "20180102");
      System.out.println(
            "계좌번호: " + a01.accountNum + ", 예금주: " + a01.name + ", 잔액: " + a01.balance + ", 개설일: " + a01.date);

      // 상품 정보 객체 생성 (생성자O)
      // - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
      Product p01 = new Product("11045874", "자석", 1000, 3, "페이펄");
      System.out.println("상품코드: " + p01.code + ", 상품명: " + p01.name + ", 가격: " + p01.price + ", 재고수량: "
            + p01.availableStock + ", 제조사: " + p01.company);

      // 영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
      // - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
      Movie movie01 = new Movie();
      Movie movie02 = new Movie("상견니", "김용화", "허광환", "2018-03-02", 32, "로맨스");
      System.out.println("제목: " + movie02.title + ", 감독: " + movie02.director + ", 배우: " + movie02.actor + ", 개봉일: "
            + movie02.releasDate + ", 상영시간: " + movie02.runningTime);

      // 운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
      // - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
      Athlete athlete01 = new Athlete();
      Athlete athlete02 = new Athlete("문해인", "마라톤", "달려라", "페이서", 3, 7);

      // 음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
      // 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
      MusicTrack musicTrack01 = new MusicTrack("사건의 지평선", "윤하");
      MusicTrack musicTrack02 = new MusicTrack(3, "발라드");

      // 동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
      // - 필드: (이름), (종류, 나이), 체중, 색상
      Animal animal01 = new Animal("푸바오");
      Animal animal02 = new Animal("판다", 13);

      // 사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
      // - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
      UserProfile userProfile01 = new UserProfile("abc123");
      UserProfile userProfile02 = new UserProfile("a1313!", "문해인");

   }
}

class UserProfile {
   String userId;
   String password;
   String name;
   String email;
   String phoneNumber;

   UserProfile() {
   }

   UserProfile(String userId) {
      this.userId = userId;
   }

   UserProfile(String password, String name) {
      this.password = password;
      this.name = name;
   }
}

class Animal {
   String name;
   String species;
   int age;
   int weight;
   String color;

   Animal() {
   }

   Animal(String name) {
      this.name = name;
   }

   Animal(String species, int age) {
      this.species = species;
      this.age = age;
   }
}

class MusicTrack {
   String title;
   String artist;
   int playbackTime;
   String genre;
   String albumName;

   MusicTrack() {
   }

   MusicTrack(String title, String artist) {
      this.title = title;
      this.artist = artist;
   }

   MusicTrack(int playbackTime, String genre) {
      this.playbackTime = playbackTime;
      this.genre = genre;
   }
}

class Athlete {
   String name;
   String sportsTypes;
   String teamName;
   String position;
   int yearsOfExperience;
   int playerNumber;

   Athlete() {
   }

   Athlete(String name, String sportsTypes, String teamName, String position, int yearsOfExperience,
         int playerNumber) {
      this.name = name;
      this.sportsTypes = sportsTypes;
      this.teamName = teamName;
      this.position = position;
      this.yearsOfExperience = yearsOfExperience;
      this.playerNumber = playerNumber;
   }
}

class Movie {
   String title;
   String director;
   String actor;
   String releasDate;
   int runningTime;
   String genre;

   Movie() {
   }

   Movie(String title, String director, String actor, String releasDate, int runningTime, String genre) {
      this.title = title;
      this.director = director;
      this.actor = actor;
      this.releasDate = releasDate;
      this.runningTime = runningTime;
      this.genre = genre;
   }
}

class Product {
   String code;
   String name;
   int price;
   int availableStock;
   String company;

   Product() {
   }

   Product(String code, String name, int price, int availableStock, String company) {
      this.code = code;
      this.name = name;
      this.price = price;
      this.availableStock = availableStock;
      this.company = company;
   }
}

class Account {
   String accountNum;
   String name;
   int balance;
   String date;

   Account() {
   }

   Account(String accountNum, String name, int balance, String date) {
      this.accountNum = accountNum;
      this.name = name;
      this.balance = balance;
      this.date = date;
   }
}

class Car {
   String brand;
   String modelName;
   int modelYear;
   String color;
   double maxSpeed;
   double currentSpeed;
}

class Student {
   int stuNo;
   String name;
   String major;
   int grade;
   double aveGrade;
}

class Book {
   String name;
   String author;
   String publisher;
   int price;
   int pageCnt;
}