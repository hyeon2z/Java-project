package javaexp.z02_homework.a21_hcj.vo;
//2. **계좌 클래스**
	//	    - 필드: 계좌번호, 예금주, 잔액
	//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
	//	    - 메서드: 입금, 출금, 잔액 확인
public class Account {
	private String acNum;
	private String acName;
	private int acMoney;
	
	public Account(String acNum, String acName) {
		this.acNum = acNum;
		this.acName = acName;
		this.acMoney = 0;//생략가능
	}
	
	public void deposit(int money) {
		System.out.println(money+"원 입금");
		this.acMoney += money;
	}
	
	public void withdraw(int money) {
		System.out.println(money+"원 출금");
		this.acMoney -= money;
	}
	public void showMoney() {
		System.out.println("현재 계좌 잔액 : "+ acMoney);
	}
	
	
	

}
