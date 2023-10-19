package javaexp.z02_homework;

import javaexp.z02_homework.vo2.Address;
import javaexp.z02_homework.vo2.Author;
import javaexp.z02_homework.vo2.Book;
import javaexp.z02_homework.vo2.Client;
import javaexp.z02_homework.vo2.Member;
import javaexp.z02_homework.vo2.Order;
import javaexp.z02_homework.vo2.Person;
import javaexp.z02_homework.vo2.Student;
import javaexp.z02_homework.vo2.Teacher;
import javaexp.z02_homework.vo2.Team;

public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 Client/Order
		Client cli01 = new Client("홍길동", 25);
		cli01.setOrder(new Order("컴퓨터", 100000));
		cli01.clientInfo();
//			2) 학생과 담임교사 Student/Teacher
		Teacher t01 = new Teacher("2학년 4반" ,"선생님", 32);
		t01.setStudent(new Student("학생", 25));
		t01.teacherInfo();
//			3) Person 객체와 Address 객체의 관계
		Person p01 = new Person("김철수", 30);
		p01.setAddress(new Address("abc@abc.com", "동작구"));
		p01.personInfo();
//			4) Book 객체와 Author 객체의 관계
		Author b01 = new Author("김상훈", "43세");
		b01.setBook(new Book("해리포터", 14000));
		b01.authorInfo();
//			5) Member 객체와 Team 객체의 관계
		Team tea01 = new Team("T1", 2003);
		tea01.setMember(new Member("이상혁", 28));
		tea01.teamInfo();
		
	}

}
