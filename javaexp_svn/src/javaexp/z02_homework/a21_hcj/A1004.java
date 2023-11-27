package javaexp.z02_homework.a21_hcj;

import javaexp.z02_homework.a21_hcj.vo.a1004.Address;
import javaexp.z02_homework.a21_hcj.vo.a1004.Author;
import javaexp.z02_homework.a21_hcj.vo.a1004.Book;
import javaexp.z02_homework.a21_hcj.vo.a1004.Cunsumer;
import javaexp.z02_homework.a21_hcj.vo.a1004.HomeRoomTeacher;
import javaexp.z02_homework.a21_hcj.vo.a1004.Member;
import javaexp.z02_homework.a21_hcj.vo.a1004.Order;
import javaexp.z02_homework.a21_hcj.vo.a1004.Person;
import javaexp.z02_homework.a21_hcj.vo.a1004.Student_1004;
import javaexp.z02_homework.a21_hcj.vo.a1004.Team;
public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
			/*
			필드는 객체가 가지고있을 정보를 의 공간 나타내고 생성자 호출시 사용자 정의에 따라 선언한 필드를 할당할수 있다.
			메서드 선언은 해당 객체가 할 행동을 선언하는것을 말한다.
			 * */
//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 
			Cunsumer cm01 = new Cunsumer("홍길동");
			cm01.ShowOrderInfo();
			cm01.setOrder(new Order("사과",1500,3));
			cm01.ShowOrderInfo();
//			2) 학생과 담임교사 
			Student_1004 std01 = new Student_1004("홍길동",2,3);
			std01.showStudentInfo();
			std01.setHomeroomteacher(new HomeRoomTeacher("마길동"));
			std01.showStudentInfo();
					
//			3) Person 객체와 Address 객체의 관계
			Person po01 = new Person("홍길동", 24);
			po01.showPersonInfo();
			po01.setAddress(new Address("서울"));
			po01.showPersonInfo();
//			4) Book 객체와 Author 객체의 관계
			Book bk = new Book("해리포터","@@@",1500);
			bk.showBookInfo();
			bk.setAuthor(new Author("J.K. 롤링"));
			bk.showBookInfo();
//			5) Member 객체와 Team 객체의 관계
			Member mb = new Member("홍길동", 25);
			mb.showMemberInfo();
			mb.setTeam(new Team("홍팀"));
			mb.showMemberInfo();
			
		
		
	}

}
