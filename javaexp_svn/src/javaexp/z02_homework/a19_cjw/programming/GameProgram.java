package javaexp.z02_homework.a19_cjw.programming;

import java.util.Scanner;

import javaexp.z02_homework.a19_cjw.programming.games.Baseball;
import javaexp.z02_homework.a19_cjw.programming.games.CorrectNum;
import javaexp.z02_homework.a19_cjw.programming.games.Dice;
import javaexp.z02_homework.a19_cjw.programming.games.Gugudan;
import javaexp.z02_homework.a19_cjw.programming.games.RockScissorsPaper;

public class GameProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("# 종합 게임 사이트 #");
		System.out.println("로그인 해주세요!");
		
		while(true) {	//로그인 성공시 반복 종료
			System.out.print("id: ");
			String id = sc.nextLine();	//아이디 입력
			System.out.print("password: ");
			String password = sc.nextLine();  //패스워드 입력
			
			if(!id.equals("himan")&&!password.equals("java123")) {	//아이디와 패스워드 모두 불일치시
				System.out.println("아이디와 패스워드를 다시 입력해주세요.");
				
			}else if(!id.equals("himan")&&password.equals("java123")) {	//아이디만 불일치시
				System.out.println("아이디를 다시 입력해주세요.");
				
			}else if(id.equals("himan")&&!password.equals("java123")) {	//패스워드만 불일치시
				System.out.println("패스워드를 다시 입력해주세요.");
				
			}else {
				System.out.println("로그인 성공!");	//둘 다 일치했을때
				break;
			}//if-else-if문
		}//while문
		
		//게임 클래스들을 객체로 불러옴
		CorrectNum correctnum = new CorrectNum("","");
		RockScissorsPaper rock = new RockScissorsPaper("","");
		Baseball baseball = new Baseball("","");
		Dice dice = new Dice("","");
		Gugudan gugudan = new Gugudan("","");
		
		System.out.println("어떤 게임을 하시겠습니까?(종료 입력시 종료)");
		System.out.println("숫자맞추기 | 가위바위보 | 숫자야구 | 주사위게임 | 구구단게임");	//게임 선택지 제공
		
		while(true) {	//종료 입력 때까지 반복
			String gameslc = sc.nextLine();
			
			switch(gameslc) {
				case "숫자맞추기":	//숫자맞추기 실행
					System.out.println(correctnum.getName());	//이름 불러옴
					System.out.println("게임 설명을 들으시겠습니까?(y/n)");
					while(true) {	//y나 n 둘 중 하나를 입력할 때까지 반복
						String answer = sc.nextLine();
						if(!answer.equals("y") && !answer.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임 설명을 들으시겠습니까?(y/n)");
						}else if(answer.equals("y")) {	//y입력시 설명 불러오고 다음 단계로
							System.out.println(correctnum.getHow());
							break;
						}else if(answer.equals("n")) {	//n입력시 바로 다음 단계
							break;
						}//if-else-if문
					}//내부 while문
					
					System.out.println("게임을 실행하시겠습니까?(y/n)");
					while(true) {	//y나 n 둘 중 하나를 입력할 때까지 반복
						String answer1 = sc.nextLine();
						if(!answer1.equals("y") && !answer1.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임을 실행하시겠습니까?(y/n)");
						}else if(answer1.equals("y")) {	//y입력시 게임실행 후 다음단계로
							correctnum.playCorrectNum();
							break;
						}else if(answer1.equals("n")) {	//n입력시 게임실행하지 않고 다음단계로
							break;
						}//if-else-if문
					}//내부 while문
					
					System.out.println("어떤 게임을 하시겠습니까?(종료 입력시 종료)");		//다시 게임 선택지 제공
					System.out.println("숫자맞추기 | 가위바위보 | 숫자야구 | 주사위게임 | 구구단게임");
					break;
					
				case "가위바위보":	//위 게임 실행과 동일
					System.out.println(rock.getName());
					System.out.println("게임 설명을 들으시겠습니까?(y/n)");
					while(true) {
						String answer2 = sc.nextLine();
						if(!answer2.equals("y") && !answer2.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임 설명을 들으시겠습니까?(y/n)");
						}else if(answer2.equals("y")) {
							System.out.println(rock.getHow());
							break;
						}else if(answer2.equals("n")) {
							break;
						}//if-else-if문
					}//내부 while문
					
					System.out.println("게임을 실행하시겠습니까?(y/n)");
					while(true) {
						String answer3 = sc.nextLine();
						if(!answer3.equals("y") && !answer3.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임을 실행하시겠습니까?(y/n)");
						}else if(answer3.equals("y")) {
							rock.playRock();
							break;
						}else if(answer3.equals("n")) {
							break;
						}//if-else-if문
					}//내부 while문
					System.out.println("어떤 게임을 하시겠습니까?(종료 입력시 종료)");
					System.out.println("숫자맞추기 | 가위바위보 | 숫자야구 | 주사위게임 | 구구단게임");
					break;
					
				case "숫자야구":	//위 게임 실행과 동일
					System.out.println(baseball.getName());
					System.out.println("게임 설명을 들으시겠습니까?(y/n)");
					while(true) {
						String answer4 = sc.nextLine();
						if(!answer4.equals("y") && !answer4.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임 설명을 들으시겠습니까?(y/n)");
							answer4 = sc.nextLine();
						}else if(answer4.equals("y")) {
							System.out.println(baseball.getHow());
							break;
						}else if(answer4.equals("n")) {
							break;
						}//if-else-if문
					}//내부 while문
					
					System.out.println("게임을 실행하시겠습니까?(y/n)");
					while(true) {
						String answer5 = sc.nextLine();
						if(!answer5.equals("y") && !answer5.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임을 실행하시겠습니까?(y/n)");
						}else if(answer5.equals("y")) {
							baseball.playBaseball();
							break;
						}else if(answer5.equals("n")) {
							break;
						}//if-else-if문
					}//내부 while문
					System.out.println("어떤 게임을 하시겠습니까?(종료 입력시 종료)");
					System.out.println("숫자맞추기 | 가위바위보 | 숫자야구 | 주사위게임 | 구구단게임");
					break;
					
				case "주사위게임":	//위 게임 실행과 동일
					System.out.println(dice.getName());
					System.out.println("게임 설명을 들으시겠습니까?(y/n)");
					while(true) {
						String answer = sc.nextLine();
						if(!answer.equals("y") && !answer.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임 설명을 들으시겠습니까?(y/n)");
						}else if(answer.equals("y")) {
							System.out.println(dice.getHow());
							break;
						}else if(answer.equals("n")) {
							break;
						}//if-else-if문
					}//내부 while문
					
					System.out.println("게임을 실행하시겠습니까?(y/n)");
					while(true) {
						String answer1 = sc.nextLine();
						if(!answer1.equals("y") && !answer1.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임을 실행하시겠습니까?(y/n)");
						}else if(answer1.equals("y")) {
							dice.playDice();
							break;
						}else if(answer1.equals("n")) {
							break;
						}//if-else-if문
					}//내부 while문
					System.out.println("어떤 게임을 하시겠습니까?(종료 입력시 종료)");
					System.out.println("숫자맞추기 | 가위바위보 | 숫자야구 | 주사위게임 | 구구단게임");
					break;
				
				case "구구단게임":	//위 게임 실행과 동일
					System.out.println(gugudan.getName());
					System.out.println("게임 설명을 들으시겠습니까?(y/n)");
					while(true) {
						String answer = sc.nextLine();
						if(!answer.equals("y") && !answer.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임 설명을 들으시겠습니까?(y/n)");
						}else if(answer.equals("y")) {
							System.out.println(gugudan.getHow());
							break;
						}else if(answer.equals("n")) {
							break;
						}//if-else-if문
					}//내부 while문
					
					System.out.println("게임을 실행하시겠습니까?(y/n)");
					while(true) {
						String answer1 = sc.nextLine();
						if(!answer1.equals("y") && !answer1.equals("n")) {
							System.out.println("다시 입력하세요.\n"
									+ "게임을 실행하시겠습니까?(y/n)");
						}else if(answer1.equals("y")) {
							gugudan.playGugudan();
							break;
						}else if(answer1.equals("n")) {
							break;
						}//if-else-if문
					}//내부 while문
					System.out.println("어떤 게임을 하시겠습니까?(종료 입력시 종료)");
					System.out.println("숫자맞추기 | 가위바위보 | 숫자야구 | 주사위게임 | 구구단게임");
					break;
					
				case "종료":	//종료 입력시 실행없이 switch문 종료
					break;
					
				default:	//종료나 선택지속 게임외의 단어를 입력시
					System.out.println(gameslc+"은/는 존재하지 않습니다.");
					System.out.println("다시 입력해주세요.(종료 입력시 종료)");
					System.out.println("숫자맞추기 | 가위바위보 | 숫자야구 | 주사위게임 | 구구단게임");
			}//switch문
			
			if(gameslc.equals("종료")) {	//while(true)속 반복중단 조건. 종료 입력시 반복 종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}//if문
		}//while문
		
		

		
	}//main()

}//class GameProgram
