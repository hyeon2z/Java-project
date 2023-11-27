package javaexp.z02_homework.a16_jsr;

import java.util.InputMismatchException;
import java.util.Scanner;

//public class A1016 {
//	public static void main(String[] args) {
		// TODO Auto-generated method stub

//[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
//		1)예외처리란 오류가 발생할 거 같은 코드에 try{}catch{}를 넣어
//		오류를 확인하고 그에 따른 예외처리를 통해 프로그램의 강제종료를 막습니다.
//		2)예외 처리 순서 프로세스
//		try 블록에는 예외가 발생할 가능성이 있는 코드를 넣습니다. 여기서 만약 예외가 발생한다면
//		- catch의 예외 발생 지점에서 강제 종료 후 -> finally 블록으로 갑니다.
//		- 예외가 발생하지 않았다면 try -> finally 순으로 실행이 됩니다. 
//		- try, catch문에서 return을 사용해도 finally문을 스킵할 수는 없습니다. 또한 finally은 생략이 가능합니다.
//		  	try{
//		  		처리1
//		  		처리2
//		  		에러가 발생할 가망성이 있는 코드
//		  		처리3
//		  	}catch(Exceptoin e){
//		  		예외 처리: 에러가 발생시 처리할 코드
//		  	}finally{
//		        예외가 발생해도 안 해도 실행하는 코드
//			}
//
//[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
//		try {
//			Scanner sc=new Scanner(System.in);
//			System.out.print("숫자를 입력하세요:");
//			int num=sc.nextInt();
//		} catch (InputMismatchException e) {
//			System.out.println("정수를 입력해 주세요~");
//		}
		
//[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
//		1) 실행예외(RuntimeException)은 실행 예외는 일반 예외와 다르게 컴파일 과정에서 예외 처리 코드를 검사하지 않는 예외입니다.
//		또한 일반 예외와는 다르게 실행 예외만이 RuntimeException 예외 클래스를 상속받습니다. 실행 예외는 자바 컴파일러가 체크를 
//		해주지 않기에(이클립스에서 빨간 선으로 에러 표시를 해주지 않음) 개발자가 자신의 역량으로 찾고 예외 처리를 해주어야 합니다. 
//		또한 실행 예외는 일반 예외와는 다르게 반드시 예외 처리를 강제하지는 않습니다.
//		- NullPointerException: 객체 참조가 없는 상태(null)에서 객체 접근 연산자(.도트)를 사용하는 경우에 발생합니다.
//		- ArrayIndexOutOfBoundsException: 능동적으로 크기를 늘리고 줄일 수 없는 배열에 대해 범위 오류가 발생합니다.
//		- NumberFormatException: 문자열을 숫자로 바꿀 때 바꿀 수 없는 문자가 들어있을 경우 발생합니다
//		- ClassCastException: 알맞지 않은 클래스간의 타입 변환시 발생하는 예외입니다.
//		2) 컴파일예외(일반예외:Exception)은 일반 예외는 소스를 컴파일 하는 과정에서 예외 처리가 필요한지 검사하고 예외 처리 과정이 존재하지 않는다면 컴파일 오류를 발생시킵니다.
//		또한 일반 예외는 RuntimeException을 제외한 모든 예외 클래스를 상속받는 예외입니다. 또한 예외 발생시 반드시 try-catch등으로 처리를 해줘야합니다.
//		이클립스의 경우에는 컴파일 과정에서 예외를 확인하고 빨간 선으로 사용자에게 보여주고 시스템이 추천하는 예외 처리 방법 또한 제시해 줍니다.
		
//[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
//		예시) SQLException
//			사용자 등록을 시도하는 상황에서 중복되는 아이디가 있으면 DB에러가 발생해 JDBC API는 SQLException을 발생시켜
//			DAO 메소드로 메소드를 던졌을 때, 이 에러를 받은 DAO 객체는 SQLException이라는 예외만 알뿐 왜 발생했는지 쉽게 알 방법이 없는 상황이 발생한다.
//		1) throws 문으로 선언해 던지는 방법
//		public void add( ) throws SQLException{
//			// JDBC API
//		}
//
//		2) catch문으로 일단 예외를 잡을 후 로그를 남긴 후 던지는 방법
//		public void add() throws SQlException {
//			try {
//				// JDBC API
//			catch(SQLException e){
//				// 로그 출력
//				throw e;
//			}
//		}
//[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
//		1) 코드의 가독성을 높이기 위해서입니다. 예외를 계층구조로 만들면, 예외의 종류를 쉽게 파악할 수 있습니다. 예를 들어, catch 블록에서 Exception을 처리하는 경우,
//			어떤 예외가 발생했는지 알기 어렵습니다. 하지만, NullPointerException과 ArrayIndexOutOfBoundsException을 각각 catch 블록에서 처리하는 경우, 
//			예외의 종류를 쉽게 파악할 수 있습니다.
//		2) 예외 처리 코드를 유지보수하기 쉽게 하기 위해서입니다. 예외를 계층구조로 만들면, 예외 처리 코드를 추가하거나 수정하기 쉽습니다. 예를 들어, 새로운 예외가 발생하는 경우,
//			Exception을 처리하는 catch 블록에 예외 처리 코드를 추가하면 됩니다.
		
//[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
//		예외 처리 위임은, 예외를 처리하는 책임을 다른 메서드로 위임하는 것입니다. 예를 들어, 메서드 A에서 예외가 발생할 수 있는 작업을 수행하고, 
//		예외 처리를 메서드 B에게 위임하는 경우를 예외 처리 위임이라고 합니다.
//		그 이유는
//		1) 메서드 A의 코드를 단순화하기 위해서입니다. 메서드 A가 예외를 직접 처리하지 않고, 예외 처리를 메서드 B에게 위임하면, 메서드 A의 코드를 단순화할 수 있습니다.
//		2) 예외 처리를 특화하기 위해서입니다. 메서드 B는 예외 처리를 전문적으로 하는 메서드이기 때문에, 예외 처리를 특화하여 보다 효과적으로 처리할 수 있습니다.
//		 void doSomething() throws Exception {
//	            // 예외가 발생할 수 있는 작업을 수행합니다.
//	            int a = 10 / 0;
//	        }
//
//	        // 예외 처리를 수행하는 메서드
//	        void handleException(Exception e) {
//	            // 예외를 처리합니다.
//	            System.out.println(e.getMessage());
//	        }
//
//	        // 예외 처리 위임을 수행합니다.
//	        try {
//	            doSomething();
//	        } catch (Exception e) {
//	            // 예외 처리를 위임합니다.
//	            handleException(e);
//	        }
//[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
		/* main문 밖에 선언해야한다.
		 * static void call01() throws ArrayIndexOutOfBoundsException{    
			int[] numbers = {1, 2, 3, 4, 5};
			System.out.println(numbers[6]);
			}
		 */
//		try {
//			call01();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//[1단계:개념]  8. 예외의 강제란 무엇인가?
//		예외 강제는, 프로그램의 흐름을 제어하기 위해 인위적으로 예외를 발생시키는 것을 말합니다.
//		예외 강제는 throw 키워드를 사용하여 수행할 수 있습니다.
		// 예외를 강제 발생시킵니다.
//		throw new Exception("예외 메시지");
//		try {
//			if(cnt%2==0) {
//				throw new NullPointerException(cnt+"짝수는 예외처리");
//				}
//			} catch (NullPointerException e) {
//		System.out.println("강제 예외 처리 결과:"+e.getMessage());
//		}
		
//[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
//	       데이터를 입력하게 처리하세요.
//		  Scanner sc=new Scanner(System.in);
//	      String name = "";
//	      int price = 0;
//	      int cnt = 0;
//	      boolean isValid = false;
//	      
//	      while(!isValid) {
//	      try {
//	         System.out.println("물건명을 입력하십시오: ");
//	         name = sc.nextLine();
//	         System.out.println("가격을 입력하십시오: ");
//	         price = Integer.parseInt(sc.nextLine());
//	         System.out.println("물건 갯수를 입력하십시오: ");
//	         cnt = Integer.parseInt(sc.nextLine());
//	         if(name.isEmpty()||price<=0||cnt<=0) {
//	               throw new InputMismatchException("비어있는 항목이 존재합니다.");   
//	         }else isValid = true;
//	         
//	      }catch(InputMismatchException e) {
//	         System.out.println("입력 오류:"+e.getMessage());
//	      }
//	      }
//	      System.out.println("물건명: "+name);
//	      System.out.println("물건명: "+price);
//	      System.out.println("개수: "+cnt);
//	}
//
//}

