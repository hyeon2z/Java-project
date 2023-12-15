package javaexp.z02_homework.a01_kjh;

import javaexp.z02_homework.a01_kjh.vo.Bank;
import javaexp.z02_homework.a01_kjh.vo.Book;
import javaexp.z02_homework.a01_kjh.vo.Car;
import javaexp.z02_homework.a01_kjh.vo.Coffee;
import javaexp.z02_homework.a01_kjh.vo.Game;
import javaexp.z02_homework.a01_kjh.vo.Pen;
import javaexp.z02_homework.a01_kjh.vo.SmartPhone;
import javaexp.z02_homework.a01_kjh.vo.Square;
import javaexp.z02_homework.a01_kjh.vo.Student;
import javaexp.z02_homework.a01_kjh.vo.Travle;

public class A0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	1. **도서 클래스**
	//	    - 필드: 제목, 저자, 가격, 출판년도
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 도서 정보 출력, 가격 변경
		Book bo1 = new Book("JAVA", "김길동", 16000, 2020);
		bo1.bookInfo();
		bo1.setPrice(25000); // 도서 가격 변경
		System.out.println("변경 후 가격 : " + bo1.getPrice());
		
		System.out.println();
		
	//	2. **계좌 클래스**
	//	    - 필드: 계좌번호, 예금주, 잔액
	//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
	//	    - 메서드: 입금, 출금, 잔액 확인
		Bank ba1 = new Bank(81610200543L, "배길동", 100000);
		ba1.bankInfo();
		ba1.inMoney(50000);
		ba1.outMoney(60000);
		System.out.println("현재 잔액 : " + ba1.getMoney());
		
		System.out.println();
		
	//	3. **학생 클래스**
	//	    - 필드: 학번, 이름, 성적
	//	    - 생성자: 학번과 이름 초기화
	//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		Student st01 = new Student(190521, "고길동");
		st01.setGrade(100);
		System.out.println("성적조회 : " + st01.getGrade() + "\n");
		
		st01.stuInfo();
		
		System.out.println();
		
	//	4. **사각형 클래스**
	//	    - 필드: 가로, 세로
	//	    - 생성자: 가로와 세로 초기화
	//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		Square sq01 = new Square(15, 17);
		sq01.sqInfo();
		
		System.out.println();
		
	//	5. **차량 클래스**
	//	    - 필드: 차량 번호, 모델, 연식
	//	    - 생성자: 차량 번호, 모델 초기화
	//	    - 메서드: 연식 변경, 정보 출력
		Car ca01 = new Car("12서울3456", "아반떼");
		ca01.setYear(2023);
		ca01.carInfo();
		
		System.out.println();
		
	//	6. **커피 클래스**
	//	    - 필드: 종류, 가격, 원산지
	//	    - 생성자: 종류 초기화
	//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		Coffee co01 = new Coffee("아메리카노");
		co01.setPrice(5000);
		co01.setFrom("한국");
		co01.cofInfo();
		
		System.out.println();
		
	//	7. **여행 정보 클래스**
	//	    - 필드: 목적지, 출발일, 도착일
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 여행 일수 계산, 정보 출력
		Travle tra01 = new Travle("일본", 230901, 230927);
		tra01.traInfo();
		
		System.out.println();
		
	//	8. **스마트폰 클래스**
	//	    - 필드: 브랜드, 모델, 가격
	//	    - 생성자: 브랜드와 모델 초기화
	//	    - 메서드: 가격 변경, 정보 출력
		SmartPhone sp01 = new SmartPhone("Apple", "Iphone15");
		sp01.setPrice(1500000);
		sp01.smartInfo();
		
		System.out.println();
		
	//	9. **게임 캐릭터 클래스**
	//	    - 필드: 이름, 레벨, 체력
	//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
	//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		Game g01 = new Game("용사", 1, 1);
		g01.getLevel();
		g01.setHp(100);
		g01.gameInfo();
		
		System.out.println();
		
	//	10. **펜 클래스**
	//	    - 필드: 색상, 브랜드, 가격
	//	    - 생성자: 색상과 브랜드 초기화
	//	    - 메서드: 가격 변경, 정보 출력
		Pen p01 = new Pen("black", "monami");
		p01.setPrice(3000);
		p01.penInfo();
		
		
	}

}
