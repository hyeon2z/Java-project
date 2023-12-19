package user;

public class Users {
	private int userNo;
    private String userId;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String address;
    private String phoneNumber;
    private String petStatus;
    private String subStatus;
    private String subDate;
    private String role;
    private String joinDate;
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(int userNo, String userId, String name, String userName, String password, String email, String address,
			String phoneNumber, String petStatus, String subStatus, String subDate, String role) {
		this.userNo = userNo;
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.petStatus = petStatus;
		this.subStatus = subStatus;
		this.subDate = subDate;
		this.role = role;
	}
	public Users(String userId, String name, String userName, String phoneNumber, String subStatus, String joinDate) {
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.subStatus = subStatus;
		this.joinDate = joinDate;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPetStatus() {
		return petStatus;
	}
	public void setPetStatus(String petStatus) {
		this.petStatus = petStatus;
	}
	public String getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	public String getSubDate() {
		return subDate;
	}
	public void setSubDate(String subDate) {
		this.subDate = subDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
    
}
