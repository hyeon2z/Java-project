package javaexp.y01_util;

import java.util.ArrayList;
import java.util.Scanner;

import javaexp.a06_object.vo.Car;
import javaexp.a06_object.vo.Student;

public class A04_ActiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 동적 배열
		 1. 자바의 기본 배열을 한번 크기가 정해지면, 변경을 할 수 없다.
		 2. 자바에서는 동적 배열을 지원하는 객체를 api에서 제공하고 있다.
		     1) Collection 안에 List/ArrayList
		 3. ArrayList<타입> 으로 여러가지 객체들을 동적으로 추가하거나 삭제할 수 있다.
		 
		 */
//		ArrayList<String> fruits = new ArrayList<String>();
//		fruits.add("사과");
//		fruits.add("바나나");
//		fruits.add("딸기"); // 동적배열에 String 타입으로 추가처리
//		
//		for(String fruit:fruits) {
//			System.out.println(fruit);
//		}
//		fruits.set(0, "오렌지"); // 특정한 index 위치 변경 for(S
//		System.out.println("# 변경 후 #");
//		for(String fruit : fruits) {
//			System.out.println(fruit);
//		}
//		fruits.remove(1); // 특정한 index 위치 삭제
//		System.out.println("# 삭제 후 #");
//		for(String fruit : fruits) {
//			System.out.println(fruit);
//		}
		// ex) members 라는 이름으로 동적 배열을 위와 같이 만들고 회원이름 3명을 추가,
		// 2번째 데이터 변경, 마지막데이터 삭제하고 출력
		
//		ArrayList<String> members = new ArrayList<String>();
//		members.add("홍길동");
//		members.add("김길동");
//		members.add("장길동");
//		
//		System.out.println("변경 전");
//		for(String member : members) {
//			System.out.println(member);
//		}
//		
//		members.set(1, "배길동");
//
//		System.out.println("변경한 뒤");
//		for(String member : members) {
//			System.out.println(member);
//		}
		ArrayList<Student> stList = new ArrayList<Student>();
		//추가
//		stList.add(new Student(1, "홍길동", 2));
//		stList.add(new Student(2, "김길동", 5));
//		stList.add(new Student(3, "이길동", 1));
//		// 수정
//		stList.set(0, new Student(4,"오길동",1));
//		// 삭제
//		stList.remove(1);
//		System.out.println("# 학생 동적배열 리스트 #");
//		System.out.println("번호\t이름\t학년");
//		for(Student st : stList) {
//			System.out.println(st.getNum() + "\t");
//			System.out.println(st.getName() + "\t");
//			System.out.println(st.getGrade() + "\t");
//		}
		// ex) Car(종류, 속도) 5개를 위 ArrayList 형식으로 추가
		//		3번째 변경, 1번째 삭제 후 for문을 통해서 종류와 속도를
		
		ArrayList<Car> clist = new ArrayList<Car>();
		
//		clist.add(new Car(150, "그렌저"));
//		clist.add(new Car(70, "모닝"));
//		clist.add(new Car(100, "아반떼"));
//		clist.add(new Car(120, "포터"));
//		clist.add(new Car(110, "벤츠"));
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		clist.add(new Car(Integer.parseInt(sc.nextLine()), sc.nextLine()));
//		clist.set(2, new Car(40, "현대차"));
		
//		clist.remove(0);
		
//		System.out.println("#차량의 종류와 속도#");
		for(Car car : clist) {
			System.out.println("차량종류 : " + car.getKind());
			System.out.println("차량의 속도 : " + car.getSpeed());
		}
//		System.out.println(clist.get(0));
	}

}
