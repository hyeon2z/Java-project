package javaexp.z02_homework.a03_ls;

import java.util.Scanner;

public class A1016 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
		
		//==> 기본형식은 
		try{
			에러가 발생할 가능성이 있는 코드
		}catch(Exception e(에러 내용)){
			예외처리 : 에러가 발생시 처리할 코드
		}계속 수행해서 처리할 내용
		
		인데, catch를 반복해서 사용할 경우
		위에서 부터 최하위 예외처리를 이용해 밑으로 갈수록
		최상위 예외처리를 처리하게 된다. //
		
		
		[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
		//==> 실행예외는 컴파일 시에는 확인할 수 없는 예외입니다. 주로 사용자의 입력이나 외부 요인에 의해 발생합니다. 
		 그리고 컴파일 예외는 프로그래밍을 할 때 개발자가 실수를 해(변수타입 잘못입력) 생기는 오류같은 애들입니다.
		 
		 이정도는 알겠는데 사실 실행예외와 컴파일 예외가 명확하게 구분되는 예제는 뭐가 뭔지 아직 모르겠습니다.
		
		
		
		[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
		
		//==> 하나의 코드로 간결하게 에러를 잡아낼 수 있기 때문입니다.//
		 * 
		 * 
		[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
		//==> 메서드로 에러가 발생할 수 있는 코드를 넣어놓고 throws 로 try,catch구문에 넣어 
		 에러 처리를 위임해 해결하는 방법입니다.
		  
		  static void call01 () throws ClassNotFoundException{
		  		Class.forname("abcde");
		  }
		  라는 메서드를 설정해놓고 메인 메서드 안에서
		  try {
			call01(); 
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}로 불러와 예외처리를 할 수 있습니다.
		
		
		[1단계:개념]  8. 예외의 강제란 무엇인가?
		//=> 오류 처리가 나도 강제적으로 실행할 수 있게 throw 를 이용해 처리하는 방법입니다. 
		
		
		
		 * */
//		[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("숫자입력하세영");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("a = " + a);
			
		}catch(NumberFormatException nfe) {
			System.out.println("숫자만 입력하세여");
		}
		
		
//		[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
		// 도저히 모르겠음여 
		
//		[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
		int arry[] = new int[3];
		try {
			System.out.println(arry[4]);
		} catch (Exception e) {
			System.out.println("오류");
		}
		
		
		
//		[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서 데이터를 처리하게 하세요.


		
		try {
			System.out.println("물건명 입력");
			String name = sc.nextLine();
			if (name == null) {
				throw new Exception();
			}

			System.out.println("가격 입력");
			int price = Integer.parseInt(sc.nextLine());
			if (price == 0) {
				throw new Exception();
			}

			System.out.println("갯수 입력");
			int cnt = Integer.parseInt(sc.nextLine());
			if (cnt == 0) {
				throw new Exception();
			}
			System.out.println("물건명: " + name);
			System.out.println("가격: " + price);
			System.out.println("갯수: " + cnt);
		} 
		  catch (Exception e) {
			System.out.println("마져 입력 ㄱㄱ");
		} 

		
		
	
	
	}
		
		
		
		
	}


