package javaexp.a09_exception;

public class A10_UserException {

	public static void main(String[] args) {
		for(int i = 1; i <= 20; i ++) {
			System.out.println("카운트 : " + i);
			try {
				if(i % 3 == 0) {
					throw new UserExpt();
				}
				if(i % 3 == 1) {
					throw new UserExpt("3의 배수에서 1이 남음");
				}
			}catch(UserExpt ue) {
				ue.call();
				if(ue.getMessage()!=null) 
					System.out.println(ue.getMessage());
				
			}
		}
	}

}

class UserExpt extends Exception{
	public UserExpt() {}
	
	public UserExpt(String msg) {
		super(msg); // ==> e.getMessage();
	}
	
	public void call() {
		System.out.println("사용자정의 예외 출력(3의배수)");
	}
}
/*
# 처리 순서
1. 사용자정의 예외 처리 클래스 선언
    class XXX extends Exception{}
2. main()에서 호출하는 처리
*/
// ex) 사용자정의 예외 클래스 UserExpt 선언하고,
//     기능메서드로 void call()로 사용자정의 예외 출력이라고 출력 추가하는 메서드 정의
//     그리고 반복문에서 이번에는 3의 배수일 때, 호출되게 하세요.
