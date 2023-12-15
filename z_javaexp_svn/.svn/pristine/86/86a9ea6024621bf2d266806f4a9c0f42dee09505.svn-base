package javaexp.z02_homework.a14_cms;
import javaexp.z02_homework.a14_cms.vo.Book;
import javaexp.z02_homework.a14_cms.vo.Account;
import javaexp.z02_homework.a14_cms.vo.Student;
import javaexp.z02_homework.a14_cms.vo.Rectangle;
import javaexp.z02_homework.a14_cms.vo.Phone;
import javaexp.z02_homework.a14_cms.vo.Coffee;
import javaexp.z02_homework.a14_cms.vo.Travel;
import javaexp.z02_homework.a14_cms.vo.Car;
import javaexp.z02_homework.a14_cms.vo.Game;
import javaexp.z02_homework.a14_cms.vo.Pen;



public class A0921 {
	
	//class는 a14_cms_0921 package에 있습니다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. **도서 클래스**
		//	    - 필드: 제목, 저자, 가격, 출판년도
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 도서 정보 출력, 가격 변경
		Book b1 = new Book("자바기초", "홍길동", 12000, "2020년 5월 30일");
		b1.showBookInfo();
		b1.setPrice(10000);
		System.out.println("가격 변경 후 책 정보");
		b1.showBookInfo();
		//	
		//	2. **계좌 클래스**
		//	    - 필드: 계좌번호, 예금주, 잔액
		//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
		//	    - 메서드: 입금, 출금, 잔액 확인
		Account a01 = new Account("01011111111", "홍길동");
		a01.accountInfo();
		a01.getBalance();
		a01.depositAccount(20000);
		a01.withdrawalAccount(1000);
		System.out.println("입출금 후 잔액");
		a01.getBalance();
		
		//	
		//	3. **학생 클래스**
		//	    - 필드: 학번, 이름, 성적
		//	    - 생성자: 학번과 이름 초기화
		//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		Student s01 = new Student(121212, "홍길동");
		s01.inputGrade("A학점");
		s01.getGrade();
		s01.studentInfo();
		//	
		//	4. **사각형 클래스**
		//	    - 필드: 가로, 세로
		//	    - 생성자: 가로와 세로 초기화
		//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		Rectangle r01 = new Rectangle(12, 13);
		r01.getArea();
		r01.getCircumference();
		r01.showRectangleInfo();
		//	
		//	5. **차량 클래스**
		//	    - 필드: 차량 번호, 모델, 연식
		//	    - 생성자: 차량 번호, 모델 초기화
		//	    - 메서드: 연식 변경, 정보 출력
		Car c01 = new Car("10아 1234", "메르세데스 벤츠");
		c01.setYear(1);
		c01.showCarInfo();
		//	
		//	6. **커피 클래스**
		//	    - 필드: 종류, 가격, 원산지
		//	    - 생성자: 종류 초기화
		//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		
		Coffee cf01 = new Coffee("커피종류모르는데");
		cf01.setPrice(4500);
		cf01.setOrigin("콜롬비아");
		cf01.showCoffeeInfo();
		//	
		//	7. **여행 정보 클래스**
		//	    - 필드: 목적지, 출발일, 도착일
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 여행 일수 계산, 정보 출력
		Travel t1 = new Travel("제주도", 20230910, 20230920);
		t1.showTravleInfo();
		t1.getTravelDay();
		//	
		//	8. **스마트폰 클래스**
		//	    - 필드: 브랜드, 모델, 가격
		//	    - 생성자: 브랜드와 모델 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		
		Phone p1 = new Phone("삼성전자", "Galaxy23");
		p1.setPrice(1200000);
		p1.showPhoneInfo();
		
		//	
		//	9. **게임 캐릭터 클래스**
		//	    - 필드: 이름, 레벨, 체력
		//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
		//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		
		Game g01 = new Game("디봉");
		g01.increLevel();
		g01.healHp();
		g01.showGameInfo();
		//	
		//	10. **펜 클래스**
		//	    - 필드: 색상, 브랜드, 가격
		//	    - 생성자: 색상과 브랜드 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		
		Pen pen01 = new Pen("핑크색", "제트스트림");
		pen01.setPrice(1500);
		pen01.showPenInfo();
		

	}

}
