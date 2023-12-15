package javaexp.z02_homework.a14_cms_0921;

import java.nio.file.spi.FileSystemProvider;

public class Account {
	private String accountNo;
	private String accountHolder;
	private int balance;
	public Account() {
		
	}
	public void accountInfo(){
		System.out.println("계좌번호: " + accountNo);
		System.out.println("예금주: " + accountHolder);
		System.out.println("잔액: " + balance);
	}
	public void depositAccount(int money) { //입금
		balance += money;
	}
	public void withdrawalAccount(int money) { //출금
		balance -= money;
	}
	public void getBalance(){ //잔액 확인
		System.out.println("잔액은: " + balance);
	}

	

}
