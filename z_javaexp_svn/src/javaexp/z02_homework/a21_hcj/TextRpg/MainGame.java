package javaexp.z02_homework.a21_hcj.TextRpg;

import java.util.Scanner;

public class MainGame {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	MemberManager member = new MemberManager();
		
		Member mem = new Member("abcde","abc1234","만랩전사");
		//list.add(mem);
		boolean isplaying = true;
		//임시 캐릭터
		mem.getMycharactor().getInv().newItem("기본장비1", 3);
		mem.getMycharactor().getInv().newItem("기본장비12", 3);
	//	
		
		while(true) {
			Scanner sc = new Scanner(System.in);
		System.out.println("## TEXTRPG ##");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		
		switch(Integer.parseInt(sc.nextLine())) {
		case 2:
			member.newMem();
			break;
		}
		
		
		
		
		
		//boolean isitem = false;
		//임시 로그인
		
		
		
		
		
		String inId;
		String inPass;
		while(true) {
		
			System.out.print("아이디 입력:");
			inId = sc.nextLine();
			System.out.print("패스워드 입력:");
			inPass = sc.nextLine();
			if(inId.equals(mem.getId())) {
				if(inPass.equals(mem.getPass()))
				{
					
					System.out.println("로그인 성공");
					isplaying = true; //로그인시 게임플레이여부 true
					mem.callinfo();
					
					
					
					while(isplaying) {
						System.out.println("하실 일을 선택해주세요");
						System.out.println("1.던전");
						System.out.println("2.여관");
					 	System.out.println("3.인벤토리");
					 	System.out.println("4.정보확인");
					 	System.out.println("5.게임 종료");
					 	System.out.println("==>");
						if(mem.getMycharactor().getExp() >= mem.getMycharactor().getMaxexp()) {
						 	System.out.println("Level Up!!!!!!");
						 	mem.getMycharactor().setLevel(mem.getMycharactor().getLevel()+1);
						 	mem.getMycharactor().setAd(mem.getMycharactor().getAd()+1);
						 	mem.getMycharactor().setMaxexp(mem.getMycharactor().getMaxexp()*2);
						 	mem.getMycharactor().setExp(-1*(mem.getMycharactor().getExp()));
						 }
				 	switch(Integer.parseInt(sc.nextLine())){
				 	
				 	case 1:	// 던전 입장
				 		Charactor monster = new Charactor("슬라임");
				 		monster.setAd((int)(Math.random()*4+1));
						BattleSystem bt = new BattleSystem(mem.getMycharactor(),monster);
						while(!(monster.getHp()<=0)) {
							if(mem.getMycharactor().getHp()<=0) {
								System.out.println("체력이 부족하여 전투를할 수 없습니다.");
								System.out.println("여관에서 휴식을 취하여 체력을 회복해주세요");
								break;
							}else {
								
							
								
						bt.BasicMessage();
						
						switch(Integer.parseInt(sc.nextLine())) {
						case 1:	//기본공격 선택
							bt.BasicAttack((int)(Math.random()*3+8)*mem.getMycharactor().getAd());
							break;
						case 2:	//스킬공격 선택
							if(mem.getMycharactor().getMp()>=10) {
							System.out.print("스킬 쌔게 찌르기");
							bt.SkillAttack((int)(Math.random()*3+8)*(mem.getMycharactor().getAd()+2));
							}else { 
								System.out.println("마나가 부족합니다.");
								continue;
							}
							break;
						case 3:
							System.out.println("준비중인 시스템입니다.");
							continue;

						
						
						}
						int monsterat = (int)(Math.random()*3+8)* monster.getAd();
						
						System.out.println(monster.getName()+"의 공격!");
						System.out.println(monsterat+"의 피해를입었습니다");
						mem.getMycharactor().setHp(-monsterat);
						
						 }
						}
						if(mem.getMycharactor().getHp()<=0)break;
						System.out.println(monster.getName()+" 사망 "+monster.getGivexp()+"의 경험치 획득");
						mem.getMycharactor().setExp(monster.getGivexp());
						
						
						boolean isitem =false ;
					
						for(int i = 0;i<mem.getMycharactor().getInv().getInvenName().length;i++) {
							if(mem.getMycharactor().getInv().getInvenName()[i]!=null&&
									mem.getMycharactor().getInv().getInvenName()[i].equals("슬라임의 물방울"))
								isitem = true;
						}
						
						if(isitem == false) {
							mem.getMycharactor().getInv().newItem("슬라임의 물방울", 1);
							System.out.println("슬라임의 물방울 획득");
							isitem = true;
						}else {
							for(int i = 0;i<mem.getMycharactor().getInv().getInvenName().length;i++) {
								
								if(mem.getMycharactor().getInv().getInvenName()[i].equals("슬라임의 물방울")) {
									mem.getMycharactor().getInv().setItemcnt("슬라임의 물방울", (mem.getMycharactor().getInv().getInvenCnt()[i])+1);
									System.out.println("슬라임의 물방울 획득");
									break;
								}
							
							}
								
						}
						
							
					
					
						
				 		break;
				 	case 2: //여관
				 		System.out.println("휴식을 취해 모든 체력과 마력이 회복되었습니다");
				 		mem.getMycharactor().heal();
				 		break;
				 	case 3:
				 		int ivcnt = mem.getMycharactor().getInv().getInvenName().length;
				 		for(int i = 0;i<ivcnt;i++)
				 		{
				 			if(mem.getMycharactor().getInv().getInvenName()[i] != null){
				 			System.out.println(mem.getMycharactor().getInv().getInvenName()[i]+":"+mem.getMycharactor().getInv().getInvenCnt()[i]);
				 			}else if(mem.getMycharactor().getInv().getInvenName()[0]==null){
				 				System.out.println("인벤토리 저장공간이 비어있습니다");
				 				break;
				 		}
				 			
				 		}
				 	//	System.out.println("준비중인 시스템입니다.");
				 		break;
				 	case 4:	//4.기본정보 호출
				 		mem.callinfo();
				 			break;
				 	case 5:
				 		isplaying = false;
				 		break;
				 		default:
				 			System.out.println("잘못입력");
				 	}
					}
					
				}else {
					System.out.println("올바르지 않은 패스워드입니다.");
				}
				
			}else {
				System.out.println("존재하지 않는 ID입니다.");
			}
		
			
		}
		
	
		
	
		}	
			
	}

	
	
}

	
	


