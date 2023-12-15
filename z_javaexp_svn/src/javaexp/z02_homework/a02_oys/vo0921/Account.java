package javaexp.z02_homework.a02_oys.vo0921;

/*2. **계좌 클래스**
- 필드: 계좌번호, 예금주, 잔액
- 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
- 메서드: 입금, 출금, 잔액 확인*/
public class Account {
	private String accountNum;
	private String accountName;
	private int price;
	
	// 생성자
	public Account(String accountNum, String accountName) {
		this.accountNum = accountNum;
		this.accountName = accountName;
	}
	
	// 잔액확인 (getter)
	public int getPrice() {
		return price;
	}

	// 입금
	public void deposit (int money) {
		price += money;
		System.out.println("입금 완료. 잔액 : " + price);
	}
	
	// 출금
	public void withdraw (int money) {
		if (money > price) {
			System.out.println("잔액이 부족해 출금이 불가능합니다.");
		} else {
			price -= money;
			System.out.println("출금 완료. 잔액 : " + price);
		}
	}
	
}
