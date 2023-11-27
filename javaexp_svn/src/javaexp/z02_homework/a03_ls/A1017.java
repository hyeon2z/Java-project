package javaexp.z02_homework.a03_ls;

import java.util.Scanner;

public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
		
		/*
		사용자 정의 예외 클래스는 class 클래스명 extends Exception{} 형태로 생성하고 
		main에서 try, catch 구문을 통해 try 안에 throw 클래스명 을 통해 
		catch로 받아서 수행하게 할 수 있습니다. 
		 * */
		
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
		
		/*
		사용자 정의 예외 클래스의 생성자를 생성하여 main 쪽에서 생성자를 넣어 호출할 수 있게 하는데,
		만약에 생성자 정의 예외 클래스의 생성자에서 super 나 내가 추가하고 싶은 내용을 기술해 넣으면
		Exception 클래스에서의 message부분으로 저장되고
		이 내용을 getMessage() 로 다시 호출할 수 있는걸로 알고있습니다.
		 * */
		
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 
//		추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
		
		
//		try {
//			throw new User001("하....");
//		}catch(User001 u01) {
//			System.out.print(u01.a);u01.call();
//		}
		
		
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
			
		/*
		그냥 안녕은 다른변수로 계속 선언해도 동일한 주소값인데
		new String 안녕은 다른 변수명으로 선언하면 새로운 주소값이 뜬다. 
		 * */
		
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
		
		byte[] bytes = new byte[6];
		for (int idx = 0; idx < bytes.length; idx++) {
			bytes[idx] = (byte) (Math.random() * 26 + 97);
		}
		String str = new String(bytes);
		System.out.println("#임시비밀번호#");
		System.out.println(str);
		
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
		
		/*
		자바의 최상위 클래스는 Object이고 toStirng()은 해당 클래스의 객체를 문자열로 표현하는 역할을 합니다.
		 * */
		
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서 
//				@@@년 @@월 @@일생 남/여  출력
		StringBuffer sb = new StringBuffer();
		String civil="021214-2801512";
		for(int a =0; a<=1; a++) {
			sb.append(civil.charAt(a));
		}sb.append("년생");
		for(int a =2; a<=3; a++) {
			sb.append(civil.charAt(a));
		}sb.append("월");
		for(int a =4; a<=5; a++) {
			sb.append(civil.charAt(a));
		}sb.append("일");
		for(int a =7; a<=7; a++) {
			sb.append(civil.charAt(a));
		}sb.append("여자");
		
		System.out.println(sb);
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고,
//				Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
		
		String cartList = "사과,바나나,딸기";
		Scanner sc = new Scanner(System.in);
		System.out.println("장바구니 리스트 : "+cartList);
		System.out.println("구매할 물건을 입력하세여");
		String buyList = sc.nextLine();
		if(cartList.indexOf(buyList)!=-1) {
			System.out.println("구매할 물건이 장바구니에 담겨있습니다");
		} else {
			System.out.println("구매할 물건이 장바구니에 없습니다.");
		}
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
		String arry[] = "홍길동&70&80-김길동&90&85-신길동&95&75".split("-");
		for (int idx = 0; idx < arry.length; idx++) {
			String arry01[] = arry[idx].split("&");
			for (int idx01 = 0; idx01 < arry01.length; idx01++) {
				if (idx01 == 0) {
					System.out.print(arry01[idx01] + "\t");
				}
				if (idx01 == 1) {
					System.out.print(arry01[idx01] + "\t");
				}
				if (idx01 == 2) {
					System.out.println(arry01[idx01] + "\n");
				}

			}
		
		


	}

}
class User001 extends Exception{
	String a = "배고프다..";  // 필드

	public User001(String message) {  // 생성자
		super(message+"목요일날 비온대..");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {  // 재정의
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	public void call() {  //  추가메서드
		System.out.println("너무 슬프지만 "+ getMessage());
	}
	
}}