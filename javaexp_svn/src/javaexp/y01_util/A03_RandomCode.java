package javaexp.y01_util;

public class A03_RandomCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=33;num<=126;num++) {
			System.out.println(num+":"+(char)num);
		}
		// 영문 대문자 중에서 4개를 추출해서 임의의 비번 설정..
		// 65~90
		int rCode1 = (int)(Math.random()*26+65);
		int rCode2 = (int)(Math.random()*26+65);
		int rCode3 = (int)(Math.random()*26+65);
		int rCode4 = (int)(Math.random()*26+65);
		System.out.print((char)rCode1);
		System.out.print((char)rCode2);
		System.out.print((char)rCode3);
		System.out.println((char)rCode4);
		System.out.println("8개 임시 비번");
		for(int cnt=1;cnt<=8;cnt++) {
			int rCode = (int)(Math.random()*26+65);
			System.out.print((char)rCode);
		}
		System.out.println();
		// ex1) 소문자 8자를 임의로 출력 처리
		System.out.println("# 소문자 8자로 임시 비번 설정#");
		for(int cnt=1;cnt<=8;cnt++) {
			int rCode = (int)(Math.random()*26+97);
			System.out.print((char)rCode);		
		}
		System.out.println();
		
		// ex2) 숫자 4자를 임의로 출력 처리
		System.out.println("# 숫자 4자로 임시 비번 설정#");
		for(int cnt=1;cnt<=4;cnt++) {
			int rCode = (int)(Math.random()*10+48);
			System.out.print((char)rCode);		
		}
		System.out.println();		
		// ex3) 대문자+소문자+특수문자 포함한 16자 임시비번 생성
		// 33~126
		// 경우의 수 94, 시작수 33
		System.out.println("# 대문자+소문자+특수문자 포함한 16자 임시비번 생성#");
		for(int cnt=1;cnt<=16;cnt++) {
			int rCode = (int)(Math.random()*94+33);
			System.out.print((char)rCode);		
		}
		System.out.println();		
		
		
	}

}
