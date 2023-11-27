package javaexp.z02_homework.a04_asy;

import java.util.Scanner;

public class A1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 예외처리 기본 형식과 구체적인 예외 처리 순서 프로세스
	/*	try {
			처리1
			처리2
			에러가 발생할 가능성 있는 코드
		}catch(Exception) {
			처리3
		}
		처리 4: 계속해서 수행하여 마무리 처리 가능
		*/
		
//		[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
		try {	//숫자형 데이터 입력
			System.out.print("숫자형 데이터를 입력하세요 : ");
			String str = sc.nextLine();
			int num = Integer.parseInt(str);
			System.out.println("입력한 숫자형 데이터:"+num);
		}catch(NumberFormatException e){	//숫자형이 아닌 데이터를 입력할때
			System.out.println("숫자형 데이터를 다시 입력하세요 : ");
//			str = sc.nextLine();	//다시 입력
//			num = Integer.parseInt(str);
			System.out.println("입력한 숫자형 데이터 : "+e);
			
			
		}
//		[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
		//예외 위임을 하지 않더라도 처리 가능(런타임 예외)
//		public void runtimeExceptionExample() {
//		    int[] arr = new int[5];
//		    arr[10] = 50;  // ArrayIndexOutOfBoundsException
//		}
//		//예외 위임을 반드시 하여야 처리가능(컴파일 예외)
//		public void compileTimeExceptionExample() throws FileNotFoundException {
//		    File file = new File("nonexistent.txt");
//		    FileInputStream fis = new FileInputStream(file);
//		}
//		[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
//		public void databaseQuery() {
//		    try {
//		    //데이터 베이스 처리시 반드시 필수 예외 처리하여야함
//		        Connection connection = DriverManager.getConnection
//				("jdbc:mysql://localhost:3306/dbname", "user", "password");
//		        Statement stmt = connection.createStatement();
//		        ResultSet rs = stmt.executeQuery("SELECT * FROM tableName");
//		    } catch(SQLException e) {
//		        e.printStackTrace();
//		    }
//		}
//		[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
//		- 자바의 예외 계층구조는 객체 지향적인 상속의 원칙을 따릅니다. 이 계층구조를 통해 예외들을 그룹화하고, 공통된 로직을 재사용할 수 있습니다. 
//		  예를 들어, 여러 예외들이 같은 부모 예외로부터 상속받는다면, 해당 부모 예외만으로 여러 예외를 함께 처리할 수 있습니다.

//		[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
//		- 예외 위임이란 메서드나 생성자에서 발생하는 예외를 그대로 호출한 곳으로 
//			던져서 처리하게 하는 것을 말합니다. `throws` 키워드를 사용하여 예외를 위임합니다.
		
		
//		[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.

//		[1단계:개념]  8. 예외의 강제란 무엇인가?
		/*				Throw			...Throw와 Throws는 다름
						1특정 조건이나 코드에서 강제 예외 처리
						기본코드 : throw new 강제예외 Exception();
								 호출
					*/
//		[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 
//						각 데이터를 입력하지 않을 때, 
//						강제 예외를 발생해서 데이터를 입력하게 처리하세요.
//		System.out.println("물건 갯수를 입력하세요:");
		
	}

}
