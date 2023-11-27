package javaexp.z02_homework.a05_kjh;

import java.util.Scanner;

public class small_p1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		// 환율 정보 (1 단위당 외화 금액 10.03 12시 기준)
        double usd = 1358.5;  // 달러 환율 (원화에 대한 달러)
        double jpy = 9.06;   // 엔화 환율 (원화에 대한 엔화)
        double cny = 185.75;  // 위안화 환율 (원화에 대한 위안화)
        
     // 통화 밑 금액 입력
        System.out.print("금액을 입력하세요: ");
        double amount = scanner.nextDouble();
        System.out.print("통화를 선택하세요 (USD, JPY, CNY): ");
        String curren = scanner.next();
     // 환율 계산
        double result = 0;
        if ("USD".equals(curren)) {
            result = amount * usd;
        } else if ("JPY".equals(curren)) {
            result = amount * jpy;
        } else if ("CNY".equals(curren)) {
            result = amount * cny;
        } else {
            System.out.println("지원하지 않는 통화입니다.");
            return;
        }
        System.out.println("원화로 환산된 금액: " + result + " 원");
		
	}

}
