package springweb.a01_start;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
// springweb.a01_start.A03_ParamObjectModel
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lowagie.text.List;

import springweb.z01_vo.Movie;
import springweb.z01_vo.Person;
import springweb.z01_vo.Phone;
import springweb.z01_vo.Product;
@Controller
public class A03_ParamObjectModel {
	/*
	# 객체형 요청값 전달하기
	1. 요청값이 useBean과 같이 property와 matching이 되면 전달하는 처리를
	    스프링에서 매개변수로 처리하도록 하고 있다.
	2. 즉, regPerson.do?name=홍길동&age=25&loc=서울 의 요청을 받을 수 있는
	    setName(), setAge, setLoc가 있는 클래스가 매개변수로 선언되어 있으면
	    해당 값을 받아서 처리 할 수 있다.
	    ex) public String regerPerson(Person p)
	3. 객체로 요청값을 받는 경우, 특별한 기능 처리가 더 추가가 되는데
	    1) default 값을 설정하지 않더라도
	        해당 요청값이 없으면 객체는 각 속성이 null, 0이 설정되어 처리된다.
	        요청값을 처리하지 않을 때, default로 처리되는데
	        합당치 않는 요청값을 요청 시에 에러 발생. ?age=이십오 : 문자열데이터 호출시 404에러 발생
	    2) 객체로 요청값을 받는 경우, default 로 객체의 소문자 형태로 모델 데이터까지 설정되어 처리된다.
	        public String regerPerson(Person p)경우, 화면에서
	        
	        Person ==> person 형태로 객체의 참조로 모델 데이터를 사용할 수 있다.
	        ${person.name}${person.price}${person.cnt}
	 */
	@RequestMapping("callObj01.do")
	public String callObj01(Person p01) {
		return "WEB-INF\\views\\a01_start\\a10_objectParam.jsp";
	}
	// 고객명 전화번호로 전화번호부를 등록하는 VO를 만들어 a11_regPhone.jsp
	// http://localhost:7080/springweb/regPhone.do
	@RequestMapping("regPhone.do")
	public String regPhone(Phone pnum01) {
		return "WEB-INF\\views\\a01_start\\a11_regPhone.jsp";	
	}
	// http://localhost:7080/springweb/preMovie.do?date=&name=&cnt=
	// 영화 예약 날짜 제목, 인원을 입력 해당 출력처리
	@RequestMapping("preMovie.do")
	public String preMovie(@ModelAttribute("m01") Movie m01) {
		// movie ==> m01
		return "WEB-INF\\views\\a01_start\\a12_preMovie.jsp";	
	}
	/*
	# Model 데이터
	1. MVC 개발패턴에서 핵심 데이터를 처리 할 때, 사용한다.
	스프링에는 Model 이라는 객체를 지원하여 그 객체에 속성과 속성값 형식으로 설정한다.
	 */
	@RequestMapping("model01.do")
	public String model01(Model d) {
		d.addAttribute("m01", "안녕하세요");
		// ==> ${m01}
		d.addAttribute("m02", 200);
		// ==> ${m02}
		d.addAttribute("m03", new String[] {"사과","바나나","딸기"});
		// ==> ${m03[0]} ${m03[1]} ${m03[2]}
		d.addAttribute("m04", new Person("홍길동", 25, "서울"));
		// ==> ${m04.name} ${m04.age} ${m04.loc}
		return "WEB-INF\\views\\a02_modelView\\a01_oneModel.jsp";
	}
	// http://localhost:7080/springweb/model02.do
	// num01, num02, Product(name(물건명), price(가격), cnt(갯수))
	// memberIds (회원아이디 배열)을 설정하여
	// a02_model.jsp 에 출력
	@RequestMapping("model02.do")
	public String model02(Model d) {
		d.addAttribute("num01", 5);
		d.addAttribute("num02", 10);
		d.addAttribute("Product", new Product("사과", 5000, 3));
		d.addAttribute("memberIds", new String[]{"himan", "manhi", "hi"});
		return "WEB-INF\\views\\a02_modelView\\a02_model.jsp";
	}
	// 1) 사용자가 도시 이름을 입력하면 해당 도시의 날씨 정보(도시3개 날씨3개 조건처리)를 반환하는 API를 만드세요
	@RequestMapping("city.do")
	public String city(Model d) {
		d.addAttribute("city", new String[] {"서울", "베이징", "도쿄"});
		d.addAttribute("weather", new String[] {"눈", "맑음", "비"});
		return "WEB-INF\\views\\homework\\city.jsp";
	}
	// 2) 사용자가 이름, 이메일, 비밀번호를 입력하여 회원 가입을 할 수 있는 API를 만드세요.
	@RequestMapping("member.do")
	public String member(@RequestParam(value = "name", defaultValue = "") String name,
						@RequestParam(value = "email", defaultValue = "") String email,
						@RequestParam(value = "pwd", defaultValue = "") String pwd) {

		return "WEB-INF\\views\\homework\\member.jsp";
	}
	// 3) 여러 개의 투표 항목이 주어지고, 사용자는 투표를 할 수 있는 API를 만드세요. 
    // 각 사용자는 한 항목에 대해 한 번만 투표 또는 다중 투표를 할 수 있게 만드세요
	@RequestMapping("vote.do")
	public String vote(Model d) {
		d.addAttribute("dinner", new String[] {"햄버거", "치킨", "김치찌개", "칼국수"});
		return "WEB-INF\\views\\homework\\dinner.jsp";
		
	}
	// 	4) 사용자가 식당의 ID, 예약 날짜 및 시간, 인원 수를 입력하여 예약을 할 수 있는 API를 만드세요.
    // - 예약 가능한 시간과 인원 수에 제한을 두어, 불가능한 예약 요청에 대해선 거절 메시지를 반환하세요.
    @RequestMapping("reser.do")
    public String reser(Model d) {
    	d.addAttribute("restaurant", new String[] {"식당1", "식당2", "식당3"});
    	d.addAttribute("restaurant", new String[] {"식당1", "식당2", "식당3"});
    	d.addAttribute("restaurant", new String[] {"식당1", "식당2", "식당3"});    	
    	return "WEB-INF\\views\\homework\\reservation.jsp";
    }
	
}
