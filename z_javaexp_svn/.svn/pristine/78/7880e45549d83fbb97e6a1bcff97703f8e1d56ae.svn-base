package javaexp.z02_homework.a14_cms.miniproject2;

import java.util.Scanner;

public class Login {
	public Login() {
	} // 생성자

	private User[] memberArray = new User[10]; // 10명의 회원가입을 받을 수 있다.
	private int memIndex = 0; // memberArray의 인덱스 초기화
	Scanner sc = new Scanner(System.in);

	public void login() {
		System.out.println("ID를 입력하십시오. :");
		String inputID = sc.nextLine(); // 사용자로부터 id를 입력받는다.
		System.out.println("Password를 입력하십시오. :");
		String inputPass = sc.nextLine(); // 사용자로부터 password를 입력받는다.
		if (memIndex != 0) { // meberArray의 값이 비어있지 않는 경우
			for (int i = 0; i < memIndex; i++) { // memberArray를 탐색
				User user = memberArray[i];
				if (user.getId().equals(inputID) && user.getPass().equals(inputPass)) { // 아이디와 패스워드가 일치
					System.out.println(user.getNickname() + "님 로그인 성공!!");
					user.setisLogin(true); // 로그인 상태여부를 true로 전환.
					PlayGame playGame = new PlayGame();
					playGame.play(user);
				
				} else
					System.out.println("로그인 실패!!");

			}

		} else {
			System.out.println("회원가입한 유저가 없습니다.");
			return;
		}
	}

	public User getLoggedInUser(int index) { // 로그인 되있는 유저의 정보를 리턴한다.
		// 이 메서드는 isLogin이 true일 때만 사용가능
		return memberArray[index];

	}

	public void join() { // 회원가입
		System.out.println("★★★★ 회원가입 화면입니다. ★★★★");
		if (memIndex > memberArray.length) { // 10명까지밖에 회원을 못 받는다.
			System.out.println("회원가입을 진행할 수 없습니다.");
			return; // 회원가입 중단
		}
		memberArray[memIndex] = new User();
		System.out.print("ID를 입력하십시오. :");
		String newId = sc.nextLine(); // 사용자가 원하는 ID를 입력받는다.
		System.out.print("비밀번호를 입력하십시오: ");
		String newPass = sc.nextLine(); // 사용자가 원하는 password를 입력받는다.
		System.out.print("닉네임을 입력하십시오: "); // 사용자가 원하는 닉네임을 입력받는다.
		String newNickname = sc.nextLine();

		User newUser = new User(newId, newPass, newNickname);
		if (!(isUnique(newUser))) {
			System.out.println("중복된 아이디나 닉네임을 입력했습니다. 회원가입 실패");
		} else {
			memberArray[memIndex++] = newUser;
			System.out.println("회원가입에 성공했습니다.");
		}

	}

	public void secession() { // 탈퇴
		if (memIndex != 0) {
			{
				System.out.println("탈퇴하고 싶은 계정의 닉네임을 입력하십시오: ");
				String inputNick = sc.nextLine();
				for (int i = 0; i < memIndex; i++) {
					User user = memberArray[memIndex];
					if (user.getNickname().equals(inputNick)) {
						System.out.println(user.getNickname() + "님 탈퇴를 원하시면 비밀번호를 입력하십시오.");
						String inputPass = sc.nextLine();
						if (user.getPass().equals(inputPass)) {
							System.out.println(user.getId() + "님 탈퇴를 진행합니다.");
							for (int j = i; j < memIndex - 1; j++) {
								memberArray[j] = memberArray[j + 1];
							}
							memberArray[memIndex - 1] = null;
							memIndex--;
							return;

						} else {
							System.out.println("비밀번호가 일치하지 않습니다. 탈퇴실패!");
							return;
						}
					} else {
						System.out.println("존재하지 않는 닉네임입니다.");
						return;
					}
				}
			}

		} else {
			System.out.println("회원가입한 멤버가 없어서 회원탈퇴를 할 수 없습니다.");
			return; // 함수 종료
		}

	}

	public boolean isUnique(User newUser) { // 아이디나 닉네임 중복여부 체크
		for (int idx = 0; idx < memIndex; idx++) {
			if (memberArray[idx].getId().equals(newUser.getId())
					|| memberArray[idx].getNickname().equals(newUser.getNickname()))
				return false;
		}
		return true;
	}

	public void showNickname() {
		// 사용중인 닉네임 확인할 수 있는 method
		if (memIndex == 0) {
			System.out.println("!!회원가입한 유저가 없습니다!!");
			return;
		} else {
			for (int i = 0; i < memberArray.length; i++) {
				User user = memberArray[i];
				if (user != null) {
					System.out.println(user.getNickname());
				}
			}
		}
	}
	public void showScore() { // 점수 확인 method
		if(memIndex == 0) {
			System.out.println("!!회원가입한 유저가 없습니다!!");
			return;
		}else {
			for (int i = 0; i < memberArray.length; i++) {
				User user = memberArray[i];
				if (user != null) {
					System.out.println(user.getNickname()+"님의 점수: "+user.getScore());
				}
			}
			
		}
	}

	

}

