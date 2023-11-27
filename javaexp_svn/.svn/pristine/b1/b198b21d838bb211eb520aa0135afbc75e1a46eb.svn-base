package javaexp.a12_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A09_ReaderFileExp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex) a02_memList.txt(홍길동,70,80,90) 에 있는 파일의
		//    내용을 가져와서
		// 이름 : @@@, 국어 : @@, 영어 : @@, 수학 : @@
		// 로 출력하세요..    hint) 문자열.split("")
		String path="C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a05_fileread\\";
		String fname="a02_memList.txt";
		
		try {
			FileReader fin = new FileReader(path+fname);
			StringBuffer sbf = new StringBuffer();
			
			while(true) {
				int data = fin.read();
				if(data==-1) {
					break;
				}
				sbf.append((char)data);
			}
			fin.close();
			System.out.println("현재 데이터:"+sbf);
			// 1단계 줄바꿈을 데이터 자르기 
			/*
			'김' ==> char ==> code 
			줄바꿀때..'\n' '\r'
			 * */
			
			String[]arr = sbf.toString().split("\r\n");
			System.out.println("뽑아온 데이터");
			System.out.println("이름\t국어\t영어\t수학");
			for(String str:arr) {
				//System.out.print(str);
				// 2단계 각 줄단위로 있는 데이터 ,(콤마로) 자르기
				String[] arr2 = str.split(",");
				System.out.print(arr2[0]+"\t");
				System.out.print(arr2[1]+"\t");
				System.out.print(arr2[2]+"\t");
				System.out.print(arr2[3]+"\n");
				
				
				
							
			}

			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
