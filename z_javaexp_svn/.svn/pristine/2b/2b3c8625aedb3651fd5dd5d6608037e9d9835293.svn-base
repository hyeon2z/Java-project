package javaexp.z02_homework.a00_yhs;

public class A0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
/*			동일한 패키지는 class 접근제어자가 접근제어자가 없거나 public일 때, 선언하고 사용할 수 있지만,
 *          다른 패키지일 때는 class 접근제어자가 반드시 public이어야 한고, 호출하는 곳에서는 import를 
 *          하여야 객체 생성을 위한 선언할 수 있다. 
 *          javaexp.z02_homework.a00_yhs.Person의 public 선언에 따라.
 *          현재 클래스 호출과 javaexp.z02_homework.a00_yhs.a01.CallPerson에서의 호출이 
 *          차이가 난다.
 *          */		
		
        // 1. 책 정보 클래스
        Book book = new Book();
        book.title = "Java Programming";
        book.author = "John Doe";
        book.publisher = "Tech Books";
        book.price = 30000;
        book.pages = 500;

        // 2. 학생 정보 클래스
        Student student = new Student();
        student.studentId = "20210001";
        student.name = "Kim";
        student.major = "Computer Science";
        student.grade = 1;
        student.avgGrade = 95.5;

        // 3. 자동차 클래스
        Car car = new Car();
        car.brand = "Hyundai";
        car.model = "Elantra";
        car.year = 2023;
        car.color = "Black";
        car.maxSpeed = 180;
        car.currentSpeed = 0;

        // 4. 계좌 정보 클래스
        Account account = 
        		new Account("1122-3344-5566", "Lee", 1000000, "2023-09-15");
        System.out.println(account.accountNumber);

        // 5. 상품 정보 클래스
        Product product = new Product("P001", "Laptop", 1500000, 10, "Dell");

        // 6. 영화 정보 클래스
        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Inception", "Christopher Nolan", "Leonardo DiCaprio", "2010-07-16", 148, "Science Fiction");

        // 7. 운동선수 클래스
        Athlete athlete1 = new Athlete();
        Athlete athlete2 = new Athlete("Ronaldo", "Soccer", "Manchester United", "Forward", 18, 7);

        // 8. 음악 트랙 클래스
        MusicTrack track1 = new MusicTrack("Shape of You", "Ed Sheeran");
        MusicTrack track2 = new MusicTrack("Shape of You", "Ed Sheeran", "3:53", "Pop");

        // 9. 동물 클래스
        Animal animal1 = new Animal("Tiger");
        Animal animal2 = new Animal("Tiger", 5, 200, "Orange");

        // 10. 사용자 프로필 클래스
        UserProfile user1 = new UserProfile("john123", "password");
        UserProfile user2 = new UserProfile("john123", "password", "John Doe", "john.doe@email.com");
    }
}

class Book {
    String title;
    String author;
    String publisher;
    int price;
    int pages;
}

class Student {
    String studentId;
    String name;
    String major;
    int grade;
    double avgGrade;
}

class Car {
    String brand;
    String model;
    int year;
    String color;
    int maxSpeed;
    int currentSpeed;
}

class Account {
    String accountNumber;
    String accountHolder;
    int balance;
    String openDate;

    Account(String accountNumber, String accountHolder,
    		int balance, String openDate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.openDate = openDate;
    }
    // Account ac = 
    //	new Account("ACC0011","홍길동",1000,"2023-09-21");
}

class Product {
    String productCode;
    String productName;
    int price;
    int stockQuantity;
    String manufacturer;

    Product(String productCode, String productName, int price, int stockQuantity, String manufacturer) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.manufacturer = manufacturer;
    }
}

class Movie {
    String title;
    String director;
    String actor;
    String releaseDate;
    int runningTime;
    String genre;

    Movie() {}
    Movie(String title, String director, String actor,
    		String releaseDate, int runningTime, 
    		String genre) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.releaseDate = releaseDate;
        this.runningTime = runningTime;
        this.genre = genre;
    }
    // Movie m01 = new Movie();
    // Movie m02 = new Movie("영화1","감독명","주연","09/21",
    //                      120, "르느와르");
}

class Athlete {
    String name;
    String sportType;
    String teamName;
    String position;
    int careerYears;
    int playerNumber;

    Athlete() {}

    Athlete(String name, String sportType, String teamName, String position, int careerYears, int playerNumber) {
        this.name = name;
        this.sportType = sportType;
        this.teamName = teamName;
        this.position = position;
        this.careerYears = careerYears;
        this.playerNumber = playerNumber;
    }
}

class MusicTrack {
    String songTitle;
    String artist;
    String playTime;
    String genre;
    String genre1;
    // 매개변수가 2개일 때,
    MusicTrack(String songTitle, String artist) {
        this.songTitle = songTitle;
        this.artist = artist;
    }
    // 매개변수 4개일 때..
    // 생성자나 메서드는 호출시 매개변수의 갯수로 식별하여
    // 호출이 가능하기 때문에 동일한 이름이라도 선언할 수 있다.
    MusicTrack(String songTitle, String artist, 
    			String playTime, String genre) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.playTime = playTime;
        this.genre = genre;
    }
}
class Animal {
    String name;
    String type;
    int age;
    double weight;
    String color;

    Animal(String name) {
        this.name = name;
    }

    Animal(String name, int age, 
    		double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
}

class UserProfile {
    String userId;
    String password;
    String name;
    String email;
    String contact;
    String dob;

    UserProfile(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    UserProfile(String userId, String password, String name, String email) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
    }
}
