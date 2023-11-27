package javaexp.z02_homework.a06_psj.vo;

import java.util.Arrays;
import java.util.Scanner;

public class MC {
	Scanner sc = new Scanner(System.in);
	private int remainCard = 136; //3(9*4)+(7*4) = 108 + 28
	int cardNum = 0;
	String[]card = new String[136];
	boolean[]cardIsNull = new boolean[136];
	String[]myCard = new String[13];
	int[]myCardID = new int[14];
	int rd=0;
	boolean cardDraw = true;

	public void cardSet() {
		for (int i = 0; i<146; i++) {
			if (i<36) {
				card[i] = Integer.toString(i/4+1);
				card[i]+="만";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=36 && i<72) {
				card[i] = Integer.toString((i/4)%9+1);
				card[i]+="삭";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=72 && i<108) {
				card[i] = Integer.toString((i/4)%9+1);
				card[i]+="통";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=108 && i<112) {
				card[i]="동";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=112 && i<116) {
				card[i]="남";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=116 && i<120) {
				card[i]="서";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=120 && i<124) {
				card[i]="북";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=124 && i<128) {
				card[i]="백";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=128 && i<132) {
				card[i]="발";
//				System.out.println(i+" = "+card[i]);
			}
			else if(i>=132 && i<136) {
				card[i]="중";
//				System.out.println(i+" = "+card[i]);
			}
		}
		
	}
	public void gameSet() {
		System.out.print("내손: ");
		for (int i = 0; i<13; i++) {
			rd = (int)(Math.random()*136);
			while (cardDraw) {
				if (cardIsNull[rd]==false) {
//					myCard[i]= card[rd];
					myCardID[i]= rd;
					cardIsNull[rd]=true;
//					System.out.print(myCardID[i]+" ");
					cardDraw=false;
				}
				rd = (int)(Math.random()*136);
			}
			cardDraw=true;
		}
		myCardID[13]=136;
	}
	public void sort() {
		Arrays.sort(myCardID);
		System.out.println("Sorted arr[] : " + Arrays.toString(myCardID));
		for (int i=0; i<13;i++) {
			System.out.print(card[myCardID[i]]+" / ");
		}	
	}
	public void drawCard() {
		rd = (int)(Math.random()*136);
		while (cardDraw) {
			if (cardIsNull[rd]==false) {
				myCardID[13]= rd;
				cardIsNull[rd]=false;
				cardDraw=false;
			}
			rd = (int)(Math.random()*136);
		}
		cardDraw=true;
		System.out.println("뽑은카드 : "+card[myCardID[13]]);
		System.out.println("버릴카드는?");	
		myCardID[sc.nextInt()-1]=136;	
		sort();
		
		//상대방
		for (int i=1; i<=3;i++) {
			rd = (int)(Math.random()*136);
			System.out.print("\n"+i+"번째상대가뽑은카드 : "+card[rd]);
			while (cardDraw) {
				if (cardIsNull[rd]==false) {
//					System.out.println("\n상대가뽑은카드 : "+card[rd]);
					cardIsNull[rd]=false;
					cardDraw=false;
				}
				rd = (int)(Math.random()*136);
			}
			cardDraw=true;
		}
		System.out.println("\n");
		sort();
	}
	
//	public void check() {
//		for (int i=0; i<13;i++) {
//			myCardID[i]%4>0
//		}		
//	}
}