package javaexp.a12_stream;

import java.io.File;

public class A05_DirectoryMake {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 디렉토리도 파일 객체에 의해 생성한다.
		// 1. 단, mkdir()라는 메서드로 디랙토리 생성.
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\";
		File path01 = new File(path+"a03_exp");
		path01.mkdir();
		
		// ex) a01_exp 디렉토리안에, 위 코드 기준으로
		//        a01_dir1  ~ a01_dir10까지 경로를
		//        만들어 보세요..
		String path2 = "C:\\b01_javaexp\\workspace\\"
				+ "javaexp\\src\\javaexp\\a12_stream\\"
				+ "a01_exp\\";
		for(int cnt=1;cnt<=10;cnt++) {
			String dir01 = "a01_dir"+cnt;
			File path02 = new File(path2+dir01);
			path02.mkdir();
		}
		
	}

	
}
