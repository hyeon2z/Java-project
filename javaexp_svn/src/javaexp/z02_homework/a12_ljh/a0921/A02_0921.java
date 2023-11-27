package javaexp.z02_homework.a12_ljh.a0921;

import javaexp.z02_homework.a12_ljh.vo.Account;
import javaexp.z02_homework.a12_ljh.vo.BookInfo;
import javaexp.z02_homework.a12_ljh.vo.Rectangular;
import javaexp.z02_homework.a12_ljh.vo.Student;
import javaexp.z02_homework.a12_ljh.vo.Travel;
import javaexp.z02_homework.a12_ljh.vo.Car;
import javaexp.z02_homework.a12_ljh.vo.Coffee;
import javaexp.z02_homework.a12_ljh.vo.Game;
import javaexp.z02_homework.a12_ljh.vo.Pen;
import javaexp.z02_homework.a12_ljh.vo.Phone;

public class A02_0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	1. **도서 클래스**
//	    - 필드: 제목, 저자, 가격, 출판년도
//	    - 생성자: 모든 필드 초기화
//	    - 메서드: 도서 정보 출력, 가격 변경
		System.out.println("No1. **도서 클래스**");
		BookInfo b1 = new BookInfo("자바의 기초", "이준호", 27000, 2023);
		b1.showInfo();
		b1.changePrice();
		b1.showInfo();
		System.out.println();
		
//	
//	2. **계좌 클래스**
//	    - 필드: 계좌번호, 예금주, 잔액
//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
//	    - 메서드: 입금, 출금, 잔액 확인
		System.out.println("No2. **계좌 클래스**");
		Account a1 = new Account("1234567890", "이준호", 2300000);
		a1.AccountInfo();
		a1.AddMoney();
		a1.MinusMoney();
		a1.AccountInfo();
		System.out.println();
		
//		
//	
//	3. **학생 클래스**
//	    - 필드: 학번, 이름, 성적
//	    - 생성자: 학번과 이름 초기화
//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		System.out.println("No3. **학생 클래스**");
		Student stu1 = new Student(2016, "이준호", 85);
		stu1.showInfo();
		stu1.showScore();
		stu1.InputScore();
		stu1.showScore();
		stu1.showInfo();
		System.out.println();
		
//	
//	4. **사각형 클래스**
//	    - 필드: 가로, 세로
//	    - 생성자: 가로와 세로 초기화
//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		System.out.println("No4. **사각형 클래스**");
		Rectangular rect1 = new Rectangular(37, 52);
		rect1.getArea();
		rect1.getPerimeter();
		rect1.getRectInfo();
		System.out.println();
		
		
//	
//	5. **차량 클래스**
//	    - 필드: 차량 번호, 모델, 연식
//	    - 생성자: 차량 번호, 모델 초기화
//	    - 메서드: 연식 변경, 정보 출력
		
		System.out.println("No5. **차량 클래스**");
		Car car1 = new Car(7777, "아우디A8", 3);
		car1.showInfo();
		car1.changeYear();
		car1.showInfo();
		
		System.out.println();
		
//	
//	6. **커피 클래스**
//	    - 필드: 종류, 가격, 원산지
//	    - 생성자: 종류 초기화
//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		
		System.out.println("No6. **커피 클래스**");
		Coffee coff1 = new Coffee("원두");
		coff1.showInfo();
		coff1.changePrice();
		coff1.inputCountry();
		coff1.showInfo();
		System.out.println();
		
		
//	
//	7. **여행 정보 클래스**
//	    - 필드: 목적지, 출발일, 도착일
//	    - 생성자: 모든 필드 초기화
//	    - 메서드: 여행 일수 계산, 정보 출력
		
		System.out.println("No7. **정보 클래스**");
		Travel travel1 = new Travel("프랑스-파리", 12, 20);
		travel1.travelDate();
		travel1.showInfo();
		System.out.println("여행 일수: " + travel1.travelDate());
		System.out.println();
		
		
//	
//	8. **스마트폰 클래스**
//	    - 필드: 브랜드, 모델, 가격
//	    - 생성자: 브랜드와 모델 초기화
//	    - 메서드: 가격 변경, 정보 출력
		
		System.out.println("No8. **스마트폰 클래스**");
		Phone p1 = new Phone("삼성", "갤럭시S21");
		p1.showInfo();
		p1.changePrice();
		p1.showInfo();
		System.out.println();
		
		
	
//	9. **게임 캐릭터 클래스**
//	    - 필드: 이름, 레벨, 체력
//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		
		System.out.println("No9. **게임 캐릭터 클래스**");
		Game game1 = new Game("Junho");
		game1.ShowInfo();
		game1.LevelUp();
		game1.Heal();
		game1.ShowInfo();
		System.out.println();
		
		
	
//	10. **펜 클래스**
//	    - 필드: 색상, 브랜드, 가격
//	    - 생성자: 색상과 브랜드 초기화
//	    - 메서드: 가격 변경, 정보 출력
		
		System.out.println("No10. **펜 클래스**");
		Pen pen1 = new Pen("Black", "모나미");
		pen1.ShowInfo();
		pen1.ChangePrice();
		pen1.ShowInfo();
		System.out.println();
		
		

	}

}
