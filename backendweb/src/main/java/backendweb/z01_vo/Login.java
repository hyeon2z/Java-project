package backendweb.z01_vo;

public class Login {
	private String id;
	private String pwd;
	public Login(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	public Login() {
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
	
	
}
