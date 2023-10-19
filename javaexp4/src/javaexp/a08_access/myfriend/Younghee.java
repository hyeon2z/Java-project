package javaexp.a08_access.myfriend;

public class Younghee {
	public void callGildongInfo() {
		Gildong g = new Gildong();
		System.out.println(g.friendPlan);
//		System.out.println(g.privCustom);
		System.out.println(g.pubAnnounce);
		System.out.println(g.msgFollower);
		g.goWeekMeeting();
	}
}
