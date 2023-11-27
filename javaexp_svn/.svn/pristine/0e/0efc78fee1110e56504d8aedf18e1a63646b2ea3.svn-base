package javaexp.z02_homework.a17_okw;

import java.util.ArrayList;
import java.util.Scanner;

public class A1006_TodoListApp{
	public static void main(String[] args) {
		ArrayList<TodoList> todoList = new ArrayList<TodoList>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 할 일 추가 || 2. 할 일 삭제 || 3. 할 일 수정 || 4. 우선순위 설정 || 5. 완료 체크 || 6. To-do List 확인 || 7. 종료 ");
			System.out.print("어떤 것을 하시겠습니까 ?(1~6번 선택) >> ");
			
			int select = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch (select) {
				case 1:
					System.out.println("@@ 주의) 처음 저장하는 할 일 부터 인덱스 0번에 배정됩니다! (0,1,2...) @@");
					System.out.print("할 일을 입력하세요 : ");
					String task = sc.nextLine();
					System.out.print("이 일의 우선 순위를 입력하세요 : ");
					int priority = Integer.parseInt(sc.nextLine());
					TodoList newTodo = new TodoList(task, priority);
					todoList.add(newTodo);
					System.out.println();
					break;
				case 2:
					System.out.print("삭제할 일의 인덱스를 입력하세요(0~) : ");
					int indexTodoDelete = Integer.parseInt(sc.nextLine());
					if (indexTodoDelete >= 0 && indexTodoDelete < todoList.size()) {
						TodoList itemPresentTask = todoList.get(indexTodoDelete);
						System.out.println("선택한 삭제할 일은... " + itemPresentTask.getTask());
						System.out.print("정말 삭제하시겠습니까? (Y/N 중 입력..)");
						String really = sc.nextLine();
						if(really.equals("Y")) {
							todoList.remove(indexTodoDelete);
						}else {
							System.out.println("메뉴로 돌아갑니다..");
							break;
						}
					}else {
						System.out.println("존재하지 않는 인덱스입니다.");
					}
					System.out.println();
					break;
				case 3:
					System.out.print("수정할 일의 인덱스를 입력하세요(0~) : ");
					int indexTodoModify = Integer.parseInt(sc.nextLine());
					if (indexTodoModify >=0 && indexTodoModify < todoList.size()) {
						System.out.print("새로운 할 일을 입력하세요 : ");
						String newTask = sc.nextLine();
						todoList.get(indexTodoModify).setTask(newTask);
					}else {
						System.out.println("존재하지 않는 인덱스입니다.");
					}
					System.out.println();
					break;
				case 4:
					System.out.print("우선 순위를 변경할 일의 인덱스를 입력하세요(0~) : ");
					int indexChangePriority = Integer.parseInt(sc.nextLine());
					if (indexChangePriority >=0 && indexChangePriority < todoList.size()) {
						TodoList itemPresentPriority = todoList.get(indexChangePriority);
						System.out.println("현재 우선 순위는 " + itemPresentPriority.getPriority() + "입니다.");
						System.out.print("우선 순위를 몇 번으로 변경 하시겠습니까? : ");
						int newPriority = Integer.parseInt(sc.nextLine());
						todoList.get(indexChangePriority).setPriority(newPriority);
					}
					System.out.println();
					break;
				case 5:
					System.out.print("완료 체크할 일의 인덱스를 입력하세요 (0~): ");
					int indexCheckComplete = Integer.parseInt(sc.nextLine());
					if(indexCheckComplete >=0 && indexCheckComplete < todoList.size()) {
						todoList.get(indexCheckComplete).checkCompleted(true);
					}else {
						System.out.println("존재하지 않는 인덱스입니다.");
					}
					System.out.println();
					break;
				case 6:
					System.out.println("## === 나의 To-do List === ##");
					for(int i = 0; i < todoList.size(); i++) {
						TodoList item = todoList.get(i);
						String checkbox = item.isCompleted()? "▣" : "□";
						System.out.println(i + " . "+ checkbox + " " + item.getTask() + " (우선순위: " + item.getPriority() + ")" );
					}
					System.out.println();
					break;
				case 7:
					System.out.println("To-do List App 을 종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println("잘못된 입력입니다. 1~6번의 번호 중 선택해주세요.");
			}
		}
		
		
	}
	
}

class TodoList {
	private String task;
	private int priority;
	private boolean isCompleted;
	
	public TodoList(String task, int priority) {
		this.task = task;
		this.priority = priority;
		this.isCompleted = false;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void checkCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	

	
}
