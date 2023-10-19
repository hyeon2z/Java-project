package javaexp.a11_collection;

import java.util.ArrayList;
import java.util.List;

import javaexp.a11_collection.vo.Person;
import javaexp.a11_collection.vo.Student;

public class A05_ObjectCollections {

	public static void main(String[] args) {
		/*
		# 객체형 Collection 활용
		1. 자바의 클래스를 만들어서 단위 객체를 사용할 수 있게 하고,
		    이것을 Collection에 활용하는 형태로
		2. 실무적 활용도가 높다
		
		# 처리 순서
		1. class 선언
		    컬렉션에 넣을 단위 내용을 VO클래스로 선언한다.
		2. List/Map에 할당하여 처리하기
		    생성자나 메서드를 통해서 데이터를 넣은 컬렉션을 만든다.
		3. 반복문을 통해서 개별 단위 객체를 가지고 오고,
		    해당 속성들을 getXXX()에 의해서 로딩 및 활용한다.
		 */
		// 학생정보(이름/국어/수학/영어)
		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student("홍길동",70,80,90));
		studs.add(new Student("김길동",80,80,95));
		studs.add(new Student("신길동",90,85,90));
		System.out.println("이름\t국어\t영어\t수학");
		for(Student st : studs) {
			System.out.print(st.getName() + "\t");
			System.out.print(st.getKor() + "\t");
			System.out.print(st.getEng() + "\t");
			System.out.print(st.getMath() + "\n");
		}
		// ex) 기본단위정보를 Person으로 사람의 이름, 나이, 사는 곳으로 하여
		// 해당 Person 3명의 정보를 위 List<Person>으로 처리/출력
		List<Person> ps1 = new ArrayList<Person>();
		ps1.add(new Person("길동", 25, "강남구"));
		ps1.add(new Person("민수", 22, "강북구"));
		ps1.add(new Person("철수", 28, "서초구"));
		
		for(Person p1 : ps1) {
			System.out.print(p1.getName() + "\t");
			System.out.print(p1.getAge() + "\t");
			System.out.print(p1.getHome() + "\n");
		}
	}

}
