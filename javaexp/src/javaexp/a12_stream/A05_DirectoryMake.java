package javaexp.a12_stream;

import java.io.File;

public class A05_DirectoryMake {

	public static void main(String[] args) {
		/*
		# 디렉토리도 파일 객체에 의해 생성한다.
		1. 단, mkdir()라는 메서드로 디렉토리 생성.
		*/
//		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\";
//		File path01 = new File(path + "a03_exp");
//		path01.mkdir();
		
		String pathExp = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a01_exp\\";
		for(int i = 1; i <= 10; i ++) {
			File path02 = new File(pathExp + "a01_dir" + i);
			path02.mkdir();
			
		}
		
		// ex) a01_exp 디렉토리 안에, 위 코드 기준으로
		//    a01_dir1 ~ a01_dir10 경로를 만들기
	}

}
