package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_homework_vo.Note;
import a01_diexp.z01_homework_vo.Pen;

public class DIExp01_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컨테이너 경로
		String path = "a01_diexp\\di01_homework.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		// 2. DL(Dependency Lookup) 객체를 찾는 처리
		Pen pen01 = ctx.getBean("pen01", Pen.class);
		Note note01 = ctx.getBean("note01", Note.class);
		System.out.println("컨테이너 객체 : " + pen01);
		System.out.println("컨테이너의 객체 호출:"+note01);
		
		note01.doScatch();
		// 3. 자원해제
		ctx.close();
		System.out.println("종료@!!");
	}

}
