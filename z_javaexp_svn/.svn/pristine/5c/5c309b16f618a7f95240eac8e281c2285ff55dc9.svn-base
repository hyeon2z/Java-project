package javaexp.z02_homework.a06_psj.vo;

import java.util.Scanner;

public class RSP {
	public int myHand;
	public int comHand;
	public void gameStart(){
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 1, 바위 2, 보 3");
		myHand = sc.nextInt();
	}
	public String change(int a) {
		String tmp="";
		if (a==1) tmp="가위";
		else if (a==2) tmp="바위";
		else if (a==3) tmp="보";
		return tmp;
	}
	public void showHand() {
		System.out.println("나: "+change(myHand));
		System.out.println("상대: "+change(comHand));
	}
}
