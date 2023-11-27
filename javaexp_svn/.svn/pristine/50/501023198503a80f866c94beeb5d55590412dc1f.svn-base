package javaexp.z02_homework.a19_cjw.programming.games;

import java.util.Scanner;

public class Baseball {
	
	private String name;
	private String how;
	
	//숫자야구에 대한 정보
	public Baseball(String name, String how) {
		this.name = "~~숫자야구~~";
		this.how = "세자리 임의의 숫자(각 자리는 0~9)가 배정된다.(각 자리의 숫자는 다르다.)\n"
				+"플레이어는 세자리 숫자를 입력하여 이를 맞춰야 한다.\n"
				+"숫자는 맞지만 위치가 틀리면 해당 숫자 하나당 볼 하나,\n"
				+"숫자와 위치 전부 맞으면 해당 숫자 하나당 스트라이크 하나,\n"
				+"숫자와 위치가 맞는 숫자가 하나도 없으면 아웃이다.\n"
				+ "야구의 9이닝처럼 9번의 기회가 주어진다.";
	}
	
	//게임 이름 불러오기
	public String getName() {
		return name;
	}
	//게임 방법 불러오기
	public String getHow() {
		return how;
	}
	
	//숫자야구 실행
	public void playBaseball() {
		Scanner sc1 = new Scanner(System.in);
		//컴퓨터가 제시할 세자리 수를 랜덤으로 지정하기(배열로 저장)
		int[] comArray = new int[3];
		comArray[0] = (int)(Math.random()*10);
		
		while(true) {	//앞에 지정된 숫자와 중복되지 않도록 하기
			comArray[1] = (int)(Math.random()*10);
			if(comArray[1]!=comArray[0]) {
				break;
			}//if문(while문 종료 조건)
		}//while문
		
		while(true) {	//앞에 지정된 숫자와 중복되지 않도록 하기
			comArray[2] = (int)(Math.random()*10);
			if(comArray[2]!=comArray[0] && comArray[2]!=comArray[0]) {
				break;
			}//if문(while문 종료 조건)
		}//while문
		
		int[] ipArray = new int[3];
		
		for(int cnt=1;cnt<=9;cnt++) {	//9번이내로 정답 입력하기
			System.out.println(cnt+"회");
			int strike=0;
			int ball=0;
			
			while(true) {	//플레이어가 숫자입력(중복되는 숫자가 있으면 다시)
				System.out.print("세자리 숫자 입력(각 자리를 다르게): ");
				int input = (int)Integer.parseInt(sc1.nextLine());
				ipArray[2] = input%10; 	input/=10;	//입력된 숫자를 배열에
				ipArray[1] = input%10;	input/=10;
				ipArray[0] = input%10;
				if(ipArray[0]!=ipArray[1] && ipArray[1]!=ipArray[2]
						&&ipArray[2]!=ipArray[0]) {
					break;
				}else {
					System.out.println("다시 입력하세요.");
				}//if-else문(while문 종료 조건)
			}//while문
			
			for(int i=0;i<=2;i++) {	//strike 확인
				if(comArray[i]==ipArray[i]) {
					strike++;
				}//if문
			}//for문
			
			for(int j=0;j<=2;j++) {	//ball 확인
				for(int k=0;k<=2;k++) {
					if(comArray[j]==ipArray[k]
							&& j!=k) {
						ball++;
					}//if문
				}//내부 for문
			}//for문
			
			if(strike==0 && ball==0) {
				System.out.println("아웃");
			}else {
				System.out.print(strike+"스트라이크 ");
				System.out.println(ball+"볼");
			}//if-else문
			
			if(strike==3) {	//3스트라이크 시 종료
				System.out.println("승리!");
				System.out.println(cnt+"회만에 맞추셨습니다.");
				break;
			}//if-else문
			
			if(cnt==9) {
				System.out.println("정답을 맞추는데 실패하셨습니다!");
			}//if문
			
		}//for문(9번 반복)
		System.out.println("정답: "+comArray[0]+comArray[1]+comArray[2]);
	}//playBaseball 메서드
	
}//class Baseball
