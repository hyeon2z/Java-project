package javaexp.z02_homework.a19_cjw;

import java.util.Scanner;

public class A1016_Homework {
	
//	[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
	static void callArray1() throws ArrayIndexOutOfBoundsException{
		String str[] = {"a","b"};
		System.out.println(str[2]);
	}
	static void callArray2() throws ArrayIndexOutOfBoundsException{
		String str[] = {"a","b"};
		System.out.println(str[3]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
//		[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
		/*
		1. 기본형식
			try{
					처리1
					처리2 -> 예외가 발생할 수도 있는 코드
					처리3 -> 위에서 예외처리되면 이 부분은 실행되지 않는다.
				}catch(Exception e){
					예외 처리(e.메서드 사용)
				}
			처리4 -> 이어서 실행가능
		2. 구체적인 예외 처리 순서 프로세스
			try{
		
			}catch(최하위예외클래스){
				
			}catch(차상위예외클래스){
		
			}catch(상위예외클래스){
		
			}finally{}
			
			- 메모리가 가장 작은, 좁은 범위의 최하위 예외에 대한 처리를 먼저 해야 한다.
		 * */
		
//		[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때
//					   예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
		System.out.println("문자 입력");
		String str = sc.nextLine();
		try {
			int num = Integer.parseInt(str);
			System.out.println(num);
		}catch(NumberFormatException nf) {
			System.out.println(nf.getMessage());
		}
		
//		[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
		/*
		--예외는 에러와 달리 심각하지 않은, 미미한 오류이다--
		1. 실행예외
			프로그램의 실행 도중 발생하는 에러로 코드자체의 문제가 아니라 코드를 실행하는 도중에 문제가 생기는 경우이다.
			ex) 1/0, Integer.parseInt("이십오");
			컴파일해도 에러표시가 뜨지 않으며, 실행하면 에러가 생긴 부분에 에러코드가 출력되면서 실행이 중단된다.
			
		2. 컴파일예외
			컴파일시 발생하는 에러로 코드 자체에 문제가 발생한 경우이다.
			ex) System.out.println() ==> ;가 없다.
				for(){ => 블럭을 닫지 않았다.
			컴파일하면 왼쪽에 붉게 에러 표시가 뜬다.
		 * */
		
//		[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
		
		
//		[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
		/*
		예외는 범위가 작은 것과 큰 것으로 나누어져 있기 때문에 범위에 따라 계층구조로 나뉘어져 있으며,
		예외가 명확하지 않은 것은 범위가 큰 상위예외클래스로, 명확한 것은 범위가 작은 하위예외클래스로 처리할 수 있다.
		 * */
		
//		[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
		/*
		예외의 위임 : 예외가 나오는 부분을 기능메서드별로 처리하지 않고 메서드를 호출할 때 한번에 처리하는 것을 의미한다.
					try{}catch(){}를 중복해서 사용하지 않아도 된다는 장점이 있다.
		
		ex) void call01() throws Exception{
				예외가 발생할 수도 있는 코드
			}
			void call02() throws Exception{
				예외가 발생할 수도 있는 코드
			}
			try{
				call01();
				call02();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		 * */
		
//		[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
		try {
			callArray1();
			callArray2();
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열에러처리: "+ae.getMessage());
		}
		
//		[1단계:개념]  8. 예외의 강제란 무엇인가?
		/*
		에러가 발생하지 않았음에도 특정 조건에 따라 강제로 예외처리를 하는 것을 의미한다.
		
		ex) try{
				throw new Exception();
			}catch(Exception e) {
				강제예외처리
			}
		 * */
		
//		[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때,
//					   강제 예외를 발생해서 데이터를 입력하게 처리하세요.
		System.out.println("물건명 입력");
		String name = sc.nextLine();
		System.out.println("가격 입력");
		String price = sc.nextLine();
		System.out.println("개수 입력");
		String cnt = sc.nextLine();
		try {
			if(name.equals("")) {
				throw new Exception(name = sc.nextLine());
			}
		}catch(Exception e) {
			System.out.println("물건명 입력: "+e.getMessage());
		}
		try {
			if(price.equals("")) {
				throw new Exception(price = sc.nextLine());
			}
		}catch(Exception e) {
			System.out.println("가격 입력: "+e.getMessage());
		}
		try {
			if(cnt.equals("")) {
				throw new Exception(cnt = sc.nextLine());
			}
		}catch(Exception e) {
			System.out.println("개수 입력: "+e.getMessage());
		}
		System.out.println("물건명\t가격\t개수");
		System.out.println(name+"\t"+price+"\t"+cnt);
		
	}

}
