package javaexp.z02_homework.a02_oys.z01_miniProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A0922_program {
	public void call(Scanner scan) {
		
	}

	public static void main(String[] args) {
		ProgramClass pc = new ProgramClass();
		pc.call();
		
		
		Scanner scan = new Scanner(System.in);
		A0922_program p1 = new A0922_program();
		p1.call(scan);
		
		
		List<User> users = new ArrayList<User>();
		List<Board> boards = new ArrayList<Board>();
		
		// 기본 데이터
		users.add(new User("test", "test1234", "테스트계정"));
		users.add(new User("test123", "test1234", "테스트계정123"));
		
		boards.add(new Board(boards.size(), "제목테스트", users.get(0), "테스트내용입니다. 쌸라", 0));
		boards.add(new Board(boards.size(), "제목테스트1", users.get(0), "테스트내용입니다1. 쌸라", 0));
		boards.add(new Board(boards.size(), "제목테스트2", users.get(1), "테스트내용입니다2. 쌸라", 0));
		
		while (true) {
			User loginUser = null;
			System.out.println("\n--------------------\n");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("0. 종료");
			System.out.println("\n--------------------");
			System.out.print("메뉴를 입력해주세요 : ");
			int menu = scan.nextInt();
			System.out.println("--------------------\n");
			
			if (menu == 0) {
				break;
			}
			
			switch (menu) {
				case 1 :
					loginUser = loginUser(users);
					break;
				case 2 :
					createUser(users);
					break;
			}
			
			while (loginUser != null) {
				System.out.println("--------------------");
				System.out.println("1. 게시판 보기");
				System.out.println("2. 게시글 수정");
				System.out.println("3. 게시글 추가");
				System.out.println("4. 게시글 삭제");
				System.out.println("0. 로그아웃");
				System.out.println("--------------------");
				
				System.out.print("메뉴를 입력해주세요 : ");
				menu = scan.nextInt();
				System.out.println("--------------------\n");
				
				if (menu == 0) {
					break;
				}
				
				switch (menu) {
					case 1 :
						showBoard(boards);
						getBoardDetail(boards);
						break;
					case 2 :
						showBoard(boards);
						System.out.print("수정하고싶은 게시글 번호를 입력하세요 : ");
						int num = scan.nextInt();
						updateBoard(boards.get(num-1), loginUser);
						break;
					case 3 :
						createBoard(boards, loginUser);
						break;
					case 4 : 
						showBoard(boards);
						System.out.print("삭제하고싶은 게시글 번호를 입력하세요 : ");
						num = scan.nextInt();
						System.out.println("--------------------\n");
						deleteBoard(boards, num - 1, loginUser);
						break;
					
					default :
						System.out.println("메뉴에 있는 번호를 입력해주세요.");
							
				}
			}
		}

	}
	
	static User loginUser(List<User> users) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String pass = scan.nextLine();
		
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getUserId().equals(id)) {
				if (user.getUserPassword().equals(pass)) {
					System.out.println("\n--------------------");
					System.out.println("로그인 성공");
					System.out.println("--------------------\n");
					return user;
				} else {
					System.out.println("비밀번호를 확인 해주세요.");
					break;
				}
			}
		}
		return null;
	}
	
	static void createUser(List<User> users) {
		Scanner scan = new Scanner(System.in);
		String id;
		boolean isOk = false;
		
		while(true) {
			System.out.print("아이디를 입력하세요 (회원가입 취소는 0을 입력하세요) : ");
			id = scan.nextLine();
			if (id.equals("0")) {
				break;
			}
			for (int i = 0; i < users.size(); i++) {
				User user = users.get(i);
				if (user.getUserId().equals(id)) {
					System.out.println("이미 있는 아이디 입니다.");
					break;
				} else {
					isOk = true;
				}
			}
			
			if (isOk) {
				break;
			}
		}
		if (!id.equals("0") && isOk) {
			System.out.print("비밀번호를 입력하세요 : ");
			String pass = scan.nextLine();
			System.out.print("닉네임을 입력하세요 : ");
			String name = scan.nextLine();
			users.add(new User(id, pass, name));
			System.out.println("회원가입 완료! 로그인 해주세요.");
		}
	}
	
	// 게시글 리스트 뽑아오기
	static void showBoard(List<Board> boards) {
		System.out.println("번호\t제목\t\t작성자");
		System.out.println("----------------------------------------");
		for (int i = 0; i < boards.size(); i++) {
			boards.get(i).getBoardList();
			System.out.println();
			System.out.println("----------------------------------------");
		}
	}
	
	static void getBoardDetail(List<Board> boards) {
		Scanner scan = new Scanner(System.in);
		System.out.print("보고싶은 게시물 번호 입력 (뒤로가기 0) : ");
		int showNum = scan.nextInt();
		if (showNum != 0) {
			boards.get(showNum - 1).getBoardDetail();
		}
	}
	
	// 게시글 추가
	static void createBoard(List<Board> boards, User user) {
		Scanner scan = new Scanner(System.in);
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String text = scan.nextLine();
		
		boards.add(new Board(boards.size(), title, user, text, 0));
	}
	
	// 게시글 업데이트 (수정)
	static void updateBoard(Board board, User user) {
		Scanner scan = new Scanner(System.in);
		
		if (board.checkUser(user)) {
			System.out.print("변경할 제목 : ");
			String title = scan.nextLine();
			System.out.print("변경할 내용 : ");
			String text = scan.nextLine();
			board.updateBoard(title, text);
			
			board.getBoardDetail();
			
		} else {
			System.out.println("작성자가 다릅니다.\n");
		}
	}
	
	// 게시글 삭제 (본인이 쓴 글만 삭제 가능)
	static void deleteBoard(List<Board> boards, int num, User user) {
		if (boards.get(num).checkUser(user)) {
			boards.remove(num);
			System.out.println("삭제 완료했습니다.");
			
			// 게시글 번호 수정
			for (int i = 0; i < boards.size(); i++) {
				boards.get(i).updateBoardNum(i + 1);
			}
		} else {
			System.out.println("작성자가 다릅니다.\n");
		}
		
	}

}
