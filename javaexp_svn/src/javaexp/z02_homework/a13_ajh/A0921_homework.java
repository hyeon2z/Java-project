package javaexp.z02_homework.a13_ajh;

//import javaexp.z01_homework.vo0921.Book;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javaexp.z01_homework.vo0921.BankNum;
//import javaexp.z01_homework.vo0921.Student;
//import javaexp.z01_homework.vo0921.Rectangle;
//import javaexp.z01_homework.vo0921.Smartphone;
//import javaexp.z01_homework.vo0921.Vehicle;
//import javaexp.z01_homework.vo0921.Coffee;
//import javaexp.z01_homework.vo0921.GameCharacter;
//import javaexp.z01_homework.vo0921.Pen;
//import javaexp.z01_homework.vo0921.TravelInfo;

public class A0921_homework {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	//	1. **도서 클래스**
//	//	    - 필드: 제목, 저자, 가격, 출판년도
//	//	    - 생성자: 모든 필드 초기화
//	//	    - 메서드: 도서 정보 출력, 가격 변경
//		System.out.println("#1번#");
//		Book b01 = new Book("성냥팔이","안데르센",17000,1845);
//		b01.showInf();
//		b01.setPrice(20000);
//		b01.showInf();
//		
//		System.out.println();
//	//	
//	//	2. **계좌 클래스**
//	//	    - 필드: 계좌번호, 예금주, 잔액
//	//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
//	//	    - 메서드: 입금, 출금, 잔액 확인
//		System.out.println("#2번#");
//		BankNum myAc = new BankNum("12345678", "홍길동", 0);
//		myAc.checkBalance();
//        myAc.deposit(100000); 
//        myAc.checkBalance(); 
//        myAc.withdraw(50000); 
//        myAc.checkBalance();
//        
//		System.out.println();	
//	//	
//	//	3. **학생 클래스**
//	//	    - 필드: 학번, 이름, 성적
//	//	    - 생성자: 학번과 이름 초기화
//	//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
//		System.out.println("#3번#");
//		Student student1 = new Student(12345, "홍길동", 0);
//        student1.printInfo(); 
//        student1.setGrade(95.5); 
//        student1.printInfo(); 
//		
//		System.out.println();
//	//	
//	//	4. **사각형 클래스**
//	//	    - 필드: 가로, 세로
//	//	    - 생성자: 가로와 세로 초기화
//	//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
//		System.out.println("#4번#");
//		Rectangle rectangle1 = new Rectangle(5.0, 3.0);
//        rectangle1.printInfo();
//		
//		System.out.println();
//	//	
//	//	5. **차량 클래스**
//	//	    - 필드: 차량 번호, 모델, 연식
//	//	    - 생성자: 차량 번호, 모델 초기화
//	//	    - 메서드: 연식 변경, 정보 출력
//		System.out.println("#5번#");
//		Vehicle myVehicle = new Vehicle("12345", "모델X", 0);
//        myVehicle.printInfo();
//        myVehicle.setYear(2020);
//        myVehicle.printInfo();
//        
//        System.out.println();
//	//	
//	//	6. **커피 클래스**
//	//	    - 필드: 종류, 가격, 원산지
//	//	    - 생성자: 종류 초기화
//	//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
//        System.out.println("#6번#");
//        Coffee espresso = new Coffee("에스프레소");
//        espresso.setPrice(2500);
//        espresso.setOrigin("이탈리아");
//        espresso.printInfo();
//        
//        System.out.println();
//	//	
//	//	7. **여행 정보 클래스**
//	//	    - 필드: 목적지, 출발일, 도착일
//	//	    - 생성자: 모든 필드 초기화
//	//	    - 메서드: 여행 일수 계산, 정보 출력
//        System.out.println("#7번#");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date departureDate = dateFormat.parse("2023-10-01");
//        Date arrivalDate = dateFormat.parse("2023-10-10");
//
//        TravelInfo trip = new TravelInfo("파리", departureDate, arrivalDate);
//        trip.printInfo();
//        
//        System.out.println();
//	//	
//	//	8. **스마트폰 클래스**
//	//	    - 필드: 브랜드, 모델, 가격
//	//	    - 생성자: 브랜드와 모델 초기화
//	//	    - 메서드: 가격 변경, 정보 출력
//        System.out.println("#8번#");
//        Smartphone myPhone = new Smartphone("Apple", "iPhone 13", 0);
//        myPhone.printInfo();
//        myPhone.setPrice(1000000);
//        myPhone.printInfo();
//        
//        System.out.println();
//	//	
//	//	9. **게임 캐릭터 클래스**
//	//	    - 필드: 이름, 레벨, 체력
//	//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
//	//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
//		System.out.println("#9번#");
//        GameCharacter player = new GameCharacter("용사");
//
//        player.printInfo();
//        player.levelUp();
//        player.heal(50);
//        player.printInfo();
//        
//        System.out.println();
//    //
//    //	10. **펜 클래스**
//	//	    - 필드: 색상, 브랜드, 가격
//	//	    - 생성자: 색상과 브랜드 초기화
//	//	    - 메서드: 가격 변경, 정보 출력
//        System.out.println("#10번#");
//        Pen myPen = new Pen("파란색", "모나미");
//
//        myPen.printInfo(); 
//        myPen.setPrice(2000); 
//        myPen.printInfo();
//        
//        System.out.println();
        
	}

}
