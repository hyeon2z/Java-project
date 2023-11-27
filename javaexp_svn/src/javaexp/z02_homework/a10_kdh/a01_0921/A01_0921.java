package javaexp.z02_homework.a10_kdh.a01_0921;
import javaexp.z02_homework.a10_kdh.a01_0921.vo.*;

public class A01_0921 {
	
	public static void main(String[] args) {
//		1. **도서 클래스**
		//	    - 필드: 제목, 저자, 가격, 출판년도
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 도서 정보 출력, 가격 변경
		//	
		System.out.println("====== 1번 ======");
		Book book = new Book("어린왕자", "김도현", 12000, 2023);
		book.showInfo();
		book.setPrice(36000);
		System.out.println("#변경후#");
		book.showInfo();
		System.out.println();
//		2. **계좌 클래스**
			//	    - 필드: 계좌번호, 예금주, 잔액
			//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
			//	    - 메서드: 입금, 출금, 잔액 확인
			//	
		System.out.println("====== 2번 ======");
		Account account = new Account("000-0000-000", "김도현");
		account.deposit(5000);
		account.showInfo();
		account.withdrawal(2000);
		account.showInfo();
		System.out.println();
//		3. **학생 클래스**
			//	    - 필드: 학번, 이름, 성적
			//	    - 생성자: 학번과 이름 초기화
			//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
			//	
		System.out.println("====== 3번 ======");
		Student studnet = new Student(1234, "김도현");
		studnet.setGrade(4.5);
		studnet.showInfo();
		studnet.setGrade(4.0);
		studnet.showGrade();
		System.out.println();
		// 4. **사각형 클래스**
		// - 필드: 가로, 세로
		// - 생성자: 가로와 세로 초기화
		// - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		//
		System.out.println("====== 4번 ======");
		Rectangle rt = new Rectangle(10, 20);
		rt.getArea();
		rt.getCircumference();
		rt.showInfo();
		System.out.println();
		//5. **차량 클래스**
		//	    - 필드: 차량 번호, 모델, 연식
		//	    - 생성자: 차량 번호, 모델 초기화
		//	    - 메서드: 연식 변경, 정보 출력
		//	
		System.out.println("====== 5번 ======");
		Car car = new Car(1234, "그랜저", "2022");
		car.setYearOfYear("2023");
		car.showInfo();
		System.out.println();
		
		//	6. **커피 클래스**
		//	    - 필드: 종류, 가격, 원산지
		//	    - 생성자: 종류 초기화
		//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		//	
		System.out.println("====== 6번 ======");
		Coffee coffee = new Coffee("아메리카노");
		coffee.setPrice(3000);
		coffee.setOrigin("아프리카");
		coffee.showInfo();
		System.out.println();
		//	7. **여행 정보 클래스**
		//	    - 필드: 목적지, 출발일, 도착일
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 여행 일수 계산, 정보 출력
		System.out.println("====== 7번 ======");
		Travel travel = new Travel("하와이", 921, 923);
		travel.calcDate();
		travel.showInfo();
		System.out.println();
		//	
		//	8. **스마트폰 클래스**
		//	    - 필드: 브랜드, 모델, 가격
		//	    - 생성자: 브랜드와 모델 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		System.out.println("====== 8번 ======");
		SmartPhone smartPhone = new SmartPhone("애플", "아이폰15");
		smartPhone.setPrice(1500000);
		smartPhone.showInfo();
		System.out.println();
		//	
		//	9. **게임 캐릭터 클래스**
		//	    - 필드: 이름, 레벨, 체력
		//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
		//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		//	
		System.out.println("====== 9번 ======");
		GameCharacter gameCharacter = new GameCharacter("고블린");
		gameCharacter.showInfo();
		gameCharacter.levelup();
		gameCharacter.healHp();
		gameCharacter.showInfo();
		System.out.println();
		//	10. **펜 클래스**
		//	    - 필드: 색상, 브랜드, 가격
		//	    - 생성자: 색상과 브랜드 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		System.out.println("====== 10번 ======");
		Pen pen = new Pen("검정색", "모나미");
		pen.setPrice(1200);
		pen.showInfo();
		System.out.println();
	}
}

