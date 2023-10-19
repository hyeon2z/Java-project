package javaexp.a12_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A08_ReaderFileExp {

	public static void main(String[] args) {
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a05_fileread\\";
		String fname = "a02_memList.txt";
		
		
		try {
			FileReader fin = new FileReader(path+fname);
			StringBuffer sbf = new StringBuffer();
			
			while(true) {
				int data = fin.read();
				if(data == -1) {
					break;
				}
				sbf.append((char)data);
			}
			fin.close();
			System.out.println("현재 데이터 : " + sbf);
			// 1단계 줄바꿈으로 데이터 자르기
			String[]arr = sbf.toString().split("\n");
			System.out.println("이름\t국어\t영어\t수학");
			for(String str : arr) {
//				System.out.print(str);
				// 2단계 각 줄단위로 있는 데이터 ,(콤마로) 자르기
				String[] arr2 = str.split(",");
				System.out.print(arr2[0] + "\t");
				System.out.print(arr2[1] + "\t");
				System.out.print(arr2[2] + "\t");
				System.out.print(arr2[3] + "\n");
			}
			
			/*
			System.out.print("이름 : " + arr[0] + ", ");
			System.out.print("국어 : " + arr[1] + ", ");
			System.out.print("영어 : " + arr[2] + ", ");
			System.out.print("수학 : " + arr[3]);
			*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		int code = 0;
//		try {
//			FileReader read = new FileReader(path + fname);
//			while(true) {
//				code = read.read();
//				if(code == -1) {
//					break;
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String inf = String.valueOf((char)code);
//		System.out.println(inf);
//		String[] info = inf.split(",");
//		System.out.println("이름 : " + info[0]);
		
		
	}

}
