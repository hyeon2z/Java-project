package javaexp.z02_homework.a19_cjw.a1006_homework;

import java.util.Scanner;

import javaexp.z02_homework.a19_cjw.a1006_homework.vo.Schedule;
import javaexp.z02_homework.a19_cjw.a1006_homework.vo.Todo;

public class N06_Todolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		/*
		6. **투두 리스트 애플리케이션**:
		    - 할 일 추가, 삭제, 수정 기능
		    - 우선순위 및 완료 체크 기능
		 * */
		System.out.println("**투두 리스트 애플리케이션**");
		System.out.println("날짜를 입력하세요.(_월 _일)");
		String date = sc.nextLine();
		Schedule sche = new Schedule(date);
		
		while(true) {
			System.out.println("무엇을 하시겠습니까?(추가, 삭제, 수정, 우선순위, 완료체크, 종료)");
			String answer = sc.nextLine();
			switch(answer) {
			case"추가":
				System.out.println("할 일을 입력해주세요.");
				String todo = sc.nextLine();
				sche.regTodolist(todo);
				sche.showList();
				break;
			case"삭제":
				System.out.println("삭제할 할일의 번호를 입력해주세요.");
				int idx = Integer.parseInt(sc.nextLine());
				sche.deleteList(idx);
				sche.showList();
				break;
			case"수정":
				System.out.println("수정할 할일의 번호를 입력해주세요.");
				int i = Integer.parseInt(sc.nextLine());
				System.out.println("해당 번호의 할 일을 입력해주세요.");
				String tod = sc.nextLine();
				sche.fixList(new Todo(i,tod));
				sche.showList();
				break;
			case"우선순위":
				System.out.println("우선순위로 지정할 할일의 번호를 입력해주세요.");
				int j = Integer.parseInt(sc.nextLine());
				sche.changeList(j);
				sche.showList();
				break;
			case"완료체크":
				System.out.println("완료한 할일의 번호를 입력해주세요.");
				int k = Integer.parseInt(sc.nextLine());
				sche.checkList(k);
				sche.showList();
			case"종료":
				break;
			default:
				System.out.println(answer+"이라는 처리는 지정되어 있지 않습니다.");
				break;
			}
			if(answer.equals("종료")) {
				sche.showList();
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}

}
