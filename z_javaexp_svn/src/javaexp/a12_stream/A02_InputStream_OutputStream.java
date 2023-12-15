package javaexp.a12_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A02_InputStream_OutputStream {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//     정답번호를 입력:   주의) 1 vs '1' 다름..
		//     입력된 번호 : @@
		System.out.print("정답번호를 입력:");
		InputStream is = System.in;
		OutputStream os = System.out;
		try {
			int numCode = is.read();  // 'A'  ==> 65
			System.out.println("입력된 번호는 ");
			// OutputStream의 write()에서는
			// 숫자 코드값을 char로 변환하여 출력 처리..
			// 
			os.write(numCode);
			System.out.println("\n입력된 코드값:"+numCode);
			// Stream의 자원해제..
			
			
			os.flush();
			os.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
