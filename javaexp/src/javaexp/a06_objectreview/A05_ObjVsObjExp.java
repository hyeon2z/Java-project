package javaexp.a06_objectreview;

import javaexp.a06_objectreview.vo.Office;
import javaexp.a06_objectreview.vo.Employee;
import javaexp.a06_objectreview.vo.Student;
import javaexp.a06_objectreview.vo.Subject;

public class A05_ObjVsObjExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ex) Office(포함될 객체)
				location(위치), capcity(수용인원)
			Employee(포함할 객체)
				name(이름), age(나이)
				Office office
				setXXX
				getXXX
				void showMyOfficeInfo() 위 포함될 객체의 정보 출력
		 */
		Office of01 = new Office("서울", 250);
		
		Employee em01 = new Employee("홍길동", 25);
		em01.setOffice(of01);
		em01.showMyOfficeInfo();
		em01.setOffice(new Office("서초구", 500));
		em01.showMyOfficeInfo();
		// ex) 다른 사무실 정보 할당 후
		// showMyOfficeInfo() 호출
		
		/*
		Subject 포함될 클래스
			과목, 점수
			
		Student 포함할 클래스
			번호 이름
			Subject subject;
			void showMyPoint() 학생의 번호 이름 과목점수 출력
		 */
		Student st01 = new Student(2, "홍길동");
		st01.setSubject(new Subject("국어", 98));
		st01.showMyPoint();
		
	}

}
