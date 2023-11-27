package javaexp.z02_homework.a11_mhi.vo;


public class Acount {
	private String acountNum;
	private String name;
	private int cnt;

//	public Acount() {
//		int cnt = 0;
//	}

	public Acount(String acountNum, String name) {
		this.acountNum = acountNum;
		this.name = name;
		this.cnt = 0;
	}

	public Acount(String acountNum, String name, int cnt) {
		this.acountNum = acountNum;
		this.name = name;
		this.cnt = cnt;
	}

	public void deposit() {
		cnt += 1000;
		System.out.println(cnt + "원 입금되었습니다");
	}

	public void withdrawn() {
		cnt -= 500;
		System.out.println(cnt + "원 출금되었습니다");
	}

	public void showInf() {
		System.out.println("잔액:" + cnt + "원");
	}
}