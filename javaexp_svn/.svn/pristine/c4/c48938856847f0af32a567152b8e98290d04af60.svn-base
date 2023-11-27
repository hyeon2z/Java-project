package javaexp.z02_homework.a21_hcj.bookManagementSystem;

import java.util.Scanner;

public class BookLoanSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int indata = 0;
		
		//MemberManage mManage = new MemberManage();
		BookManagement mManage = new BookManagement();
		mManage.addBook(new Book("Harry dsf","sdf"));
		mManage.addBook(new Book("sdfsd dsf","sdf"));
		mManage.addBook(new Book("harry dsf","sdf"));
		mManage.addBook(new Book("HARRY dsf","sdf"));
		mManage.addBook(new Book("Harryfds","sdf"));
		
		mManage.addBook(new Book("Hsfsdfsf","sdf"));
		
		while(indata!=8) {
		System.out.println("#책 대출 프로그램#");
		System.out.println("1. 책 목록보기");
		System.out.println("2. 책 검색");
		System.out.println("3. 책 추가");
		System.out.println("4. 책 대여");
		System.out.println("5. 책 반납");
		System.out.println("6. 로그인");
		System.out.println("7. 회원가입");
		System.out.println("8. 프로그램 종료");	
		System.out.print("입력 :");
		indata =Integer.parseInt(sc.nextLine());
		
		
		
		
		switch(indata) {
			case 1:
		
				mManage.showbooklist(mManage.getBlist());
				break;
			case 2:
				System.out.print("검색하실 책이름을 입력:");
				String bookname =sc.nextLine();
				mManage.researchBook(bookname);
				mManage.showbooklist(mManage.researchBook(bookname));
				break;
			case 3:
				System.out.print("추가하실 책의 이름:");
				String Bookname = sc.nextLine();
				System.out.print("추가하실 책의 작가:");
				String Bookaut = sc.nextLine();
				mManage.getBlist().add(new Book(Bookname,Bookaut));
				
				break;
			case 4:
				if(mManage.getM()==null)System.out.println("로그인후에 이용해주세요");
				else {
				System.out.print("대여하실 책번호를 입력해주세요:");
				mManage.rentalBook(Integer.parseInt(sc.nextLine())-1);
				}
				break;
			case 5:
				if(mManage.getM()==null)System.out.println("로그인후에 이용해주세요");
				else mManage.returnBook();
				break;
			case 6:
				
				
				if(mManage.getM() != null)System.out.println("이미 로그인된상태입니다.");
				else {
					Member m = mManage.getmManage().Login();
					mManage.setM(m);
				}
				
			
			
				break;
			case 7:
				mManage.getmManage().newMember();
				break;
			case 8:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
			System.out.println("올바른 데이터를 입력해주세요");
		}
		}
		
	}

}

