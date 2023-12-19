package community.vo;

import java.sql.Date;

public class Comments {
	
	private int no;	//번호
	private String id;	//id
	private String name;	//닉네임
	private String content;		//내용
	private int likes;		//좋아요
	private Date time;		//작성날짜

	public Comments() {}

	public Comments(int no, String id, String name, String content, int likes, Date time) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.content = content;
		this.likes = likes;
		this.time = time;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	

	
}
