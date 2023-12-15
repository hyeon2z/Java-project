package javaexp.z02_homework.a05_kjh;


public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
		//class XXX extends Exception{}로 선언하여 기존 예외를 상속하여 처리한다.
		// 기본 생성자에서 추가할 내용이 필요하면 super()를 활용하여  상위 생성자의 내용을 호출하면서 처리할 수 있다.
		// 클래스를 정의할 때 필요로 하는 필드와 메서드들을 추가하거나 재정의해서 사용할 수 있다.
		// 사용자 정의 예외 클래스를 main()에서 호출하는 예시는 다음과 같다. try구문 안에 조건문을 사용하여
		//	클래스를 던져 처리한다.
		//	try{
//			if(조건){
//				throw new userException();
//			}
//  	
//  			}catch(userException ue){
//  					System.out.println(ue.getMessage());
//  			}
		
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
		// 사용자 정의 예외 클래스에서는 super()를 이용하여 생성자를 호출할 수 있다. 이 때 super() 안에
		// 적힌 내용은 .getMessage()와 같은 역할을 한다.
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
		
//		class uce extends Exception{
//			//필드
//			private String num;
//			public uce(String message) {
//				super("[사용자정의예외클래스]"+message);
//				
//			}
//			// 메서드 재정의
//			@Override
//			public String getMessage() {
//				return super.getMessage()
//			}
//
//			//추가 메서드 
//			public String getnum() {
//				return num;
//			}
//			public void setnum(String num) {
//				this.num = num;
//			}
//			
//			
//		}
		//호출
//		try {
//			if(조건) {
//				throw new uce();
//			}
//		}catch(uce ue) {
//			ue.setSerialNum();
//			System.out.println(ue.getMessage());
//		}
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
		// String hi = "안녕";의 heap 메모리 주소는 1239731077이다
		// String hi2 = "안녕";의 heap 메모리 주소는 1239731077이다
		// 같은 문자열이라면 heap메모리 상의 주소는 같다. 하지만 
		// new String("안녕")의 메모리 주소는 557041912이다.
		// 즉, 위 두 방식의 차이는 같은 문자열이어도 메모리 주소가 다르게 할당된다는 것이다.
//		String hi  = "안녕";
//		String hi2 = "안녕";
//		String hi3 = new String("안녕");
//		System.out.println(System.identityHashCode(hi));
//		System.out.println(System.identityHashCode(hi2));
//		System.out.println(System.identityHashCode(hi3));
		
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비밀번호를 만들어 출력하세요.
//		for(int ap=1;ap<=200;ap++) {
//			System.out.println(ap+":"+(char)ap);
//		}
//		byte[] pw = {80, 97, 115, 115, 119, 111, 114, 100};
//		String pass = new String(pw);
//		System.out.println(pass);
		
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
		// 자바의 최상위 클래스는 Object이다. toString()은 객체를 문자열로 반환하는 역할을 한다.
		// toString()메서드를 이용해 객체를 문자열로 표현할 수 있다.
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
//		String civil="021214-2801512";
//		char [] birth = new char[12];
//				birth[0]=civil.charAt(0);
//				birth[1]=civil.charAt(1);
//				birth[2]='년';
//				birth[3]=civil.charAt(2);
//				birth[4]=civil.charAt(3);
//				birth[5]='월';
//				birth[6]=civil.charAt(4);
//				birth[7]=civil.charAt(5);
//				birth[8]='일';
//				birth[9]=' ';
//				birth[10]='여';
//		String bDay = new String(birth);
//		System.out.println(19+bDay);
			
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
		
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
//		String과 StringBuffer의 차이점은 다음과 같다
		String name="홍길동"; System.out.println(System.identityHashCode(name));
		name+="!"; System.out.println(System.identityHashCode(name));
		//String은 +=를 이용하여 문자열을 추가할 수 있으나 이 경우 메모리를 재할당한다. 이는
		// 반복문에 이용했을 때 메모리의 오버플로우를 불러올 수 있다.
		StringBuffer name2 = new StringBuffer("김길동");
		System.out.println(System.identityHashCode(name2));
		name2.append("!"); System.out.println(System.identityHashCode(name2));
		//StringBuffer는 String과는 달리 +=가 아닌 .append()메서드를 이용하여 문자열울 추가한다.
		//이는 메모리의 재할당이 일어나지 않아 메모리를 관리할 때 좋다.
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
		
		
	}

}
