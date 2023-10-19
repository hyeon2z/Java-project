package javaexp.a06_object;

import javaexp.a06_object.vo.Cpu;
import javaexp.a06_object.vo.Computer;

public class A10_ObjVsObj {

	public static void main(String[] args) {
		// 포함될 CPU 객체 생성
		// 일반 메모리에 돌아다니는 Cpu 객체(매장에 있는 핸드폰)
		Cpu cpu = new Cpu("intel", "3.2 quard core");
		// 하나의 컴퓨터객체에 할당(특정한 사람이 구매처리시 그 사람 소속이 된다)
		Computer com01 = new Computer("조립컴퓨터");
		com01.setCpu(cpu);
		com01.show();
		
	}

}
