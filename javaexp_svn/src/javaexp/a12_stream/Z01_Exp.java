package javaexp.a12_stream;

import java.util.Scanner;

public class Z01_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isNames = false;
		Scanner sc = new Scanner(System.in);
		while (true) {
			//isNames = false;
			System.out.print("이름 입력(최대 10글자):");
			String inName = sc.nextLine();
			for (int idx = 0; idx < inName.length(); idx++) {
				if (!((inName.charAt(idx) <= 65 && inName.charAt(idx) >= 90)
						|| (inName.charAt(idx) <= 97 && inName.charAt(idx) >= 122)
						|| (inName.charAt(idx) <= 44032 && inName.charAt(idx) >= 55203))) {
					System.out.println("영문 또는 한글을 입력해주세요.");
					isNames = true;
					break;
				}
			}
			if (isNames == true) {
				isNames = false;
				 continue;
			}
			if (inName.length() > 10) {
				System.out.println("10글자 이내로 입력해주세요");
				 continue;
			}
		break;
		}
	}

}
