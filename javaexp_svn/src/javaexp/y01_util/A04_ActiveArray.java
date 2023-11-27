package javaexp.y01_util;

import java.util.ArrayList;

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
		3. ArrayList<타입>로 여러가지 객체들을 동적으로 추가하거나
		 	삭제할 수 있다.
		 * */
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");  // 동적배열에 String 타입으로 추가 처리
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		fruits.set(0, "오렌지"); // 특정한 index 위치 변경for(String fruit:fruits) {
		System.out.println("# 변경 후 #");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		fruits.remove(1); // 특정한 index 위치 삭제
		System.out.println("# 삭제 후 #");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}	
		// ex) members 라는 이름으로 동적 배열을 위와 같이 만들고
		//     회원이름 3명을 추가, 2번째 데이터변경, 마지막데이터 삭제
		//     하고 출력 하세요.
		ArrayList<String> mlist = new ArrayList<String>();
		mlist.add("홍길동");
		mlist.add("김길동");
		mlist.add("신길동");
		mlist.set(1,"마길동");
		mlist.remove(2);
		System.out.println("# 최종 회원 리스트 #");
		for(String mem:mlist) {
			System.out.println(mem);
		}
		ArrayList<Student> stList 
			= new ArrayList<Student>();
		// 추가..
		stList.add(new Student(1,"홍길동",2));
		stList.add(new Student(2,"김길동",3));
		stList.add(new Student(3,"신길동",1));
		// 수정
		stList.set(0, new Student(4,"오길동",1));
		// 삭제 
		stList.remove(1);
		System.out.println("# 학생 동적 배열 리스트#");
		System.out.println("번호\t이름\t학년");
		for(Student st:stList) {
			System.out.print(st.getNo()+"\t");
			System.out.print(st.getName()+"\t");
			System.out.print(st.getGrade()+"\n");
		}
		// ex) Car(종류, 속도) 5개를 위 ArrayList형식으로 추가
		//     3번째 변경,  1번째 삭제 후 for문을 통해서 종류와 속도를 출력
		
		ArrayList<Car> clist = new ArrayList<Car>();
		clist.add(new Car("그랜저",250));
		clist.add(new Car("소나타",230));
		clist.add(new Car("K7",230));
		clist.add(new Car("SM5",240));
		clist.add(new Car("제규어",280));
		clist.set(2,new Car("K9",250));
		clist.remove(0);
		System.out.println("크기:"+clist.size());
		System.out.println("# 자동차 리스트 #");

		for(Car car:clist) {
			System.out.print(car.getKind()+"\t");
			System.out.print(car.getSpeed()+"\n");
		}
		
		
		
	}

}
