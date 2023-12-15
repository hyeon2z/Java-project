package javaexp.z02_homework.a14_cms.vo;

public class Account {
	private String accNo;
	private String holder;
	private int amount;
	public Account(String accNo, String holder) {
		this.accNo = accNo;
		this.holder = holder;
	}
	public void accountInfo() {
		System.out.println("게좌번호 : " + accNo);
		System.out.println("게좌주 : " + holder);
		System.out.println("잔액 : " + amount);
		
	}
	public void getBalance() {
		System.out.println("잔액은: " + amount);
	}
	public void depositAccount(int price) {
		amount+=price;
	}
	public void withdrawalAccount(int price) {
		amount-=price;
	}

}
