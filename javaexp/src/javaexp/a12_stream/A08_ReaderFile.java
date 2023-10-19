package javaexp.a12_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A08_ReaderFile {

	public static void main(String[] args) {
		/*
		# 파일의 내용을 가져오는 Reader객체
		1. 상속관계
		    InputStream > Reader > FileReader
		    
		2. 내용
		    특정한 경로의 파일에 있는 문자열을 읽어와서 화면에 출력하거나, 변수에 할당하여
		    원하는 데이터를 사용할 때 활용하는 객체이다.
		    
		3. 주요 기능 메서드 내용
		    1) 생성자 : new FileReader(경로/파일명);
		    2) 기능메서드 : read() 글자 한자씩 code값을 int로 가져온다.
		        char 타입 캐스팅 시, 문자로 변환
		        공백이나 줄 바꿈들도 포함해서 가져온다.
		        System.out.print((char)code)
		    3) code값이 -1 일 때, 더이상 문자가 없을 때이다.
		    4) close() 자원해제..
		*/
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a05_fileread\\";
		String fname = "a01_poem.txt";
		try {
			FileReader fin = new FileReader(path+fname);
			StringBuffer sbf = new StringBuffer(path+fname);
			while(true) {
				int code = fin.read();
				if(code == -1) { // 더이상 데이터값 없을 때 까지
					break;
				}
				// 파일에 있는 내용을 화면에 출력
				System.out.print((char)code);
			}
			fin.close(); // 자원해제
			System.out.println("\n#파일 읽기 종료#");
			System.out.println("# StringBuffer #");
			System.out.println(sbf);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ex) a02_memList.txt 에 있는 파일의 내용을 가져와서
		// 이름 : @@@, 국어 : @@, 영어 : @@, 수학 : @@ 로 출력하세요.
		// hint) 문자열.split("")
		// A08_ReaderFileExp.java
		
	}

}
