package javaexp.z02_homework.a17_okw;

import java.util.Scanner;

public class A1017_okw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
					/*
					1. 사용자 정의 예외 클래스 생성법
						class UserDefEx extends Exception{} 
					이처럼 extends를 통해 Exception 클래스를 상위클래스로 둔다.
					2. main()에서의 호출 규칙
						try{
							if(조건){
								throw new UserDefEx();
							}
						}catch(UserDefEx e){
							System.out.println(e.getMessage());
						}
					*/
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
					/*
					사용자 정의 예외 클래스를 정의할 때, 원하는 필드와 메서드를 추가할 수 있고,
					Exception 클래스의 getMessage()를 super 키워드를 통해 재정의하여 사용할 수 있다.
					*/
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
					/*
					# 예외 클래스
					class UserDefEx extends Exception{
						private String eNum;
						public UserDefEx() { // 기본생성자 호출.
							
						}
						public UserDefEx(String message) { // String 매개변수를 받는 생성자 호출.
							super("사용자정의예외:"+message);
						}
						@Override
						public String getMessage() { // 기존메서드 재정의
							return super.getMessage()+" 기존메서드 재정의";
						}
						public void call() {
							System.out.println("추가정의한 메서드");
						}
					}
					
					# 메인 메서드 호출 예시
					for(int i=1;i<=20;i++) {
						System.out.println(i+"번");
						try {
							if(i%5==0) {
								throw new UserDefEx(i+"번은 예외(5의 배수)");
							}
						}catch(UserDefEx e) {
							System.out.println(e.getMessage());
							e.call();
						}
					}
					*/
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
					/*
					# String greet = "안녕";
					 	이 경우에는 문자열 리터럴로 생성되어, Java의 문자열 풀에 저장되며 불변하고 재사용이 가능하다.
					 	즉, 특정한 heap영역의 위치에 할당하여 처음 "안녕"이 저장된 주소값을 그대로 사용하여 변수에 할당된다.
						따라서, 같은 문자열 데이터를 사용하는 경우 동일한 문자열 객체가 공유되어 재사용된다.
					# String greet2 = new String("안녕"); 
						이 경우에는 새로운 문자열 객체가 heap영역에 동적으로 할당된다.
						new 키워드를 사용시 항상 새로운 객체가 생성되며 위 문자열 리터럴과 달리 불변성이 없고 
						new를 통해 객체가 생성될 때마다 각기 다른 메모리 주소를 갖는다.
					 */
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
					int passwordLength = 8;
					byte[] codes = new byte[passwordLength];
					for(int i = 0;i<passwordLength;i++) {
						codes[i] =(byte)(Math.random()*26+97);
					}
					String pass = new String(codes);
					System.out.println("생성된 비밀번호:"+pass);
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
						/*
						# 자바의 최상위 클래스는 Object 클래스 이다. 자바의 모든 클래스는 Object클래스를 상속 받는다.
							class A XXX {} 에서 XXX 부분에 무언가 추가하지 않는다면 자동적으로 
							extends Object가 되어있는 상태라고 볼 수 있다.
						
						# toString()
							객체의 정보를 String(문자열)형으로 형변환 해준다. Object 클래스를 상속받은 클래스들은
							toString()을 오버라이딩(재정의)하여 사용할 수 있다.
							오버라이딩 없이 사용하면 기본적으로 클래스의 이름과 해시코드 값을 나타낸다.
							이를 재정의하여 사용자가 원하는 문자열을 출력하도록 할 수 있게 된다.
						
						 * */
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
						String civil="021214-2801512";
						char year1 = civil.charAt(0);
						char year2 = civil.charAt(1);
						char month1 = civil.charAt(2);
						char month2 = civil.charAt(3);
						char day1 = civil.charAt(4);
						char day2 = civil.charAt(5);
						char gender = civil.charAt(7);
						
						String year = "20"+year1+year2;
						String month = ""+month1+month2;
						String day = ""+day1+day2;
						
						String isGender = (gender == '1'||gender == '3')?"남자":"여자";
						
						System.out.println(year+"년 "+month+"월 "+day+"일생"+isGender);
						
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
						String cartList = "공책, 볼펜, 샤프, 지우개";
						Scanner sc = new Scanner(System.in);
						System.out.print("장바구니에 담겨있는 상품을 입력하세요.. >>");
						String item = sc.nextLine();
						if(cartList.indexOf(item) != -1) {
							System.out.println("장바구니에 담겨있는 상품입니다!");
						}else {
							System.out.println("장바구니에 없음..");
						}
						
						
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
						String[] data = "홍길동&70&80-김길동&90&85-신길동&95&75".split("-");
						for(String studentData: data) {
							String[] studentInfo = studentData.split("&");
							
							for(int i=0; i< studentInfo.length;i++) {
								System.out.print(studentInfo[i]+" ");
							}
							System.out.println();
						}
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
						//String은 +=를 활용하여 문자열 연산을 할 시, heap영역을 계속 새로 만들어서
						//메모리 overflow를 유발할 수 있다.
						//그러나 StringBuffer() 객체를 이용하여 append 메서드를 사용하면 새로운 heap영역을
						//만들지 않고, 같은 주소에 문자열 데이터만 수정할 수 있다.
						 String name1 = "홍길동";System.out.println(System.identityHashCode(name1));
						 name1+="바보";System.out.println(System.identityHashCode(name1)); // 주소가 달라짐
						 StringBuffer sb = new StringBuffer("홍길동");
						 System.out.println("초기 주소값:"+System.identityHashCode(sb));
						 sb.append("천재");System.out.println("추가후 주소값:"+System.identityHashCode(sb));
						
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		

		
	}

}

