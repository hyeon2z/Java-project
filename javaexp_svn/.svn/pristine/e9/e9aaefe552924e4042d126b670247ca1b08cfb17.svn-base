package javaexp.a09_exception;

public class A09_UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문에서 짝수번째 사용자 예외 처리
		/*
		1. 사용자정의 클래스 정의
		2. try{
			  특정 조건/특정한 라인
			  원하는 프로세스에서 정의된 내용을 예외로 처리할 때 사용.
			  throw new 사용자정의예외객체(매개데이터);
		   }catch(사용자정의예외객체 참조변수){
		      참조변수.getMessage() : 생성자에 의해 던지 매개데이터 처리
		 * */
		
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.println("번호:"+cnt);
			try {
				if(cnt%2==0) {
					throw new User01Exception(cnt+"번 예외처리");
				}
			}catch(User01Exception ue) {
				// 사용자 정의 추가 메서드 처리..
				ue.setSerialNum("#"+cnt);
				// 재정의된 메서드 호출..
				
				System.out.println(ue);
				System.out.println(ue.getMessage());
				User02 u02 = new User02("매개변수");
				System.out.println(u02);
			}
		}
	}
}
// extends Object 기본적으로 되어 있기에
// 상속에 의해, 포함하는 구성요소를 호출하여 사용하거나
// 아래와 같이 재정의 할 수 있다.
/*
class Exception{
	private String msg;
	Exception(String msg){
		this.msg = msg;
	}
	String getMessage() {
		return msg;
	}
}
*/
class User02 extends Exception{
	public User02(String message) {
		super(message);
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public String toString() {
		return "[재정의 추가]"+super.toString();
	}
}
// 사용자 정의 예외
// 1. extends Exception 상속
// 2. 추가 멤버(필드, 생성자(super()), 메서드), 메서드 재정의
class User01Exception extends Exception{
	private String serialNum;
	public User01Exception(String message) {
		super("[사용자정의예외]"+message);
		//  super.getMessage()처리..
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "^^ 안녕하세요 신기하죠!!";
	}
	// 기존메서드 재정의
	@Override
	public String getMessage() {
		return super.getMessage()+":메서드 처리(재정의)"
					+serialNum;
	}

	// 추가 메서드 처리
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	
	
	
}


/*
# 사용자 정의 예외 처리
1. 기본에 있는 Exception의 구성요소를 사용하면서, 추가적인
	필드나 메서드를 만들어서 사용자 정의 예외 클래스를 선언하고,
2. 이렇게 선언된 클래스를 객체로 사용할 수 있다.
3. 사용자 정의 예외 처리 순서
	1) 사용자정의 클래스 선언(extends Exception)
		기본 예외 클래스를 상속하여 처리한다.
		class UserException extends Exception{
		
		}
	2) 기본 생성자에서 추가할 내용이 필요하면 super()를 활용하여,
		상위 생성자의 내용을 호출하면서 처리할 수 있다.
			UserException(String msg){
				super("[사용자정의예외]"+msg);
			}
	3) 클래스를 정의할 때, 필요로 하는 필드와 메서드들을 추가하거나
		재정의해서 사용할 수 있다.
		class UserException extends Exception{
			private String name; // 추가 필드
			public void setName(String name){ // 추가 메서드
				this.name = name;
			}
			// 기존의 메서드 재정의 처리..
			public String getMessage(){
				return "[재정의 메서드]"+super.getMessage()
			}
	4) main()이나 다른 클래스의 메서드에서 호출
			try{
				if(조건){
					throw new UserException(); 
				}
			}catch(UserException ue){
				System.out.println(ue.getMessage());
			}
 * */
