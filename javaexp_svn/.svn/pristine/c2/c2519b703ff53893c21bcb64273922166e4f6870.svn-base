package javaexp.z02_homework.a19_cjw.programming.games;

import java.util.Scanner;

public class RockScissorsPaper {
	
	private String name;
	private String how;
	
	//가위바위보에 대한 정보
	public RockScissorsPaper(String name, String how) {
		this.name = "~~가위바위보~~";
		this.how = "컴퓨터와 가위바위보하기\n"+"가위,바위,보 셋 중 하나를 입력하세요.\n"
					+"가위vs보 => 가위 승리\n"+"바위vs가위 => 바위 승리\n"+"보vs바위 => 보 승리";
	}
	
	//게임 이름 불러오기
	public String getName() {
		return name;
	}
	//게임 방법 불러오기
	public String getHow() {
		return how;
	}
	
	//가위바위보 실행
	public void playRock() {
		Scanner sc1 = new Scanner(System.in);
		int rsp;
		String comResult;
		String playerResult;
		while(true) {	//비기지 않는 결과가 나올 때까지 반복
			
			while(true) {	//가위,바위,보 셋 중에 하나를 입력할 때까지 반복
				System.out.println("어떤 것을 내시겠습니까?");
				playerResult = sc1.nextLine();
				if(!playerResult.equals("가위")&&!playerResult.equals("바위")
						&&!playerResult.equals("보")){
					System.out.println("다시 입력해주세요.");
				}else {
					break;
				}//if-else문(while문 종료 조건)
			}//내부 while문
			
			rsp = (int)(Math.random()*3);	//컴퓨터가 무엇을 낼지 랜덤지정
			comResult = rsp==0?"가위":(rsp==1?"바위":"보");
			System.out.println("플레이어: "+playerResult);
			System.out.println("컴퓨터: "+comResult);
			if(playerResult.equals(comResult)) {
				System.out.println("비겼습니다! 다시 내주세요.");
			} else {
				break;
			}//if-else문(while문 종료 조건)
		}//while문
		
		//결과처리
		if((playerResult.equals("가위")&&comResult.equals("보"))
				||(playerResult.equals("바위")&&comResult.equals("가위"))
				||(playerResult.equals("보")&&comResult.equals("바위"))) {
			System.out.println("승리!");
		}else {
			System.out.println("패배!");
		}//if-else문
	}//playRock 메서드
	
}//class RockScissorsPaper
