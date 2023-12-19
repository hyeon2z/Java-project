package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.z01_vo.Member;
import springweb.z01_vo.Vote;

@Controller
// http://localhost:7080/springweb/voting.do
public class A1219Controller {
	@RequestMapping("voting.do")
	public String voting(Vote v) {
		// 기본 VO객체를 선언하면 default 요청값 객체에 할당도 하고,
		// Model데이터로 선언도 된다. @ModelAttribute("vote") Vote t
		// default 객체의 시작 소문자로 모델명이 자동 설정된다.
		// vote PersonCom ==> personCom
		
		return "z01_homework\\1218.jsp";
	}
	@RequestMapping("login.do")
	public String login(Member m) {
		return "z01_homework\\1219.jsp";
	}
	
	
}
