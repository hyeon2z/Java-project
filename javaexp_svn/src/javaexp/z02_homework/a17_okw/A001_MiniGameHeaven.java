package javaexp.z02_homework.a17_okw;

import java.util.Scanner;

public class A001_MiniGameHeaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {	// Main Page
			System.out.println("# 미니 게임 천국 #");
			System.out.println("1. 주사위 게임, 2. 윷놀이, 3. 야구게임, 0.미니게임천국 종료");
			System.out.print("플레이 하실 게임 번호를 입력 해주세요.. >>");
			int gameChoice = Integer.parseInt(sc.nextLine());
			
			if(gameChoice==0){	//게임 종료시
				System.out.println("미니게임천국을 종료합니다.");
				break;
				
			}else if(gameChoice==1) {
				System.out.println("선택한 게임은 주사위게임 입니다.");
				System.out.println("---게임 설명--- ");
				System.out.println("나와 컴퓨터가 각각 주사위를 두 번 굴립니다.\n그 결과, 두 번의 주사위 눈의 합이 큰 쪽이 승리합니다."
						+ "\n게임은 내가 이길때 까지 진행됩니다.");
				System.out.println("...주사위 게임을 시작합니다!");
				
				int cnt = 1;// 사용 변수
				
				
				while(true) {
					System.out.println("## 먼저 컴퓨터가 주사위를 굴립니다..");
					int comDice1 = (int)(Math.random()*6+1);
					System.out.println("컴퓨터의 첫번째 주사위 눈 : "+comDice1);
					int comDice2 = (int)(Math.random()*6+1);
					System.out.println("컴퓨터의 두번째 주사위 눈 : "+comDice2);
					int comSum = comDice1 + comDice2;
					System.out.println("컴퓨터 주사위 눈의 합 : "+comSum);
					
					System.out.println("## 내 차례입니다. Enter키를 누르면 주사위를 굴립니다..");
					System.out.print("첫번째 굴리기!");
					String enter = sc.nextLine();
					int myDice1 = (int)(Math.random()*6+1);
					System.out.println("나의 첫번째 주사위 눈 : "+myDice1);
					System.out.print("두번째 굴리기!");
					enter = sc.nextLine();
					int myDice2 = (int)(Math.random()*6+1);
					System.out.println("나의 두번째 주사위 눈 : "+myDice2);
					int mySum = myDice1 + myDice2;
					System.out.println("나의 주사위 눈의 합 : "+mySum);
					System.out.println("컴퓨터:"+comSum+"나:"+mySum);
					if(mySum > comSum) {
						System.out.println(cnt+"번 만에 이겼습니다!");
					}else if(mySum < comSum){
						System.out.println("패배 ㅠㅠ");
						cnt++;
					}else {
						System.out.println("무승부 입니다.");
						cnt++;
					}
					System.out.print("한번 더 해보시겠습니까? (y/n 입력)");
					String restart = sc.nextLine();
					if(restart.equals("n")) {
						System.out.println("\n게임 종료\n");
						cnt = 0;
						break;
					}
					else if(restart.equals("y")){
						System.out.println("\n게임을 재시작합니다.\n");
					}
				}
				
				
			}else if(gameChoice==2) {
				int myP = 0;
				int comP = 0;
				System.out.println("선택한 게임은 윷놀이 입니다.");
				System.out.println("---게임 설명--- ");
				System.out.println("Enter키를 눌러 윷을 던집니다.\n□:뒷면, ■:앞면,▤:빽도\nEx)□ ■ ■ ■ = 도");
				System.out.println("윷과 모는 한번 더 던집니다. 컴퓨터보다 멀리 가면 승리합니다.");
				boolean isContinue = false;
				
				while(true) {
					System.out.print("# 내 차례..(Enter키를 눌러 윷 던지기)");
					while(true) {
						String myPlay = sc.nextLine();
						int myYut = (int)(Math.random()*16+1);
						
						switch(myYut) {
							case 1: System.out.print("▤ ■ ■ ■"); System.out.println("빽도"); myP--; break;
							case 2: case 3: case 4:
								System.out.print("□ ■ ■ ■"); System.out.println("도"); myP++; break;
							case 5: case 6: case 7: case 8: case 9: case 10:
								System.out.print("□ □ ■ ■"); System.out.println("개"); myP+=2; break;
							case 11: case 12: case 13: case 14: 
								System.out.print("□ □ □ ■"); System.out.println("걸"); myP+=3; break;
							case 15:
								System.out.print("□ □ □ □"); System.out.println("윷"); myP+=4; 
								isContinue = true;
								break;
							case 16:
								System.out.print("■ ■ ■ ■"); System.out.println("모"); myP+=5; 
								isContinue = true;
								break;
						}
						if(!isContinue) {
							break;
						}else {
							System.out.print("한번 더 던집니다.");
							isContinue = false;
						}
					}
					while(true) {
						System.out.print("# 컴퓨터 차례..(Enter키를 눌러 윷 던지기)");
						String comPlay = sc.nextLine();
						int comYut = (int)(Math.random()*16+1);
						switch(comYut) {
							case 1: System.out.println("▤ ■ ■ ■"); System.out.println("빽도"); comP--; break;
							case 2: case 3: case 4:
								System.out.print("□ ■ ■ ■"); System.out.println("도"); comP++; break;
							case 5: case 6: case 7: case 8: case 9: case 10:
								System.out.print("□ □ ■ ■"); System.out.println("개"); comP+=2; break;
							case 11: case 12: case 13: case 14: 
								System.out.print("□ □ □ ■"); System.out.println("걸"); comP+=3; break;
							case 15:
								System.out.print("□ □ □ □"); System.out.println("윷"); comP+=4; 
								isContinue = true;
								break;
							case 16:
								System.out.print("■ ■ ■ ■"); System.out.println("모"); comP+=5; 
								isContinue = true;
								break;
						}
						if(!isContinue) {
							break;
						}else {
							System.out.println("컴퓨터가 한번 더 던집니다.");
							isContinue = false;
						}
					}
					System.out.println("나의 총합:"+myP+"\n컴퓨터의 총합:"+comP);
					if(myP>comP){
						System.out.println("결과 : 나의 승리! >_o");
					}else if(myP<comP) {
						System.out.println("결과 : 컴퓨터의 승리 ㅜㅜ");
					}else {
						System.out.println("결과 : 무승부 -_-");
					}
					System.out.print("한번 더 해보시겠습니까? (y/n 입력)");
					String restart = sc.nextLine();
					if(restart.equals("n")) {
						System.out.println("\n게임 종료\n");
						comP = 0;
						myP = 0;
						break;
					}
					else if(restart.equals("y")){
						comP = 0;
						myP = 0;
						System.out.println("\n게임을 재시작합니다.\n");
					}
				}
				
				
			
			}else if(gameChoice==3){
				System.out.println("선택한 게임은 야구게임 입니다.");
				System.out.println("---게임 설명--- ");
				System.out.println("컴퓨터가 중복되지 않는 임의의 세자리 수를 생성합니다.\n사용자는 각 자리 숫자를 입력하여 임의의 숫자를 맞춥니다.");
				System.out.println("숫자와 자리수 까지 맞추면 Strike, 숫자만 맞고 자리수가 틀리면 Ball 입니다.");
				
				// 사용 변수
				int com1, com2, com3;
				int my1, my2, my3;
				int gamecount=0;
				int strike = 0;
				int ball = 0;
				
				while(true) {				// while전체 게임 반복
					for(;;) {	//3자리 생성
						com1 = (int)(Math.random()*10);
						com2 = (int)(Math.random()*10);
						com3 = (int)(Math.random()*10);
						if(!(com1==com2||com2==com3||com1==com3)) {
							break;
						}
					} // 중복되지 않는 세자리 완성 
					System.out.println("컴퓨터 숫자 : "+com1+com2+com3);   // <점검용> ctrl+/로 끄고 시작하기.
					for(;;) {	// 내가 숫자 맞출 차례
						System.out.print("첫번째 자리 입력 :");
						my1 = Integer.parseInt(sc.nextLine());
						System.out.print("두번째 자리 입력 :");
						my2 = Integer.parseInt(sc.nextLine());
						System.out.print("세번째 자리 입력 :");
						my3 = Integer.parseInt(sc.nextLine());
						System.out.println("내가 입력한 숫자는 "+my1+my2+my3);
						gamecount++;
						
						// 스트라이크 여부
						if(com1==my1) strike++;
						if(com2==my2) strike++;
						if(com3==my3) strike++;
					
						//볼 여부
						if(com1==my2||com1==my3) ball++;
						if(com2==my1||com2==my3) ball++;
						if(com3==my1||com3==my2) ball++;
						
						if(strike==3) {
							System.out.println("3 스트라이크!");
							System.out.println("컴퓨터가 생성한 숫자는 "+com1+com2+com3);
							System.out.println(gamecount+"번 만에 맞췄습니다.");
							break;		//내가 숫자맞추는 for반복 탈출
						}else {
							if(strike==0 && ball==0) {
								System.out.println("3아웃!");
							}else {
								System.out.printf("%d스트라이크 %d볼\n",strike,ball);
							}
						} 	//카운트 초기화
						strike = 0;
						ball = 0;
					}	//내가 숫자맞추는 for 종료
					System.out.print("한번 더 해보시겠습니까? (y/n 입력)");
					String restart = sc.nextLine();
					if(restart.equals("n")) {
						System.out.println("\n게임 종료\n");
						break;
					}
					else if(restart.equals("y")){
						strike = 0;
						ball = 0;
						gamecount = 0;
						System.out.println("\n게임을 재시작합니다.\n");
					}
				}	//while 게임 전체 종료
				
				
				
				
			}else {
				System.out.println("잘못 누르셨습니다..");
			}
		}
		
		
		
		
		
	}

}
