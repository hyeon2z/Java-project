package javaexp.z03_1006_teamprograms.vo3;

import java.util.Scanner;

public class MovieSeat {
	private int i;
	private int e;
	private String[][] seatList;
	private int cnt = 0;
	private int usrE;
	private int usrI;
	
	public MovieSeat(int i, int e) {
		this.i = i;
		this.e = e;
		this.seatList = new String[i][e];
	}
	
	public void printSeatList() {
		System.out.println("\n###좌석 목록###\n");
		System.out.println("========  Screen  ========");
		for(int e = 1; e <= this.e; e ++) {
			if(e == 2 || e == this.e -2) {
				System.out.print(e+ "   ");
			
			}else if(e == 1) {
				System.out.print("  " + e + " ");
			
			}else {
				System.out.print(e+ " ");
			}
			
		}
		System.out.println();
		for(int i = 0; i < this.i; i ++) {
			System.out.print((i+1) + " ");
			for(int e = 0; e < this.e; e ++) {
				
				if(e == 1 || e == this.e -3) {
					System.out.print("□   ");
					seatList[i][e] = "□   ";
				}else {
					System.out.print("□ ");
					seatList[i][e] = "□ ";
				}
				
			}
		System.out.println();
		}
			
	}
			
	public void seatReservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n예매할 좌석의 위치를 입력해주세요");
		System.out.print("행(1~10) : ");
		usrE = (Integer.parseInt(sc.nextLine())-1);
		System.out.print("열(1~7) : ");
		usrI = (Integer.parseInt(sc.nextLine())-1);
		
		if(usrE == 1 || usrE == this.e -3) {
			seatList[usrI][usrE] = "■   ";
		}else {
			seatList[usrI][usrE] = "■ ";
		}
	}
	
	public void seatStatus() {
		System.out.println("\n좌석이 선택 되었습니다\n");
		System.out.println("======== Screen ========\n");
		for(int e = 1; e <= this.e; e ++) {
			if(e == 2 || e == this.e -2) {
				System.out.print(e+ "   ");
			
			}else if(e == 1) {
				System.out.print("  " + e + " ");
			
			}else {
				System.out.print(e+ " ");
			}
			
		}
		System.out.println();
		for(int i = 0; i < this.i; i ++) {
			System.out.print((i+1) + " ");
			for(int e = 0; e < this.e; e ++) {				
				System.out.print(seatList[i][e]);
				
			}
		System.out.println();
		}
	}
	public void usrSeat() {
		System.out.println("선택하신 좌석 : "  + (usrE+1) + "행 " + (usrI+1) + "열 입니다");
	}
}
