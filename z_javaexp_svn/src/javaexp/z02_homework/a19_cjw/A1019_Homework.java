package javaexp.z02_homework.a19_cjw;

import java.io.*;
import java.util.Scanner;

public class A1019_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후,
//		  			  InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
		String[] menu = {"햄버거","라면","김밥"};
		System.out.println("주문번호\t메뉴");
		for(int idx=0;idx<menu.length;idx++) {
			System.out.println((idx+1)+"\t"+menu[idx]);
		}
		System.out.print("주문번호를 입력하세요 : ");
		InputStream is = System.in;
		try {
			int code = is.read();
			char chnum = (char) code;
			int num = Character.getNumericValue(chnum);
			System.out.println("주문번호 : "+num);
			System.out.println("주문한 메뉴 : "+menu[num-1]);
//			is.close(); 여기서 처리하면 뒤의 scanner객체가 작동하지 않음
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여,
//					  배열로 선언된 학생 이름과 점수를 입력되게 하세요.
		String[] student = {"홍길동","80","70","90"};
		String path = "C:\\b01_javaexp\\workspace\\javaexp_svn\\src\\javaexp\\z02_homework\\a19_cjw\\";
		String fname = "1학년1반.txt";
		File f01 = new File(path+fname);
		if(!f01.exists()) {
			try {
				f01.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter school = new FileWriter(path+fname);
			school.write("이름\t국어\t영어\t수학\n");
			school.append(student[0]+"\t"+student[1]+"\t"+student[2]+"\t"+student[3]+"\t");
			school.flush();
			school.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입력 완료");
		
//		[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고,
//					  Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘날짜 : ");
		String str = sc.nextLine();	// 앞에서 inputstream 사용후 처음 불러오는 것은 buffer때문에 제대로 작동 안함
		str = sc.nextLine();
		String diary = str+".txt";
		File f02 = new File(path+diary);
		if(!f02.exists()) {
			try {
				f02.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter fw = new FileWriter(path+diary);
			fw.write(str+"의 일기\n");
			System.out.println("오늘 일기 작성(Q입력시 종료)");
			while(true) {
				String memo = sc.nextLine();
				if(memo.equals("Q")) {
					System.out.println("입력종료");
					break;
				}
				fw.append(memo+"\n");
			}
			// inputstream의 close를 앞에서 처리하면 System.in이 종료되어 scanner가 제대로 작동하지 못함
			is.close();
			fw.flush();
			fw.close();
			System.out.println("파일저장완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
		/*
		1. FileWriter
			입력한 경로의 파일에 내용을 입력/추가할 수 있다.
				writer("문자열") : 파일에 쓸 내용
				append("문자열") : 기존 파일 내용에서 추가할 내용
				flush() : buffer메모리 해제
				close() : FileWriter 객체 메모리 해제
		2. FileReader
			입력된 경로의 파일의 내용을 불러올 수 있다.
				read() : 글자 하나씩 code값을 int로 가져온다.(공백, 줄바꿈 포함)
				close() : 자원해제
		 * */
		
//		[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고,
//					  해당 물건 정보를 탭간격으로 출력되게 하세요.
		String pfname = "product.txt";
		try {
			FileReader fin = new FileReader(path+pfname);
			StringBuffer sbf = new StringBuffer();
			while(true) {
				int data = fin.read();
				if(data==-1) {
					break;
				}
				sbf.append((char)data);
			}
			String[] arr = sbf.toString().split("\n");
			System.out.println("물건명\t가격\t개수");
			for(String pro:arr) {
				String[] arr2 = pro.split("&");
				System.out.print(arr2[0]+"\t"+arr2[1]+"\t"+arr2[2]);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
