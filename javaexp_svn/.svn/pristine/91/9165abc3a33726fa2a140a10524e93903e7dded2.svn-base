package javaexp.z02_homework.a14_cms.miniProject;
//사용자 입력을 받고 배열에 저장하는 class


import java.util.Scanner;

public class UserInput {
	Scanner sc = new Scanner(System.in);
	private int [] playerArray = new int [3];
	public void inputPlayerNuber() {
		System.out.println("3자리 숫자를 입력하십시오: ");
		int r = sc.nextInt();
		if(r>999) {
			System.out.println("3자리 숫자로 다시 입력하십시오.");
		}
		playerArray[0] = r/100;
		playerArray[1] = r%100/10;
		playerArray[2] = r%100%10;
		
	}
	public int [] getPlayerArray() {
		return playerArray;
	}
	public void showPlayerArray() {
		for(int i=0;i<playerArray.length;i++) {
			System.out.print(playerArray[i]);
			
		}
		System.out.println();
	}
}


