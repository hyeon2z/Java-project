package javaexp.z02_homework.a11_mhi;

import javaexp.z02_homework.a11_mhi.vo.Acount;
import javaexp.z02_homework.a11_mhi.vo.Book;
import javaexp.z02_homework.a11_mhi.vo.Coffee;
import javaexp.z02_homework.a11_mhi.vo.Pen;
import javaexp.z02_homework.a11_mhi.vo.Rectangle2;
import javaexp.z02_homework.a11_mhi.vo.Smartphone;
import javaexp.z02_homework.a11_mhi.vo.Student2;
import javaexp.z02_homework.a11_mhi.vo.Travel;
import javaexp.z02_homework.a11_mhi.vo.Character;
import javaexp.z02_homework.a11_mhi.vo.Car;

public class A01_0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 자바과제 제출합니다
		
			// 1. **도서 클래스**
			// - 필드: 제목, 저자, 가격, 출판년도
			// - 생성자: 모든 필드 초기화
			// - 메서드: 도서 정보 출력, 가격 변경
			//
			// 2. **계좌 클래스**
			// - 필드: 계좌번호, 예금주, 잔액
			// - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
			// - 메서드: 입금, 출금, 잔액 확인
			//
			// 3. **학생 클래스**
			// - 필드: 학번, 이름, 성적
			// - 생성자: 학번과 이름 초기화
			// - 메서드: 성적 입력, 성적 조회, 정보 출력
			//
			// 4. **사각형 클래스**
			// - 필드: 가로, 세로
			// - 생성자: 가로와 세로 초기화
			// - 메서드: 넓이 계산, 둘레 계산, 정보 출력
			//
			// 5. **차량 클래스**
			// - 필드: 차량 번호, 모델, 연식
			// - 생성자: 차량 번호, 모델 초기화
			// - 메서드: 연식 변경, 정보 출력
			//
			// 6. **커피 클래스**
			// - 필드: 종류, 가격, 원산지
			// - 생성자: 종류 초기화
			// - 메서드: 가격 변경, 원산지 입력, 정보 출력
			//
			// 7. **여행 정보 클래스**
			// - 필드: 목적지, 출발일, 도착일
			// - 생성자: 모든 필드 초기화
			// - 메서드: 여행 일수 계산, 정보 출력
			//
			// 8. **스마트폰 클래스**
			// - 필드: 브랜드, 모델, 가격
			// - 생성자: 브랜드와 모델 초기화
			// - 메서드: 가격 변경, 정보 출력
			//
			// 9. **게임 캐릭터 클래스**
			// - 필드: 이름, 레벨, 체력
			// - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
			// - 메서드: 레벨 업, 체력 회복, 정보 출력
			//
			// 10. **펜 클래스**
			// - 필드: 색상, 브랜드, 가격
			// - 생성자: 색상과 브랜드 초기화
			// - 메서드: 가격 변경, 정보 출력

//			 -------------------------------------
			// 1. **도서 클래스**
			// - 필드: 제목, 저자, 가격, 출판년도
			// - 생성자: 모든 필드 초기화
			// - 메서드: 도서 정보 출력, 가격 변경
			Book book = new Book("어린왕자", "생텍쥐페리", 4000, 1996);
			book.setPrice(5000);
			book.showInf();

//			2. **계좌 클래스**
			// - 필드: 계좌번호, 예금주, 잔액
			// - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
			// - 메서드: 입금, 출금, 잔액 확인
			Acount acount = new Acount("110-288-544-323", "문해인");
			acount.showInf();
			acount.deposit();
			acount.withdrawn();
			acount.showInf();

//			3. **학생 클래스**
			// - 필드: 학번, 이름, 성적
			// - 생성자: 학번과 이름 초기화
			// - 메서드: 성적 입력, 성적 조회, 정보 출력
			Student2 student = new Student2("18613", "김민지", 3.5);
			student.setGrade(4.0);
			student.showInf();

//			4. **사각형 클래스**
			// - 필드: 가로, 세로
			// - 생성자: 가로와 세로 초기화
			// - 메서드: 넓이 계산, 둘레 계산, 정보 출력
			Rectangle2 rectangle = new Rectangle2(4, 5);
			rectangle.getArea();
			rectangle.getPerimeter();
			rectangle.showInf();
			
//			5. **차량 클래스**
			// - 필드: 차량 번호, 모델, 연식
			// - 생성자: 차량 번호, 모델 초기화
			// - 메서드: 연식 변경, 정보 출력
			Car car = new Car("32보 2264","소나타",1996);
			car.setYear(1997);
			car.showInf();

//			6. **커피 클래스**
			// - 필드: 종류, 가격, 원산지
			// - 생성자: 종류 초기화
			// - 메서드: 가격 변경, 원산지 입력, 정보 출력
			Coffee coffee = new Coffee("아메리카노원두", 5000, "페루");
			coffee.setPrice(4700);
			coffee.setOrigin("에티오피아");
			coffee.showInf();

//			7. **여행 정보 클래스**
			// - 필드: 목적지, 출발일, 도착일
			// - 생성자: 모든 필드 초기화
			// - 메서드: 여행 일수 계산, 정보 출력
			Travel travel = new Travel("성남", 20230901, 20230921);
			travel.durationOfTrave();
			travel.showInf();

//			8. **스마트폰 클래스**
			// - 필드: 브랜드, 모델, 가격
			// - 생성자: 브랜드와 모델 초기화
			// - 메서드: 가격 변경, 정보 출력
			Smartphone smartPhone = new Smartphone("삼성","kf49",33000);
			smartPhone.setPrice(3999);
			smartPhone.showInf();

//			9. **게임 캐릭터 클래스**
			// - 필드: 이름, 레벨, 체력
			// - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
			// - 메서드: 레벨 업, 체력 회복, 정보 출력
			Character character = new Character("민쮸걸");
			character.levelup();
			character.healthup();
			character.showInf();

//			10. **펜 클래스**
			// - 필드: 색상, 브랜드, 가격
			// - 생성자: 색상과 브랜드 초기화
			// - 메서드: 가격 변경, 정보 출력
			Pen pen = new Pen("노랑", "모나미", 300);
			pen.setPrice(500);
			pen.showInf();

		}

	}