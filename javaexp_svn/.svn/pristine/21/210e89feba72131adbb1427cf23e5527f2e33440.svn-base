package javaexp.z02_homework.a03_ls;
import javaexp.z02_homework.a03_ls.vo.Account;
import javaexp.z02_homework.a03_ls.vo.Book;
import javaexp.z02_homework.a03_ls.vo.Car;
import javaexp.z02_homework.a03_ls.vo.Coffee;
import javaexp.z02_homework.a03_ls.vo.Game;
import javaexp.z02_homework.a03_ls.vo.Pen;
import javaexp.z02_homework.a03_ls.vo.Phone;
import javaexp.z02_homework.a03_ls.vo.Quadrangle;
import javaexp.z02_homework.a03_ls.vo.Student;
import javaexp.z02_homework.a03_ls.vo.Travel;
public class A0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	1. **도서 클래스**
		//	    - 필드: 제목, 저자, 가격, 출판년도
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 도서 정보 출력, 가격 변경
		Book b01 = new Book("자바의이해","임솔",10000,2023);
		b01.bookInfo();
		b01.setPrice(15000);
		System.out.println();
		//	
		//	2. **계좌 클래스**
		//	    - 필드: 계좌번호, 예금주, 잔액
		//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
		//	    - 메서드: 입금, 출금, 잔액 확인
		Account a01 = new Account("539701-04","임솔",10000);
		a01.accountInfo();
		System.out.println("처음 잔액에서 만원 입금");
		a01.money1();
		System.out.println("처음 잔액에서 만원 출금");
		a01.money2();
		System.out.println();
		
		//	
		//	3. **학생 클래스**
		//	    - 필드: 학번, 이름, 성적
		//	    - 생성자: 학번과 이름 초기화
		//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		Student s01 = new Student(215090006,"임솔");
		s01.studentInfo();
		System.out.println();
		//	
		//	4. **사각형 클래스**
		//	    - 필드: 가로, 세로
		//	    - 생성자: 가로와 세로 초기화
		//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		 Quadrangle q01 = new  Quadrangle(10,20);
		 q01.quadrangleInfo();
		 q01.area1();
		 System.out.println("사각형 넓이 : "+q01.area1());
		 q01.area2();
		 System.out.println("사각형 둘레 : "+q01.area2());
		 System.out.println();
		//	5. **차량 클래스**
		//	    - 필드: 차량 번호, 모델, 연식
		//	    - 생성자: 차량 번호, 모델 초기화
		//	    - 메서드: 연식 변경, 정보 출력
		 Car c01 = new Car(1111,"캐스퍼");
		 c01.carInfo();
		 c01.setYear(5);
		 c01.carInfo();
		 System.out.println();
		//	
		//	6. **커피 클래스**
		//	    - 필드: 종류, 가격, 원산지
		//	    - 생성자: 종류 초기화
		//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		 Coffee c02 = new Coffee("아메리카노");
		 c02.coffeeInfo();
		 c02.setPrice(3000);
		 c02.setMake("콜롬비아");
		 c02.coffeeInfo();
		 System.out.println();
		//	
		//	7. **여행 정보 클래스**
		//	    - 필드: 목적지, 출발일, 도착일
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 여행 일수 계산, 정보 출력
		 Travel t01 = new Travel("일본",1021 ,1026);
		 t01.travelInfo();
		 System.out.println("여행일수 : "+t01.live());
		 System.out.println();
		//	
		//	8. **스마트폰 클래스**
		//	    - 필드: 브랜드, 모델, 가격
		//	    - 생성자: 브랜드와 모델 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		 Phone p01 = new Phone("애플","아이폰14");
		p01.phoneInfo();
		p01.setPrice(14000);
		p01.phoneInfo();
		System.out.println();
		
		//	9. **게임 캐릭터 클래스**
		//	    - 필드: 이름, 레벨, 체력
		//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
		//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		//	
		Game g01 = new Game("봉봉",50,60);
		g01.gameInfo();
		g01.up();
		g01.full();
		g01.gameInfo1();
		System.out.println();
		//	10. **펜 클래스**
		//	    - 필드: 색상, 브랜드, 가격
		//	    - 생성자: 색상과 브랜드 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		Pen p02= new Pen("검정색","시그노",1500);
		p02.penInfo();
		p02.setPrice(2500);
		p02.penInfo();
		//왜 안올라가

	}

}
