package javaexp.z02_homework.a19_cjw.vo;

import java.util.Scanner;

public class Account {

	private int actNum;
	private String actName;
	private int actmoney;

	public Account(int actNum, String actName, int actmoney) {
		this.actNum = actNum;
		this.actName = actName;
		this.actmoney = 0;
	}
	
	public int inputmoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금액: ");
		int input = Integer.parseInt(sc.nextLine());
		actmoney+=input;
		System.out.print("잔액: ");
		return actmoney;
	}
	public int outputmoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금액: ");
		int output = Integer.parseInt(sc.nextLine());
		actmoney-=output;
		System.out.print("잔액: ");
		return actmoney;
	}

	public int getActmoney() {
		System.out.print("최종 잔액: ");
		return actmoney;
	}
	
}
