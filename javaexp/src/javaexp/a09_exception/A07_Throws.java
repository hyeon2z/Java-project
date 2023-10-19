package javaexp.a09_exception;

import java.io.IOException;

public class A07_Throws {
	/*
	main()을 가지고 있는 클래스의 경우 객체 생성없이 바로 사용할 때, main()메서드가 static 이기에
	바로 사용할 수 있도록 하기 위해 선언한다.
	main()
	    static 아닌 경우 A07_throws
	                  a07 = new A07_throws();
	                  a07.메서드명();
	 */
	
	
	
	static void call01() throws ClassNotFoundException{
		System.out.println("#메서드#1");
		Class.forName("aaa.bbb.ccc");
	}
	// 각 메서드 마다 try catch문을 만들어야 하는데, 이것을 한 곳에서 호출하는 곳까지 한번에 처리하고자 할 때
	
	static void call02() throws ClassNotFoundException{
		System.out.println("#메서드#2");
		Class.forName("kkk.ppp.ooo");
	}
	static void call03() throws IOException {
		// call03(),call04() 만들고 필수예외 위임처리
		System.out.println(System.in.read());
	}
	static void call04() throws IOException {
		// call03(),call04() 만들고 필수예외 위임처리
		System.out.println(System.in.read());
	}
	
	public static void main(String[] args) {
		try {
			// 메서드에서 위임된 예외 처리
			call03();
			call04();
		} catch (IOException e) {
			// 최상위 상속관계에 있기에 모든 위임 예외를
			// 한꺼번에 처리할 수 있다.
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		try {
			call01(); // 위임된 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			call02(); // 위임된 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			call01(); // 위임된 예외 처리
			call02(); // 위임된 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		# 예외 위임
		1. 메서드별로 예외를 위임해서 한꺼번에 호출하는 곳에서 처리하는 것을 말한다.
		2. 기본형식
		    void 메서드명1() throws 위임할 클래스{
		        예외가 나올만한 코드..
		    }
		    void 메서드명2() throws 위임할 클래스{
		        예외가 나올만한 코드..
		    }
		    
		    호출하는 곳
		    try
		        메서드명1();
		        메서드명2();
		    }catch(위임할클래스 e){
		    
		    }
		 */
	}

}
