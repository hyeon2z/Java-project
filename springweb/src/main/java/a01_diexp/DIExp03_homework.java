package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z05_vo.Note;
import a01_diexp.z05_vo.Pen;

public class DIExp03_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컨테이너 경로
		String path = "a01_diexp\\di03_homework.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		// 2. DL(Dependency Lookup) 객체를 찾는 처리
		Pen pen = ctx.getBean("pen", Pen.class);
		Note note = ctx.getBean("note", Note.class);
		System.out.println("컨테이너 객체 : " + pen);
		System.out.println("컨테이너 객체 : " + note);
		
		pen.setColor("빨강");
		pen.setType("색연필");
		note.setName("스케치북");
		note.doScatch();
		// 3. 자원해제
		ctx.close();
		System.out.println("종료@!!");
	}

}
