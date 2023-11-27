package javaexp.z02_homework.a14_cms.miniproject2;

import java.util.Scanner;

import javaexp.z02_homework.a14_cms.miniproject2.Login;

public class PlayGame {
	private boolean isAnswer = false;

	public PlayGame() {
	} // 매개변수 없는 생성자

	public PlayGame(Login login) {

	}

	Scanner sc = new Scanner(System.in);
	private String logoutKey = null;
	private int[] cp = new int[3]; // 컴퓨터가 만든 숫자를 넣을 배열

	private int[] makeRandomNum() { // 랜덤 수 배열 생성
		int[] cp = new int[3];
		for (int i = 0; i < cp.length; i++) {
			int r = (int) (Math.random() * 9 + 1);
			cp[i] = r;
			for (int j = 0; j < i; j++) {
				if (cp[j] == cp[i])
					i--;

			}
		}
		return cp;
	}

	private int[] intToArray(int input) { // 사용자가 입력한 세자리 정수를 배열로 변환하는 함수
		int[] array = new int[3]; // 반환값
		if (input > 999 || input < 100 && input != -1) // -1이면 종료
			System.out.println("3자리의 정수를 입력하십시오.");
		else {
			array[0] = input / 100;
			array[1] = input / 10 % 10;
			array[2] = input % 10 % 10;

		}
		return array;

	}

	private void compare(int[] answer, int[] input) { // 사용자입력과 정답을 비교하는 함수
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < 3; i++) {
			if (answer[i] == input[i]) {
				strike++;
			} // 숫자도 같고, 위치도 같을 때 strike + 1
			else {
				for (int j = 0; j < 3; j++) { // 위치만 같으면 ball +1
					if (i != j && answer[i] == input[j])
						ball++;
				}
			}

		}
		System.out.println("strike :" + strike + " ,ball : " + ball);

		if (strike >= 3) {
			System.out.println("정답입니다!!");
			isAnswer = true;

		}
	}

	public void play(User user) {
		System.out.println(user.getNickname() + "님 환영합니다 !!");
		System.out.println("★★★★ 컴퓨터와 함께 하는 숫자 야구 게임입니다!!★★★★");
		System.out.println("기회는 10번 주어지며 1~9까지의 중복되지 않는 3개의 숫자를 맞춰주세요!");
		System.out.println("숫자와 위치가 모두 맞을 시 strike, 숫자만 맞을 시 ball이 출력됩니다.");

		// 숫자 야구 시작
		while (true) { // -1을 입력할 때까지 게임 진행.
			System.out.println("게임 종료를 원할 시 -1 입력 (로그아웃)");
			int[] answer = new int[3];
			int input = 0;
			int score = 0; // 기본점수 100점
			int[] inputArray = new int[3];
			for (int i = 1; i <= 10; i++) { // 10번동안 맞춘다.
				answer = makeRandomNum(); // 정답
				
				score = 100; //초기점수
				System.out.print("세자리 정수를 입력하십시오.");
				input = sc.nextInt(); // 사용자 입력을 받는다. (-1이 아닐시)
				inputArray = intToArray(input); // 사용자 입력을 배열로 바꾼다.
				score -= 10; // 시도를 한번 할 때마다 10점 감소
				compare(answer, inputArray);
				if(isAnswer) {

				System.out.println(user.getNickname() + "님 " + score + 10 + "점 획득하였습니다.");
				user.setScore(score + 10); // user 점수 정답을 맞췄기 때문에 감소된 점수를 다시 올린다.
				break;
				}
				

			}
			if(!isAnswer) System.out.println("기회를 모두 사용하셨습니다.\n획득점수 0점");
			if (input == -1) {
				System.out.println("게임을 종료합니다.");
				user.setisLogin(false);
				break;
			}

		}
	}

}
