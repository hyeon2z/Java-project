package javaexp.mini_program;

import java.util.Scanner;

import javaexp.mini_program.vo.Baseball;

public class a01_program_baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("### 숫자야구 ###\n");
		
		System.out.print("플레이어의 이름은? ");
		Baseball bs = new Baseball(sc.nextLine());
		
		System.out.print("\n" + "안녕하세요 " + bs.getPlayer()+ ", 게임설명을 들으시겠습니까?(Y/N) "); // 도입부
		String tutor = sc.nextLine();
		if(tutor.equals("Y")) {
			System.out.println("\n컴퓨터가 임의로 0~9까지의 서로 다른 수 3개를 고르면,\n"
					+ "플레이어가 3개의 수를 입력하여 컴퓨터의 수를 맞추는 게임입니다.\n"
					+ "기회는 총 9번이며 숫자는 맞지만 위치가 틀렸을 경우엔 \"볼\"\n"
					+ "숫자와 위치가 전부 맞을경우 \"스트라이크\"\n"
					+ "숫자와 위치가 전부 틀리면 \"아웃\" 입니다.\n\n"
					+ "이제 게임을 시작하겠습니다.");
		}else if(tutor.equals("N")){
			System.out.println("\n게임을 시작합니다.");
		}
		
		int[] pnum = new int[3]; // 플레이어 숫자 저장배열
		
		while(true) { // 전체게임
			
			int[] num = new int[3]; // 컴퓨터 숫자 저장할 배열
			
			num[0] = (int)(Math.random()*9+1);
			num[1] = (int)(Math.random()*9+1);
			while(num[0] == num[1]) {
				num[1] = (int)(Math.random()*9+1);
			}
			num[2] = (int)(Math.random()*9+1);
			while(num[1] == num[2] || num[0] == num[2]) {
				num[2] = (int)(Math.random()*9+1);
			} // 컴퓨터 숫자가 겹치지 않게 만드는 블럭
			
			while(true) { // 한 게임	
				for(int i = 0; i <= 9; i++) { // 총 라운드
					int result01 = 0;
					int result02 = 0;
					int result03 = 0;
					
					if(i < 9) {
						System.out.println("\n=======" + (i+1) + "라운드=======");
					}else if(i == 9) {
						System.out.println("\n   패배...\n");
						System.out.print("정답 공개 : ");
						System.out.println("[" + num[0] + "]" + "[" + num[1] + "]" + "[" + num[2] + "]\n");
						break;
					}
					
					for(int cnt = 0; cnt < 3; cnt++) { // 한 라운드
						if(cnt == 0) {
							System.out.print("첫번째 숫자를 입력하세요 : ");
							pnum[0] = Integer.parseInt(sc.nextLine());
							if(pnum[0] == num[0]) {
								result01 += 1;
							}else if(pnum[0] == num[1]) {
								result02 += 1;
							}else if(pnum[0] == num[2]) {
								result02 += 1;
							}else {
								result03 += 1;
							}
						} // 1번째 숫자 결과
						
						if(cnt == 1) {
							System.out.print("두번째 숫자를 입력하세요 : ");
							pnum[cnt] = Integer.parseInt(sc.nextLine());
							if(pnum[cnt] == num[cnt]) {
								result01 += 1;
							}else if(pnum[cnt] == num[0]) {
								result02 += 1;
							}else if(pnum[cnt] == num[2]) {
								result02 += 1;
							}else {
								result03 += 1;
							}
						} // 2번째 숫자 결과
						
						
						if(cnt == 2) {
							System.out.print("세번째 숫자를 입력하세요 : ");
							pnum[cnt] = Integer.parseInt(sc.nextLine());
							if(pnum[cnt] == num[cnt]) {
								result01 += 1;
							}else if(pnum[cnt] == num[1]) {
								result02 += 1;
							}else if(pnum[cnt] == num[0]) {
								result02 += 1;
							}else {
								result03 += 1;
							}
						} // 3번째 숫자 결과
						
				
					} // 한 라운드 끝 블럭
					System.out.println("\n플레이어가 입력한 수 : " + "[" + pnum[0] + "]" + "[" + pnum[1] + "]" + "[" + pnum[2] + "]");
					
					if(result03 == 3) {
						System.out.println("\n   아웃");
					}else {
						System.out.println("\n   " + result01 + "스트라이크   " + result02 + "볼");
					}
					
					if(result01 == 3) {
						System.out.println("\n   !!!승리!!!\n");
						break;
					} // 승리 블럭
					
				
				} // 총 라운드 블럭
				
			break;	
			} // 한 게임
			
			System.out.print("게임을 더 하시겠습니까?(Y/N) : ");
			String answer = sc.nextLine();
			if(answer.equals("N")) {
				System.out.println("\n게임종료!! 수고하셨습니다. " + bs.getPlayer());
				break;
			}else if(answer.equals("Y")){
				
			} // 게임 진행여부
			
			
		} // 전체 게임
		
		
		
		
		
		
		
	}

}
