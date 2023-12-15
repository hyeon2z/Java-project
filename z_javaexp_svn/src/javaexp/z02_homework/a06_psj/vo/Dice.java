package javaexp.z02_homework.a06_psj.vo;

public class Dice {
	public int myD;
	public int comD;
	
	public void roll() {
		myD=(int)(Math.random()*6+1);
		comD=(int)(Math.random()*6+1);
	}
	public void result() {
		if (myD>comD)
			System.out.println("이겼어요!");
		else if(myD==comD)
			System.out.println("비겼어요");
		else
			System.out.println("졌어요 ㅠ");
		System.out.println("내 주사위: "+myD);
		System.out.println("COM 주사위: "+comD);
	}
}
