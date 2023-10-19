package javaexp.a09_exception;

public class A08_ThrowException {

	public static void main(String[] args) {
		/*
		# throw : 특정한 조건이나 코드에서 강제 예외처리
		1. 기본 코드
		    throw new 강제예외Exception(); 호출..
		 */
		try {
			System.out.println("# 강제 예외 처리 #");
			System.out.println("프로세스1");
			// 특정라인에서 예외를 던지기 처리
			// 생성자로 넘겨준 문자열 내용은 e.getMessage()로 해당 값을 리턴할 수 있다.
			throw new Exception("강제예외");
			
		}catch(Exception e) {
			System.out.println("강제예외처리결과 : " + e.getMessage());
		}
		try {
			System.out.println("# 강제 예외 처리 #");
			for(int cnt = 1; cnt <= 10; cnt ++) {
				if(cnt == 5) {
					throw new Exception(cnt + "강제예외 입니다");
				}
			}
			
		}catch(Exception e) {
			System.out.println("강제예외처리결과 : " + e.getMessage());
		}
		
		// ex) 1~10까지 반복문에서 짝수번째에 NullPointException을 강제예외 처리
		for(int i = 1; i <= 10; i ++) {
			try {
				if(i%2 == 0) {
					throw new NullPointerException(i + "강제예외");
				}
			}catch(NullPointerException e) {
				System.out.println("예외 처리결과 : " + e.getMessage());
			}
		}
		
	}

}
