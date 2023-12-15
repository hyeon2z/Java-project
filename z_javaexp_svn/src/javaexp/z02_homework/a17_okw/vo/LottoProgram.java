package javaexp.z02_homework.a17_okw.vo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram {
	// 게임 실행 메서드
	public void runGame() {
		Scanner sc = new Scanner(System.in);
		// 수동입력, 자동입력 선택 메뉴.
		System.out.print("로또 방식을 선택하세요(1. 수동입력 // 2. 자동입력) >>");
		int selectLotto = Integer.parseInt(sc.nextLine());
		int[] userLotto = null;
		switch(selectLotto) {
			case 1:
				// 사용자로부터 로또 번호 입력 받기.
				userLotto = new int[6];
				System.out.println("로또 번호를 입력하세요.(1~45까지 중복없이) : ");
				for (int i = 0; i < userLotto.length; i++) {
					System.out.print("번호 " +(i + 1) + ": ");
					userLotto[i] = Integer.parseInt(sc.nextLine());
				}
				break;
				
			case 2:
				// 랜덤 로또 번호 생성
				userLotto = generateRandomLotto();
				// 생성된 로또번호 출력
				System.out.println("자동입력된 로또 번호 : " + Arrays.toString(userLotto));
				break;
				
			default :
				System.out.println("잘못된 입력입니다.");
				break;
				
		}
		//컴퓨터가 생성한 로또 번호
		int[] computerLotto = generateRandomLotto();
		System.out.println("이번회차 로또 번호는... : "+Arrays.toString(computerLotto));
		
		// 당첨 여부 확인
		int matchingCount = countMatching(userLotto, computerLotto);
		
		if(matchingCount == 6) {
			System.out.println("축하합니다! 1등 당첨되셨습니다!!");
		}else if(matchingCount == 5) {
			System.out.println("축하합니다. 2등 당첨되셨습니다.");
		}else if(matchingCount == 4) {
			System.out.println("축하합니다. 3등 당첨되셨습니다.");
		}else if(matchingCount == 3) {
			System.out.println("축하합니다. 4등 당첨되셨습니다.");
		}else {
			System.out.println("아쉽게도 이번에는 낙첨이군요... 다음 회차를 기대해주세요!");
		}
		
	}
	
	// 로또 추첨
	public int[] generateRandomLotto() {
		int[] lotto = new int[6];
		Random random = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 오름차순으로 정렬
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i + 1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int tmp = lotto[i];  
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		return lotto;
	}
	
	// 배열에서 일치하는 번호 개수를 세는 메서드
	public int countMatching(int[] arr1, int[] arr2) {
		int count = 0;
		for(int i : arr1) {
			for(int j : arr2) {
				if (i == j) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
}
