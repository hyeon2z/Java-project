package springweb.a02_mvc;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// springweb.a02_mvc.A01_MVC_StartController
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.z01_vo.Movie;
import springweb.z01_vo.Person;
// springweb.a02_mvc.A01_MVC_StartController
@Controller
public class A01_MVC_StartController {
	// http://localhost:7080/springweb/call10.do
	// http://localhost:7080/springweb/call10.do?name=홍길동
	// 요청값이 없을 때도 처리하고, 요청값이 있을 때도 처리하려면
	// ==> value="name", defaultValue=""
	@RequestMapping("call10.do")
	public String call10(@RequestParam(value="name", 
									 defaultValue = "") String name,
					     Model d // request.setAttribute("gender","남");
			) {					 // ${gender}	
		// 요청값에 따른 권한 설정
		String auth = "";
		if(name.equals("홍길동")) {
			auth = "관리자";
		}else if(!name.equals("")) {
			auth = "일반사용자";
		}else { // null, ""
			auth = "";
		}
		// 넘겨줄 모델 데이터 설정..
		d.addAttribute("auth", auth); // ${auth}, ${param.name}
		return "WEB-INF\\views\\a02_modelView\\a03_callAuth.jsp";
	}
	@RequestMapping("call11.do")
	public String call11(Model d) {
		d.addAttribute("name", "마길동");
		d.addAttribute("age", 29);
		d.addAttribute("p01", new Person("홍길동",25,"서울"));
		/*
		# controller단에서 위와 같이 설정된 모델 데이터를, view단에서
		아래와 같이 호출할 수 있다.
		${name}
		${age+10}
		${p01.name} ==> person.getName()  get property 호출..
		${p01.age} ==> person.getAge()
		${p01.loc} ==> person.getLoc()
		ex) 아래의 key로 모델 데이터를 저장하고, 화면에서 출력하세요
			fruit 과일명 전달 선언과 할당
			price 과일의 가격 선언과 할당
			Movie Vo를 이용해서 상영일 영화제목 동반자수를 할당하여 화면에서 출력.		
		 * */
		d.addAttribute("fruit","사과"); //
		d.addAttribute("price",3000); // ${price}
		d.addAttribute("mov01", new Movie("2023/12/23","아쿠아맨",5));

		
		return "WEB-INF\\views\\a02_modelView\\a05_modelKind.jsp";
	}
	@RequestMapping("call12.do")
	public String call12(Model d) {
		// 배열형 데이터
		// 1. 단순 배열
		d.addAttribute("fruits", new String[] {"사과","바나나","딸기"});
		//  ==> view단 ${fruits[0]}, ${fruits[1]}, ${fruits[2]}
		// 2. List형
		d.addAttribute("names", Arrays.asList("홍길동","김길동","신길동"));
		//     ${fruits[0]}, ${fruits[1]}, ${fruits[2]}
		//  ==> view단에서 ${names.get(0)}, 
		//               ${names.get(1)}, ${names.get(2)}
		//  ==> <c:forEach var="name" items="${names}">
		//          ${name}
		return "WEB-INF\\views\\a02_modelView\\a06_modelKind.jsp";
	}
	
	
}
