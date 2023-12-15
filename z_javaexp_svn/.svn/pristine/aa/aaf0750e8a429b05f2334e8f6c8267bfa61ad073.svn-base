package javaexp.z02_homework.a11_mhi;

import java.util.Random;
import java.util.Scanner;

public class Z01_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 컴퓨터와 하는 가위/바위/보 게임
		 0. 배열로 가위/바위/보 선언
		 1. 나는 Scanner에 의해 번호로 선택 (1. 가위, 2. 바위, 3. 보)
		 2. 컴퓨터는 랜덤
		 3. 두개의 내용을 비교하여 승/무/패 결정
		 4. 위 내용을 3회 반복 처리 하여 승/무/패 누적 
		 */
		String[] games = {"가위","바위","보"};
		int win,eq,def; win=eq=def=0;
		
		System.out.println("#컴퓨터와 하는 가위, 바위, 보 게임#");
		for(int cnt=1;cnt<=3;cnt++) {
	    System.out.println(cnt+"번째 게임");
		System.out.print("번호를 입력하세요(1.가위, 2.바위, 3.보)");
		Scanner sc = new Scanner(System.in);
		int myIdx = sc.nextInt()-1;
		String myChoice= games[myIdx];
		System.out.println("당신의 선택:"+myChoice);
		
		
		Random r = new Random();
		int comIdx = r.nextInt(3); // 0~2 임의로 나온다
		String comResult = games[comIdx]; // 임의 index로 컴퓨터 선택
		
		System.out.println("임의의 가위/바위/보(컴퓨터):"+comResult);
		if(myIdx == comIdx) {
			System.out.println("무승부");
			eq++;
		}else if((myIdx+2)%3  == comIdx){
			System.out.println("나의 승");
			win++;
		}else{
			System.out.println("컴퓨터 승");
			def--;
		}
		}
		System.out.println("최종 결과");
		System.out.println(win+"승, "+eq+"무, "+def+"패");
		
		
		//            {"가위", "바위", "보"}
		// myIdx          0     1     2
		// comIdx         0     1     2
		// 1. 비길때, myIdx = comIdx
		// 2. 나의승  myIdx   0  1  2 
		//           comIdx  2  0  1 
		// 규칙 찾고 ==> 비교조건 
		// (myIdx+2)%3  == comIdx
		// 3. 컴퓨터 승 myIdx  0   1  2
//		              comIdx 1   2  0
//		                   myIdx+1 == comIdx
	}

}
