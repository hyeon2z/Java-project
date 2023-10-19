package javaexp.a08_access.unclefriend;

import javaexp.a08_access.myfriend.Gildong;

public class GildongFollower extends Gildong {

	GildongFollower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void callGildongInfo() {
//		System.out.println(friendPlan); // default 같은 패키지일때만
//		System.out.println(privCustom); // private는 해당 클래스에서만
		System.out.println(msgFollower); // 상속 + protected 이기에 접근가능
		System.out.println(pubAnnounce); // public 이기에 접근가능
		
	}
}
