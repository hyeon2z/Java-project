package javaexp.z02_homework.a06_psj.vo;

public class Account {
	private int AccNum;
	private String name;
	private int money;
	public Account(int accNum, String name) {
		AccNum = accNum;
		this.name = name;
		money = 0;
	}
	public void addMoney(int a) {
		money += a;
	}
	public void minusMoney(int a) {
		money -= a;
	}
	public void AccInfo() {
		System.out.println("\n"+name+"님의 잔액은 "+money+"원 입니다.");
	}
}
