package javaexp.z02_homework.a17_okw;

import javaexp.z02_homework.a17_okw.vo.Address;
import javaexp.z02_homework.a17_okw.vo.Author;
import javaexp.z02_homework.a17_okw.vo.Book;
import javaexp.z02_homework.a17_okw.vo.Customer;
import javaexp.z02_homework.a17_okw.vo.Member;
import javaexp.z02_homework.a17_okw.vo.Order;
import javaexp.z02_homework.a17_okw.vo.Person;
import javaexp.z02_homework.a17_okw.vo.Student;
import javaexp.z02_homework.a17_okw.vo.Teacher;
import javaexp.z02_homework.a17_okw.vo.Team;

public class A1004_okw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 (고객명 // 주문품목, 주문갯수)
		Order order = new Order("치약", 5);
		Customer customer = new Customer("김봉구");
		order.setCustomer(customer);
		order.showOrderInfo();
		
//			2) 학생과 담임교사 (번호, 학생이름 // 교사명, 담당학년)
		Teacher tc1 = new Teacher("손경환", 3);
		tc1.setStudent(new Student(20, "김길동"));
		tc1.showTeacherInfo();
//			3) Person 객체와 Address 객체의 관계(이름, 나이 // 지번, 위치)
		Person p01 = new Person("홍길동", 25);
		p01.setAddress(new Address("시흥시", "상직길 4"));
		p01.showAddressInfo();
//			4) Book 객체와 Author 객체의 관계 (책제목, 출판사 // 작가명 )
		Author at01 = new Author("남궁성");
		at01.setBook(new Book("자바의 정석","도우출판"));
		at01.showBookInfo();
		
//			5) Member 객체와 Team 객체의 관계 (멤버 이름, 포지션 // 팀이름, 연고지)
		Team team01 = new Team("Liverpool FC", "잉글랜드 머지사이드주 리버풀");
		Member mem01 = new Member("도미니크 소보슬라이", "MF");
		team01.setMember(mem01);
		team01.showMemberInfo();
		
	}

}
