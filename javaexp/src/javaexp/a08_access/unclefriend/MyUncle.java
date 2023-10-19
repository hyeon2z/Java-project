package javaexp.a08_access.unclefriend;

import javaexp.a08_access.myfriend.Gildong;

public class MyUncle {
	public void callGildongInfo() {
//		System.out.println(g.privCustom);
		Gildong g = null; // public class Gildong{}
//		g = new Gildong(); // public Gildong() 생성자선언
		System.out.println(g.pubAnnounce);
		// 상속관계가 없기게 호출불가
//		System.out.println(g.msgFollower);
//		외부패키지에 있는 클래스에서 해당 구성요소가 접근이 불가능하다.
//		System.out.println(g.friendPlan);
//		g.goWeekMeeting();
	}
}
