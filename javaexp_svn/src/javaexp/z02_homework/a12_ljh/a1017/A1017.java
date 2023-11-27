package javaexp.z02_homework.a12_ljh.a1017;

public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요.
		/*
		1) 사용자 정의 예외 클래스 생성
			사용자 정의 예외 클래스(extends Exception) {
				기본 생성자 추가
				클래스명(String message) {
					super("사용자 정의 예외" + message);
				}
				public void 메서드명(){
					프로세스
				}
			}
		2) main()에서 호출
			try{
				예외 처리될 코드
			} catch(사용자 정의 예외 클래스 e) {
				사용자 정의 추가 메서드 처리
				재정의 된 메서드 호출
			}
		
		 */
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
		/*
		1) 사용자 정의 예외 클래스의 생성자:  메인 메서드에서 사용자 정의 예외 클래스를 호출 시, 상속 받은 Exception 클래스의 생성자와 추가한 사용자 정의 예외를 호출한다.
		2) getMessage(): 상속 받은 Exception 클래스의 메서드를 재정의하여 호출할 수 있다.
		즉, 사용자 정의 예외 클래스의 생성자는 메인에 호출 시, 자동적으로 실행되고 getMessage()는 클래스의 객체를 통해 따로 호출해야 실행된다.
		
		 */
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
		/*
		class UserDefineException extends Exception {
			// 필드
			private String str1;
			// 생성자
			public UserDefineException(String message) {
				super("# 추가 에외 #" + message);
			}
			// 메서드 재정의
			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return super.getMessage() + "# 메서드 재정의 #";
			}
			// 메서드 추가 정의
			public String getStr1() {
				return str1;
			}
			public void setStr1(String str1) {
				this.str1 = str1;
			}
			
		}
		
		try {	// 사용자 정의 예외 객체 생성
			throw new UserDefineException("사용자 정의 예외");
		} catch (UserDefineException e2) {
			// TODO: handle exception
			// 추가 메서드 호출
			e2.setStr1("hello");
			// 재정의 메서드 출력
			System.out.println(e2.getMessage());
		}
		*/
		
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
		/*
		1) "안녕" : 문자열 바로 대입한 것은 문자열이 같으면 모두 주소가 같다.
		2) new String("안녕") : 객체를 생성하여 다른 위치에 생성 된다.
		 */
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
		/*
		for(int code = Byte.MIN_VALUE; code<=Byte.MAX_VALUE; code++) {
			System.out.print(code + " : " + (char)code + "  ");
			if(code%10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		byte [] pass = new byte[8];
		for(int cnt=0; cnt<8; cnt++) {
			byte idx = (byte)(Math.random()*26+97);
			pass[cnt] = idx;
		}
		System.out.println("생성된 비밀번호: " + new String(pass));
		 */
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
		/*
		자바의 최상위 클래스는 Object 클래스이며, toString()은 디폴트로 주소값을 사람이 볼 수 있게 문자열로 변환 시켜주며 재정의해서 사용할 수 있는 메서드이다.
		 */
		
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
		/*
		String civil = "021214-2801512";
		String year = civil.substring(0, 2);
		String month = civil.substring(2, 4);
		String date = civil.substring(4, 6);
		System.out.print(year + "년 " + month + "월 " + date + "일생");
		if(civil.substring(7,8).equals("1") || civil.substring(7,8).equals("3")) {
			System.out.println(" 남");
		}else {
			System.out.println(" 여");
		}
		System.out.println();
		*/
		
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
		/*
		String data = "홍길동&70&80-김길동&90&85-신길동&95&75";
		String [] persons = data.split("-");
		for(String person : persons) {
			String[] info = person.split("&");
			System.out.println(info[0] + " " + info[1] + "\t" + info[2]);
		}
		*/
		
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
		/*
		// String
		String str = "Good";
		System.out.println("초기 주소값: " + System.identityHashCode(str));
		str += " night";			// 새로운 String 객체 생성
		System.out.println(str);
		System.out.println("추가후 주소값: " + System.identityHashCode(str));
		
		// StringBuffer
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("초기 주소값: " + System.identityHashCode(sb));
		sb.append(" World");		// 동일한 StringBuffer 객체 내에서 변경
		
		System.out.println(sb);
		System.out.println("추가후 주소값: " + System.identityHashCode(sb));
		*/
		
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
		
		
	}

}
