package javaexp.a02_var;

public class A02_primitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 자바의 stack영역에서 사용되는 기본 데이터 유형
			기본데이터유형은 stack영역에서는 할당과 동시에 
			해당 변수의 내용을 가지고 있다.
			ps) 객체의 경우는 stack영역과 heap영역을 사용하는데
				heap영역에 실제 데이터가 할당되고, stack영역에서는
				이 heap영역의 주소값을 할당한다.
		1. 숫자형
			1) 정수형
				byte:1byte(8bits) -128~127  ex) byte num01 = 25;
				short:2byte(16bits) 
				int:4byte(32bits) **(정수형의 default)
				 		-2147483648~2147483647  약 21억
				 	데이터를 기본적을 할당하면 int 유형이고, 특히,
				 	연산을 하여 할당하는 경우, 반드시 int 유형이상으로
				 	할당하여야 한다. byte/short유형을 연산의 결과값을
				 	할당하지 못한다. 
				long:8byte(64bits)
						long num01 = 21474836473422L;
					위 21이상의 int형 범위를 초과할 때는 반드시 L이라고
					붙어야 그 이상의 데이터를 사용할 수 있다.	
			2) 실수형:소숫점이하 처리 
				float:4byte
						float num02 = 34.23432F;
						
				double:8byte **(실수형의 default)
						double num03 = 42.2342;
		2. 문자형(char)
			문자형은 정수형에서 파생된 것으로 2byte로
				정수형 0~65535범위의 코드값을 유니코드값으로 연결하여
				처리한 것을 말한다.
				보통 영문은 1byte로 표현을 할수 있고, 한글이나
				기타 언어는 2byte범위로 표현한다.
			char ==> char[] ==> String
			문자		 문자배열     문자배열의 type화하여 객체처리
						        객체지향프로그램에서는 꼭 필요
						        메서드(객체내함수)를 통해서 여러가지
						        기능을 지원하기 위해서 꼭 필요로 한다..
						        "홍길동 김길동 신길동" ==> 배열
						        index로 접근하여 추출, 숫자형 문자열을
						        원하는 기본 데이터로 변경하는 등 많은
						        기능적인 필요성에 의해 객체화하여 메서드를
						        이용한다.
			ex) char c01 = 'A';
			    int c01Val = c01;  	
			    int c02Val = 66;
			    char c02 = (char)c02Val;  	
		3. 논리형
			boolean값을 true/false값을 할당할 수 있는 데이터 유형
			이다. 
			int point = 90;
			boolean isPass = point>=80;  true/false값을 저장 
			boolean isPass01 = true;  true/false값을 저장 
			boolean isPass02 = false;  true/false값을 저장 
		 * */
		byte byte01 = 25;
//		byte byte02 = 225; 범위를 벗어나고 기본 정수형 데이터는
		// default로 int 형이기에 에러가 발생..
		short short01 = 35;
		// 2byte범위의 데이터를 할당할 때, 사용된다.
		// 주의) byte, short 범위라하더라도 +(연산자)가 들어 가는
		// 순간 이것을 할당할 수 있는 범위는 int형 이상이어야 한다.
		byte byte03 = 30;
//		byte sumByte = byte01 + byte03; 
//		에러 발생.
		int sumByte01 = byte01 + byte03; // int형이어야 한다.
		
		System.out.println(65);
		System.out.println((char)65);
		System.out.println((char)66);
		for(int num=0;num<=256;num++) {
			System.out.println(num+":"+(char)num);
		}
		// 랜덤변수 :특정한 숫자를 범위를 지정해서 임의로 숫자 처리
		// Math.random()
//		int maxNumOver = 214748364723; // int 범위 넘기에 에러
		long maxNumOver = 214748364723L; // long 범위 선언
		System.out.println(maxNumOver);
		float num03 = 3.41f;
		System.out.println("실수1(float):"+num03);
		double num04 = 3.14;// 실수형의 기본데이터 유형
		System.out.println("실수2(double):"+num04);
//		int ==> char ==> char[] ==> String
		// char 유형 선언
		char c01 = 'A';
		char c02 = '홍';
		int c01Val = c01; // 숫자형 코드값으로 변환
		int c02Val = c02;
		int c03Val = 100;
		char c03 = (char)c03Val; // 100의 코드값에 대한 문자
		System.out.println("# char 유형 데이터 확인 #");
		System.out.println(c01);
		System.out.println(c02);
		System.out.println(c01Val);
		System.out.println(c02Val);
		System.out.println(c03);
		/*
		# 다음의 데이터 유형을 사용하여 변수를 선언하고 초기화 후, 출력하세요
		int 유형의 변수 largeNumber에 1000000을 할당하세요.
		long 유형의 변수 veryLargeNumber에 5000000000L을 할당하세요.
		float 유형의 변수 smallDecimal에 3.14f를 할당하세요.
        double 유형의 변수 largeDecimal에 2.718281828459045를 할당하세요.
        char 유형의 변수 letter를 선언하고, 'K'를 할당한 후, 
        	해당 문자의 유니코드 값을 출력하는 코드를 작성하세요.
		 * */
		int largNmber = 1000000;
		System.out.println("largNmber:"+largNmber);
		long veryLargeNumber = 5000000000L;
		System.out.println("veryLargeNumber:"+veryLargeNumber);
		float smallDecimal = 3.14f;
		System.out.println("smallDecimal:"+smallDecimal);
		double largeDecimal = 2.718281828459045;
		System.out.println("largeDecimal:"+largeDecimal);
		char letter = 'K'; 
		// 자바에서 문자형 데이터 유형을 ''사이에 글자 한자를 할당할 수 있게
		// 한다.
		System.out.println("문자:"+letter);
		int letterCode = letter;
		System.out.println("문자K의 유니코드값:"+letterCode);
		// 정수형의 default은 int, 실수형의 default는 double
		// 로 default 유형이 아닌 경우 long은 초과 처리할 때, L을
		// 붙이고, 실수유형의 경우, f를 붙여서 처리한다.
		// # boolean형 데이터 유형
		// true/false
		boolean isTrue = true;
		boolean isFalse = false;
		boolean isOver = largNmber>=10000; 
		// 비교연산자를 이용해서 true/false값을 가져올 수 있다.
		System.out.println("# boolean 데이터 처리 #");
		System.out.println(isTrue);
		System.out.println(isFalse);
		System.out.println(isOver);
		// ex) 정수형 데이터로 점수 80점을 point01변수에 할당하고
		// boolean 형으로 isPass로 70점이상일 때(>=)로 선언하여
		// 합격여부를 true/false로 출력하세요.
		int point01 = 60;
		boolean isPass = point01>=70;
		System.out.println("획득한 점수:"+point01);
		System.out.println("합격여부:"+isPass);
		/*
		# 정수형은 연산을 처리한 데이터를 int형 이상에서만 할당이
		가능하다.
		 * */
		byte num01 = 25;
		short num02 = 30;
//		short num03 = num01 + num02; (X)
		int num05 = num01 + num02;		
		
		
		
		
		
		
		
		
	}

}
