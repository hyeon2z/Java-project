package javaexp.a12_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A02_InputStream_OutputStream {

	public static void main(String[] args) {
		System.out.print("정답 번호를 입력 : ");
		InputStream asw = System.in;
		try {
			int answer = asw.read();
			OutputStream out = System.out;
			System.out.println("입력한 내용 : ");
			out.write(answer);
			// stream 자원해제
			out.flush();
			
			System.out.println("입력한 정답 : " + ((char)answer));
			out.close();
			asw.close();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
