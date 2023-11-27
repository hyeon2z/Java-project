package javaexp.z02_homework.a04_asy;

import javaexp.z02_homework.a04_asy.vo.Bank;
import javaexp.z02_homework.a04_asy.vo.Book;
import javaexp.z02_homework.a04_asy.vo.Car;
import javaexp.z02_homework.a04_asy.vo.Coffee;
import javaexp.z02_homework.a04_asy.vo.Game;
import javaexp.z02_homework.a04_asy.vo.Pen;
import javaexp.z02_homework.a04_asy.vo.Phone;
import javaexp.z02_homework.a04_asy.vo.Rectangle;
import javaexp.z02_homework.a04_asy.vo.Student;
import javaexp.z02_homework.a04_asy.vo.Travel;

public class A0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			1. **책 클래스**
//			    - 필드: 제목, 저자, 가격, 출판년도
//			    - 생성자: 모든 필드 초기화
//			    - 메서드: 도서 정보 출력, 가격 변경
				System.out.println("# 책 정보 #");
				Book b1 = new Book("백설공주","홍길동",600,2023);
				System.out.println("책제목:"+b1.getName());
				System.out.println("저자:"+b1.getName2());
				System.out.println("가격:"+b1.getPrice()+"원");
				System.out.println("출판년도:"+b1.getYear()+"년");
				//println->Book class에 따로 출력 되있으므로 안해두됨.
//				b1.setName("책제목뭐하지");
//				b1.setName2("김길동");
//				b1.setPrice(300);
//				b1.setYear(2000);
//				b1.bookInfo(); //최종적으로 메서드호출 해줘야 불려와짐
			
//			2. **계좌 클래스**
//			    - 필드: 계좌번호, 예금주, 잔액
//			    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
//			    - 메서드: 입금, 출금, 잔액 확인
				System.out.println("\n# 계좌 정보 #");
				Bank b2 = new Bank("1234-4567-8911","홍길동",0);
				System.out.println("계좌번호:"+b2.getNumber());
				System.out.println("예금주:"+b2.getName());
				b2.setAmount(1000); //잔액
				System.out.println("잔액:"+b2.getAmount()+"원");
//				b2.bankInfo(); //메서드호출
//				b2.setPrice(0);
//			3. **학생 클래스**
//			    - 필드: 학번, 이름, 성적
//			    - 생성자: 학번과 이름 초기화
//			    - 메서드: 성적 입력, 성적 조회, 정보 출력
			System.out.println("\n# 학생 정보 #");
				Student st1 = new Student(13,"김철수",100);
				System.out.println("학번:"+st1.getNumber());
				System.out.println("이름:"+st1.getName());
				System.out.println("성적:"+st1.getPoint()+"점");
//			4. **사각형 클래스**
//			    - 필드: 가로, 세로
//			    - 생성자: 가로와 세로 초기화
//			    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
				System.out.println("\n# 사각형 정보 #");
				Rectangle r1 = new Rectangle();
				System.out.println("가로:"+r1.getA()+"cm");
				System.out.println("세로:"+r1.getB()+"cm");
				System.out.println("넓이:"+r1.getA()*r1.getB()+"cm");
				System.out.println("둘레:"+(2*(r1.getA()+r1.getB()))+"cm");
//			5. **차량 클래스**
//			    - 필드: 차량 번호, 모델, 연식
//			    - 생성자: 차량 번호, 모델 초기화
//			    - 메서드: 연식 변경, 정보 출력
				System.out.println("");
				Car car = new Car("12가3678","제네시스",2000);
//				car.setNumber("책제목뭐하지");
//				car.setName2("김길동");
//				car.setPrice(300);
				car.setYear(2023);	//연식 변경
				car.carInfo();
//			6. **커피 클래스**
//			    - 필드: 종류, 가격, 원산지
//			    - 생성자: 종류 초기화
//			    - 메서드: 가격 변경, 원산지 입력, 정보 출력
				System.out.println("");
				Coffee cf = new Coffee("아메리카노",4000,"케냐");
				cf.setPrice(5000);	// 가격변경
				cf.coffeeInfo();
//			7. **여행 정보 클래스**
//			    - 필드: 목적지, 출발일, 도착일
//			    - 생성자: 모든 필드 초기화
//			    - 메서드: 여행 일수 계산, 정보 출력
				System.out.println("\n# 여행 정보 #");
				Travel t = new Travel("일본",22,28);
				System.out.println("목적지:"+t.getPurpose());
				System.out.println("출발일:2023년09월"+t.getArrival());
				System.out.println("도착일:2023년09월"+t.getDeparture());
				System.out.println("여행일수:"+(t.getDeparture()-t.getArrival()+1)+"일");
//			8. **스마트폰 클래스**
//			    - 필드: 브랜드, 모델, 가격
//			    - 생성자: 브랜드와 모델 초기화
//			    - 메서드: 가격 변경, 정보 출력
				System.out.println("");
				Phone phone= new Phone("아이폰","13pro",120);
				phone.setPrice(150);	// 가격변경
				phone.phoneInfo();
//			9. **게임 캐릭터 클래스**
//			    - 필드: 이름, 레벨, 체력
//			    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
//			    - 메서드: 레벨 업, 체력 회복, 정보 출력
				System.out.println("\n# 캐릭터 #");
				Game game = new Game("신짱구");
				System.out.println("이름:"+game.getName());
				game.setLevel(2); //레벨
				game.setVit(100); //체력
				System.out.println("Lv:"+game.getLevel());
				System.out.println("VIT:"+game.getVit());
//			10. **펜 클래스**
//			    - 필드: 색상, 브랜드, 가격
//			    - 생성자: 색상과 브랜드 초기화
//			    - 메서드: 가격 변경, 정보 출력
				System.out.println("");
				Pen pen= new Pen("검정","모나미",1000);
				pen.setPrice(1500);	// 가격변경
				pen.penInfo();
	}

}

	

