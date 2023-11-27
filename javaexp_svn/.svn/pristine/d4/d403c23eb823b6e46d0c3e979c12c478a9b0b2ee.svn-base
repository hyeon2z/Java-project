/*
------------------------------------------------------------------------------------------------------------
과제시작
------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	1. **도서 클래스**
		//	    - 필드: 제목, 저자, 가격, 출판년도
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 도서 정보 출력, 가격 변경
		//	
		
		Book myBook=new Book("자바의정석","남궁성",25000,2023);
		myBook.showInfo();
		System.out.println("\n가격이 5000원 할인되었습니다.\n");
		myBook.setPrice(20000);
		myBook.showInfo();

	}

}

class Book
{
	private String title;
	private String author;
	private int price;
	private int published;
	
	public Book(String title,String author,int price,int published)
	{
		this.title =title ;
		this.author =author ;
		this. price=price ;
		this. published= published;
	}
	
	public void showInfo()
	{
		System.out.println("title : "+title);
		System.out.println("author : "+author);
		System.out.println("price : "+price);
		System.out.println("published : "+published);
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
}
------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	2. **계좌 클래스**
		//	    - 필드: 계좌번호, 예금주, 잔액
		//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
		//	    - 메서드: 입금, 출금, 잔액 확인
		//	
		Account mine=new Account(3520318,"장선웅");
		System.out.print("나의 잔액");
		mine.check();
		
		mine.deposit(50000);
		mine.withdraw(3000);
		mine.check();
		
	}
}

class Account
{
	private int number;
	private String owner;
	private int money=0;
	
	public Account(int number,String owner)
	{
		this.number=number;
		this.owner=owner;
	}
	
	public void deposit(int plus)
	{
		System.out.println(plus+" 원 입금");
		money+=plus;
	}
	
	public void withdraw(int minus)
	{
		System.out.println(minus+" 원 출금");
		money-=minus;
	}
	
	public void check()
	{
		System.out.println("잔액 : "+money+"\n");
	}
	
}
------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	3. **학생 클래스**
		//	    - 필드: 학번, 이름, 성적
		//	    - 생성자: 학번과 이름 초기화
		//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		//	
		Student me=new Student(2018110523,"장선웅");
		me.showInfo();
		System.out.println("\n성적을 80점 받았다.");
		me.setScore(80);
		System.out.println("\n그러면 현재 성적은 "+me.getScore()+" 이다.\n");
		me.showInfo();
	}
}

class Student
{
	private long studentNumber;
	private String name;
	private int score;
	
	public Student(long studentNumber,String name)
	{
		this.studentNumber=studentNumber;
		this.name=name;
	}
	
	public void setScore(int score)
	{
		this.score=score;
	}
	public int getScore()
	{
		return score;
	}
	public void showInfo()
	{
		System.out.println("studentNumber : "+studentNumber);
		System.out.println("name : "+name);
		System.out.println("score : "+score);
	}
}
------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	4. **사각형 클래스**
		//	    - 필드: 가로, 세로
		//	    - 생성자: 가로와 세로 초기화
		//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		//	
		
		Rectangular shape=new Rectangular(5,7);
		shape.showInfo();
		System.out.println("넓이 : "+shape.area());
		System.out.println("둘레 : "+shape.around());
	}
}

class Rectangular
{
	private double x;
	private double y;
	
	public Rectangular(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double area()
	{
		return x*y;
	}
	
	public double around()
	{
		return 2*(x+y);
	}
	public void showInfo()
	{
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	5. **차량 클래스**
		//	    - 필드: 차량 번호, 모델, 연식
		//	    - 생성자: 차량 번호, 모델 초기화
		//	    - 메서드: 연식 변경, 정보 출력
		//	
		
		Car mycar=new Car(5000,"소나타");
		mycar.showInfo();
		System.out.println("연식을 2023으로 변경");
		mycar.setYear(2023);
		mycar.showInfo();
	}
}

class Car
{
	private int number;
	private String model;
	private int year;
	
	public Car(int number,String model)
	{
		this.number=number;
		this.model=model;
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}
	public void showInfo()
	{
		System.out.println("number : "+number);
		System.out.println("model : "+model);
		System.out.println("year : "+year);
	}
}

------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	6. **커피 클래스**
		//	    - 필드: 종류, 가격, 원산지
		//	    - 생성자: 종류 초기화
		//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		//	
		
		Coffee mine=new Coffee("아라비카");
		mine.showInfo();
		System.out.println("가격 변경");
		mine.setPrice(50000);
		System.out.println("원산지 변경");
		mine.setFrom("콜롬비아");
		mine.showInfo();
	}
}

class Coffee
{
	private String kind;
	private int price;
	private String from;
	
	public Coffee(String kind)
	{
		this.kind=kind;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void setFrom(String from)
	{
		this.from=from;
	}
	
	public void showInfo()
	{
		System.out.println("kind : "+kind);
		System.out.println("price : "+price);
		System.out.println("from : "+from);
	}
}
------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	7. **여행 정보 클래스**
		//	    - 필드: 목적지, 출발일, 도착일
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 여행 일수 계산, 정보 출력
		//	
		Tour mine=new Tour("캐나다",12,31);
		mine.showInfo();
		System.out.print("여행일수는 "+mine.days()+" 입니다.");
	}
}

class Tour
{
	private String destination;
	private int departure;
	private int arrival;

	public Tour(String destination,int departure, int arrival)
	{
		this.destination=destination;
		this.departure=departure;
		this.arrival=arrival;
	}
	public void showInfo()
	{
		System.out.println("destination : "+destination);
		System.out.println("departure : "+departure);
		System.out.println("arrival : "+arrival);
	}
	public int days()
	{
		return arrival-departure;
	}
}
------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	8. **스마트폰 클래스**
		//	    - 필드: 브랜드, 모델, 가격
		//	    - 생성자: 브랜드와 모델 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		//	
		Smartphone mine=new Smartphone("Apple","Iphone_14_plus");
		mine.showInfo();
		mine.setPrice(1500000);
		mine.showInfo();
	}
}

class Smartphone
{
	private String brand;
	private String model;
	private int price;
	
	public Smartphone(String brand, String model)
	{
		this.brand =brand;
		this.model =model;
	}
	
	public void setPrice(int price)
	{
		System.out.print("가격 변경 -> "+price+"\n");
		this.price=price;
	}
	public void showInfo()
	{
		System.out.println("brand : "+brand);
		System.out.println("model : "+model);
		System.out.println("price : "+price);
	}
	
}
------------------------------------------------------------------------------------------------------------
package Assignment20230921;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	9. **게임 캐릭터 클래스**
		//	    - 필드: 이름, 레벨, 체력
		//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
		//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		//	
		
		Game mine=new Game("gkendl");
		mine.showInfo();
		mine.levelUp(20);
		mine.healthup(500);
		mine.showInfo();
	}
}

class Game
{
	private String name;
	private int level=1;
	private int health=1;
	
	public Game(String name)
	{
		this.name=name;
	}
	
	public void levelUp(int num)
	{
		System.out.println("레벨이 "+ num+" 만큼 증가합니다.");
		this.level+=num;
	}
	public void healthup(int num)
	{
		System.out.println("체력이 "+ num+" 만큼 증가합니다.");
		this.health+=num;
	}
	public void showInfo()
	{
		System.out.println("name : "+name);
		System.out.println("level : "+level);
		System.out.println("health : "+health);
	}
}
------------------------------------------------------------------------------------------------------------

package javaexp.z02_homework.a08_jsw;

public class A01_0921 
{

	public static void main(String[] args) 
	{
		//	10. **펜 클래스**
		//	    - 필드: 색상, 브랜드, 가격
		//	    - 생성자: 색상과 브랜드 초기화
		//	    - 메서드: 가격 변경, 정보 출력

		Pen mine=new Pen("black","Jet Stream");
		mine.showInfo();
		mine.setPrice(1500);
		mine.showInfo();
	}
}

class Pen
{
	private String color;
	private String brand;
	private int price;
	
	public Pen(String color, String brand)
	{
		this.color=color;
		this.brand=brand;
	}
	
	public void setPrice(int price)
	{
		System.out.println(price+" 로 가격을 변경합니다.");
		this.price=price;
	}
	public void showInfo()
	{
		System.out.println("color : "+color);
		System.out.println("brand : "+brand);
		System.out.println("price : "+price);
	}
}
*/