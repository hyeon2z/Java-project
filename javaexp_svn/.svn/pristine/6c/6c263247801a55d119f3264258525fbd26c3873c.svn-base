package javaexp.z02_homework.a00_yhs;
import javaexp.z02_homework.a00_yhs.vo.Book;
import javaexp.z02_homework.a00_yhs.vo.Account;
import javaexp.z02_homework.a00_yhs.vo.Student;
import javaexp.z02_homework.a00_yhs.vo.Coffee;
import javaexp.z02_homework.a00_yhs.vo.GameCharacter;
import javaexp.z02_homework.a00_yhs.vo.Pen;
import javaexp.z02_homework.a00_yhs.vo.Rectangle;
import javaexp.z02_homework.a00_yhs.vo.Smartphone;
import javaexp.z02_homework.a00_yhs.vo.Trip;
import javaexp.z02_homework.a00_yhs.vo.Vehicle;

public class A0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	1. **도서 클래스**
	//	    - 필드: 제목, 저자, 가격, 출판년도
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 도서 정보 출력, 가격 변경

	//	2. **계좌 클래스**
	//	    - 필드: 계좌번호, 예금주, 잔액
	//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
	//	    - 메서드: 입금, 출금, 잔액 확인
	//	
	//	3. **학생 클래스**
	//	    - 필드: 학번, 이름, 성적
	//	    - 생성자: 학번과 이름 초기화
	//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
	//	
	//	4. **사각형 클래스**
	//	    - 필드: 가로, 세로
	//	    - 생성자: 가로와 세로 초기화
	//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
	//	
	//	5. **차량 클래스**
	//	    - 필드: 차량 번호, 모델, 연식
	//	    - 생성자: 차량 번호, 모델 초기화
	//	    - 메서드: 연식 변경, 정보 출력
	//	
	//	6. **커피 클래스**
	//	    - 필드: 종류, 가격, 원산지
	//	    - 생성자: 종류 초기화
	//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
	//	
	//	7. **여행 정보 클래스**
	//	    - 필드: 목적지, 출발일, 도착일
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 여행 일수 계산, 정보 출력
	//	
	//	8. **스마트폰 클래스**
	//	    - 필드: 브랜드, 모델, 가격
	//	    - 생성자: 브랜드와 모델 초기화
	//	    - 메서드: 가격 변경, 정보 출력
	//	
	//	9. **게임 캐릭터 클래스**
	//	    - 필드: 이름, 레벨, 체력
	//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
	//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
	//	
	//	10. **펜 클래스**
	//	    - 필드: 색상, 브랜드, 가격
	//	    - 생성자: 색상과 브랜드 초기화
	//	    - 메서드: 가격 변경, 정보 출력
        // 1. 도서 클래스 사용 예제
        Book book = new Book("Java Basics", "John Doe", 15.99, 2021);
        book.displayInfo();
        book.setPrice(17.99);  // 가격 변경
        book.displayInfo();

        // 2. 계좌 클래스 사용 예제
        Account account = new Account("123-456-789", "Jane Doe");
        account.deposit(1000);
        account.displayBalance();
        account.withdraw(500);
        account.displayBalance();

        // 3. 학생 클래스 사용 예제
        Student student = new Student("S12345", "Alice");
        student.setGrade(92.5);
        student.displayInfo();		
		
	      // 사각형 클래스 사용 예시
        Rectangle rect = new Rectangle(4, 5);
        rect.displayInfo();
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

        // 차량 클래스 사용 예시
        Vehicle vehicle = new Vehicle("1234-ABCD", "Sedan");
        vehicle.setManufactureYear(2022);
        vehicle.displayInfo();

        // 커피 클래스 사용 예시
        Coffee coffee = new Coffee("Latte");
        coffee.setPrice(5.50);
        coffee.setOrigin("Brazil");
        coffee.displayInfo();

        // 여행 정보 클래스 사용 예시
        Trip trip = new Trip("Paris", 20230601, 20230610);
        trip.displayInfo();
        System.out.println("Days of Trip: " + trip.calculateDays());

        // 스마트폰 클래스 사용 예시
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14");
        smartphone.setPrice(999.99);
        smartphone.displayInfo();

        // 게임 캐릭터 클래스 사용 예시
        GameCharacter character = new GameCharacter("Link");
        character.displayInfo();
        character.levelUp();
        character.heal();
        character.displayInfo();

        // 펜 클래스 사용 예시
        Pen pen = new Pen("Blue", "Pilot");
        pen.setPrice(1.25);
        pen.displayInfo();
	}

}
