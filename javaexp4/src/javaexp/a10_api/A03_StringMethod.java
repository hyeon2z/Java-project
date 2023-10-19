package javaexp.a10_api;

import java.util.Scanner;

public class A03_StringMethod {

	public static void main(String[] args) {
		/*
		# 문자열을 처리한 String 객체의 주요 기능 메서드
		1. charAt(int idx) : 해당 문자열의 0부터 시작해 특정 문자(char)의 위치 리턴
		 */
//		String greet = "안녕하세요 반갑습니다";
		// .length() : 문자열의 길이 리턴
//		for(int idx = 0; idx < greet.length(); idx ++) {
//			System.out.println(idx + ")" + greet.charAt(idx));
//		}
		String data = "1991/10/12";
		String data1 = "";
		// ex) 이 데이터는 생년월일을 가져온다. charAt를 이용하여 문자를 추출해
		//		@@@년@@월@@일 생을 바꾸어 출력
		for(int i = 0; i < data.length(); i ++) {
			if(i != 4 && i != 7) {
				data1 += data.charAt(i);
			}else if(i == 4) {
				data1 += "년";
			}else if(i == 7) {
				data1 += "월";
			}
		}data1 += "일";
		System.out.println(data1);
		
		char[] birth = new char[11];
		birth[0] = data.charAt(0);
		birth[1] = data.charAt(1);
		birth[2] = data.charAt(2);
		birth[3] = data.charAt(3);
		birth[4] = '년';
		birth[5] = data.charAt(5);
		birth[6] = data.charAt(6);
		birth[7] = '월';
		birth[8] = data.charAt(8);
		birth[9] = data.charAt(9);
		birth[10] = '일';
		String birthDay = new String(birth);
		System.out.println(birthDay);
		/*
		2. getBytes() : 문자열을 byte배열로 가지고온다
		 */
		String str1 = "Hello";
		byte[] bytes01 = str1.getBytes();
		for(byte b : bytes01) {
			System.out.println(b + "(" + (char)b + ")");
		}
		/*
		3. 특정 문자열을 찾을 때, 활용되는 indexOf()
		    1) 기본형식
		        문자열.indexOf("찾을문자열")
		        해당문자열 안에서 찾을 문자열의 시작 위치를 index로 리턴해준다.
		        해당 문자열을 포함하지 않으면 -1을 리턴한다.
		    ex) 키워드 검색 시 주로 활용된다. 포함된 문자열의 시작위치를 리턴한다.
		 */
		String msg = "식사 맛있게 했나요";
		int idxLoc1 = msg.indexOf("식사");
		int idxLoc2 = msg.indexOf("점심");
		System.out.println("데이터가 있을 때 : " + idxLoc1);
		System.out.println("데이터가 없을 때 : " + idxLoc2);
		
		if(idxLoc1 != -1) {
			System.out.println("검색이 되었다.");
		}else {
			System.out.println("해당 데이터가 없다.");
		}
		// ex) String menu = "사과, 바나나, 딸기";를 선언하고,
		// 구매할 물건을 Scanner를 통해 입력받았을 때
		// 구매가능여부를 조건문으로 출력하세요
		Scanner sc = new Scanner(System.in);
		
		String menu = "사과, 바나나, 딸기";
		System.out.println("메뉴목록 : " + menu);
		
		System.out.print("구매할 물건을 입력하세요 : ");
		String usrbuy = sc.nextLine();
		int buy = menu.indexOf(usrbuy);
		
		if(buy != -1) {
			System.out.println(usrbuy + "는 구매 가능합니다.");
		}else {
			System.out.println("입력하신 물건은 없습니다.");
		}
	}	

}
