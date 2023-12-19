package chat.vo;

import java.util.Date;

import user.Users;

public class Chat {
	private int chatNum;
	private String chat;
	private Users user01;
	private Users user02;
	private Date sendDate;
	
	public Chat() {
		
	}
	
	public Chat(int chatNum, String chat, Users user01, Users user02, Date sendDate) {
		this.chatNum = chatNum;
		this.chat = chat;
		this.user01 = user01;
		this.user02 = user02;
		this.sendDate = sendDate;
	}
	
	public int getChatNum() {
		return chatNum;
	}
	public void setChatNum(int chatNum) {
		this.chatNum = chatNum;
	}
	public String getChat() {
		return chat;
	}
	public void setChat(String chat) {
		this.chat = chat;
	}
	public Users getUser01() {
		return user01;
	}
	public void setUser01(Users user01) {
		this.user01 = user01;
	}
	public Users getUser02() {
		return user02;
	}
	public void setUser02(Users user02) {
		this.user02 = user02;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

}
