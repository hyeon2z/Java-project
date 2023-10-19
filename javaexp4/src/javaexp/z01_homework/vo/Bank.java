package javaexp.z01_homework.vo;

public class Bank {
    long num;
	String name;
	int money;
	
	public Bank(long num, String name, int mon) {
		this.num = num;
		this.name = name;
		money = mon;
	}
	public void bankInfo() {
		System.out.println("현재 잔액은 : " + money + "\n");
	}
	public void moneyIn(int mon) {
		System.out.println("입금 : " + mon);
		bankInfo();
	}
	public void moneyOut(int mon) {
		System.out.println("출금 : " + mon);
		bankInfo();
	}
	
	
	// 잔액확인
	public int getMoney() {
		return money;
	}
	// 입/출금
	public void inMoney(int mon) {
		money += mon;
		moneyIn(mon);
	}
	public void outMoney(int mon) {
		money -= mon;
		moneyOut(mon);
	}
	
	
	
}
