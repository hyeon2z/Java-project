package javaexp.a06_object.inner;

import javaexp.a06_object.Baby;
import javaexp.a06_object.Book;
import javaexp.a06_object.Puppy;
// javaexp.a06_object.inner
// 앞에 패키지명이 같더라도 모든 패키지가 다르면
// 다른 패키지이다.
public class CallObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 외부 패키지에 있는 클래스를
		// 객체로 생성할려면
		// 1. import
		// 2. 객체 생성해서
		// 3. 해당 구성요소가 접근제어자가 public 이어야 한다.
		Puppy p01; 
		// class에 선언시 접근제어자 확인 public class Puppy 
		p01= new Puppy(); // class 에 포함된 생성자에 따라 확인
		// p01.kind는 접근제어자가 public 아니기에 
		// 외부패키지에서 호출이 안된다.
		p01.name="댕댕이2";
		Book b1 = new Book();
		b1.title="jsp기초";
//		b1.price : 접근제어자 범위가 public이 아니기에 외부에서
//         직접적으로 호출해서 사용할 수 없다.
		// 다른 패키지에 선언된 클래스를
		// 객체로 사용할려면
		// 1. import
		// 2. class앞에 접근제어자가 public
		Baby bab01;
		
		
		
		
	}

}
