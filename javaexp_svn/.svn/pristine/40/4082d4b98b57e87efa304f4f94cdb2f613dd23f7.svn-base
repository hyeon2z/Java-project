package javaexp.z02_homework.a16_jsr;

import java.util.Scanner;

public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
//				일반 클래스를 만들듯이 만들면 되는데 반드시 extends Exception을 붙여서 상속을 받아야 한다.
//				class UserEx extends Exception{
//						새로운 예외 메서드를 생성할 수 있고,
//					public String message(){
//						return "예외입니다";
//					}
//					Exception에 있는 기존 메서드를 재정의하여 사용할 수 있다.
//					@Override
//					public String getMessage() {
//						return "안녕하세요 메서드 처리(재정의)";
//					}
//				}
//				main()에서 try{}catch{}문을 통하여 사용하는데
//				try {
//					if(cnt%2==0) {
//						throw new UserEx(); //사용자가 재정의한 예외객체를 만들어 던진다.
//					}
//				}catch (UserEx ue) {
//					// 사용자 정의 추가 메서드 처리..
//					System.out.println(ue.message());
//					// 재정의된 메서드 호출
//					System.out.println(ue.getMessage());
//				}
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
//				class UserEx extends Exception {
//				    public UserEx(String message) { //예외 클래스의 생성자는 
//				    	super(message);				//예외 메시지를 저장하는 역할을 하고
//				    }
//				}
//				try {
//				    throw new UserEx("예외 메시지입니다.");
//				} catch (UserEx e) {
//				    System.out.println(e.getMessage());
//				    //getMessage() 메서드는 예외 클래스의 인스턴스에 저장된 예외 메시지를 반환한다.
//				}
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
//				for(int cnt=1; cnt<=10;cnt++) {
//					try {
//						if(cnt==2) {
//							throw new UserEx("생성자 메세지");
//						}
//					} catch (UserEx e) {
//						System.out.println(e.getMessage());
//						e.my();
//						System.out.println(e);
//					}
//				}
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
//				"안녕"은 String literal을 사용한 선언 방법입니다. String literal은 컴파일 타임에 컴파일러가
//				String 상수 풀(constant pool)에 저장한다. 그래서 heap 메모리 영역을 사용하지 않습니다.
//				new String("안녕")는 new 연산자를 사용한 선언 방법입니다. new 연산자는 heap 메모리에 String 객체를 생성합니다.
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
//				byte[] bytes = new byte[4];
//				for(int i=0;i<4;i++) {
//					bytes[i]=(byte) (Math.random()*25+97);
//				}
//				String greet = new String(bytes);
//				System.out.println(greet);
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
//				자바의 최상위 클래스는 Object입니다. 
//		        toString()은 객체의 정보를 문자열로 반환하는 역할을 합니다.
//				기본적으로 toString() 메서드는 객체의 클래스 이름과 해시 코드를 문자열로 반환합니다.
//				객체의 참조변수만을 출력했을 때 나오는 것들을 정의할 수 있습니다.
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
//				String civil="021214-2801512";
//				for(int i=0;i<=13;i++) {
//					System.out.print(civil.charAt(i));
//					if(i==1) {
//						System.out.print("년");
//					}else if(i==3) {
//						System.out.print("월");
//					}else if(i==5) {
//						System.out.print("일생 여");
//						break;
//					}
//				}
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
//				String cartList ="바나나, 당근, 호박, 두부";
//				Scanner scanner = new Scanner(System.in);
//				System.out.print("장바구니에 어떤 물건이 있을까요?>>");
//				int cart=cartList.indexOf(scanner.next());
//				if(cart!=-1) {
//					System.out.println("정답!");
//				}else {
//					System.out.println("땡!");
//				}
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
//				String[] student="홍길동&70&80-김길동&90&85-신길동&95&75".split("-");
//				for(String name:student) {
//					String[] score=name.split("&");
//					for(String hi:score) {
//						System.out.print(hi+" ");
//					}
//					System.out.println();
//				}
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
//			String은 불변 클래스입니다. 즉, 한 번 생성된 String 객체는 변경할 수 없습니다. 
//			String 객체의 내용을 변경하려면 새로운 String 객체를 생성해야 합니다. 따라서,
//			기존에 특정한 위체에서 메모리가 확대되는 것이 아니라, 새로운 주소값을 가지고 다시 메모리를 할당하는 특징이 있습니다.
//			
//			StringBuffer는 가변 클래스입니다. 즉, StringBuffer 객체의 내용을 자유롭게 변경할 수 있습니다. 따라서,
//			다양한 기능 메서드를 통해서 문자열이 늘어나더라도 동일한 heap 주소 안에서 데이터를 처리할 수 있게 처리해줍니다.
	}

}
//사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
class UserEx extends Exception{
	private String title="사용자 정의 예외";
	
	public UserEx(String message) {
		super(message);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"재정의 했습니다.";
	}
	public void my() {
		System.out.println("내가 정의한 예외");
	}
	
}
