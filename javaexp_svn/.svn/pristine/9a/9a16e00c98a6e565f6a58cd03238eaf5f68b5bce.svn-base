package javaexp.z02_homework.a21_hcj;

import java.sql.SQLException;
import java.util.Scanner;

public class A1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스

[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
[1단계:개념]  8. 예외의 강제란 무엇인가?
[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
	       데이터를 입력하게ㅐ 처리하세요.
	       
	   
# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분

2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
3. 수업 시간 집중하였는가?
 * */
		 //1.
		try {//예외가 발생할수 있는 코드
			
		}catch(Exception/*(NullPointerException/
		ArrayIndexOutOfBoundsException/
		NumberFormatException)*/ e) {//예외 발생시 처리할 코드
			
		}
		
		//2.
		try {
			Scanner sc = new Scanner(System.in);
			int num = Integer.parseInt(sc.nextLine());
			
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage()+"숫자가아님");
		}
		
		//3.
		//실행 예외(RuntimeError)는 처리 코드를 생략하더라도 컴파일이 되는 예외
		// 
		try {			
		String s = null; 
		System.out.print(s.toString());//실행은 되지만 s는 null이기에 toString을 할수가없다
		}catch(NullPointerException npe) {
			System.out.println(npe.getMessage());
		}
		//컴파일 예외는 컴파일 조차 안되는 에러들이라 실행시킬수없는 에러들을 예외처리로 실행시키고 예외
		//를 잡아낼수 있는 예외처리이다
		//Class.forName("aaa.bbb.ccc"); 실행불가 
		try {
			Class.forName("aaa.bbb.ccc");// 예외처리하여 실행 가능
		}catch(ClassNotFoundException cfe) {
			System.out.println(cfe.getMessage()+"를 찾을수 없습니다.");
		}
		//4. 
	
		// call01(); Unhandled exception type SQLException 
		
		try {
			call01();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//5. 예외에는 여러종류의 예외가있어 각 예외별로 다르게 처리하기위해 계층별로 나눠져있다
		//
		
	// 6. 메서드에 예외를 위임해서 모아서 한번에 처리하는것을 예외 위임한다 
	// 		throws를 통해 예외를 모아서 한곳에 모아서 처리
		try {			
		call02();
		call03();
		}catch(NullPointerException npe) {
			System.out.println(npe.getMessage());
		}
		
		//7.
		try {			
		call04();
		call05();
		}catch(ArrayIndexOutOfBoundsException abe) {
			System.out.println(abe.getMessage());
		}
		
		//8.
		//throw 를 통해 예외를 강제로 발생시켜 처리하는것 
		//throw new 예외명(); 형식으로 예외를 강제발생시킴

		//9.
		try {
			Scanner sc = new Scanner(System.in);
			String ProName = sc.nextLine();
			String Proprice = sc.nextLine();
			String ProCnt = sc.nextLine();;
			if(ProName == ""||Proprice == ""||ProCnt == "")throw new NullPointerException();
			System.out.println("상품:"+ProName);
			System.out.println("가격:"+Proprice);
			System.out.println("갯수:"+ProCnt);
			
		}catch(NullPointerException npe){
			System.out.println("데이터를 전부 입력해주세요");
		}
}
	static void call01() throws SQLException{
		
	}
	
	static void call02() throws NullPointerException{
		String o = null;
		System.out.println(o.toString());
	}
	static void call03() throws NullPointerException{
		String o = "dd";
		System.out.println(o.toString());
	}
	static void call04() throws ArrayIndexOutOfBoundsException{
		int [] num = {1,4,5,3};
		System.out.println(num[3]);
	}
	static void call05() throws ArrayIndexOutOfBoundsException{
		int [] num = {1,4,5,5,7};
		System.out.println(num[7]);
	}
	
}
 
		