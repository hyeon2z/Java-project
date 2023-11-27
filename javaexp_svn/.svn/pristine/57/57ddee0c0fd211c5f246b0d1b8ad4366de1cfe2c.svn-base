package javaexp.z02_homework.a14_cms.miniProject;

import java.util.ArrayList;
import java.util.List;

//임의의 3개의 숫자를 생성하는 클래스
public class RandomNumber {
	private int [] randomNum = new int[3];
	public RandomNumber() {}; //생성자
	public int [] makeRandomNum() {
		for(int i=0; i<randomNum.length;i++) {
			randomNum[i] = (int)(Math.random()*9+1);
			//중복제거
			for(int j =0; j<i; j++) {
				if(randomNum[i]==randomNum[j]) {
					i--;
					break;
				}
			}
		}
		return randomNum;
	}
	public void showRandomArray() {
		for(int i=0;i<3;i++) {
			System.out.print(randomNum[i]); 
		}
	}
	
	

}
