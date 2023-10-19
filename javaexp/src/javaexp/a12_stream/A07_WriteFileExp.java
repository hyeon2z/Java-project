package javaexp.a12_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A07_WriteFileExp {

	public static void main(String[] args) {
		String pathExp = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a04_filewrite\\";
		File path01 = new File(pathExp + "a02_memberList.txt");
		
		String fileName = "a02_memberList.txt";
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter exp = new FileWriter(pathExp+fileName);
			while(true) {
				System.out.print("회원 아이디 입력 : ");
				String id = sc.nextLine();
				System.out.print("회원 명 입력 : ");
				String name = sc.nextLine();
				exp.append(id + "\t");
				exp.append(name + "\n");
				System.out.println("계속 입력하나요?(Y/N)");
				String isCon = sc.nextLine();
				if(!isCon.equals("Y")) {
					System.out.println("입력종료");
					break;
				}
			}
			exp.flush();
			exp.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
