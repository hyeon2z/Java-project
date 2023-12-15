package javaexp.z02_homework.a19_cjw;

import javaexp.z02_homework.a19_cjw.vo.Book;
import javaexp.z02_homework.a19_cjw.vo.Account;
import javaexp.z02_homework.a19_cjw.vo.Student;
import javaexp.z02_homework.a19_cjw.vo.Rectangle;
import javaexp.z02_homework.a19_cjw.vo.Car;
import javaexp.z02_homework.a19_cjw.vo.Coffee;
import javaexp.z02_homework.a19_cjw.vo.Character;
import javaexp.z02_homework.a19_cjw.vo.Travel;
import javaexp.z02_homework.a19_cjw.vo.Smartphone;
import javaexp.z02_homework.a19_cjw.vo.Pen;

public class A0921_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1. **도서 클래스**
			- 필드: 제목, 저자, 가격, 출판년도
			- 생성자: 모든 필드 초기화
			- 메서드: 도서 정보 출력, 가격 변경
			
		2. **계좌 클래스**
			- 필드: 계좌번호, 예금주, 잔액
			- 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
			- 메서드: 입금, 출금, 잔액 확인
			
		3. **학생 클래스**
			- 필드: 학번, 이름, 성적
			- 생성자: 학번과 이름 초기화
			- 메서드: 성적 입력, 성적 조회, 정보 출력
			
		4. **사각형 클래스**
			- 필드: 가로, 세로
			- 생성자: 가로와 세로 초기화
			- 메서드: 넓이 계산, 둘레 계산, 정보 출력
			
		5. **차량 클래스**
			 - 필드: 차량 번호, 모델, 연식
			 - 생성자: 차량 번호, 모델 초기화
			 - 메서드: 연식 변경, 정보 출력
			
		6. **커피 클래스**
			- 필드: 종류, 가격, 원산지
			- 생성자: 종류 초기화
			- 메서드: 가격 변경, 원산지 입력, 정보 출력
			
		7. **여행 정보 클래스**
			- 필드: 목적지, 출발일, 도착일
			- 생성자: 모든 필드 초기화
			- 메서드: 여행 일수 계산, 정보 출력
			
		8. **스마트폰 클래스**
			- 필드: 브랜드, 모델, 가격
			- 생성자: 브랜드와 모델 초기화
			- 메서드: 가격 변경, 정보 출력
			
		9. **게임 캐릭터 클래스**
			- 필드: 이름, 레벨, 체력
			- 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
			- 메서드: 레벨 업, 체력 회복, 정보 출력
			
		10. **펜 클래스**
			- 필드: 색상, 브랜드, 가격
			- 생성자: 색상과 브랜드 초기화
			- 메서드: 가격 변경, 정보 출력
		 * */
		
		System.out.println("#1");
		Book b01 = new Book("제목","작가",10000,"2023.09.21");
		b01.bookInfo();
		b01.setPrice(13000);
		System.out.println("변경된 가격: "+b01.getPrice());
		System.out.println();
		
		System.out.println("#2");
		Account a01 = new Account(123123,"홍길동",0);
		System.out.println(a01.inputmoney());
		System.out.println(a01.outputmoney());
		System.out.println(a01.getActmoney()+"\n");
		
		System.out.println("#3");
		Student s01 = new Student(1,"홍길동");
		System.out.println(s01.inputpoint());		
		s01.studentInfo();
		System.out.println(s01.getPoint());
		System.out.println();
		
		System.out.println("#4");
		Rectangle r01 = new Rectangle(5,4);
		System.out.println(r01.area());
		System.out.println(r01.length());
		r01.rectangleInfo();
		System.out.println();
		
		System.out.println("#5");
		Car c01 = new Car(1234,"아반떼");
		c01.setAge(3);
		c01.carInfo();
		System.out.println();
		
		System.out.println("#6");
		Coffee c02 = new Coffee("아라비카");
		c02.setPrice(3000);
		System.out.println(c02.chmade());
		c02.coffeeInfo();
		System.out.println();
		
		System.out.println("#7");
		Travel t01 = new Travel("방콕",12,25);
		System.out.println(t01.traveldate());
		t01.travelInfo();
		System.out.println();
		
		System.out.println("#8");
		Smartphone p01 = new Smartphone("삼성","s10");
		p01.setPrice(10000);
		p01.phoneInfo();
		System.out.println();
		
		System.out.println("#9");
		Character g01 = new Character("홍길동",0,100);
		System.out.println(g01.levelup());
		System.out.println(g01.recoverhp());
		g01.charInfo();
		System.out.println();
		
		System.out.println("#10");
		Pen p02 = new Pen("검은색","jetstream");
		p02.setPrice(1800);
		p02.penInfo();
		
	}

}
