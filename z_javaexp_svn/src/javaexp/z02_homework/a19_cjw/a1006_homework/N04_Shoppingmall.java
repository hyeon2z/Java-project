package javaexp.z02_homework.a19_cjw.a1006_homework;

import java.util.Scanner;

import javaexp.z02_homework.a19_cjw.a1006_homework.vo.ShopBag;
import javaexp.z02_homework.a19_cjw.a1006_homework.vo.Shopping;

public class N04_Shoppingmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*
		4. **간단한 쇼핑몰 시스템**:
		    - 상품 목록, 장바구니, 주문 기능
		    - 사용자 로그인 및 회원 가입 기능
		 * */
		System.out.println("**간단한 쇼핑몰 시스템**");
		System.out.println("로그인 하시겠습니까?(로그인/회원가입)");
		
		boolean correct = false;
		String newid="himan";
		String newpassword="java123";
		while(true) {	// 로그인 또는 회원가입을 입력할 때까지 반복
			String login = sc.nextLine();
			switch(login) {
			case "로그인":
				correct=true;
				break;
			case "회원가입":
				correct=true;
				System.out.print("아이디 입력: ");
				newid = sc.nextLine();
				System.out.print("패스워드 입력: ");
				newpassword = sc.nextLine();
				break;
			default:
				System.out.println("다시 입력해주세요"
						+ "\n로그인 하시겠습니까?(로그인/회원가입)");
				break;
			}
			if(correct) {
				break;
			}
		}
		
		System.out.println("로그인 해주세요!");
		
		while(true) {	//로그인 성공시 반복 종료
			System.out.print("id: ");
			String id = sc.nextLine();	//아이디 입력
			System.out.print("password: ");
			String password = sc.nextLine();  //패스워드 입력
			
			if(!id.equals(newid)&&!password.equals(newpassword)) {	//아이디와 패스워드 모두 불일치시
				System.out.println("아이디와 패스워드를 다시 입력해주세요.");
				
			}else if(!id.equals(newid)&&password.equals(newpassword)) {	//아이디만 불일치시
				System.out.println("아이디를 다시 입력해주세요.");
				
			}else if(id.equals(newid)&&!password.equals(newpassword)) {	//패스워드만 불일치시
				System.out.println("패스워드를 다시 입력해주세요.");
				
			}else {
				System.out.println("로그인 성공!");	//둘 다 일치했을때
				break;
			}
		}
		
		Shopping mall = new Shopping("",0,"");
		mall.showPlist();
		while(true) {
			System.out.println("어떤 상품을 장바구니에 추가하시겠습니까?(종료 입력시 종료)");
			System.out.println(mall.getProducts());
			String buy = sc.nextLine();
			
			switch(buy) {
			case"가방":
				mall.regBlist(new ShopBag("가방",40000));
				break;
			case"신발":
				mall.regBlist(new ShopBag("신발",80000));
				break;
			case"청바지":
				mall.regBlist(new ShopBag("청바지",50000));
				break;
			case"티셔츠":
				mall.regBlist(new ShopBag("티셔츠",30000));
				break;
			case"모자":
				mall.regBlist(new ShopBag("모자",25000));
				break;
			case"종료":
				break;
			default:
				System.out.println(buy+"(이)라는 상품은 없습니다.");
				break;
			}
			if(buy.equals("종료")) {
				break;
			}
		}
		
		mall.showBlist();
		
		System.out.println("구매하시겠습니까?(y/n)");
		while(true) {
			String answer = sc.nextLine();
			if(answer.equals("y")) {
				mall.order();
				break;
			} else if(answer.equals("n")){
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
				System.out.println("구매하시겠습니까?(y/n)");
			}
		}
		
	}

}
