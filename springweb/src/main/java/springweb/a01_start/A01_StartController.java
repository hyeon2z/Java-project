package springweb.a01_start;

import org.springframework.stereotype.Controller;
// annotation으로 controller(사용자 정의 컨트롤러)
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// springweb.a01_start.A01_StartController
@Controller
public class A01_StartController {
	// private EmpDao dao; ==> 컨테이너에 객체가 있으면 설정에 의해 자동으로 할당된다.
	// dao = new EmpDao(); 필요가 없음.
	
	// WEB-INF\views\a01_startSpring.jsp
	// 각, 메서드 마다 url 패턴으로 해당 view를 호출
	// http://localhost:7080/springweb/start.do
	@RequestMapping("start.do")
	public String start() {
		return "WEB-INF\\views\\a01_start\\a01_startSpring.jsp";
		
	}
	// 요청값 처리
	// http://localhost:7080/springweb/start2.do?name=홍길동
	@RequestMapping("start2.do")
	public String start2(@RequestParam("name") String name) {
		System.out.println("요청값 이름 :" + name);
		
		return "WEB-INF\\views\\a01_start\\a03_startSpring.jsp";
	}
	@RequestMapping("start3.do")
	public String start3(@RequestParam("no") int no) {
		System.out.println("요청값 번호:"+no);
		return "WEB-INF\\views\\a01_start\\a03_requestNo.jsp";
		
	}
	
	@RequestMapping("start4.do")
	public String start4(@RequestParam("name") String name,
						 @RequestParam("price") int price,
						 @RequestParam("cnt") int cnt) {
		System.out.println("## 요청값 ##");
		System.out.println("물건명:"+name);
		System.out.println("가격:"+price);
		System.out.println("갯수:"+cnt);
		return "WEB-INF\\views\\a01_start\\a04_buyProduct.jsp";
	}
	@RequestMapping("start5.do")
	public String start5(@RequestParam("name") String name,
						@RequestParam("age") int age,
						@RequestParam("loc") String loc) {
		return "WEB-INF\\views\\a01_start\\a05_member.jsp";
		}
	// 요청값이 없을 때는 defaultValue로 요청값이 있을 때는 해당 요청값으로 처리
	@RequestMapping("start6.do")
	public String start6(@RequestParam(value="name", defaultValue="")
										String name){
		return "WEB-INF\\views\\a01_start\\a03_startSpring.jsp";
	}
	
	@RequestMapping("start7.do")
	public String start7(@RequestParam(value = "name", defaultValue="") String name,
						@RequestParam(value="price", defaultValue = "0") int price,
						@RequestParam(value="cnt", defaultValue="0") int cnt) {
		return "WEB-INF\\views\\a01_start\\a04_buyProduct.jsp";
		}		
	
	// ex)
	// http://localhost:7080/springweb/start5.do?name=홍길동&age=25&loc=서울
	// http://localhost:7080/springweb/login01.do?id=himan&pwd=7777
	// 요청값이 없더라도 초기화면이 출력되고, 요청값을 화면에서 전달하면 해당 입력값 내용을 출력되게끔
	@RequestMapping("login01.do")
	public String login01(@RequestParam(value = "id", defaultValue = "") String id,
						@RequestParam(value = "pwd", defaultValue = "") String pwd) {
		return "WEB-INF\\views\\a01_start\\a06_login.jsp";
	}
	
	@RequestMapping("buyInfo.do")
	public String buyInfo(@RequestParam(value = "name", defaultValue = "") String name,
						@RequestParam(value = "price", defaultValue = "") int price,
						@RequestParam(value = "cnt", defaultValue = "") int cnt) {
		return "WEB-INF\\views\\a01_start\\a07_buyForm.jsp";
	}
	
	//http://localhost:7080/springweb/buyInfo.do?name=사과&price=3000&cnt=5
	// 를 처리하는 초기화면을 만든 뒤 form 요청값 화면을 만든 후
	// 물건명 @@ 총계 @@ 를 출력되게 하세요.
	// a07_buyForm.jsp
	//http://localhost:7080/springweb/members.do?mname=홍길동&mname=신길동&mname=마길동
	@RequestMapping("members.do")
	public String names(@RequestParam("mname") String[] mnames) {
		// 여러개의 데이터를 입력할 때 사용하는 형태
		System.out.println("#배열형 데이터#");
		for(String mname:mnames) {
			System.out.println(mname);
		}
		return "WEB-INF\\views\\a01_start\\a08_mlist.jsp";
	}
	//http://localhost:7080/springweb/orderMenu.do?menu=짜장면&menu=짬뽕&menu=탕수육
	// 처리되는 주문 메뉴 출력 a09_orderList.jsp
	@RequestMapping("orderMenu.do")
	public String menus(@RequestParam(value="menu", defaultValue="") String[] menus) {
		return "WEB-INF\\views\\a01_start\\a09_orderList.jsp";
	}
}

















