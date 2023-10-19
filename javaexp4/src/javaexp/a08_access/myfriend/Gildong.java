package javaexp.a08_access.myfriend;

public class Gildong {
	// 같은 패키지에서만 공유하는 정보
	private String privCustom = "이상한 잠꼬대";
	public String pubAnnounce = "구독자 100만 유튜버가 됐어용";
	protected String msgFollower = "팔로우메세지";
	
	String friendPlan = "여름에 친구들과 제주도 여행계획";
	public Gildong() {}
	void goWeekMeeting() {
		System.out.println("친구들과 주말 모임");
	}
	// 외부에서 호출하는 내용.
	public void callGildongInfo() {
		Gildong g = new Gildong();
		System.out.println(g.friendPlan);
		System.out.println(g.privCustom);
		System.out.println(g.msgFollower);
		g.goWeekMeeting();
	}
}
