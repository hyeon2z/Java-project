package a01_diexp.z01_vo;

public class Account {
	private int balance;
	private int deposit;
	private int withdraw;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int balance, int deposit, int withdraw) {
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
}
