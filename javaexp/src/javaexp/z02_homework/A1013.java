package javaexp.z02_homework;

import java.util.Scanner;

public class A1013 {

//	static void ex01() throws IndexOutOfBoundsException {
//		String[] arr01 = new String[3];
//		arr01[0] = "1";
//		arr01[1] = "2";
//		arr01[2] = "3";
//		arr01[3] = "4";
//	}

	public static void main(String[] args) throws NumberFormatException {
		
//[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
//		try {
//			(에러가능성이 있는 코드)
//		}catch(에러문구 변수명) {
//			(에러 시 수행할 코드)
//		}
//		try문 안에 에러가능성이 있는 코드를 작성하고, catch문 괄호 안에 있는 에러발생 시 catch문 중괄호 안에 있는 에러 시 수행할 코드가 작동된다.
		
//[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
		Scanner sc = new Scanner(System.in);
//		int num2;
//		while(true) {
//			try {
//				System.out.print("숫자를 입력 : ");
//				num2 = Integer.parseInt(sc.nextLine());
//				break;
//			}catch(NumberFormatException ne) {
//				System.out.println("숫자만 입력해야 합니다.");
//			}
//		}
//		System.out.println("입력된 숫자 : " + num2);
		
//[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
//		컴파일예외는 예외처리코드 작성 하지 않으면 컴파일오류가 발생하는 코드
//		컴파일도 되지 않아서 왼쪽에 빨간색으로 표시가 된다.
//		IOException <- 에러코드
		
//		실행예외는 예외코드를 생략해도 컴파일은 되는 코드이다.
//		위 Scanner 코드와 같이 숫자형 변수에 문자형을 넣었을 경우 발생하는 오류같은걸
//		예외코드로 잡아주는것을 말한다.
//		잡지않으면 오류발생
		
//[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
//		안배운것같아용
		
//[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
//		메모리를 절약하고/어떤예외처리인지 파악하기 쉽게하기위해?
		
//[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
//		예외가 나올 여지가 있는 코드들을 try catch 문 하나에다가 호출할때 사용한다
		
		
//[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
//		try {
//			ex01();
//		}catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println(ae.getMessage());
//		}
		
		
//[1단계:개념]  8. 예외의 강제란 무엇인가?
//		오류가 아님에도 강제로 특정 조건일때는 예외문으로 빠지게 만드는것이다
//		ex) 1~100 반복할때 99는 강제로 예외시키고 싶을 경우
		
//[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
//	       데이터를 입력하게 처리하세요.
//		while(true) {
//			try {
//				String prod;
//				int price;
//				int cnt;
//				System.out.print("물건명 : ");
//				prod = sc.nextLine();
//				if(prod.equals("")) {
//					throw new NullPointerException(prod);
//				}
//				System.out.print("가격 : ");
//				price = Integer.parseInt(sc.nextLine());
//				System.out.print("갯수 : ");
//				cnt = Integer.parseInt(sc.nextLine());
//				System.out.println("물건명 : " + prod);
//				System.out.println("가격 : " + price);
//				System.out.println("갯수 : " + cnt);
//				break;
//			}catch(NullPointerException ne) {
//				System.out.println("다시 입력하세요");
//			}catch(NumberFormatException ne1) {
//				System.out.println("다시 입력하세요");
//			}
//			
//		}
		
		
/*
# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
3. 수업 시간 집중하였는가?
*/

	}
	
}
