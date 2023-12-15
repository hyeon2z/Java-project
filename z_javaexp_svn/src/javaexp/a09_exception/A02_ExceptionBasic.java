package javaexp.a09_exception;

public class A02_ExceptionBasic {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			for(int cnt=1;cnt<=100;cnt++) {
				System.out.println(cnt+"번째!!");
				if(cnt==50) {
					System.out.println(1/0);
				}
			}			
		}catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
		
	}

}
