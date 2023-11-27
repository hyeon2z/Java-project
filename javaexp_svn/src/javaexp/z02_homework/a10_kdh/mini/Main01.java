package javaexp.z02_homework.a10_kdh.mini;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 회원크기
		Member [ ] mems = new Member[200];
		Product [] prods = new Product[1000];
		// 기본 물건크기
		ShoppingMall sm = new ShoppingMall(mems, prods);
		// 1.Scanner
		sm.regMember(new Member(1, "himan","8888"));
		sm.regMember();
	}

}
