package javaexp.z02_homework;

import java.util.Scanner;

public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
//		기본 예외 클래스를 상속 한 뒤
//		main()안에서 생성한 객체변수를 통해 생성해뒀던 생성자와 메서드를 사용하면 된다.
		
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
//		사용자 정의 예외클래스를 생성 한 뒤
//		기본 생성자가 아닌 문자열을 받는 생성자를 만든 뒤 super(전달할 문자열) 을 입력후 호출하면
//		전달한 문자열이 getMessage에 출력되게 된다.
		
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
//		class ExceptClass extends Exception{
//			String field1;
//			
//			ExceptClass(){}
//
//			public ExceptClass(String message) {
//				super(message);
//				// TODO Auto-generated constructor stub
//			}
//
//			@Override
//			public String getMessage() {
//				// TODO Auto-generated method stub
//				return super.getMessage();
//			}
//
//			public String getField1() {
//				return field1;
//			}
//
//			public void setField1(String field1) {
//				this.field1 = field1;
//			}	
//		}
//		try {
//			throw new ExceptClass("예외로 보낼 문자열");
//		}catch(ExceptClass ec) {
//			System.out.println(ec.getMessage());
//		}
		
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
//		String 으로 안녕을 저장하는경우 문자열이 바뀌지 않으면 기존 안녕이라는 문자열이 저장된 주소를 계속 사용하고
//		new String("안녕") 으로 저장하는 경우 새로운 메모리공간에 문자열이 계속 저장된다 = 주소값이 계속 바뀜
		
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요. 97~122
//		char[] password = new char[8];
//		for(int i = 0; i < password.length; i ++) {
//			password[i] = (char)(Math.random()*26 + 97);
//			System.out.print(password[i]);
//		}
		
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
//		자바 최상위 클래스는 Object이며 toString은 해당 객체에 대한 주소정보를 문자열로 전달한다.
		
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
//		String civil = "021214-2801512";
//		String inf = "";
//		for(int i = 0; i <= 7; i ++) {
//			while(i <= 5) {
//				inf += civil.charAt(i);
//				if(i == 1) {
//					inf += "년";
//				}else if(i == 3) {
//					inf += "월";
//				}else if(i == 5) {
//					inf += "일";
//				}
//				i ++;
//			}
//			while(i == 7) {
//				if(civil.charAt(i) == '1') {
//					inf += "생 남";
//				}else if(civil.charAt(i) == '2') {
//					inf += "생 여";
//				}
//				break;
//			}
//		}
//		System.out.println(inf);
		
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
//		Scanner sc = new Scanner(System.in);
//		String cartList = "모니터, 마우스, 스피커";
//		System.out.println("장바구니 목록 : " + cartList);
//		System.out.print("구매하려면 해당 물건을 입력 : ");
//		String buy = sc.nextLine();
//		int usrBuy = cartList.indexOf(buy);
//		
//		if(usrBuy != -1) {
//			System.out.println(buy + " 구매확정");
//		}else {
//			System.out.println("구매 취소");
//		}
		
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
//		String data = "홍길동&70&80-김길동&90&85-신길동&95&75";
//		String[] arry = data.split("&");
//		String data1 = "";
//		
//		for(int i = 0; i < arry.length; i ++) {
//			data1 += arry[i];
//		}
//		String[] arry1 = data1.split("-");
//		
//		for(int i = 0; i < arry1.length; i ++) {
//			System.out.println(arry1[i]);
//		}
		
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
//		String은 +=을 활용하여 문자열을 누적 대입 할 경우 heap영역을 계속 만들어서 메모리 overflow가 생긴다
//		StringBuffer은 해쉬값 변경 없이 누적대입이 되므로 메모리를 절약 할 수 있다.
//		String name1 = new String("길동");
//		System.out.println("string 주소" + System.identityHashCode(name1));
//		name1 += "홍";
//		System.out.println("string 변경후 주소" + System.identityHashCode(name1));
//		StringBuffer st = new StringBuffer("동길");
//		System.out.println("StringBuffer 주소" + System.identityHashCode(st));
//		st.append("홍");
//		System.out.println("StringBuffer 변경후 주소" + System.identityHashCode(st));

//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
		
		
	}

}
