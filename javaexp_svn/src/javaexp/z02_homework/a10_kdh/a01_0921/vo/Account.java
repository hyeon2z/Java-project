package javaexp.z02_homework.a10_kdh.a01_0921.vo;

public class Account {
	// 2. **계좌 클래스**
	// - 필드: 계좌번호, 예금주, 잔액
	// - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
	// - 메서드: 입금, 출금, 잔액 확인

	private String accountNumber;
	private String depositors;
	private int balance;

	public Account(String accountNumber, String depositors) {
		this.accountNumber = accountNumber;
		this.depositors = depositors;
		this.balance = 0;
	}

	public int deposit(int money) {
		System.out.println(money + "입금");
		balance += money;
		return balance;
	}

	public int withdrawal(int money) {
		System.out.println(money + "출금");
		balance -= money;
		return balance;
	}

	public void showInfo() {
		System.out.println("잔액:" + balance);
	}

}
