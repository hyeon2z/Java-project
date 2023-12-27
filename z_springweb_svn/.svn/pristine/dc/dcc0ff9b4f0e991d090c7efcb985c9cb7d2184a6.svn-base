package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Car;
import a01_diexp.z01_vo.Movie;
import a01_diexp.z01_vo.Person;
import a01_diexp.z01_vo.Product;

public class DIExp16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컨테이너 경로
		String path="a01_diexp\\di16.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		// 2. DL(Dependency Lookup) 객체를 찾는 처리
		Person p01 = ctx.getBean("p01", Person.class);
		System.out.println("컨테이너의 객체 호출:"+p01);
		System.out.println(p01.getName());
		System.out.println(p01.getLoc());
		System.out.println(p01.getAge());
		Person p02 = ctx.getBean("p02", Person.class);
		System.out.println("컨테이너의 객체 호출:"+p02);
		System.out.println(p02.getName());
		System.out.println(p02.getLoc());
		System.out.println(p02.getAge());
		Person p03 = ctx.getBean("p03", Person.class);
		System.out.println("컨테이너의 객체 호출:"+p03);
		System.out.println(p03.getName());
		System.out.println(p03.getLoc());
		System.out.println(p03.getAge());
		// movie01 car01 pro01
		Movie movie01 = ctx.getBean("movie01", Movie.class);
		System.out.println("컨테이너의 객체 호출:"+movie01);
		System.out.println(movie01.getDate());
		System.out.println(movie01.getName());
		System.out.println(movie01.getCnt());
		Car car01 = ctx.getBean("car01", Car.class);
		System.out.println("컨테이너의 객체 호출:"+car01);
		System.out.println(car01.getKind());
		System.out.println(car01.getCc());
		System.out.println(car01.getMaxVel());
		Product pro01 = ctx.getBean("pro01", Product.class);
		System.out.println("컨테이너의 객체 호출:"+pro01);
		System.out.println(pro01.getName());
		System.out.println(pro01.getPrice());
		System.out.println(pro01.getCnt());

		
		// 3. 자원해제 
		ctx.close();
		System.out.println("종료@!!");
	}

}
