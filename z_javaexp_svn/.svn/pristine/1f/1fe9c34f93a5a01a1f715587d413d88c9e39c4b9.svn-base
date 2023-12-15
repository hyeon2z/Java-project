package javaexp.z02_homework.a17_okw;

import java.util.ArrayList;
import java.util.Scanner;

public class A1006_BankAccountApp {

	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("## 쌍용은행 인터넷뱅킹 ##");
			System.out.println("1. 계좌 생성 || 2. 입금 || 3. 출금 || 4. 잔액 조회 || 5. 종료");
			System.out.print("원하는 메뉴를 선택하세요.(1~5)  >>");
			int select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
				case 1:
//					System.out.print("새로운 계좌를 생성합니다. 계좌번호를 입력하세요 : ");
//					String accountNumber = sc.nextLine();
					String accountNumber = "";	
					System.out.println("\n새로운 계좌를 생성합니다. 계좌 번호는 다음과 같습니다.");
					for(int cnt=1;cnt<=4;cnt++) {
						int accountDigit = (int)(Math.random()*10);
						accountNumber += Integer.toString(accountDigit);
						System.out.print(accountDigit);
					}
					BankAccount newAccount = new BankAccount(accountNumber);
					accounts.add(newAccount);
					System.out.println("\n계좌가 생성되었습니다.\n");
					break;
				case 2:
					System.out.print("입금할 계좌의 계좌번호를 입력하세요... : ");
					String depositAccountNum = sc.nextLine();
					BankAccount depositAccount = findAccount(accounts, depositAccountNum);
					if(depositAccount != null) {
						System.out.print("입금할 금액 입력... : ");
						long depoositAmount = Long.parseLong(sc.nextLine());
						depositAccount.deposit(depoositAmount);
					}else {
						System.out.println("해당 계좌를 찾을 수 없습니다.");
					}
					break;
				case 3:
					System.out.print("출금할 계좌의 계좌번호를 입력하세요 ... : ");
					String withdrawAccountNum = sc.nextLine();
					BankAccount withdrawAccount = findAccount(accounts, withdrawAccountNum);
					if(withdrawAccount != null) {
						System.out.print("출금할 금액 입력... : ");
						Long withdrawAmount = Long.parseLong(sc.nextLine());
						withdrawAccount.withdraw(withdrawAmount);
					}else {
						System.out.println("해당 계좌를 찾을 수 없습니다.");
					}
					break;
				case 4:
					System.out.print("잔액 조회할 계좌번호를 입력하세요 ... : " );
					String checkAccountNum = sc.nextLine();
					BankAccount checkAccount = findAccount(accounts, checkAccountNum);
					if(checkAccount != null) {
						System.out.println("현재 잔액은.. "+ checkAccount.getBalance() + "원 입니다.");
					}else {
						System.out.println("해당 계좌를 찾을 수 없습니다.");
					}
					break;
				case 5:
					System.out.println("인터넷 뱅킹을 종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println("잘못된 접근입니다.");
			}
		}
		
		
	}
	private static BankAccount findAccount(ArrayList<BankAccount> accounts, String accountNumber) {
		for(BankAccount account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}

}

class BankAccount {
	private String accountNumber;
	private long balance;
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	public void deposit(long amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println(amount + "원 입금 완료. 현재 잔액은 "+ balance + "원");
		}else {
			System.out.println("유효하지 않은 입력입니다.");
		}
	}
	
	public void withdraw(long amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println(amount + "원 출금 완료. 현재 잔액은 "+ balance + "원");
		}else {
			System.out.println("출금할 수 없습니다. 잔액이 부족하거나 유효하지 않은 입력입니다.");
		}
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	public long getBalance() {
		return balance;
	}

}
