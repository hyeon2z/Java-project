package javaexp.z02_homework.a19_cjw;

import java.util.Scanner;

public class A1017_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
		/*
		기본형식
			class 클래스명 extends Exception{	// 기본 예외클래스를 상속하여 생성한다.
				상위 예외클래스의 메서드 또는 필드 재정의
				필드와 메서드 새롭게 추가 가능
			}
			---------------
			main()
			try{
 				if(조건){
 					throw new 클래스명();
 					// 클래스를 호출하는 부분으로 생성자에 매개변수를 사용했다면()를 채워야한다.
 					// 그리고 생성자에서 상위 생성자를 호출하여 매개변수를 넣었다면( super(매개변수+추가내용) )
 					// catch에서 getMessage()를 호출하여 매개변수+추가내용을 출력할 수 있다.
 				}
 			}catch(클래스명 객체명){
 				메서드 호출 또는 새로운 내용 출력
 			}
		 * */
		
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
		/*
		getMessage()는 상위 예외클래스의 생성자의 매개변수값을 출력하는 메서드이다.
		따라서 사용자가 예외클래스를 생성할 당시 생성자에 문자열 매개변수를 사용하고
		super()를 사용하여 받은 상위클래스의 생성자에 그 매개변수를 넣는다면(super(매개변수+추가내용))
		super()속 내용이 getMessage()에 의해 출력된다.
		 * */
		
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt%2==0) {
				System.out.println(cnt+"번");
			}
			try {
				if(cnt%2==1) {
					throw new UserException("홀수입니다.");
				}
			}catch(UserException ue) {
				ue.setNum(cnt);
				System.out.println(ue.getMessage());
			}
		}
		
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
		String str1 = "안녕";
		String str2 = new String("안녕");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		/*
		String은 기본 데이터 형태가 아니라 기본 데이터 형태인 char의 배열이기 때문에
		heap영역에 데이터가 할당된 후, 할당된 heap영역의 주소값이 stack영역에 할당된다.
		그래도 같은 데이터를 할당하면 같은 주소값을 가지게 되지만
		new를 사용하면 무조건 객체/배열이 새로운 위치(heap)에 생성된다.
		참고) ==는 stack영역의 값을 비교하며,
			.equals()는 stack영역의 주소값을 참조하여 heap영역의 데이터를 비교한다.
			따라서 문자열을 비교할 때는 .equals()를 사용해야 한다.
		 * */
		
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요. 97~122
		byte[] bytes = {(byte)(Math.random()*26+97),(byte)(Math.random()*26+97)
				,(byte)(Math.random()*26+97),(byte)(Math.random()*26+97)
				,(byte)(Math.random()*26+97),(byte)(Math.random()*26+97)};
		String password = new String(bytes);
		System.out.println("임의의 6자리 비밀번호(영문소문자로만): "+password);
		
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
		/*
		자바의 최상위 클래스는 Object로 자바의 모든 클래스들은 암묵적으로 Object를 상속받고 있다.
		Object의 메서드인 toString()은 객체의 stack영역에 할당된 heap영역의 주소값을 리턴한다.
		이를 새 클래서에서 재정의하여 리턴값을 임의로 바꾸면 객체를 출력했을때 주소값이 아닌 재정의한 리턴값이 출력된다.
		 * */
		
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서
//					   @@@년 @@월 @@일생 남/여 출력
		String civil="021214-2801512";
		char[] info = new char[16];
		info[0] = '2';
		info[1] = '0';
		info[2] = civil.charAt(0);
		info[3] = civil.charAt(1);
		info[4] = '년';
		info[5] = ' ';
		info[6] = civil.charAt(2);
		info[7] = civil.charAt(3);
		info[8] = '월';
		info[9] = ' ';
		info[10] = civil.charAt(4);
		info[11] = civil.charAt(5);
		info[12] = '일';
		info[13] = '생';
		info[14] = ' ';
		if(civil.charAt(7)=='1'||civil.charAt(7)=='3') {
			info[15] = '남';
		}else if(civil.charAt(7)=='2'||civil.charAt(7)=='4') {
			info[15] = '여';
		}
		String information = new String(info);
		System.out.println(information);
		
		
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고,
//					   Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
		String cartList = "가방, 신발, 바지, 셔츠";
		Scanner sc = new Scanner(System.in);
		System.out.print("장바구니에 있는지 확인할 물건: ");
		String cartCheck = sc.nextLine();
		if(cartList.indexOf(cartCheck)!=-1) {
			System.out.println(cartCheck+" 장바구니에 존재");
		}else {
			System.out.println(cartCheck+" 장바구니에 없음");
		}
		
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//					   for문을 2중으로 사용 처리..
//				      		홍길동 70	80 
//				      		김길동 90	85 
//				      		신길동 95	75 
		String data = "홍길동&70&80-김길동&90&85-신길동&95&75";
		String[] people = data.split("-");
		for(int idx=0;idx<people.length;idx++) {
			String[] person = people[idx].split("&");
			for(String pData:person) {
				System.out.print(pData+"\t");
			}
			System.out.println();
		}
		
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
		/*
		String은 데이터를 +=를 통해 누적할 때마다(데이터가 변할때마다) heap영역에 저장된 위치도 변경된다.
		그러나 StringBuffer 객체를 사용하면 데이터가 변경되어도 저장된 위치는 그대로이다.
		 * */
		String str3 = "문자";
		System.out.println("String 초기주소값: "+System.identityHashCode(str3));
		str3 += "열";
		System.out.println("String 최종주소값: "+System.identityHashCode(str3));
		StringBuffer str4 = new StringBuffer("문자");
		System.out.println("StringBuffer 초기주소값: "+System.identityHashCode(str4));
		str4.append("열");
		System.out.println("StringBuffer 최종주소값: "+System.identityHashCode(str4));
		
	}

}

//[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
class UserException extends Exception{
	
	// 필드 생성
	private int num;
	
	// 생성자 재정의
	public UserException(String message) {
		super("사용자 정의 예외처리: "+message);
	}

	// 메서드 재정의
	@Override
	public String getMessage() {
		return num+"번 "+super.getMessage();
	}
	
	// 추가 정의 메서드
	public void setNum(int num) {
		this.num = num;
	}
}
