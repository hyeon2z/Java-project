package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_homework_vo.Note;
import a01_diexp.z04_vo.Movie;

public class DIExp02_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컨테이너 경로
		String path = "a01_diexp\\di02_homework.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		// 2. DL(Dependency Lookup) 객체를 찾는 처리
		Movie movie = ctx.getBean("movie", Movie.class);
		System.out.println("컨테이너 객체 : " + movie);
		
		movie.setName("영화제목");
		System.out.println(movie.getName());
		// 3. 자원해제
		ctx.close();
		System.out.println("종료@!!");
	}

}
