package javaexp.a06_object.vo;

import java.util.ArrayList;
import java.util.List;

// 다수의 내용을 포함하는 클래스
public class School {
	private String name; // 학교명
	// 다수의 Student를 동적으로 포함할 수 있는 객체
	// ArrayList<클래스명> 
	private ArrayList<Student> students;
	public School() {
	}
	public School(String name) {
		this.name = name;
		System.out.println(name+"학교 설립!!");
		// 다수의 동적배열 객체를 생성자가 만들어 질 때
		// 생성 처리..
		students = new ArrayList<Student>();
	}
	// School sch = new School("쌍용");
	// sch.showSchoolInfo();  // 등록되지 않음.
	// sch.regStudent(new Student(1,"홍길동",1));
	// sch.regStudent(new Student(2,"김길동",1));
	// sch.regStudent(new Student(3,"신길동",1));
	// sch.showSchoolInfo(); // 등록된 리스트 출력..
	// 학교에 학생을 등록
	public void regStudent(Student st) {
		students.add(st);
		System.out.println(st.getName()+" 학생을 등록했습니다.");
		System.out.println("현재 학생 수는 "+
				students.size()+"명 입니다");
	}
	// 등록된 학생 리스트
	public void showSchoolInfo() {
		System.out.println("# "+name+"학교의 학생정보 #");
		if(students.size()>0) { // .size() 크기를 가져온다.
			System.out.println("학생은 "+students.size()+"명!");
			for(Student st:students) {
				System.out.print(st.getNo()+"\t");
				System.out.print(st.getName()+"\t");
				System.out.print(st.getGrade()+"\n");
			}
		}else {
			System.out.println("학생이 없네요!!");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	
	
	
}
