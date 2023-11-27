package javaexp.z02_homework.a21_hcj;

import java.util.Scanner;

public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
					// class 사용자정의클래스명 extends Exception{
					// static void main(String[] args){
					// try{
					// throw new 사용자정의클래스명();
					// }catch(사용자정의클래스명 e){}
							
//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
					//Exception 의getMessage는 예외가 생성될때 가진데이터를 넘겨받는다
					//그렇기에 사용자정의예외에서 String매개변수를 생성자를 오버라이딩하면 
					//사용자정의예외가 생성될때 가진 메시지를 getMessage가 넘겨받을수 있다.
//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
					try {
						throw new UserExcetp();
					}catch(UserExcetp ue) {
						ue.getMessage();
						ue.Call();
					}
					try {
						throw new UserExcetp("New");
					}catch(UserExcetp ue) {
						System.out.println(ue.getMessage());
						ue.Call();
					}
					
//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
					// "안녕"은 특정 heap영역 위치해 할당되고 "안녕"다시 생성하면 "안녕"있던 주소를 그대로 사용하지만 
					// new String("안녕")은 객체를 생성한것이기 때문에 생성한 객체마다 다른 주소값을 가지고있다
					
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
					byte[] pass = {112,97,115,115};
					String str = new String(pass);
					System.out.println(str);
//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
						//자바의 최상위 클래스는 Object이고 toString()은 해당객체의 주소를 반환한다
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
					String civil="021214-2801512";
					char[] trn = new char[13];
					trn[0] = '2';
					trn[1] = '0';
					trn[2] = civil.charAt(0);
					trn[3] = civil.charAt(1);
					trn[4] = '년';
					trn[5] = civil.charAt(2);
					trn[6] = civil.charAt(3);
					trn[7] = '월';
					trn[8] = civil.charAt(4);
					trn[9] = civil.charAt(5);
					trn[10] = '일';
					trn[11] = '생';
					trn[12] = civil.charAt(7)=='1'||civil.charAt(7)=='3'?'남':'여';
					
					String birthday = new String(trn);
					
					System.out.println(birthday);
					
//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
					String cartList = "사과,키위,바나나,복숭아";
					System.out.print("검색하실 상품이름입력:");
					Scanner sc = new Scanner(System.in);
					String indata = sc.nextLine();
					if(cartList.indexOf(indata) !=-1) {
						System.out.println("장바구니에 존재하는 상품입니다");
					}else {
						System.out.println("장바구니에 존재하지않는 상품입니다");
					}
					
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
					int  stdNum = 3;
					String names[]  = new String[stdNum];
					String std[][] = new String[3][3];
					String datas[] = "홍길동&70&80-김길동&90&85-신길동&95&75".split("-");
					for(int i = 0;i<stdNum;i++) {
						String data[] = datas[i].split("&");
						for(int j = 0; j<3;j++) {
							std[i][j] = data[j];	
						}
						System.out.println(std[i][0]+"\t"+std[i][1]+"\t"+std[i][2]);
					}
					
//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
					String string = ""; 
					System.out.println("#String#");
					for(int i = 0 ; i<5;i++) {
						string+="ㅋ"; //String 의경우 +=을 하면 연산할때마다 메모리를 새로 잡아서 할당
						System.out.println(System.identityHashCode(string));
					}
					StringBuffer string2 = new StringBuffer();//이를 해결하기 위해 나온 API
					System.out.println("#StringBuffer#");
					for(int i = 0 ; i<5;i++) {
						string2.append("ㅋ"); 
						System.out.println(System.identityHashCode(string2));
					}
					
					//overflow가 날수도 있다.
					//그 현상을 해결하기위해 만들어진API가 StringBuffer이다
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		1. 사용자정의예외 보충설명	
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		없음
//		3. 수업 시간 집중하였는가?
//		네
//		
		
		
	}

}
//3
class UserExcetp extends Exception{
	String msg;
	UserExcetp(){this.msg="기본생성자예외생성";}
	UserExcetp(String msg){
		super(msg+"라는 메세지를 가진생성자 생성");
	}
	void Call() {
		System.out.println("사용자정의 예외 발생!!");
	}
	
}