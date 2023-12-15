package javaexp.z02_homework.a21_hcj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class A1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
			String[] s= {"사과","배","복숭아"};
			System.out.println("주문할 메뉴번호를 입력해주세요");
			System.out.println("1.사과");
			System.out.println("2.배");
			System.out.println("3.복숭아");
			InputStream is =System.in;
			OutputStream os = System.out;
			try {
				int code = is.read();
				System.out.println("주문한 상품은 "+s[code-49]+"입니다");
				
				os.flush();
			
			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
//[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
			String path ="C:\\b01_javaexp\\workspace\\javaexp_svn\\src\\javaexp\\z02_homework\\a21_hcj\\";
			String fname = "h03_2.txt";
			File f01 = new File(path+fname);
			if(!f01.exists()) {// 같은 이름의 파일 존재 하지않는지 확인을 해주고 생성시켜줘야함
				try { 				
					f01.createNewFile();
				}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			}
			f01 = new File(path+"a01");
			f01.mkdir();// 확인절차 없이 생성 가능
			
//[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요.
			
			String fname2 = "h03_3.txt";
			File f02 = new File(path+fname2);//파일 객체
		
			if(!f02.exists()) {
			try {
				f02.createNewFile();	// 파일 생성
				
				FileWriter fw =new FileWriter(path+fname2);//파일을 쓰는 객체
				fw.write("예제3번"); // 파일에 내용 입력
				fw.append("내용 추가입력");//내용 추가입력
				
				fw.flush();//buffer메모리 해제
				fw.close();//FileWriter 객체 메모리 해제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		
			
//[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
			String[] std = new String[2];
			
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			System.out.print("학생이름 입력:");
			std[0] = sc.nextLine();
			System.out.print("학생점수 입력:");
			std[1] = sc.nextLine();
			try {
				FileWriter fw4= new FileWriter(path+"1학년1반.txt");
				fw4.write("이름\t점수\n");
				fw4.append(std[0]+"\t");
				fw4.append(std[1]+"\n");
				fw4.flush();
				fw4.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
			System.out.print("오늘 날짜를입력:");
			String today = sc.nextLine();
			File f03 = new File(path+today);
			
			try {
				if(!f03.exists()) {
				f03.createNewFile();
				}
				FileWriter fw3 = new FileWriter(path+today);
				String indata= "";
				while(true) {
					System.out.println("일기장에 입력할 내용 입력(종료시Q)");
					indata = sc.nextLine();
					if(indata.equals("Q")) {
					break;
					}
					
					fw3.append(indata+"\n");
					
				}
				System.out.println("일기장 종료");
				fw3.flush();
				fw3.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
//[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
			//FileWriter는 파일에 내용입력하는 객체
//			write("문자열") : 파일에 쓸 내용
//			append("문자열") : 기존 파일 내용에서 추가
//			flush() : buffer메모리 해체
//			close() : FileWriter 객체 메모리 해제.
			//FileReader는 파일의 내용을 1글자씩 읽어오는 객체 더이상  읽어올 내용이없을시 -1을 반환
			//read() 글자한자씩 code값을 int로 가져온다.code 값이 -1 일 때, 더이상 문자가 없을 때 이다.
			//close() 자원해제..
//[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.
			
			try {
				FileReader fr = new FileReader(path+"product.txt");
				StringBuffer sbf = new StringBuffer();
				int code;
				while(true) {
					code = fr.read();
					if(code==-1)break;
					sbf.append((char)code);
					
				}
				fr.close();
				String[] datas = sbf.toString().split("\r\n");
				System.out.println(datas[0]);
				for(String d:datas) {
					String[] sd = d.split("&");
					System.out.println(sd[0]+"\t"+sd[1]+"\t"+sd[2]);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



//			os.close();

					//	is.close();
	}

}
