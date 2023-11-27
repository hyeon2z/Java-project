package javaexp.z02_homework.a03_ls;

import javaexp.z02_homework.a03_ls.vo.Address;
import javaexp.z02_homework.a03_ls.vo.Author;
import javaexp.z02_homework.a03_ls.vo.Book_01;
import javaexp.z02_homework.a03_ls.vo.Consumer;
import javaexp.z02_homework.a03_ls.vo.Member;
import javaexp.z02_homework.a03_ls.vo.Order;
import javaexp.z02_homework.a03_ls.vo.Person;
import javaexp.z02_homework.a03_ls.vo.Stu;
import javaexp.z02_homework.a03_ls.vo.Teacher;
import javaexp.z02_homework.a03_ls.vo.Team;

public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 
		Consumer c01 = new Consumer(1,"여성");
		c01.setOrder(new Order("샌드위치",8000));
		c01.show();
		
//			2) 학생과 담임교사 
		Teacher t01 = new Teacher("홍길동",30);
		t01.setStu(new Stu("김길동",1));
//			3) Person 객체와 Address 객체의 관계
		Person p01 = new Person("홍길동", 25);
		Address a01 = new Address("서울","아파트");
		p01.setAddress(a01);
		
//			4) Book 객체와 Author 객체의 관계
		Author a02 = new Author(15,"여성");
		a02.setBook(new Book_01("자바의정석","교육책"));
		
//			5) Member 객체와 Team 객체의 관계
		Team t02 = new Team (30,"기아타이거즈");
		t02.setMember(new Member(20,"홍길동"));
		t02.showMyTeam();
		
		
		
	}

}
