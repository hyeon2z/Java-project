package javaexp.a07_inherit.compart;

public class Z01_ExcuteComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1단계 : 공통내용 처리
		// 2단계 : 재정의 내용 메서드 처리
//		Part part = new Part();
		Cpu cpu = new Cpu();
		Ram ram = new Ram();
		Ssd ssd = new Ssd();
		
//		part.partUse();
		cpu.partUse();
		ram.partUse();
		ssd.partUse();
		
		Part p1 = new Cpu();
		Part p2 = new Ram();
		Part p3 = new Ssd();
		
		p1.partUse();
		p2.partUse();
		p3.partUse();
		// 3단계 : 다형성 처리
		
		Part c1 = new Cpu();
		Part r1 = new Ram();
		Part s1 = new Ssd();
		
		c1.execute();
		r1.execute();
		s1.execute();
	}

}
