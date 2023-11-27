package javaexp.z02_homework.a02_oys;

import javaexp.z02_homework.a02_oys.vo0921.Account;
import javaexp.z02_homework.a02_oys.vo0921.Book;
import javaexp.z02_homework.a02_oys.vo0921.Car;
import javaexp.z02_homework.a02_oys.vo0921.Coffe;
import javaexp.z02_homework.a02_oys.vo0921.Rectangle;
import javaexp.z02_homework.a02_oys.vo0921.SmartPhone;
import javaexp.z02_homework.a02_oys.vo0921.Student;
import javaexp.z02_homework.a02_oys.vo0921.Travel;

public class A0921_HomeWork {

	public static void main(String[] args) {
			
		// 1.도서 클래스
		/*Book book = new Book("책이름", "홍길동", 12000, "2023");
		book.setPrice(13000);
		book.bookInfo();*/
		
		// 2. 계좌 클래스
		/*Account account = new Account("123-456", "홍길동");
		System.out.println(account.getPrice());
		account.deposit(3000);
		account.withdraw(2000);
		account.withdraw(2000);*/
		
		// 3. 학생 클래스
		/*Student student = new Student("0312", "홍길동");
		System.out.println(student.getScore());
		student.setScore(50);
		student.studentInfo();*/
		
		// 4. 사각형 클래스
		/*Rectangle rectangle = new Rectangle(3, 4);
		System.out.println(rectangle.area());
		System.out.println(rectangle.circum());
		rectangle.rectangleInfo();*/
		
		// 5. 차량 클래스
		/*Car car = new Car(3142, "벤츠");
		car.setYear(3);
		car.carInfo();*/
		
		// 6. 커피 클래스
		/*Coffe coffe = new Coffe("아메리카노");
		coffe.setPrice(3000);
		coffe.setCountry("아메리카");
		coffe.coffeInfo();*/

		// 7. 여행 정보 클래스
		/*Travel travel = new Travel("영국", 3, 5);
		System.out.println(travel.travelDay());
		travel.travelInfo();*/
		
		// 8. 스마트폰 클래스
		SmartPhone smartPhone = new SmartPhone("삼성", "s22");
		smartPhone.setPrice(120000);
		smartPhone.phoneInfo();
	}

}

