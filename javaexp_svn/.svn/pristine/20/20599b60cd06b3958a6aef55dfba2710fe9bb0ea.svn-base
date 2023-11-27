package javaexp.z02_homework.a20_kjw;



public class A1012_normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		store s1= new store();
		s1.job();
	}

}
class Parent02{
	private String job;
	public Parent02(String job) {
		this.job = job;
	}
	public void job() {
		System.out.println(job+"일을 합니다. ");
	}
}

class store extends Parent02{

	public store() {
		super("자영업");
	}
	//오버라이딩.
	public void job() {
		super.job(); //상위내용을 처리
		System.out.println("자영업을 합니다(일반 클래스 오버라이딩");
	//추가적으로 하위에서 재정의하여 처리..
	}	
}
