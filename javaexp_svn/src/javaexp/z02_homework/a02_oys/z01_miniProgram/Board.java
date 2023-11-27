package javaexp.z02_homework.a02_oys.z01_miniProgram;

public class Board {
	private int boardNum;
	private String title;
	private User user;
	private String text;
	private int count;
	
	public Board(int boardNum, String title, User user, String text, int count) {
		this.boardNum = boardNum + 1;
		this.title = title;
		this.user = user;
		this.text = text;
		this.count = count;
	}

	public void getBoardDetail() {
		System.out.println("\n----------------------------------------");
		System.out.print(boardNum + "\t");
		System.out.print(title + "\t");
		System.out.println(user.getUserName() + "(" + user.getUserId() + ")");
		System.out.println("----------------------------------------\n");
		System.out.println(text);
		System.out.println("\n----------------------------------------");
		System.out.println("조회수 : " + ++count);
		System.out.println("----------------------------------------\n");
	}
	
	public void getBoardList() {
		System.out.print(boardNum + "\t" + title + "\t" + user.getUserName());
	}
	
	public void updateBoard(String title, String text) {
		if (!title.isEmpty()) {
			this.title = title;
		}
		if (!text.isEmpty()) {
			this.text = text;
		}
	}
	
	public boolean checkUser(User user) {
		return user.getUserId().equals(this.user.getUserId());	
		
	}
	
	public void updateBoardNum(int num) {
		this.boardNum = num;
	}
}
