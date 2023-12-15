package javaexp.z02_homework.a03_ls;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class A1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
		==> 파일은 createNewFile을 이용하고, 디렉토리는 mkdir를 이용합니다.
		File f01 = new File(경로+이름);
		f01.createNewFile(); 파일생성
		f01.mkdir(); 디렉토리 생성
		
		
		[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 
		메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
		File f01= new File(경로 + 파일이름); ==> 생성자 부분에는 경로와 파일이름 을 넣어 파일객체를 생성하고
		f01.createNewFile() 같은 메서드를 통해서 새로운 파일을 만들 수 있습니다. 
		
		[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
		==> FileWriter 은 말그대로 파일안에 내가 정보값을 넣는 것이고, FileReader은 파일 안에 적혀있는 애를 내가 불러들이는 것입니다,
		FileWriter 의 주요 메서드는 write와 append로 정보값을 파일 안에 넣을 수 있고, 
		FileReader 은 read() 를 통해 불러들일 수 있습니다. 
		
		
		
		 */
		
		//[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
		String menu [] = {"피자","햄버거","치킨"};
		System.out.println("주문할 숫자를 선택하세요\n"
				+ "1.피자, 2.햄버거, 3.치킨");
		InputStream is = System.in;
		try {
			char order = (char)is.read();
			if(order==1) {
				System.out.println("주문하신 메뉴는 피자입니다");
			}else if(order==2) {
				System.out.println("주문하신 메뉴는 햄버거입니다");
			}else {
				System.out.println("주문하신 메뉴는 치킨입니다");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여,
//		 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
		String path = "C:\\b01_javaexp\\workspace\\javaexp_svn\\src\\javaexp\\z02_homework\\a03_ls\\exp\\";
		String fname = path+"1학년1반.txt";

		String [] info = {"홍길동, 80점","신길동 50점","최길동 90점"};
		File f01 = new File(fname);
		
		try {
			if(!f01.exists()) {
			f01.createNewFile();}
			FileWriter fw = new FileWriter(fname);	
			 for (String studentInfo : info) {
	                fw.write(studentInfo + "\n"); 
	            }
			 fw.close();
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 
//		일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 
//		일기를 쓰는 처리를 하세요
		
		String path01 = "C:\\b01_javaexp\\workspace\\javaexp_svn\\src\\javaexp\\z02_homework\\a03_ls\\exp\\";
		String fname01 = "note";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("계속 입력을 원시면(1), 종료를 원하시면(2) 를 입력하세요");
		String num = sc.nextLine();
		if(num.equals("2")) {
			break;
		}
		try {
			System.out.println("일기장에 적을 오늘 날짜를 입력하세요");
			FileWriter fw = new FileWriter(path01+fname01);
			String day = sc.nextLine();
			fw.write(day);
			System.out.println("입력할 내용을 적어주세요");
			String d = sc.nextLine();
			fw.append(d);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
//		[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 
//		해당 물건 정보를 탭간격으로 출력되게 하세요.
		
		String path03 = "C:\\b01_javaexp\\workspace\\javaexp_svn\\src\\javaexp\\z02_homework\\a03_ls\\exp\\";
		String fname03 = "product.txt";
		
		try {
			FileReader fr = new FileReader(path03+fname03);
			StringBuffer sb =new StringBuffer();
			while(true) {
				int code = fr.read();
				if(code==-1) {
					break;
				}
			sb.append((char)code);
			}
			fr.close();
			String arr [] = sb.toString().split("\n");
			System.out.println("물건명\t가격\t갯수");
			for(String str : arr) {
				String arr02[] = str.split("&");
				System.out.println(arr[0]+"\t");
				System.out.println(arr[1]+"\t");
				System.out.println(arr[2]+"\n");
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
