package javaexp.a07_inherit.compart;

public class Z01_ExcuteComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1단계 : 공통내용 처리
		// 2단계 : 재정의 내용 메서드 처리..
//		Part p01 = new Part(); p01.commInfo(); p01.execute();
		Cpu cpu = new Cpu(); cpu.commInfo(); cpu.execute();
		Ram ram = new Ram(); ram.commInfo(); ram.execute();
		Ssd ssd = new Ssd(); ssd.commInfo(); ssd.execute();
		// 3단계 : 다형성 처리
		Part p02 = new Cpu(); p02.execute(); 
		Part p03 = new Ram(); p03.execute();
		Part p04 = new Ssd(); p04.execute();
		
	}

}
