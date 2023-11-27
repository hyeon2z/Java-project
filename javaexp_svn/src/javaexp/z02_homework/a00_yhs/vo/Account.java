package javaexp.z02_homework.a00_yhs.vo;

public class Account {
    private String accountNumber;
    private String holderName;
    private double balance;

    public Account(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        //this.balance = 0.0;  
        // 클래스에서 선언한 변수는default로 0.0이 자동할당.
    }
    // 입금
    public void deposit(double amount) {
        balance += amount;
    }
    // 인출
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
        	// 잔액보다 더 많으면 잔액이 부족하다는 메시지 처리..
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
