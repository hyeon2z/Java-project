package javaexp.z02_homework.a17_okw;

public class A0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	1. **도서 클래스**
	//	    - 필드: 제목, 저자, 가격, 출판년도
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 도서 정보 출력, 가격 변경
		System.out.println("# 1.도서 정보 #");
		Book1 b01 = new Book1("자바의정석","남궁성",24000,2019);
		b01.bookInfo();
	//	2. **계좌 클래스**
	//	    - 필드: 계좌번호, 예금주, 잔액
	//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
	//	    - 메서드: 입금, 출금, 잔액 확인
		System.out.println("# 2.계좌정보 #");
		Account1 a01 = new Account1("110356254205","오근우");
		a01.showBalance();
		a01.deposit();
		a01.deposit();
		int balance = a01.getBalance();
		System.out.println("잔액은"+balance+"원 입니다.");
	//	3. **학생 클래스**
	//	    - 필드: 학번, 이름, 성적
	//	    - 생성자: 학번과 이름 초기화
	//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		System.out.println("# 3.학생 정보 #");
		Student1 s01 = new Student1(202312990,"오근우");
		s01.setStuGrade("A+");
		s01.stuInfo();
		
	//	4. **사각형 클래스**
	//	    - 필드: 가로, 세로
	//	    - 생성자: 가로와 세로 초기화
	//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		System.out.println("# 4.사각형 정보 #");
		Rectangle r01 = new Rectangle(5,4);
		r01.rectInfo();
	//	5. **차량 클래스**
	//	    - 필드: 차량 번호, 모델, 연식
	//	    - 생성자: 차량 번호, 모델 초기화
	//	    - 메서드: 연식 변경, 정보 출력
		System.out.println("# 5.차량 정보 #");
		Car1 c01 = new Car1("01모 2244","아반떼");
		c01.carInfo();
		c01.setCarYears(5);			// 연식 변경
		c01.carInfo();
	//	6. **커피 클래스**
	//	    - 필드: 종류, 가격, 원산지
	//	    - 생성자: 종류 초기화
	//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		System.out.println("# 6.커피 정보 #");
		Coffee1 cf1 = new Coffee1("아메리카노");
		cf1.setPrice(3000);
		cf1.cofInfo();
	//	7. **여행 정보 클래스**
	//	    - 필드: 목적지, 출발일, 도착일
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 여행 일수 계산, 정보 출력
		System.out.println("# 7.여행 정보 #");
		Travel1 tr1 = new Travel1("파푸아뉴기니",15,27);
		tr1.travelInfo();
	//	8. **스마트폰 클래스**
	//	    - 필드: 브랜드, 모델, 가격
	//	    - 생성자: 브랜드와 모델 초기화
	//	    - 메서드: 가격 변경, 정보 출력
		System.out.println("# 8.스마트폰 정보 #");
		SmartPhone1 sp1 = new SmartPhone1("갤럭시", "Z flip4");
		sp1.phoneInfo();
		sp1.setPrice(900000);	// 가격 변경
		sp1.phoneInfo();
	//	9. **게임 캐릭터 클래스**
	//	    - 필드: 이름, 레벨, 체력
	//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
	//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		System.out.println("# 9.게임 캐릭터 정보 #");
		GameChar gc01 = new GameChar("자바맨");
		gc01.gameInfo();
		gc01.levelUp();
		System.out.println("레벨업!");
		gc01.gameInfo();
		gc01.heal();
		System.out.println("체력 회복++");
		gc01.gameInfo();
		
		
	//	10. **펜 클래스**
	//	    - 필드: 색상, 브랜드, 가격
	//	    - 생성자: 색상과 브랜드 초기화
	//	    - 메서드: 가격 변경, 정보 출력
		System.out.println("# 10.펜 정보 #");
		Pen1 p01 = new Pen1("검은색","모나미");
		p01.penInfo();
		p01.setPrice(200);
		p01.penInfo();
	}

}
class Pen1{
	String color;
	String brand;
	int price=3000;
	public Pen1(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	public void penInfo() {
		System.out.println("색상:"+color);
		System.out.println("브랜드:"+brand);
		System.out.println("가격:"+price);
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
class GameChar{
	String name;
	int level;
	int hp;
	public GameChar(String name) {
		this.name = name;
		this.level = 1;
		this.hp = 1;
	}
	public void gameInfo() {
		System.out.println("캐릭터명:"+name);
		System.out.println("레벨:"+level);
		System.out.println("현재 체력:"+hp);
	}
	public void levelUp() {
		level++;
	}
	public void heal() {
		hp+=20;
	}
	
}
class SmartPhone1{
	String brand;
	String model;
	int price=800000;
	public SmartPhone1(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	public void phoneInfo() {
		System.out.println("브랜드명:"+brand);
		System.out.println("모델명:"+model);
		System.out.println("가격"+price);
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
class Travel1{
	String destination;
	int departDate;
	int arriveDate;
	public Travel1(String destination, int departDate, int arriveDate) {
		this.destination = destination;
		this.departDate = departDate;
		this.arriveDate = arriveDate;
	}
	public void travelInfo() {
		System.out.println("목적지:"+destination);
		System.out.println("출발일: 9월"+departDate+"일");
		System.out.println("도착일: 9월"+arriveDate+"일");
		System.out.println("여행일수:"+travelDate()+"일");
	}
	public int travelDate() {
		return arriveDate-departDate+1;
	}
	
}
class Coffee1{
	String type;
	int price;
	String origin = "콜롬비아";
	public Coffee1(String type) {
		this.type = type;
	}
	public void cofInfo() {
		System.out.println("종류:"+type);
		System.out.println("가격:"+ price);
		System.out.println("원산지:"+origin);
	}
	public String getOrigin(String origin) {
		return origin;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
class Car1{
	String carNum;
	String carModel;
	int carYears;
	public Car1(String carNum, String carModel) {
		this.carNum = carNum;
		this.carModel = carModel;
	}
	public void carInfo() {
		System.out.println("차량번호:"+carNum);
		System.out.println("모델:"+carModel);
		System.out.println("연식:"+carYears);
	}
	public void setCarYears(int carYears) {
		this.carYears = carYears;
	}
	
}
class Rectangle{
	double width;
	double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public void rectInfo() {
		System.out.println("가로:"+width);
		System.out.println("세로:"+height);
		System.out.println("넓이:"+getArea());
		System.out.println("둘레:"+getRound());
	}
	public double getArea() {
		return width*height;
	}
	public double getRound() {
		return 2*(width+height);
	}
	
}
class Student1{
	int stuNo;
	String stuName;
	String stuGrade;
	public Student1(int stuNo, String stuName) {
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	public void stuInfo(){
		System.out.println("학번:"+stuNo);
		System.out.println("이름:"+stuName);
		System.out.println("성적:"+stuGrade);
	}
	public String getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(String stuGrade) {
		this.stuGrade = stuGrade;
	}
	
	
}
class Account1 {
	private String accNum;
	private String accOwner;
	private int balance;
	public Account1(String accNum, String accOwner) {
		this.accNum = accNum;
		this.accOwner = accOwner;
		this.balance = 0;
	}
	public void showBalance() {
		System.out.println(accOwner+"님의 현재 잔액은 "+balance+"원 입니다.");
	}
	public void deposit() {
		balance += 100000;
		showBalance();
	}
	public void withdraw() {
		balance -= 100000;
		showBalance();
	}
	public int getBalance() {
		return balance;
	}
	
	
}
class Book1 {
	String title;
	String author;
	int price;
	int year;
	public Book1(String title, String author, int price, int year) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.year = year;
	}
	public void bookInfo() {
		System.out.println("제목:"+title);
		System.out.println("작가:"+author);
		System.out.println("가격:"+price);
		System.out.println("출판년도:"+year);
	}
	public void setPrice(int price) {
		this.price = price;
	}
}