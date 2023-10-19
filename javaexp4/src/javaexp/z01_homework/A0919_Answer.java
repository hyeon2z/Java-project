package javaexp.z01_homework;

import java.util.Scanner;

public class A0919_Answer {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// 내용으로 변경해서 문제 진행..
		Scanner sc = new Scanner(System.in);
//		// 1. 2중 for문 활용
//		// 2x2 ♥
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print("♥ ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//
//		// 3x2 ★
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print("★ ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//
//		// 사용자 입력 행/열/기호
//
//		System.out.println("행, 열, 기호를 입력하세요:");
//		System.out.println("행을 입력 : ");
//		int row = Integer.parseInt(sc.nextLine());
//		System.out.println("열을 입력 : ");
//		int col = Integer.parseInt(sc.nextLine());
//		System.out.println("기호를 입력 : ");
//		String symbol = sc.nextLine();
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(symbol + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//
////		 2. while문: 100~90 출력
//		int number = 100;
//		int sum = 0;
//		while (number >= 90) {
//			System.out.println(number);
//			sum += number;
//			number--;
//		}
//		System.out.println("합계: " + sum);
//		System.out.println();
//
//		// 3. 학생 점수 등록
//		int total = 0;
//		int count = 0;
//		while (true) {
//			System.out.println("점수를 입력하세요 (-1을 입력하면 종료):");
//			int score = sc.nextInt();
//			if (score == -1) {
//				break;
//			}
//			total += score;
//			count++;
//		}
//		double average = (double) total / count;
//		System.out.println("총점: " + total + ", 평균: " + average);
//		System.out.println();
//
//		// 4. 배열로 점수 3개 초기화
//		int[] scores = new int[3];
//		int totalScore = 0;
//		for (int i = 0; i < 3; i++) {
//			System.out.println((i + 1) + "번째 점수를 입력하세요:");
//			scores[i] = sc.nextInt();
//			totalScore += scores[i];
//		}
//		double averageScore = (double) totalScore / scores.length;
//		System.out.println("총계: " + totalScore + ", 평균: " + averageScore);
//		System.out.println();
//
//		 // 5. 학생명, 국어, 영어 할당
//		 String[] studentNames = {"홍길동", "이순신", "강감찬"};
//		 int[] koreanScores = {85, 90, 78};
//		 int[] englishScores = {88, 89, 82};
//		 
//		 for (int i = 0; i < 3; i++) {
//		 System.out.printf("%s - 국어: %d, 영어: %d%n", studentNames[i], koreanScores[i],
//		 englishScores[i]);
//		 }
//		 System.out.println();
//		
//		 // 6. 구구단 출력기
//		 System.out.print("시작 단과 끝 단을 입력하세요: ");
//		 int start = sc.nextInt();
//		 int end = sc.nextInt();
//		 for (int i = start; i <= end; i++) {
//		 for (int j = 1; j <= 9; j++) {
//		 System.out.printf("%d * %d = %d%n", i, j, i * j);
//		 }
//		 System.out.println();
//		 }
//		
//		 for(int cnt=1;cnt<150;cnt++) {
//			 System.out.println(cnt+":"+(char)cnt);
//		 }
//		 // 7. 자동 비밀번호 생성기 숫자 48~57 65~90, 97~122
//		 // 10 26 26
//		 // 52 + 10 = 62
//		 // 시작수 48 58+7, 91+6
//	
//		 System.out.print("비밀번호 길이를 입력하세요: ");
//		 int len = sc.nextInt();
//		 byte []passByes = new byte[len];
//		 0 1 0 62 48 110 83
//		 for (int i = 0; i < len; i++) {
//			 byte ran = (byte)(Math.random()*62+48); // 랜덤변수를 byte로 숫자~
//			 if(ran>=58) ran+=7;
//			 if(ran>=91) ran+=6;
//			 passByes[i] = ran;
//		 }
//		 System.out.println("생성된 비밀번호: " + new String(passByes));
//		 System.out.println();
//		
//		 // 8. 구간별 합계
//		System.out.print("두 개의 정수 A와 B를 입력하세요: ");
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		if (A > B) {
//			int temp = A;
//			A = B;
//			B = temp;
//		}
//		int sum = 0;
//		for (int i = A; i <= B; i++) {
//			sum += i;
//		}
//		System.out.printf("%d부터 %d까지의 합: %d%n", A, B, sum);
//		System.out.println();
//		 
//		 // 9. 마름모 모양 숫자 출력기
		// " " : 라인별 갯수 n : 출력할 내용
//		System.out.print("숫자 N을 입력하세요: ");
//		int N = sc.nextInt();
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= N - i; j++)
//				System.out.print(" ");
//			for (int j = 1; j <= 2 * i - 1; j++)
//				System.out.print(j);
//			System.out.println();
//		}
//		for (int i = N - 1; i >= 1; i--) {
//			for (int j = 1; j <= N - i; j++)
//				System.out.print(" ");
//			for (int j = 1; j <= 2 * i - 1; j++)
//				System.out.print(j);
//			System.out.println();
//		}
//		System.out.println();
//		
//		 // 10. 영문자 변환기
//		System.out.print("영문자 하나를 입력하세요: ");
//		// 65~90 (대문자), 97~122(소문자)
//		// 입력된 내용에서 char값을 가져오기 위한 처리
//		char ch = sc.next().charAt(0);
//		int codVal = ch;
//		System.out.println(codVal);
//		if (codVal >= 65 && codVal <= 90) {
//			codVal += 32;
//		} else if (codVal >= 97 && codVal <= 122) {
//			codVal -= 32;
//		}
//		
//		System.out.println((char) codVal);
//		
//		 // 11. 숫자 사이의 연산자 넣기
//		System.out.print("두 개의 숫자를 입력하세요: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		char op = '+';
//		double maxResult = num1 + num2;
//		if (num1 - num2 > maxResult) {
//			maxResult = num1 - num2;
//			op = '-';
//		}
//		if ((double) num1 * num2 > maxResult) {
//			maxResult = (double) num1 * num2;
//			op = '*';
//		}
//		if (num2 != 0 && (double) num1 / num2 > maxResult) {
//			maxResult = (double) num1 / num2;
//			op = '/';
//		}
//		System.out.printf("가장 큰 연산 결과: %f (%d %c %d)%n", maxResult, num1, op, num2);
//		System.out.println();
//		
//		 // 12. 카드 게임 시뮬레이션
//		int player1Wins = 0, player2Wins = 0;
//		for (int i = 0; i < 5; i++) {
//			int card1 = (int) (Math.random() * 10 + 1);
//			int card2 = (int) (Math.random() * 10 + 1);
//			System.out.printf("라운드 %d: 플레이어1(%d) vs 플레이어2(%d)%n", i + 1, card1, card2);
//			if (card1 > card2) {
//				player1Wins++;
//				System.out.println("플레이어1 승리!");
//			} else if (card2 > card1) {
//				player2Wins++;
//				System.out.println("플레이어2 승리!");
//			} else {
//				System.out.println("무승부!");
//			}
//		}
//		if (player1Wins > player2Wins)
//			System.out.println("최종 승자: 플레이어1");
//		else if (player2Wins > player1Wins)
//			System.out.println("최종 승자: 플레이어2");
//		else
//			System.out.println("최종 결과: 무승부");
//
////		 13. 동전 교환기
//		System.out.print("교환할 금액을 입력하세요: ");
//		int amount = sc.nextInt();
//
//		int[] coins = { 500, 100, 50, 10 };
//		int[] counts = new int[coins.length];
//		// 각각의 동전의 갯수를 할당 {3,3,1,1}
//
//		for (int i = 0; i < coins.length; i++) {
//			counts[i] = amount / coins[i];
//			amount %= coins[i];
//		}
//
//		for (int i = 0; i < coins.length; i++) {
//			if (counts[i] > 0) {
//				System.out.printf("%d원짜리 %d개%n", coins[i], counts[i]);
//			}
//		}
//		 System.out.println();
//
////		 14. 할인율 계산기
//		 System.out.print("상품의 원가를 입력하세요: ");
//		 double originalPrice = sc.nextDouble();
//		 System.out.print("상품의 판매가를 입력하세요: ");
//		 double salePrice = sc.nextDouble();
//		
//		 double discountRate = (originalPrice - salePrice) / originalPrice * 100;
//		
//		 System.out.printf("할인율: %.2f%%", discountRate);
//		 System.out.println();

	}

}
