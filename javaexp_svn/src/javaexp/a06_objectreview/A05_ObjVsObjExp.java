package javaexp.a06_objectreview;

import javaexp.a06_objectreview.vo.Employee;
import javaexp.a06_objectreview.vo.Office;
import javaexp.a06_objectreview.vo.Student;
import javaexp.a06_objectreview.vo.Subject;

public class A05_ObjVsObjExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	    ex) Office(포할될 객체)
	           location(위치), capcity(수용인원)
	        Employee(포함할 객체)
	           name(이름), age(나이)
	           Office office
	           setXXX
	           getXXX
	           void showMyOfficeInfo() 위 포함될 객체의 정보 출력

		 * */
		Employee emp01 = new Employee("홍길동", 25);
		emp01.showMyOfficeInfo();
		emp01.setOffice(new Office("서울 서초동",20));
		emp01.showMyOfficeInfo();
		// ex) 다른 사무실 정보 할당 후..
		// showMyOfficeInfo() 호출
		emp01.setOffice(new Office("제주 서귀포시",30));
		emp01.showMyOfficeInfo();
		/*
		ex) 
		Subject 포할될 클래스
		   과목, 점수
		
		Student 포함할 클래스
			번호 이름
			Subject subject;
			
			void showMyPoint() 학생의 번호 이름 과목 점수 출력..
			
		 * */
		Student st1 = new Student(1,"홍길동");
		st1.showMyPoint();
		st1.setSubject(new Subject("영어", 80));
		st1.showMyPoint();	
		// 
		
	}

}
