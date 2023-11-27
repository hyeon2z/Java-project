package javaexp.z02_homework.a17_okw;

import java.io.IOException;
import java.io.InputStream;
//import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A1016_okw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
			try{
				코드1
				코드2
				에러 발생 가능성 있는 코드3
			}catch(Exception e){
				예외 처리: 에러 발생시 처리할 코드
			}
			 	코드4: 계속 수행가능
[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 
				데이터를 입력하게 처리하세요.
			
			int inputInt = 0;
			
			while(true) {
				try {
					System.out.print("데이터를 입력해볼까요? :");
					inputInt = sc.nextInt();
					break;
				}catch(InputMismatchException ime) {
					System.out.print("숫자형 데이터를 입력하세요!");
					sc.nextLine();
				}
			}
			System.out.println("입력된 숫자 : "+inputInt);
				
[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
			1) 실행 예외 : 예외 처리를 하지 않더라도 컴파일이 되는 예외로, 경험에 따라 예외 처리 코드 작성이 필요한 예외이다.
				실행 후, 데이터에 따라 null 메모리 호출에러(NullPointerException), 배열에러(IndexOutOfBoundsException), 
				0나누기 (ArithMethicsException) 등의 에러를 발생시킨다.
				
				예제)
				try {
					String s=null;
					s.toString();
				}catch(NullPointerException e1) {
					System.out.println("# NPE 에러");
					System.out.println(e1.getMessage());
				}
				
			2) 컴파일 예외 : 반드시 컴파일 하여야 하는 예외이다. 예외처리가 없으면 컴파일이 안되기 때문에 실행 자체가 안되고, 
				빨간줄과 더불어 코드 왼쪽에 에러표시가 뜬다. eclipse가 제공하는 기능으로 빠르게 try-catch 처리를 할 수 있다.
				
				예제)
				InputStream is = System.in;
				System.out.print("글자를 입력하세요:");
				char code;
				try {
					code = (char)is.read();
					System.out.println(code);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
			1) SQLException: 데이터베이스 접근 또는 다른 에러에 대한 정보를 제공하는 예외.
			
			try {
				sqlErrorMaker();
			}catch(SQLException e) {
				System.out.println("데이터베이스 오류 : "+e.getMessage());
			}
			
			public static void sqlErrorMaker() throws SQLException {   		// 데이터베이스 오류를 시뮬레이션
	    		throw new SQLException("데이터베이스 연결 실패");
			}
[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
				1) 다양한 예외 유형을 처리하기 위해 : 다양한 종류의 예외를 정확히 식별하기 위함
				2) 상황에 따른 예외 처리를 위해 : 특정 상황에 따른 예외를 선택적으로 처리하기 위해
				3) 코드 가독성 향상을 위해
[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
				1) 메서드 별로 예외를 위임하여 한꺼번에 호출하는 곳에서 처리.
					static void methods01() throws NullPointerException{
						System.out.println("메서드1")
						int num01 = Integer.parseInt("안녕");
					}
					static void methods02() throws NullPointerException{
						System.out.println("메서드1")
						int num02 = Integer.parseInt("안녕2");
					}
					public static void main(String[] args) {
						try{
							methods01();
							methods02();
						} catch (NullPointerException npe){
							npe.printStackTrace();
						}
					}
[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
				try {
					int[] arr = {1,2,3};
					int index = 5;
					int value = arr[index];
					System.out.println("값: "+ value);
					
				}catch(ArrayIndexOutOfBoundsException e2) {
					System.out.println("# 예외 #");
					System.out.println(e2.getMessage());
				}
[1단계:개념]  8. 예외의 강제란 무엇인가?
				# throw를 이용하여 특정한 조건이나 코드에서 강제로 예외를 처리하는 것을 말한다.
					ex)
					throw new Exception();
[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
	       			데이터를 입력하게 처리하세요.
	       		String name = "";
		     	int price = 0;
		     	int cnt = 0;
		     	boolean isValid = false;
		      
		     	while(!isValid) {
		     	try {
		        	System.out.println("물건명을 입력하십시오: ");
		        	name = sc.nextLine();
		        	System.out.println("가격을 입력하십시오: ");
		        	price = Integer.parseInt(sc.nextLine());
		        	System.out.println("물건 갯수를 입력하십시오: ");
		        	cnt = Integer.parseInt(sc.nextLine());
		        	if(name.isEmpty()||price<=0||cnt<=0) {
		              	throw new InputMissingException("비어있는 항목이 존재합니다.");   
		        	}else isValid = true;
		         
		     	}catch(InputMissingException e) {
		        	System.out.println("입력 오류:"+e.getMessage());
		     	}
		     	}
		     	System.out.println("물건명: "+name);
		     	System.out.println("물건명: "+price);
		     	System.out.println("개수: "+cnt);
	       			
	       			
# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
3. 수업 시간 집중하였는가?
 * */
	}

}