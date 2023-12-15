package javaexp.z02_homework.a10_kdh.mini;

import java.util.Scanner;

public class Purchase {
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("### 물건 구매 프로그램 ###");
		System.out.println();
		
		System.out.print("등록할 물건의 개수를 입력하세요:");
		int pN = scanner.nextInt();
		Product[] products = new Product[pN];
		
		System.out.println();
		for(int i = 0 ; i < pN ; i++) {
			products[i] = new Product();
			System.out.println("==== 물건 정보를 입력("+ (i+1)+") ====");
			products[i].makeProduct();
			products[i].setProductNumber(i+1);
		}
		
		System.out.print("물건을 구매할 회원수를 입력하세요:");
		int N = scanner.nextInt();
		Member[] members = new Member[N];
		System.out.println("물건을 구매하려면 회원가입을 해야합니다");
		System.out.print("회원가입을 진행하시겠습니까?(yes-1,no-2)");
		int jc = scanner.nextInt();
		if(jc == 1) {
			for(int i = 0 ; i <N ; i++) {
				members[i] = new Member();
				System.out.println("## 회원 가입 ##");
				System.out.println("회원정보 입력("+ (i+1)+")");
				members[i].join();
				members[i].setMemberNumber(i+1);
				System.out.println(members[i].getMemberID() + "님의 회원 번호는 " + members[i].getMemberNumber() + "입니다.");
			}
		}
		
		int k = 0;
		int check = 0;
		scanner.nextLine();
		while(N>0) {
			System.out.print("#### 물건을 구매하시겠습니까?(1-yes, 2-no):");
			k = scanner.nextInt();
			scanner.nextLine();
			if(k == 1) {
				System.out.print("** 물건을 구매 하시려면 회원 번호를 입력하세요:");
				check = scanner.nextInt();
				System.out.println("#로그인을 합니다#");
				members[check-1].login();
				if(members[check-1].isMember) {
					System.out.println("=====물품 리스트=====");
					for(Product item : products) {
						System.out.println(item.getProductNumber()+") "+ item.getProductName() +" 가격:" + item.getProductPrice()+"원");
					}
					System.out.println();
					System.out.print("구매하실 물품의 번호를 입력하세요:");
					int pn = scanner.nextInt();
					System.out.println(members[check-1].getMemberID()+"님께서 " + 
					products[pn-1].getProductName()+"구매 완료!");
					System.out.println();
					N--;
				}else {
					System.out.println("회원이 아닙니다.");
				}
			}else {
				System.out.println("물건 구매 종료");
			}
		}
		System.out.println("물건 구매 종료");
		
	}
}
