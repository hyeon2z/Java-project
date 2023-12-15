package javaexp.a12_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A06_WriteFile {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 파일의 내용 입력 처리
		1. 입력한 데이터/메모리에 있는 변수에 할당된 데이터는
			특정한 파일에 입력할 수 있다.
		2. 이 때, 사용하는 객체가 OutputStream을 상속받은
			FileWriter 객체
			# 상속관계
			OutputStream < Writer < FileWriter
			상위                       하위
		3. 주소 객체 및 구성요소
			1) 파일쓰기 객체 : new FileWriter("경로명과 파일명")
			2) 사용메서드
				 write("문자열") : 파일에 쓸 내용
				 append("문자열") : 기존 파일 내용에서 추가할 내용
				 flush() : buffer메모리 해제
				 close() : FileWriter 객체 메모리 해제.
		 * */
		String path="C:\\b01_javaexp\\workspace\\javaexp\\src\\"
				+ "javaexp\\a12_stream\\a04_filewrite\\";
		String fname = "a01_fileWrite.txt";
		//  경로/파일 만들기 후, 아래 내용 코드 처리..
		try {
			FileWriter fout = new FileWriter(path+fname, true);
			fout.write("파일에 입력할 내용1\n");
			fout.append("파일에 추가할 내용2\n");
			Scanner scan = new Scanner(System.in);
			System.out.println("파일에 입력할 내용을 적으세요!!");
			String addStr = scan.nextLine();
			fout.append(addStr);
			fout.flush();
			fout.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ex) A07_WriteFileExp.java
		// a04_filewrite하위에 a02_memberList.txt
		// 파일에 회원아이디//이름 정보를 입력하고, 등록된 내용을 확인하세요.
		
	
		
		
		
	}

}