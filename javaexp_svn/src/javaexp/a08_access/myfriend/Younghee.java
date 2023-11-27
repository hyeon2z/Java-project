package javaexp.a08_access.myfriend;

public class Younghee {
	public void callGildongInfo() {
		Gildong g = new Gildong();
//		System.out.println(g.privCustom);
		System.out.println(g.friendPlan);
		g.goWeekMeeting();
		System.out.println(g.msgMyFollower);
		System.out.println(g.pubAnnouce);
		
		g.callGildongInfo();
	}
}
