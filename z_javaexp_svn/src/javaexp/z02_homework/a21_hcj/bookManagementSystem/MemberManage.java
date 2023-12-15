package javaexp.z02_homework.a21_hcj.bookManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberManage {
	private static List<Member> mem;
	MemberManage(){
		mem = new ArrayList<Member>();
	}
	
	public void newMember() {
		Scanner sc = new Scanner(System.in);
		boolean isIdDuplication=false;
		System.out.println("#회원 등록#");
		System.out.print("등록할 아이디:");
		String inId = sc.nextLine().trim();
		if(mem !=null) { 
		for(Member m : mem) {
			if(m.getId().equals(inId)) {
				System.out.println("중복된 아이디가 존재합니다.");
				isIdDuplication = true;
				break;
			}
		}
		}
		if(!isIdDuplication) {
			System.out.print("등록할 패스워드:");
			String inPass = sc.nextLine().trim();
			System.out.print("등록할 이름:");
			String inName = sc.nextLine().trim();
			System.out.println("회원등록성공");
			mem.add(new Member(inId,inPass,inName)); 
			
		}
		
		
	}
//	public void ShowMemList() {
//		System.out.println("회원이름\t대여가능책수량");
//		for(Member m:mem) {
//			System.out.println(m.getName()+"\t"+m.getRental());
//		}
//	}
	public Member Login() {
		boolean idok = false;
		int idnum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("#로그인#");
		System.out.print("아이디:");
		String inId = sc.nextLine().trim();
		if(mem !=null) { 
			for(int idx = 0;idx<mem.size();idx++) {
				if(mem.get(idx).getId().equals(inId)) {
					idok = true;
					idnum = idx;
					break;
				}
			}
		}
		
		if(idok == true) {
			System.out.print("패스워드:");
			String inPass = sc.nextLine().trim();
			if(inPass.equals(mem.get(idnum).getPass())) {
			System.out.println("로그인 성공!!");
			System.out.println(mem.get(idnum).getName()+"님 환영합니다.");
			return mem.get(idnum);
			}
			else {
				System.out.println("패스워드가 올바르지 않습니다.");
			}
		}else System.out.println("아이디가 올바르지 않습니다.");
		return null;
		}
	
		
	}


