package javaexp.z02_homework.a06_psj;

import javaexp.z02_homework.a06_psj.vo.Account;
import javaexp.z02_homework.a06_psj.vo.Book;
import javaexp.z02_homework.a06_psj.vo.Car;
import javaexp.z02_homework.a06_psj.vo.Character;
import javaexp.z02_homework.a06_psj.vo.Coffee;
import javaexp.z02_homework.a06_psj.vo.SmartPhone;
import javaexp.z02_homework.a06_psj.vo.Student;
import javaexp.z02_homework.a06_psj.vo.Travel;
import javaexp.z02_homework.a06_psj.vo.square;

public class A0921_Homework {

	public static void main(String[] args) {
		//	1. **도서 클래스**
		//	    - 필드: 제목, 저자, 가격, 출판년도
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 도서 정보 출력, 가격 변경
		//
			Book b1 = new Book("삼국지","나관중",10000,2000);
			b1.setPrice(8500);
			b1.BookInfo();
		//	2. **계좌 클래스**
		//	    - 필드: 계좌번호, 예금주, 잔액
		//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
		//	    - 메서드: 입금, 출금, 잔액 확인
		//	
			Account acc1 = new Account(3560947, "박성중");
			acc1.addMoney(50000000);
			acc1.minusMoney(1000000);
			acc1.AccInfo();
		//	3. **학생 클래스**
		//	    - 필드: 학번, 이름, 성적
		//	    - 생성자: 학번과 이름 초기화
		//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		//	
			Student st1 = new Student(20175313, "박성중");
			st1.setScore(90);
			System.out.println("\n당신의 성적은: "+st1.getScore());
			st1.StuInfo();
			
		//	4. **사각형 클래스**
		//	    - 필드: 가로, 세로
		//	    - 생성자: 가로와 세로 초기화
		//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		//	
			square sq1 = new square(10,20);
			System.out.println("\n넓이: "+sq1.sqArea());
			System.out.println("둘레: "+sq1.sqRound());
			sq1.sqInfo();
			
		//	5. **차량 클래스**
		//	    - 필드: 차량 번호, 모델, 연식
		//	    - 생성자: 차량 번호, 모델 초기화
		//	    - 메서드: 연식 변경, 정보 출력
		//	
			Car c5 = new Car(7979, "이쿼녹스");
			c5.setYear(2019);
			c5.carInfo();
			
		//	6. **커피 클래스**
		//	    - 필드: 종류, 가격, 원산지
		//	    - 생성자: 종류 초기화
		//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		//	
			Coffee co6 = new Coffee("케냐AA");
			co6.setPrice(25000);
			co6.setOrigin("케냐");
			co6.coffeeInfo();
			
		//	7. **여행 정보 클래스**
		//	    - 필드: 목적지, 출발일, 도착일
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 여행 일수 계산, 정보 출력
		//	
			Travel t7 = new Travel("나리타",21,27);
			t7.day();
			t7.travelInfo();
		//	8. **스마트폰 클래스**
		//	    - 필드: 브랜드, 모델, 가격
		//	    - 생성자: 브랜드와 모델 초기화
		//	    - 메서드: 가격 변경, 정보 출력
			SmartPhone sm8 = new SmartPhone("삼성", "갤럭시S23");
			sm8.setPrice(1200000);
			sm8.phoneInfo();
		//	
		//	9. **게임 캐릭터 클래스**
		//	    - 필드: 이름, 레벨, 체력
		//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
		//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		//	
			Character c9 = new Character("akaps");
			c9.levelUp(5);
			c9.hpUp(500);
			c9.chaInfo();
			
		//	10. **펜 클래스**
		//	    - 필드: 색상, 브랜드, 가격
		//	    - 생성자: 색상과 브랜드 초기화
		//	    - 메서드: 가격 변경, 정보 출력
	}

}
