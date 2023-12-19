package springweb.z01_vo;

public class Member {
	private String id = "";
	private String pwd = "";
	public Member(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLogin() {
		if(id.equals("")&&pwd.equals("")) {
			return "";
		}else if(id.equals("himan")&&pwd.equals("7777")) {
			return "로그인 성공";
		}else {
			return "로그인 실패";
		}
		
	}
}
