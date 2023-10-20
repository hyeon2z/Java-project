package javaexp.a12_stream;

import java.io.IOException;
import java.io.InputStream;

public class Z01_Code {

	public static void main(String[] args) {
		String menu[] = {"짜장면","짬뽕","탕수육","냉면"};
//		
//		for(int cnt = 1; cnt <= 200; cnt ++) {
//			System.out.println(cnt + " : " + (char)cnt);
//		}
		InputStream is = System.in;
		try {
			char code = (char)is.read();
			int idx = code - '0';
			System.out.println(menu[idx]);
			// 48 '0'
			// 49 '1'
			// 50 '2'
			// 51 '3'
			// ex) '3' - '0' ==> 3
			//      51 - 48 ==> 3
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
