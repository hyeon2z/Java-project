package javaexp.a12_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A01_Basic {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 데이터를 전송하는 Stream
		1. 자바에서는 Stream이라는 API객체를 통해서, 데이터를
			입력하거나 출력을 하는 등 처리 하고 있다.
			- 파일의 데이터를 입력/출력 또는 파일 자체를 전송 처리
			- 문자를 입력받아 출력하는 처리
			- 입력된 문자를 네트워크를 통해 전송하여 전달하는 처리
			
			프로그램의 메모리/데이터 vs ssd나 hdd의 저장 메모리/데이터
			main()
			  하드웨어적으로 저장된 class를 컴파일시켜,
			  cpu/ram메모리를 통해서 수행시켜 메모리를 할당하여
			  데이터를 처리..(소프트웨어적 메모리)
			
			
		2. 기본 객체
			1) 입력 처리 : InputStream
				==> java에서 지원하는 기본 입력 처리 객체
				System.in : InputStream객체를 리턴하는 처리객체
			2) 출력 처리 : OutputStream
				==> java에서 지원하는 기본 출력 처리 객체
				System.out :OutputStream객체를 리턴하는 처리객체
			# java에서 main()메서드 프로그램을 통해서 기본적으로
			console창에서 데이터를 키보드를 통해서 입력하여 입력된
			데이터를 System.in이라는InputStream을 통해서 관리할
			수 있고, 또한 데이터는 console창에서 출력하는
			System.out 객체를 통해서 문자열 형식으로 println()메서
			드를 통해서 출력할 수있다.
		# 기초 예제
		1.  InputStream을 통해 입력된 데이터 OutputStream을 통해
			출력하기
			1) InputStream is = System.in
				자바의 기본 입력 Stream System.in을 InputStream
				가 리턴되어 변수 is로 선언
			2) InputStream에는 다음같이 데이터를 처리한다.
				- 메서드 read()
					이 read()메서드를 통해서 console창에서 입력된
					문자를 byte단위로 입력받게 처리한다.
					byte code = is.read();
					그리고 이 byte는 char유형으로 글자 한자를
					만들수 있고, 이것은 다음 단계에 데이터를 처리하기
					위해 메모리에 가지고 있는다. 
					//ex) byte[] byes = new byte[10]
					      is.read(byes);
					  
			2) OutputStream os = System.out
			    자바의 기본 출력 Stream으로 System.out을 
			    OutputStream으로 처리되어 변수 os 에 할당한다.
			    OutputStream의 write()메서드를 통해서 특정
			    데이터를  console창에 출력 처리한다.
		 * */
/*
		ex) A02_InputStream_OutputStream.java 
		    정답번호를 입력:   주의) 1 vs '1' 다름..
		    입력된 번호 : @@
*/		
		
		System.out.println("# 기본 입력 Stream활용 #");
		System.out.print("영문으로 글자 한자를 입력하세요:");
		InputStream is = System.in;
		try {
			int code = is.read();// 입력으로 IO발생 컴파일 예외처리
			// 자바에서 콘솔창에 출력하는 출력 스트림객체 선언
			OutputStream os = System.out;
			System.out.print("입력한 내용:");
			//  출력 스트림을 통해서 코드값을 출력
			os.write(code); 
			/*	'1' ==> 1
				'a'
				char c = (char)code
				if(c == '1')
				
				
				
			 * 
			 * */
			
			/*
			# 데이터 전송
			하드웨어 ===> 소프웨어
			하드웨어 <=== 소프웨어
			1. 단위가 작으며 바로 전송.
			2. 단위가 많으면 넘길수 있는 만큼 특정한 곳에
				쌓아 두었다가 그것을 한꺼번에 전달 하는 것이
				효율 ==> 버퍼메모리
			3. 자원을 해제	
				버퍼메모리 해제 : flush()
				일반 Stream은 해제 : close()
			 * */
			// write()를 통해 code값을 실제 문자로 출력
			os.flush(); // 임시메모리 해제
			System.out.println("입력한 문자(코드값):"+code);
			System.out.println("입력한 문자:"+((char)code));
			os.close(); // OutStream 객체 자원해제
			is.close(); // InputSteam 객체 자원해제
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		
		
		
	}

}








