package javaexp.z02_homework.a20_kjw;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class hw1016 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 예외처리기본 형식& 구체적인 예외처리 순서 프로세스
		
		try {
	System.out.println("1");
	System.out.println("2");
	System.out.println("3"+1/0);
}
catch(Exception e)
{
	System.out.println("예외발생"+e.getMessage());
}

//다음과 같이 try,catch문을 통해서 예외처리가 가능하다. catch괄호문내에서 exception 
// 여러 예외문법이 존재한다.
//try에서 코드가 진행되며,에러 발생이 가능한 구간을 지나거나 만날시
//catch문을 통해 에러관련 코드가 실행된다.


//#2.
System.out.println("숫자입력");
Scanner sc = new Scanner(System.in);
String inputNum = sc.nextLine();
try {
	int num = Integer.parseInt(inputNum);
	System.out.println(inputNum);
}catch(NumberFormatException n) {
	System.out.println(n);
}
//위의 코드는 inputNum이란 문자열형 변수에 숫자형데이터를 받게되어있다.
//받아서 출력하게 되어있으나. 만약 숫자형이 아닌 데이터를 받게되면 catch에서 NumberFormatException
//(숫자형이 아닌 데이터를 받았을때 에러문)을 통해 걸러지게 되고 입력된 데이터가 숫자형이 아닌 데이터라는
//출력문을 보여준다.



//3. 실행예외, 컴파일예외 차이
// 둘의 차이는 컴파일시 예외처리 코드의 유무, 정확히는 필요한지 아닌지를 확인하는 차이이다.


//컴파일예외
try { 
Class class1 = Class.forName("forexample");
}catch(ClassNotFoundException c) {
	System.out.println("클래스가 존재하지 않아서 이 문구가 발생");
	}
//실행예외: 컴파일러가 체크하지않기때문에 개인판단 필.

//
String data = null;
//System.out.println(data.toString()); //NullPointerException에러 발생

try {
	//data = args[0];
}catch(NullPointerException e) {
	System.out.println("매개값이 부족");
}finally {
	System.out.println("재실행 요구됨");
}// data 변수에 null이 들어가있지만 값을 요구했기때문에
//재실행 요구 후 NullPointerException에러 발생


	}
	//4.데이터베이스 처리시 반드시 필수 예외처리해야한다.
	/*
	 * try{
	 * COnnection connection = DriverManager.getConnectionP
	 */

	static void ex1() throws SQLException{
		System.out.println("예제입니다.");
	try{
		ex1();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	
	//5.
	//예외를 계층구조로 두는 이유는 각 계층 구조별로 다른 예외로 처리할수 있기 때문이다.
	//6. 
	//예외의 위임
	
	
	}
	public static void std1() throws ArithmeticException{
		System.out.println(2/1);
	}
	public static void std2() throws ArithmeticException{
		System.out.println(3/1);
	
	
	try {
		std1();
		std2();
	}catch (ArithmeticException a) {
		System.out.println("예외처리");
	}
	//throws를 통해 에러를 대물림이 가능하나 결국 마지막 블럭에서는 try,catch등을 사용해서
	//문제해결해야한다.
	
	
	try {
		int[] arr = {1,2,3};
		Arrays.sort(arr);

		System.out.println(arr[arr.length]);
		
	}catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("코드 체크 필");
	}finally {
		System.out.println("예외처리 문제 완료");
	}
	//try에서 에러발생. 그후 catch,finally문을 통해 해결.
	//8. 컴파일 실행에 문제는 없지만 인위적으로 예외를 throw를 통해서 발생 시키는 것.
	
	System.out.println("물건명:");
	Scanner sc = new Scanner(System.in);
	String inputNum = sc.nextLine();

}

}




