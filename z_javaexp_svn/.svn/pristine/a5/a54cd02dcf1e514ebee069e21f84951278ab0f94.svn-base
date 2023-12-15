package javaexp.z02_homework.a19_cjw.a1006_homework.vo;

import java.util.ArrayList;

import javaexp.z02_homework.a19_cjw.a1006_homework.vo.Todo;

public class Schedule {

	private ArrayList<Todo> dolist;
	private String date;
	private String memory;
	private int num01;
	
	public Schedule() {
	}

	public Schedule(String date) {
		this.date = date;
		System.out.println(date+" 할 일!");
		dolist = new ArrayList<Todo>();
	}
	
	public void regTodolist(String dlist) {
		dolist.add(new Todo(dolist.size()+1,dlist));
		System.out.println(date+"에 할 일 "+dlist+"를 등록했습니다.");
		System.out.println(date+"에 할 일은 "+dolist.size()+"개 입니다.");
	}
	
	public void showList() {
		if(dolist.size()>0) {
			System.out.println(date+" 할 일");
			for(Todo list:dolist) {
				System.out.println(list.getIndex()+") "+list.getTodo());
			}
		} else {
			System.out.println(date+"에 할 일이 없네요!");
		}
	}
	
	public void fixList(Todo dlist) {
		dolist.set(dlist.getIndex()-1, new Todo (dlist.getIndex(), dlist.getTodo()));
	}
	
	public void deleteList(int num01) {
		dolist.remove(num01-1);
	}
	
	public void changeList(int num01) {
		memory = dolist.get(0).getTodo();
		dolist.set(0, new Todo(1, dolist.get(num01-1).getTodo()));
		dolist.set(num01-1, new Todo(num01, memory));
	}
	
	public void checkList(int num01) {
		dolist.set(num01-1, new Todo(num01, dolist.get(num01-1).getTodo()+"(완료)"));
	}
	
	public ArrayList<Todo> getDolist() {
		return dolist;
	}

	public void setDolist(ArrayList<Todo> dolist) {
		this.dolist = dolist;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
