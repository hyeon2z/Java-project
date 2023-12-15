package javaexp.z02_homework.a16_jsr;

public class A0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	1. **도서 클래스**
	//	    - 필드: 제목, 저자, 가격, 출판년도
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 도서 정보 출력, 가격 변경
		Book02 b =new Book02("자바배우기", "정서라", 27000, 2);
		b.bookInfo();
		b.setPrice(25000);
		
	//	2. **계좌 클래스**
	//	    - 필드: 계좌번호, 예금주, 잔액
	//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
	//	    - 메서드: 입금, 출금, 잔액 확인
		Bank02 b02=new Bank02("123456-78945", "홍길동");
		b02.balanceInfo();
		b02.addMoney(500000);
		b02.minusMoney(7000);
		
	//	3. **학생 클래스**
	//	    - 필드: 학번, 이름, 성적
	//	    - 생성자: 학번과 이름 초기화
	//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		Student st=new Student(5, "강수연");
		st.studentInfo();
		st.setScore(95);
		
	//	4. **사각형 클래스**
	//	    - 필드: 가로, 세로
	//	    - 생성자: 가로와 세로 초기화
	//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		Triangle tr=new Triangle(10, 2);
		tr.traiangleInfo();
		System.out.println("넓이는:"+tr.getArea());
		System.out.println("둘레는:"+tr.getCir());
		
	//	5. **차량 클래스**
	//	    - 필드: 차량 번호, 모델, 연식
	//	    - 생성자: 차량 번호, 모델 초기화
	//	    - 메서드: 연식 변경, 정보 출력
		Car02 car = new Car02(1234, "쏘나타");
		car.carInfo();
		car.setYear(3);
		
	//	6. **커피 클래스**
	//	    - 필드: 종류, 가격, 원산지
	//	    - 생성자: 종류 초기화
	//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		Coffee co = new Coffee("아메리카노");
		co.CoffeeInfo();
		co.setBorn("에티오피아");
		co.setPrice(4500);
		co.CoffeeInfo();
		
	//	7. **여행 정보 클래스**
	//	    - 필드: 목적지, 출발일, 도착일
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 여행 일수 계산, 정보 출력
		Trip t = new Trip("일본", 20240301, 20240305);
		t.day();
		t.tripInfo();
	//	
	//	8. **스마트폰 클래스**
	//	    - 필드: 브랜드, 모델, 가격
	//	    - 생성자: 브랜드와 모델 초기화
	//	    - 메서드: 가격 변경, 정보 출력
		Phone p=new Phone("애플", "아이폰14프로");
		p.setPrice(1500000);
		p.phonInfo();
	//	
	//	9. **게임 캐릭터 클래스**
	//	    - 필드: 이름, 레벨, 체력
	//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
	//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		Character c = new Character("뽀로로");
		c.characterInfo();
		c.levelUp();
		c.characterInfo();
	//	
	//	10. **펜 클래스**
	//	    - 필드: 색상, 브랜드, 가격
	//	    - 생성자: 색상과 브랜드 초기화
	//	    - 메서드: 가격 변경, 정보 출력
		Pen p2=new Pen("빨강", "지브라");
		p2.setPrice(12000);
		p2.penInfo();

	}

}

class Bank02{
	//계좌번호, 예금주, 잔액
		private String account;
		private String name;
		private int balance;
		
		public Bank02(String account, String name) {
			this.account = account;
			this.name = name;
		}
		//입금, 출금, 잔액 확인
		public void addMoney(int balance) {
			this.balance+=balance;
			balanceInfo();
		}
		
		public void minusMoney(int balance) {
			this.balance-=balance;
			balanceInfo();
		}
		
		
		public void balanceInfo() {
			System.out.println("현재 잔액은:"+balance);
		}
	}

class Book02 {
//	제목, 저자, 가격, 출판년도
	private String title;
	private String name;
	private int price;
	private int year;
	
	public Book02(String title, String name, int price, int year) {
		this.title = title;
		this.name = name;
		this.price = price;
		this.year = year;
	}
	public void bookInfo() {
		System.out.println("##도서 정보##");
		System.out.println("제목:"+title);
		System.out.println("저자:"+name);
		System.out.println("가격:"+price);
		System.out.println("출판년도"+year);
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
class Car02 {
	//차량 번호, 모델, 연식
		private int num;
		private String brand;
		private int year;
		
		public Car02(int num, String brand) {
			this.num = num;
			this.brand = brand;
		}
		
		//연식 변경, 정보 출력
		public void carInfo() {
			System.out.println("##차량 정보##");
			System.out.println("번호:"+num);
			System.out.println("모델:"+brand);
			System.out.println("연식:"+year);
		}

		public void setYear(int year) {
			this.year = year;
			carInfo();
		}
		
	}

class Character {
	//이름, 레벨, 체력
		private String name;
		private int level;
		private int power;
		
		public Character(String name) {
			this.name = name;
			level = 1;
			power = 1;
		}
		//레벨 업, 체력 회복, 정보 출력
		public void levelUp() {
			level+=1;
			System.out.println("레벨 +1 상승!");
		}
		public void powerCharge() {
			power = 1;
			System.out.println("체력회복!");
		}
		public void characterInfo() {
			System.out.println("##캐릭터 정보##");
			System.out.println("이름:"+name);
			System.out.println("레벨:"+level);
			System.out.println("체력:"+power);
		}
	}
class Coffee{
	//종류, 가격, 원산지
		private String coffee;
		private int price;
		private String born;
		
		//가격 변경, 원산지 입력, 정보 출력
		public Coffee(String coffee) {
			this.coffee = coffee;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public void setBorn(String born) {
			this.born = born;
		}
		
		public void CoffeeInfo() {
			System.out.println("##커피 정보##");
			System.out.println("종류:"+coffee);
			System.out.println("가격:"+price);
			System.out.println("원산지:"+born);
		}
		
	}
class Pen {
	//색상, 브랜드, 가격
		private String color;
		private String brand;
		private int price;
		
		public Pen(String color, String brand) {
			this.color = color;
			this.brand = brand;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		public void penInfo() {
			System.out.println("##핸드폰 정보##");
			System.out.println("색상:"+color);
			System.out.println("브랜드:"+brand);
			System.out.println("가격:"+price);
		}
		
		//가격 변경, 정보 출력
	}
class Phone {
	//브랜드, 모델, 가격
		private String brand;
		private String model;
		private int price;
		
		public Phone(String brand, String model) {
			this.brand = brand;
			this.model = model;
		}
//		가격 변경, 정보 출력
		public void phonInfo() {
			System.out.println("##핸드폰 정보##");
			System.out.println("브랜드:"+brand);
			System.out.println("모델:"+model);
			System.out.println("가격:"+price);
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
	}
class Student {
	//학번, 이름, 성적
		private int no;
		private String name;
		private int score;
		
		public Student(int no, String name) {
			this.no = no;
			this.name = name;
		}
		
		//성적 입력, 성적 조회, 정보 출력
		public void studentInfo() {
			System.out.println("##학생 정보##");
			System.out.println("학번:"+no);
			System.out.println("이름:"+name);
			System.out.println("성적:"+score);
		}
		
		
		public void setScore(int score) {
			this.score = score;
			scoreInfo();
		}

		public void scoreInfo() {
			System.out.println(name+" 학생의 성적은 "+score+"점 입니다.");
		}
	}

class Triangle {
	//가로, 세로
		private double width;
		private double height;
		
		public Triangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
		
		//넓이 계산, 둘레 계산##, 정보 출력
		public void traiangleInfo() {
			System.out.println("##삼각형 정보##");
			System.out.println("밑변:"+width);
			System.out.println("높이:"+height);
		}
		public double getArea() {
			return width*height/2;
		}
		public double getCir() {
			return width+height;
		}
		
	}

class Trip {
	//목적지, 출발일, 도착일
		private String destination;
		private int start;
		private int arrival;
		
		public Trip(String destination, int start, int arrival) {
			this.destination = destination;
			this.start = start;
			this.arrival = arrival;
		}
		//여행 일수 계산, 정보 출력
		public void tripInfo() {
			System.out.println("##여행 정보##");
			System.out.println("목적지:"+destination);
			System.out.println("출발일:"+start);
			System.out.println("도착일:"+arrival);
			System.out.println("여행일수:"+day());
			
		}
		
		public int day() {
			return arrival-start;
			
		}
	}
