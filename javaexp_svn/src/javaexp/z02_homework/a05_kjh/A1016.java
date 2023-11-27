//package javaexp.z02_homework.a05_kjh;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class A1016 {
	
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
		
//		try{
//		 		처리1
//		 		처리2
//		 		에러가 발생할 가능성이 있는 코드
//		 		처리3
//		 		}catch(Exception e){
//		 			예외 처리 : 에러가 발생시 처리할 코드
//		 		}
//		 			처리 4 : 계속 수행해서 마무리 처리가 가능
		 			
//		[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
//				Scanner sc = new Scanner(System.in);
//				int number=0;
//				boolean vInput = false;
//				
//				while(!vInput) {
//					try {
//						System.out.print("숫자를 입력하세요");		
//						number = Scanner.nextInt();
//						vInput = true;
//					}catch(InputMismatchException e) {
//						System.out.println("올바른 숫자를 입력하세요");
//						Scanner.next();
//					}
//				}
//				System.out.println("입력한 숫자는:"+number);
//		[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
						//실행예외의 예제는 다음과 같다
//						System.out.println("시작");
//				try {
//				System.out.println(1/0);//오류구문에서 ArithmeticException 복사
//				}catch(ArithmeticException e) {
//					System.out.println("실행예외 발생:"+e.getMessage());
//				}
//				System.out.println("종료");
//						
//						
//						//컴파일 예외의 예제는 다음과 같다 
//						try {
//							Class.forName("aaa, bbb, ccc");
//						} catch (ClassNotFoundException e) {
//							System.out.println(e.getMessage());
//						}
//				// 컴파일 예외는 아예 코드 자체가 컴파일되지 않는 것으로 이클립스 상에서 왼쪽에
				// 빨간색 표시가 실행된다.
				// 실행 예외(런타임에러)는 예외 처리 코드를 생략하더라도 컴파일이 된다.
				//	경우에 따라 예외 처리 코드 작성이 필요하다
						
//		[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
						
//						try {
//						
//						} catch (SQLException se) {
//							System.out.println(se.getMessage());
//						}
//						??
						
//		[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
						//계층구조를 이용하면 코드를 읽거나 고칠때 예외로 무엇을 처리했는지 명확하게 알 수 있기 때문이다.
//		[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
						//메서드별로 예외를 위임해서 한번에 처리하는 것을 말한다. throws 구문을 사용한다.
//						static void call01() throws ClassNotFoundException{
//							System.out.println("#메서드#1");
//							Class.forName("aaa.bbb.ccc");
//						}
//						static void call02() throws ClassNotFoundException{
//							System.out.println("#메서드#2");
//							Class.forName("kkk.ppp.ooo");
//						}
//						try {
//							call01();//위임된 예외 처리
//							call02();//위임된 예외 처리
//						} catch (ClassNotFoundException e) {
//							// TODO: handle exception
//							e.printStackTrace();
//						}
//		[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
		
//		[1단계:개념]  8. 예외의 강제란 무엇인가?
						//프로그래밍을 할 때 자바에서는 throw구문을 가용해 예외를 강제로 발생시킬 수 있다.
						// 이는 특정 조건이 충족되지 않으면 메서드가 실행되지 않도록 할 때
						// 예외를 강제로 실행시켜 프로그램을 제어할 수 있다.
//		[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
//			       데이터를 입력하게ㅐ 처리하세요.
						
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
//	}


//public static void arrayOver(int index) throws ArrayIndexOutOfBoundsException{
//	int[] array = {1,2,3,4,5};
//	if(index<0||index>=array.length) {
//		throw new ArrayIndexOutOfBoundsException("범위 밖 접근");
//	}
//}
