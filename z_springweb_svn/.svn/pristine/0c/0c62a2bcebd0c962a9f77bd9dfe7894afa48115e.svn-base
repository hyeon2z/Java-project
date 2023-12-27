package springweb.a02_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// springweb.a02_mvc.A02_MVC_CheckAudultCtrl
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class A02_MVC_CheckAudultCtrl {
	// // http://localhost:7080/springweb/checkAdult.do
	// // http://localhost:7080/springweb/checkAdult.do?age=15
	@RequestMapping("checkAdult.do")
	public String checkAdult(@RequestParam(value="age",
								defaultValue = "0") int age, 
							 Model d
							) {
		// 초기화면에는 표시 없고, 나이에 따라서 성년 미성년 처리..
		String isAdult = "";
		if(age>=18) {
			isAdult="성년";
		}else if(age>0) {
			isAdult="미성년";
		}
		// String name="홍길동";     System.out.println(name);
		// adult이름에 성년/미성년/""
		
		d.addAttribute("adult", isAdult);
		return "WEB-INF\\views\\a02_modelView\\a04_checkAdult.jsp";
	}
	/*    결과 : ${adult}  ==> 처리하기 위해서 필요하는 객체
	 * 		==> 모델(Model),  key/value 형식으로 설정..
	 * */
	
	
}
