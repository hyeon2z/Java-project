package javaexp.z02_homework.a19_cjw.a1006_homework.vo;

public class Todo {

	private int index;
	private String todo;
	
	public Todo() {
	}

	public Todo(int index, String todo) {
		this.index = index;
		this.todo = todo;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}
}
