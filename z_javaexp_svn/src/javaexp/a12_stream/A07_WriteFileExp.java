package javaexp.a12_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A07_WriteFileExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ="C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a04_filewrite\\";
		String fname = "a02_memberList.txt";
		try {
			FileWriter fout = new FileWriter(path+fname);
			fout.write("아이디\t회원명\n");
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("회원아이디를 입력하세요:");
				String id = sc.nextLine();
				System.out.print("회원명을 입력하세요:");
				String name = sc.nextLine();
				fout.append(id+"\t");
				fout.append(name+"\n");
				System.out.println("계속 입력하시겠습니까(Y/N)?:");
				String isCon = sc.nextLine();
				if(!isCon.equals("Y")) {
					System.out.println("입력종료");
					break;
				}
				
			}
			fout.flush();
			fout.close();
			System.out.println("입력완료! 파일저장완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
