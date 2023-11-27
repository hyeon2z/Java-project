package javaexp.z02_homework.a13_ajh.vo0921;

public class BankNum {
	private String bNum;
	private String masNum;
	private double avai;
	public BankNum(String bNum, String masNum, int avai) {
		super();
		this.bNum = bNum;
		this.masNum = masNum;
		this.avai = 0;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			avai += amount;
            System.out.println(amount + "원 입금되었습니다.");
        } else {
            System.out.println("유효하지 않은 입금액입니다.");
        }
	}
	public void withdraw(double amount) {
        if (amount > 0 && avai >= amount) {
        	avai -= amount;
            System.out.println(amount + "원 출금되었습니다.");
        } else {
            System.out.println("출금할 수 없습니다. 잔액이 부족하거나 유효하지 않은 출금액입니다.");
        }
    }
	 public void checkBalance() {
	        System.out.println("계좌번호: " + bNum);
	        System.out.println("예금주: " + masNum);
	        System.out.println("잔액: " + avai + "원");
	    }
	public String getbNum() {
		return bNum;
	}
	public void setbNum(String bNum) {
		this.bNum = bNum;
	}
	public String getMasNum() {
		return masNum;
	}
	public void setMasNum(String masNum) {
		this.masNum = masNum;
	}
	public double getAvai() {
		return avai;
	}
	public void setAvai(double avai) {
		this.avai = avai;
	}
	

}
