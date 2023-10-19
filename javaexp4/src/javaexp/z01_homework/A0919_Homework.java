package javaexp.z01_homework;

import java.util.Scanner;

public class A0919_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1. 아래 내용을 2중 for문을 활용하여
//	    1) 2X2(행X열)로 ♥를 표시 
//		for(int i = 1; i <= 2; i++) {
//			for(int e = 1; e <= 2; e++) {
//				System.out.print("♥");
//			}
//			System.out.println();
//		}
		
//		2) 3X2(행X열)로 ★표시 
//		for(int i = 1; i <= 3; i++) {
//			for(int e = 1; e <= 2; e++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}

//		3) 입력한 행/열로 입력한 기호표시
		Scanner sc = new Scanner(System.in);	
//		System.out.println("최대 행을 입력하세요 : ");
//		int hang = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("최대 열을 입력하세요 : ");
//		int yeol = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("기호를 입력하세요 : ");
//		String ho = sc.nextLine();
//		
//		for(int i = 0; i <= hang; i++) {
//			for(int e = 0; e <= yeol; e++) {
//				System.out.print(ho);
//			}
//			System.out.println();
		
		
		
		
		
		
//	2. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
//		int num02 = 100;
//		int num02Sum = 0;
//		
//		while(num02 >= 90) {
//			System.out.println(num02 + " ");
//			num02Sum += num02;
//			num02--;
//		} 
//		
//		System.out.println("합산결과 : " + num02Sum);
			
		
//	3. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//		int gradeSum = 0;
//		int stuCount = 0;
//		while(true) {
//			System.out.print("학생의 점수를 입력하세요(종료시 -1 입력) : ");
//			int stuGrade = sc.nextInt();
//			if(stuGrade != -1) {
//				gradeSum += stuGrade;
//				stuCount++;
//			} else {
//				System.out.println("학생들의 총점 : " + gradeSum);
//				System.out.println("학생들의 평균 : " + gradeSum / stuCount);
//				break;
//			}
//			
//		}
		
		
//	4. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
//		int [] score3 = new int[3];
//		int tot = 0;
//		int cntNum = 0;
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.print(i + 1 + "번째 점수를 입력하세요 : ");
//			score3[i] = sc.nextInt();
//			tot += score3[i];
//			cntNum += i;
//		}
//		System.out.println("점수의 총계 : " + tot);
//		System.out.println("점수의 평균 : " + tot / cntNum);
//		
		
		
		
//	5. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요.
//		String[] subjec = new String[3];
//		
//		for(int i = 0; i < 3; i++) {
//			if(i < 1) {
//				System.out.print("학생명을 입력하세요 : ");
//				subjec[i] = sc.nextLine();
//			}else if(i == 1) {
//				System.out.print("국어점수를 입력하세요 : ");
//				subjec[i] = sc.nextLine();
//			}else if(i == 2) {
//				System.out.print("영어점수를 입력하세요 : ");
//				subjec[i] = sc.nextLine();
//			}
//		}
//		System.out.println("학생명 : " + subjec[0] + "\n국어점수 : " + subjec[1] + "\n영어점수 : " + subjec[2]);
//		
		
		
//	6. **구구단 출력기**
//	    구구단 중 원하는 단을 시작 단과 끝 단으로 지정(입력)하여 출력하게 만드세요.
		// 구구단 출력하는거 만들고, 시작 끝 숫자 입력하게 하면 될거같은데
		
//		System.out.println("시작 단을 입력하세요 : ");
//		int ai = sc.nextInt();
//		System.out.println("끝 단을 입력하세요 : ");
//		int bi = sc.nextInt();
//		
//		for(int i = ai; i <= bi; i++) {
//			for(int e = 1; e <= 9; e++) {
//				System.out.println(i + " x " + e + " = " + i * e);
//			}
//		}
		
		
//	7. **자동비밀번호 생성기**
//	    사용자로부터 비밀번호 길이를 입력 받아, 해당 길이만큼의 비밀번호를 생성하세요. 비밀번호는 숫자와 알파벳으로 구성됩니다.
		// byte 48~57, 65~90, 97~122
		
		System.out.print("비밀번호의 길이를 입력하세요 : ");
		int i = sc.nextInt();
		
		byte[]coPass = new byte[i];
		
		for(int a = 0; a < coPass.length; a++) {
			
			coPass[a] = (byte)(Math.random() * 10 + 48);
			
			
		}
		String ranPass = new String(coPass);
		System.out.println(ranPass);
		
//	8. **구간별 합계**
//	    사용자로부터 두 개의 정수 A와 B를 입력받아, A부터 B까지의 합을 출력하세요. 단, A가 B보다 클 경우에는 순서를 바꿔서 계산하세요.
//		System.out.print("A에 들어갈 숫자를 입력하세요 : ");
//		int usrA = sc.nextInt();
//		System.out.print("B에 들어갈 숫자를 입력하세요 : ");
//		int usrB = sc.nextInt();
//		int sumAB = 0;
//		
//		if(usrA < usrB) {
//			for(int usr1 = usrA; usr1 <= usrB; usr1++) {
//				sumAB += usr1;
//			}System.out.println("A부터 B까지의 합은 : " + sumAB);
//			
//		}else if(usrA > usrB) {
//			for(int usr2 = usrB; usr2 <= usrA; usr2++) {
//				sumAB += usr2;
//			}System.out.println("B부터 A까지의 합은 : " + sumAB);
//		}		
		
//	9. **마름모 모양 숫자 출력기**
//	    사용자로부터 숫자 N을 입력받아, 마름모 모양으로 숫자를 출력하세요. (별찍기와 비슷하지만, 별 대신 숫자를 사용합니다.)
		
		
//	10. **영문자 변환기**
//	    사용자로부터 영문자 하나를 입력받아, 해당 문자가 소문자인 경우 대문자로, 대문자인 경우 소문자로 변환하여 출력하세요.

			
//	11. **숫자 사이의 연산자 넣기**
//	    사용자로부터 두 개의 숫자를 입력받아, 사이에 '+', '-', '*', '/' 중 하나를 넣어 계산 결과가 제일 큰 연산을 찾아 출력하세요.
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int usrNum1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int usrNum2 = sc.nextInt();
		
		int Num1 = usrNum1 + usrNum2;
		int Num2 = usrNum1 - usrNum2;
		int Num22 = usrNum2 - usrNum1;
		int Num3 = usrNum1 * usrNum2;
		int Num4 = usrNum1 / usrNum2;
		int Num44 = usrNum2 / usrNum1;
		
		
		
		if(usrNum1 > usrNum2) {
			if(Num1 > Num2) {
				if(Num1 > Num3) {
					if(Num1 > Num4) {
						System.out.println(Num1);
					}
				}
			}else if(Num2 > Num3) {
				if(Num2 > Num4) {
					System.out.println(Num2);
				}
			}else if(Num3 > Num4) {
				System.out.println(Num3);
			}else {
				System.out.println(Num4);
			}
			
		}else if(usrNum2 > usrNum1) {
			if(Num1 > Num22) {
				if(Num1 > Num3) {
					if(Num1 > Num44) {
						System.out.println(Num1);
					}
				}
			}else if(Num22 > Num3) {
				if(Num22 > Num44) {
					System.out.println(Num22);
				}
			}else if(Num3 > Num44) {
				System.out.println(Num3);
			}else {
				System.out.println(Num44);
			}
		}
		
		
//	12. **카드 게임 시뮬레이션**
//	    컴퓨터의 두 플레이어가 각각 1~10 사이의 카드를 무작위로 받고, 높은 카드를 가진 플레이어가 승리합니다. 게임은 총 5라운드로 진행되며, 승리한 라운드 횟수에 따라 최종 승자를 결정합니다.
		int card1 = (int)(Math.random() * 10 + 1);
		int card2 = (int)(Math.random() * 10 + 1);
		
//	13. **동전 교환기**
//	    사용자로부터 특정 금액을 입력받아, 최소한의 동전 수로 교환하는 방법을 출력합니다. 예를 들어 560원을 입력하면, 500원짜리 1개, 50원짜리 1개, 10원짜리 1개로 출력합니다.
		
		
//	14. **할인율 계산기**
//	    사용자로부터 상품의 원가와 판매가를 입력받아, 할인율을 계산하고 출력합니다.

	}

}
