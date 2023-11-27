package javaexp.z02_homework.a21_hcj.bookManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
	private List<Book> blist;
	private MemberManage mManage;
	private Member m;
	

	public BookManagement() {
		blist = new ArrayList<Book>();
		mManage = new MemberManage();
	}
	
	public void addBook(Book book) {
		blist.add(book);
	}
	public void showbooklist(List<Book> books) {
		for(Book b:books) {
			System.out.println(b.getBookNumber()+". "+b.getName());
		}
	}
	public void removeBook(Book book) {
		System.out.println(book.getName()+" 가 삭제되었습니다.");
		blist.remove(book);
	}
	public ArrayList<Book> researchBook(String name) {
		ArrayList<Book> b =new ArrayList<Book>();
		for(int idx=0;idx <blist.size();idx++) {
			if(0<=blist.get(idx).getName().indexOf(name))
			b.add(blist.get(idx));
		}
		return b;
		
	}
	public void ShowLoanBook(ArrayList<Book> booklist) {
		
		System.out.print("대출하실 도서의번호를 입력해주세요:");
		for(int idx = 0;idx<booklist.size();idx++){
			System.out.println((idx+1) + ". "+ booklist.get(idx).getName());
		}
	}
	public void rentalBook(int num){
		
		
		if(m.getRental()==false) {
			if(!blist.get(num).isRental()) {
				System.out.println(blist.get(num).getName()+"을 대여하였습니다."); 
				blist.get(num).setRentar(true);
				m.setRentalBook(blist.get(num));
				m.setRental(true);
			}
			else {
				System.out.println("이미 대여상태인 책입니다.");
			}
		}else {
			System.out.println("현재 빌린책을 반납해주세요");
		}
		
	}
	public void returnBook(){
		if(m.getRental()==true) {
		System.out.println(m.getRentalBook().getName()+"을 반납하였습니다.");
		for(int idx =0;idx < blist.size();idx++){
			if(blist.get(idx).getName().equals(m.getRentalBook().getName())) {
				blist.get(idx).setRentar(false);
				break;
			}
		}
		m.setRental(false);
		m.setRentalBook(null);
		}else {
			System.out.println("대여중인 책이 없습니다.");
		}
		
	
	}
	public List<Book> getBlist() {
		return blist;
	}

	public void setBlist(List<Book> blist) {
		this.blist = blist;
	}
	
	public Member getM() {
		return m;
	}

	public void setM(Member m) {
		this.m = m;
	}

	public MemberManage getmManage() {
		return mManage;
	}
	public void setmManage(MemberManage mManage) {
		this.mManage = mManage;
	}
	
}
