package javaexp.z02_homework.a01_kjh.teamprograms.vo;

import java.util.Scanner;

public class ReservationSystem {
	private String confirm;
	
	public ReservationSystem() {}
	
	public void isConfirm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n결제하시려면 Y를 입력하세요 : ");
		confirm = sc.nextLine();
		
		if(confirm.equals("Y") || confirm.equals("y")) {
			System.out.print("결제되었습니다!! 예매완료!!");
		}else {
			System.out.println("결제가 취소되었습니다. 처음부터 다시 예매해주십시오");
		}
	}
}
