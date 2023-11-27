package javaexp.z02_homework.a06_psj.fruit;

public class OrientalMelon {
	private int a = 1;
	int b = 2;
	protected int c = 3;
	public int d = 4;
	
	String taste="맛없어";
	
	
	public void callInfo() {
		OrientalMelon o = new OrientalMelon();
		System.out.println(o.taste);
	}
}
