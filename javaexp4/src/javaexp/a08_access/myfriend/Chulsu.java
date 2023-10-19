package javaexp.a08_access.myfriend;

public class Chulsu extends Gildong{
	public void callGildongInfo() {
		Gildong g = new Gildong();
		System.out.println(g.friendPlan);
//		System.out.println(g.privCustom);
		System.out.println(g.pubAnnounce);
		System.out.println(g.msgFollower);
//		private : 해당 클래스 외에는 접근 불가
		g.goWeekMeeting();
	}
}
