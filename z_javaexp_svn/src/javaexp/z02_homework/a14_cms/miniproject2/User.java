package javaexp.z02_homework.a14_cms.miniproject2;
//User의 정보를 저장하는 class
public class User {
	private String id; //사용자 id
	private String pass; // 사용자 비밀번호
	private String nickname; // 사용자 닉네임
	private int score; //사용자 점수
	private boolean isLogin = false; // 이 계정의 로그인 여부
	
	public User() {} //기본 생성자
	
	public User(String id, String pass, String nickname) { //생성자
		this.id = id;
		this.pass = pass;
		this.nickname = nickname;
	}
	

	// 각 필드의 getter, setter
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setisLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
	public boolean getisLogin() {
		return isLogin;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}

}
