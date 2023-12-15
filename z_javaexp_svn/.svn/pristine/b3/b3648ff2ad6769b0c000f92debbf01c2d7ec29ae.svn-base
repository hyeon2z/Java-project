package javaexp.z02_homework.a21_hcj.TextRpg;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	
	
	private ArrayList<Member> memlist ;
	MemberManager(){
		memlist = new ArrayList<Member>();
	}
	
	public void newMem() {	//회원등록
		Member newmem = new Member(); 
		newmem.input(); //member 데이터입력
		boolean isOverlapid = false;	//중복된 회원이 있는지 체크
		for(int idx = 0;idx<memlist.size();idx++) {
			Member ckid = memlist.get(idx);
			if(ckid.getId().equals(newmem.getId())){	//중복된 아이지가 있다면
				System.out.println("중복된 아이디가 있습니다.");
				isOverlapid = true;	//중복됨 체크
				break;
			}
		}
		if(isOverlapid==false) 	// 중복된 아이디가 없다면
			memlist.add(newmem);	//입력된 맵버객체데이터 맴버리스트에 추가
		}
	public void deleteMem() {
		boolean find = false;	//아이디를 찾았는지 체크
		String inId;
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 아이디 입력:");
		inId = sc.nextLine();
		for(int idx = 0;idx<memlist.size();idx++) {
			Member ckid = memlist.get(idx);
			if(inId.equals(ckid.getId())){	//맵머리스트내에 입력된 아이디가 있다면
				System.out.print("패스워드 입력:");	//삭제를 위한 패스워드확인
				String pass = sc.nextLine();
				if(pass.equals(ckid.getPass())) {	//맞는 패스워드를 입력했다면
					memlist.remove(idx);	//맴버리스트에서 해당 맴버 제거
					System.out.println("회원삭제가 정상처리되었습니다.");
					
				}else {	//패스워드가 잘못되었을시
					System.out.println("잘못된 패스워드를 입력하셨습니다");
				}
				find = true;	//아이디를 찾았는지 체크
				break;
				
				

			}
		}
		if(!find) {	//맴버리스트내에 입력된 아이디가 존재하지 않을경우
			System.out.println("등록되어있지 않은 아이디입니다.");
		}
		
	}
	
	
}
