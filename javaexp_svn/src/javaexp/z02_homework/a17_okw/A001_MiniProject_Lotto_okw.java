package javaexp.z02_homework.a17_okw;

import java.util.Scanner;

import javaexp.z02_homework.a17_okw.vo.LoginProcess;

public class A001_MiniProject_Lotto_okw {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LoginProcess logpro = new LoginProcess();
		
		while(true) {
			char select = logpro.loginMenu();
			
			switch(select) {
				case '1':
					logpro.login();
					if(LoginProcess.loginFlag) {
						break;
					}
					System.out.print("아이디 입력 : ");
					String myID = input.nextLine();
					logpro.setId(myID);
					System.out.print("비밀번호 입력 : ");
					String myPw = input.nextLine();
					logpro.setPassword(myPw);
					logpro.memberCheck(logpro.getId(), logpro.getPassword());
					break;
				case '2':
					logpro.join();
					break;
				case '3':
					logpro.logout();
					break;
				case '4':
					logpro.runLottoProgram();
					break;
				case '5':
					System.exit(0);
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
	}

}
