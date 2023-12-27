package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Gamer;
import a01_diexp.z01_vo.Sensor;

public class DIExp15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컨테이너 경로
		String path = "a01_diexp\\di15.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		// 2. DL(Dependency Lookup) 객체를 찾는 처리
		Sensor sensor01 = ctx.getBean("sensor01", Sensor.class);
		System.out.println("컨테이너의 객체 호출:"+sensor01);
		System.out.println(sensor01.getAddInfo());
		System.out.println(sensor01.getAgent());
		System.out.println("for문을 통한 확인 1");
		for(String str:sensor01.getAgent()) {
			System.out.println(str);
		}
		
		Gamer gamer01 = ctx.getBean("gamer01", Gamer.class);
		System.out.println(gamer01);
		System.out.println(gamer01.getBeadKinds());
		System.out.println(gamer01.getBeadsCnts());
		// 3. 자원해제
		ctx.close();
		System.out.println("종료@!!");
	}

}
