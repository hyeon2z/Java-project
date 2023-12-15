package javaexp.z02_homework.a09_khm;

public class Minprogramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// <컴퓨터와 함께하는 주사위 게임>
		
		System.out.println("# 컴퓨터와 하는 주사위 게임 #");
		int team01 = (int)(Math.random()*6+1);
		int team02 = (int)(Math.random()*6+1);
		System.out.println("내가 굴린 주사위 수:"+team01);
		System.out.println("컴퓨터가 굴린 주사위 수:"+team02);
		if(team01>team02) {
			System.out.println("결과 : 승리");
		}if(team01<team02) {
			System.out.println("결과 : 패배");
		}if(team01==team02) {
			System.out.println("결과 : 비김");
		}
		
		// <컴퓨터와 함께하는 가위바위보>
		
		int game01 = (int)(Math.random()*3); 
		int game02 = (int)(Math.random()*3); 
		
		System.out.println("# 컴퓨터와 하는 가위/바위/보 게임 #");
		System.out.println("나   :"+(game01==0?"가위":(game01==1?"바위":"보")));
		System.out.println("컴퓨터:"+(game02==0?"가위":(game02==1?"바위":"보")));
		if(game01>game02) {
			System.out.println("결과 : 승리");
		}if(game01<game02) {
			System.out.println("결과 : 패배");
		}if(game01==game02) {
			System.out.println("결과 : 비김");
		}
				
		
	}

}
