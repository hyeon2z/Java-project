package javaexp.z02_homework.a06_psj;

import java.util.Scanner;

public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
//		class UserExcep extends Exception{
//			//구현
//		}
//		UserExcep ue = new UserExcep();
//		throw new UserExcep(); 이런식으로 강제 예외시키거나
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
//		사용자 정의 예외 클래스는 Exception 클래스를 상속받아서 자동으로 getMessage()사용할수있다.
//		당연히 재정의도 됨. super.메소드 를 이용해서 상위 하위클래스의 메소드를 선택할수도있다.
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
		class UserExcep1 extends Exception{
			private String name;
			public UserExcep1(String name) {
				this.name = name;
			}
			public String getMessage() {
				System.out.println("재정의된 메소드~");
				return super.getMessage();
			}
			public void hello() {
				System.out.println("추가정의된 메소드~");
			}
		}
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
		String str1 = "안녕";
		String str2 = new String("안녕");
		System.out.println(System.identityHashCode(str1)); // 1239731077
		System.out.println(System.identityHashCode(str2)); // 557041912
		//실제 주소값의 차이가 난다
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
		String spwd = new String();
		int [] pwd= new int[10];
		for (int i = 0; i<10; i++) {
			pwd[i]=(int)(Math.random()*25+97);
		}
		System.out.print("임시비번: ");
		for (int b:pwd) {
			System.out.print((char)b);
		}
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
		//Object클래스
		System.out.println();
		System.out.println(str1.toString()); // String은 값을 리턴해준다.
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
		String civil="021214-2801512";
		for(int i=0; i<8; i++) {
			System.out.print(civil.charAt(i));
			if (i==1)
				System.out.print("년 ");
			else if (i==3) 
				System.out.print("월 ");
			else if (i==5) 
				System.out.print("일 ");
			else if (i==7) {
				if (civil.charAt(i)=='2')
					System.out.print(" 여성");
				else
					System.out.print(" 남성");
			}
		}
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
		
		
	}

}

