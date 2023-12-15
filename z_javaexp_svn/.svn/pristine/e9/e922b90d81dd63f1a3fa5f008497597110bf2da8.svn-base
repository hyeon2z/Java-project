package javaexp.a08_access.myfriend;

public class Gildong {
	// public Gildong() {}
	// 같은 패키지에서만 공유하는 정보
	private String privCustom="이상한 잠꼬대를 한다";	
	String friendPlan=
			"여름에 제주도 친구들와 여행계획";
	protected String msgMyFollower="안녕하세요!! 내 팔로우에게는 상금 100만원드립니다.";
	
	
	
	public String pubAnnouce="구독자 100만 유튜버가 되었어요^^";
	
	
	
	void goWeekMeeting() {
		System.out.println("친구들과 주말 모임하다!!");
	}	
	// 외부에서 호출하는 내용.
	public void callGildongInfo() {
		Gildong g = new Gildong();
		System.out.println(g.privCustom);
		System.out.println(g.friendPlan);
		System.out.println(g.pubAnnouce);
		System.out.println(g.msgMyFollower);
		g.goWeekMeeting();
	}
	
}
