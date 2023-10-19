package javaexp.a09_exception;

public class A02_ExceptionBasic {

	public static void main(String[] args) {
		try {
			for(int i = 1; i <= 100; i ++) {
				System.out.println(i);
				if(i == 50) {
					System.out.println(i / 0);
				}
			}
		}catch(Exception e){
			System.out.println("오류" + e.getMessage());
		}
	}

}
