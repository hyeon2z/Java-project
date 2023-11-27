package javaexp.z02_homework.a18_LSD.homework1017;

import java.util.Scanner;

public class A1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
		class User01Exception extends Exception {
			private String serialNum;

			public User01Exception(String message) {
				super("[사용자정의예외]" + message);
				// super.getMessage()처리..
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "^^ 안녕하세요 신기하죠!!";
			}

			// 기존메서드 재정의
			@Override
			public String getMessage() {
				return super.getMessage() + ":메서드 처리(재정의)" + serialNum;
			}

			// 추가 메서드 처리
			public String getSerialNum() {
				return serialNum;
			}

			public void setSerialNum(String serialNum) {
				this.serialNum = serialNum;
			}

		}
		
//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
		// 영문 소문자 알파벳
        String lowercaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // 비밀번호 길이 설정
        int passwordLength = 8; // 비밀번호의 원하는 길이로 변경 가능
        
        // 무작위 문자열을 저장할 배열
        byte[] passwordBytes = new byte[passwordLength];
        
//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
		String civil="021214-2801512";
		char[] birth = new char[11];
        		birth[0]= civil.charAt(0);
        		birth[1]= civil.charAt(1);
        		birth[2]= '년';
        		birth[3]= '생';
        		birth[4]= civil.charAt(2); 
        		birth[5]= civil.charAt(3);
        		birth[6]= '월';
        		birth[7]= civil.charAt(4); 
        		birth[8]= civil.charAt(5);
        		birth[9]= '일';
        		birth[10]= '생';
        		
        		String birthday = new String(birth); 
        		System.out.println("civil:"+birthday);

//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
        			String cartList = "사과, 딸기, 배";
        			Scanner sc = new Scanner(System.in);
        			System.out.println(cartList+"중 골라");
        			String menu = sc.nextLine();
      
        			if(cartList.indexOf(menu)!=-1) {
        				System.out.println("잘 골랐음");
        			}else {
        				System.out.println("잘못 골랐음");
        			}
        			
//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 

//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
		
		
	}//main()

}//A1017{}
