package javaexp.a12_stream;

import java.io.File;
import java.io.IOException;

public class A04_FileMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a02_exp\\";  
		// 주의: 경로명 마지막에 \\추가 
		//      경로명과 파일명을 디렉토리로 구분 가능.
		String f01Name= path+"a03_hello.txt";
		File f01 = new File(f01Name);	
		if(!f01.exists()) { // 파일이 없을 때..
			
			try {
				f01.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("파일 생성!!");
		}
		
	}

}
