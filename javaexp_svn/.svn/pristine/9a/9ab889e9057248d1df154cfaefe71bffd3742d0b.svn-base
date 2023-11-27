package javaexp.z02_homework.a21_hcj;
import javaexp.z02_homework.a21_hcj.vo.Book;
import javaexp.z02_homework.a21_hcj.vo.Account;
import javaexp.z02_homework.a21_hcj.vo.Student;
import javaexp.z02_homework.a21_hcj.vo.Box;
import javaexp.z02_homework.a21_hcj.vo.Car;
import javaexp.z02_homework.a21_hcj.vo.Coffee;
import javaexp.z02_homework.a21_hcj.vo.Travel;
import javaexp.z02_homework.a21_hcj.vo.SmartPhone;
import javaexp.z02_homework.a21_hcj.vo.Charactor;
import javaexp.z02_homework.a21_hcj.vo.Pen;
public class A0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. **도서 클래스**
		//	    - 필드: 제목, 저자, 가격, 출판년도
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 도서 정보 출력, 가격 변경
		//	
		Book bk1 = new Book("해리포터","J.K.Rowling",35000,"1997-06-26");
		bk1.showInfo();
		bk1.setPrice(32000);
		bk1.showInfo();
		//	2. **계좌 클래스**
		//	    - 필드: 계좌번호, 예금주, 잔액
		//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
		//	    - 메서드: 입금, 출금, 잔액 확인
		//	
		Account ac = new Account("12345-67893","홍길동");
		ac.showMoney();
		ac.deposit(3000);
		ac.showMoney();
		ac.withdraw(2000);
		ac.showMoney();
		//	3. **학생 클래스**
		//	    - 필드: 학번, 이름, 성적
		//	    - 생성자: 학번과 이름 초기화
		//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
		Student std = new Student("20230325","홍길동");
		std.showInfo();
		std.setGrade("A");
		System.out.println("학생의 성적"+std.getGrade());
		
		
		//	
		//	4. **사각형 클래스**
		//	    - 필드: 가로, 세로
		//	    - 생성자: 가로와 세로 초기화
		//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
		Box box = new Box(20,10);
		box.ShowInfo();
		System.out.println("사각형의 넓이:"+box.Area());
		System.out.println("사각형의 둘레:"+box.Around());
		
		//	
		//	5. **차량 클래스**
		//	    - 필드: 차량 번호, 모델, 연식
		//	    - 생성자: 차량 번호, 모델 초기화
		//	    - 메서드: 연식 변경, 정보 출력
		Car car = new Car("NE439i","BMW");
		car.ShowInfo();
		car.setDate("20230921");
		car.ShowInfo();
		//	
		//	6. **커피 클래스**
		//	    - 필드: 종류, 가격, 원산지
		//	    - 생성자: 종류 초기화
		//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
		Coffee cof = new Coffee("아라비카");
		cof.ShowInfo();
		cof.setPrice(2000);
		cof.setform("에티오피아");
		cof.ShowInfo();
		//	
		//	7. **여행 정보 클래스**
		//	    - 필드: 목적지, 출발일, 도착일
		//	    - 생성자: 모든 필드 초기화
		//	    - 메서드: 여행 일수 계산, 정보 출력
		Travel tv = new Travel("파리",226,301);
		System.out.println("여행 일수:"+tv.travelDate()+"일");
		//	
		//	8. **스마트폰 클래스**
		//	    - 필드: 브랜드, 모델, 가격
		//	    - 생성자: 브랜드와 모델 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		SmartPhone sm = new SmartPhone("삼성","폴더블");
		sm.showInfo();
		sm.setPrice(1700000);
		sm.showInfo();
		//	
		//	9. **게임 캐릭터 클래스**
		//	    - 필드: 이름, 레벨, 체력
		//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
		//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
		Charactor ch = new Charactor("워리어");
		ch.ShowInfo();
		ch.LevelUp(3);
		ch.Heal(300);
		ch.ShowInfo();
		//	
		//	10. **펜 클래스**
		//	    - 필드: 색상, 브랜드, 가격
		//	    - 생성자: 색상과 브랜드 초기화
		//	    - 메서드: 가격 변경, 정보 출력
		
		Pen pen = new Pen("빨강","모나미");
		pen.ShowInfo();
		pen.setPirce(2000);
		pen.ShowInfo();
	}

}




