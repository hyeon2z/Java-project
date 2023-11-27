package javaexp.z02_homework.a04_asy;

public class A1017 {

	public static void main(String[] args) {
/*		
 		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
		# main()호출 규칙
			try {
				처리1
				처리2
				에러가 발생할 가능성 있는 코드
			}catch(Exception e) {
				처리3
			} 
		# 사용자 정의 예외 클래스 생성
			class 클래스명 extends Exception{}	//클래스 선언
		
		
		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
						- getMessage() 메서드를 통해 예외가 발생했을때 전달되는 메세지를 반환. 
						- 사용자 정의 예외 클래스의 생성자는 예외가 발생했을 때 전달되는 메세지를 받을 수 있고,
						  getMessage()메서드는 예외가 발생했을 때 전달된 메세지를 반환함.
						- 즉, 사용자 정의 예외 클래스의 생성자를 호출하면 예외 메세지를 getMessage()메서드를 통하여 확인 가능 
		
		
						(ex)Person(String msg){
							super(msg)
							}
							throw new Person("안녕");
							
							catch(Person p){
								p.getMessage() : 안녕
								}
		
		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
					*/
		
		//사용자 정의 예외 클래스
		//User 클래스는 Exception 클래스를 상속하여 사용자 정의 예외 클래스로 선언
		class User extends Exception{	
		
		//필드
		//private 타입의 필드 num을 선언하여 사용자 정보 저장
		private String num="시작!";
		
		//사용자 정의 예외 처리 생성자
		//String 타입의 매개변수를 받는 User() 생성자를 선언하여 num 필드를 초기화
		public User(String user2) {
			super("사용자정의 예외 생성자"+user2);
			this.num=user2;
		}

		//기존 메서드 재정의
		//Exception 클래스의 getMessage() 메서드를 재정의하여 사용 정보 추가
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return super.getMessage()+":재정의된 메서드"+num;
		}
		
		//추가 메서드 처리
		public String getNum() {
			return num;
		}
		public void setNum(String num) {
			this.num=num;
		}
		
	}	
	
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.

			//		String str1 ="안녕";
			//		String str2 ="안녕";
			//		"안녕"이라고 사용하는 곳은 heap영역에 같은 곳을 바라본다.
					
			//		String str3 = new String("안녕");
			//		String str4 = new String("안녕");
			//		str3, str5는 다른 heap주소를 가진다. 
//		
		
//		[1단계:확인]  5. new String(byte[])을 이용하여, 
//					영문 소문자을 임의로 비번호를 만들어 출력하세요.
		
		
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?

		
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력

		
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..

		
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
		
	
	
	
	
	}

}
		
		