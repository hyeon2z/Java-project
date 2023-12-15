package javaexp.z02_homework.a12_ljh.vo;

import java.util.Scanner;

public class Account {
	private String number;
	private String name;
	private int money;
	
	public Account(String number, String name, int money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}
	
	public void AccountInfo() {
		System.out.println("계좌번호: " + number);
		System.out.println("예금주: " + name);
		System.out.println("잔액: " + money);
	}
	
	public void AddMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 금액을 입력하세요: ");
		int input = Integer.parseInt(sc.nextLine());
		System.out.println("입금 금액: " + input + "원");
		money += input;
		System.out.println("남은 금액: " + money + "원");
	}
	
	public void MinusMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금할 금액을 입력하세요: ");
		int output = Integer.parseInt(sc.nextLine());
		System.out.println("출금 금액: " + output + "원");
		money -= output;
		System.out.println("남은 금액: " + money + "원");
	}
	
}
