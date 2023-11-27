package javaexp.z02_homework.a06_psj;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A1016_2 {
	public static void show() throws NullPointerException{
		System.out.println("#메서드1#");
		try {
			Class.forName("aaa.bbb.ccc");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
//		try{ // try body 안에서 예외발생시 catch로 해당 예외를 보냄
//			실행내용 // 1순위
//		}catch(예외클래스 생성자){ // try에서 예외클래스의 예외 발생시 이 body를 실행
//			예외처리시 실행할 내용 // 2순위
//		}
//		3순위
//		[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
//		Scanner sc = new Scanner(System.in);
//		try {
//			int a = sc.nextInt();
//			System.out.println(a);
//		}catch(NumberFormatException e) {
//			System.out.println("숫자형 데이터를 입력해주세요");
//		}
//		[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
//		try {
//			String str = null;
//			System.out.println(str.toString());
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		// 실행예외: Cannot invoke "String.toString()" because "str" is null
		// 이것처럼 코드에 오류가 발생해도 예외처리를 통해 실행이 가능하다.
		// 컴파일예외: debug창이 열리면서 어떤곳이 오류인지 알려준다. 코드실행불가
		
//		[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
//		try {
//			        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "user", "password");
//        			Statement stmt = connection.createStatement();
//       			ResultSet rs = stmt.executeQuery("SELECT * FROM tableName");
//		}catch(SQLException se) {
//			se.printStackTrace();
//		}
//		[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
		// 에러와 예외의 차이를 두어야 하기때문에
//		[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
//		public static void show() throws NullPointerException{
//			System.out.println("#메서드1#");
//			try {
//				Class.forName("aaa.bbb.ccc");
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		// throws를 통해 이 메서드를 사용하면 해당 예외를 처리해야한다는것을 말한다.
//		[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
//		[1단계:개념]  8. 예외의 강제란 무엇인가?
//		throw new NullPointerException(); // 강제로 해당 예외를 발생시킴
//		[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
//			       데이터를 입력하게ㅐ 처리하세요.
		Scanner sc = new Scanner(System.in);
		String name="";
		String price="";
		String m="";
		while (true) {
			try {
				System.out.println("물건명을 입력하세요");
				name = sc.nextLine();
				if(name.equals("")) {
					throw new Exception("물건명 입력하세요");
				}
				break;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("물건명: "+name);
		System.out.println(price);
		System.out.println(m);

		
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
	}

}
