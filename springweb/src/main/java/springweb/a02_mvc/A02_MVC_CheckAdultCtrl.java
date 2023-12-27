package springweb.a02_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller	
public class A02_MVC_CheckAdultCtrl {
	@RequestMapping("checkAdult.do")
	public String checkAdult(@RequestParam(value = "age", defaultValue = "0") int age, Model d) {
		String ageResult = "";
		if(age>=18) {
			ageResult = "성인입니다.";
		}else if(age!=0) {
			ageResult = "애기입니다.";
		}else {
			ageResult = "";
		}
		d.addAttribute("ageResult", ageResult);
		return "WEB-INF\\views\\a02_modelView\\a04_checkAdult.jsp";
	}
	/* 결과 : ${adult} ==> 처리하기 위해서 필요하는 객체
	  		==> 모델 (Model), key/value 형식으로 설정
	 * 
	 */
	
}
