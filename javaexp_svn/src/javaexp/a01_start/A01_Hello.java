package javaexp.a01_start;

public class A01_Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한줄 주석 : 실행에 영향이 없음. 주로 코드에 대한 설명
		// ctrl+/ : 주석 처리 단축키
		// 명시적으로 타이핑으로도 처리가 된다.
		// ctrl+(+/-) : 화면 글자 크기 조절
		/*
		여러 줄 주석 단축키(실행에 영향 없음)
		 * */
		System.out.println("자바 드디어 실행!");
		// 출력을 위한 명령문
		// sysout+ctrl+space키로도 생성
		System.out.println("자동 키도 출력 생성");
		// ctrl+m(전체화면/부분메뉴화면)
		
		// 오른쪽 마우스 run as + java application
		// ctrl + f11 : 실행 단축키
		// f11 : 디버그 트래킹시 사용.
		
		// ex1) 안녕하세요 라는 문자열이 출력되게 하고.
		// ex2) A02_Hello.java로 만들어서  
		//      두번째 자바실행이라고 출력되게 하세요..
		System.out.println("안녕하세요!");
		int num01 = 786;
		
		
		String str = ""+num01;
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		String numStr = ""+str.charAt(0);
		System.out.println(numStr);
		Integer i = num01;
		System.out.println(i.toString().substring(0,1));
		
		
	}

}
