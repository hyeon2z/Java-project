package javaexp.z02_homework.a06_psj;

import javaexp.z02_homework.a06_psj.vo.Baseball;
import javaexp.z02_homework.a06_psj.vo.Dice;
import javaexp.z02_homework.a06_psj.vo.RSP;
import javaexp.z02_homework.a06_psj.vo.Shopping;

public class A0922_Homework {

	public static void main(String[] args) {
		System.out.println("# 가위바위보 게임 #");
		RSP rsp = new RSP();
		while(true) {
			rsp.comHand=(int)(Math.random()*3+1);
			rsp.gameStart();
			if (rsp.myHand==rsp.comHand) {
				System.out.println();
			}
			else if ((rsp.myHand==1 && rsp.comHand==3
					)||rsp.myHand>rsp.comHand)
			{
				System.out.println("이겼습니다");
				rsp.showHand();
				break;
			}
			else {
				System.out.println("졌어요 ;ㅅ;");
				rsp.showHand();
				break;
			}
		} // 가위바위보 게임

		System.out.println("\n# 주사위 게임 #");
		Dice di = new Dice();
		di.roll();
		di.result(); //주사위 게임
		
		System.out.println("\n# 야구게임 #");
		Baseball bb = new Baseball();
		while (bb.getOut()!=3) {
			System.out.println(bb.getmyNum()+"번 타자");
			bb.baseInfo();
			bb.setHitmode();
			bb.setPower();
			bb.resultHit();
		}
		System.out.println("@@@ 게임종료 @@@");
		System.out.println("내 점수: "+bb.getScore()); // 야구게임
		
		System.out.println("\n# 물건구매 프로그램 #");
		Shopping sp = new Shopping();
		while (true) {
			sp.register();
			sp.login();
			break;
		}
		sp.buy();

		
		

	}
}
